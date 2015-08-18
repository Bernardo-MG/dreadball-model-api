# Factions

While DBO makes use of a typical faction, a node meant to join all the teams to the allowed units, DBX makes use of a customizable faction, which has access to all the units, but with prices which change depending on a series of affinities.

## Team Type

![Team type class diagram](./images/team_type_class_diagram.png)

The DBO faction. It just identifies a type of team, and will be used to mark availabilities to teams of that type.

While it is not common, some team types may have a special rule which changes some aspects of the rules for them.

## Sponsor

![Sponsor class diagram](./images/sponsor_class_diagram.png)

The DBX faction. It is meant to be customized by the user, which will select the affinities it has.

Additionally, sponsors are tied to a player and keep track of changes which happen from game to game, like gaining ranks and money.