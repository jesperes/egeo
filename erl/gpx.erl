-module(gpx).
-export([
	 parse/1
	]).
-include("geocache.hrl").

lookup_attr(_, []) ->
    false;
lookup_attr(Name, [{_, _, NameStr, Val}|Rest]) ->
    case list_to_atom(NameStr) of
	Name ->
	    Val;
	_ ->
	    lookup_attr(Name, Rest)
    end.

%%%
%%% Event callback
event({startElement, _, _, QName, Attrs }, _, S) ->
    case qname(QName) of
	{_, wpt} ->
	    %% Waypoints have two attributes, 'lat' and 'long'
	    Lat = lookup_attr(lat, Attrs),
	    Lon = lookup_attr(lon, Attrs),
	    [#geocache{coords = {Lat, Lon}}|S];
	{groundspeak, cache} ->
	    [Cache|S0] = S,
	    Id = lookup_attr(id, Attrs),
	    Available = lookup_attr(available, Attrs),
	    Archived = lookup_attr(archived, Attrs),
	    [Cache#geocache{
	       id=list_to_integer(Id),
	       available=string:equal(Available, "True"),
	       archived=string:equal(Archived, "True")
	      }|S0];
	{groundspeak, owner} ->
	    [Cache|S0] = S,
	    [Cache#geocache{id=list_to_integer(lookup_attr(id, Attrs))}|S0];
	_ ->
	    S
    end;
event({endElement, _, _, QName}, _, S) ->
    case S of
	%% Closing an element with body text
	{Cs, [Cache|S0]} ->
	    case qname(QName) of
		{'', name} ->
		    [Cache#geocache{gccode=Cs}|S0];
		{groundspeak, name} ->
		    [Cache#geocache{name=Cs}|S0];
 		{'', dest} ->
		    [Cache#geocache{descr=Cs}|S0];
		{'', time} ->
		    [Cache#geocache{date=Cs}|S0];
		{groundspeak, type} ->
		    [Cache#geocache{type=Cs}|S0];
		{groundspeak, placed_by} ->
		    [Cache#geocache{placed_by=Cs}|S0];		
 		{groundspeak, container} ->
		    [Cache#geocache{container=Cs}|S0];		
  		{groundspeak, difficulty} ->
		    [Cache#geocache{difficulty=Cs}|S0];		
  		{groundspeak, terrain} ->
		    [Cache#geocache{terrain=Cs}|S0];		
  		{groundspeak, country} ->
		    [Cache#geocache{country=Cs}|S0];		
  		{groundspeak, state} ->
		    [Cache#geocache{state=Cs}|S0];		
		_ ->
		    [Cache|S0]
	    end;
	_ ->
	    S
    end;
event({characters, Cs}, _, {C, Acc}) ->
    {[C,Cs], Acc};
event({characters, Cs}, _, Acc) ->
    {Cs, Acc};
event(_, _, S) ->
    S.

qname({NS, Name}) ->
    {list_to_atom(NS), list_to_atom(Name)}.

%%
%% Returns a list of geocaches found in the given GPX file.
parse(GpxFile) ->	     
    {ok, State, _} = xmerl_sax_parser:file(GpxFile, 
					   [{event_state, []}, 
					    {event_fun, fun event/3}]),
    State.

    

%% xmerl_xpath:string("//groundspeak:cache", Doc).
