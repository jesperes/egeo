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


qname({NS, Name}) ->
    {list_to_atom(NS), list_to_atom(Name)}.

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
event({endElement, _, _, QName}, _, S) when is_list(S)->
    end_element(qname(QName), [], S);
event({endElement, _, _, QName}, _, {Cs, S}) ->
    end_element(qname(QName), Cs, S);
event({characters, Cs}, _, {C, Acc}) ->
    {[C,Cs], Acc};
event({characters, Cs}, _, Acc) ->
    {Cs, Acc};
event(_, _, Acc) ->
    Acc.

end_element({'', name}, Cs, [Cache|S]) ->
    [Cache#geocache{gccode=Cs}|S];
end_element({groundspeak, name}, Cs, [Cache|S]) ->
    [Cache#geocache{name=Cs}|S];
end_element({'', desc}, Cs, [Cache|S]) ->
    [Cache#geocache{descr=Cs}|S];
end_element({'', time}, Cs, [Cache|S]) ->
    [Cache#geocache{date=Cs}|S];
end_element({groundspeak, type}, Cs, [Cache|S]) ->
    [Cache#geocache{type=Cs}|S];
end_element({groundspeak, placed_by}, Cs, [Cache|S]) ->
    [Cache#geocache{placed_by=Cs}|S];
end_element({groundspeak, container}, Cs, [Cache|S]) ->
    [Cache#geocache{container=Cs}|S];
end_element({groundspeak, difficulty}, Cs, [Cache|S]) ->
    [Cache#geocache{difficulty=Cs}|S];
end_element({groundspeak, terrain}, Cs, [Cache|S]) ->
    [Cache#geocache{terrain=Cs}|S];
end_element({groundspeak, country}, Cs, [Cache|S]) ->
    [Cache#geocache{country=Cs}|S];
end_element({groundspeak, state}, Cs, [Cache|S]) ->
    [Cache#geocache{state=Cs}|S];
end_element(_, _, S) ->
    S.

%%
%% Returns a list of geocaches found in the given GPX file.
parse(File) ->
    {ok, State, _} = 
	xmerl_sax_parser:file(File, [{event_fun, fun event/3},
				     {event_state, []}]),
    length(State).
