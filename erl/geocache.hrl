-record(geocache, 
	{
	  gccode,
	  name,
	  descr,
	  date, 	%% Waypoint date
	  coords, 	%% Waypoint coordinates
	  type,
	  id,		%% Cache numeric id
	  available,
	  archived,
	  placed_by,  	%% Placed by (string)
	  owner,	%% {id, name}
	  container,
	  attributes, 	%% [{id, inc, descr}]
	  difficulty, 	%% Difficulty (float)
	  terrain, 	%% Terrain (float)
	  country,
	  state,
	  short_description,
	  long_description,
	  hints,
	  logs		%% [#log]
	}).

-record(log,
	{
	  id,		%% Numeric id of log
	  date,		%% Log date
	  type,		%% Log type
	  finder, 	%% {id, name}
	  text	 	%% log text
	}).
