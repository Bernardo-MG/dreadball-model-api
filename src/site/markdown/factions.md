# Factions

Dreadball Original (DBO) makes use of a typical faction structure, where said factions are just a way to join all the teams with the units they are allowed to buy. Dreadball Xtreme (DBX) on the other hand makes use of a sort of customizable faction, which has access to all the units, but with prices changing depending on a series of shared affinities.

---

## Team Type

![Team type class diagram](./images/team_type_class_diagram.png)

The [TeamType][team_type] is the DBO faction. It just identifies a type of team, and will be used to mark availabilities to teams of that type.

While it is not common, some team types may have a special rule which changes some aspects of the rules for them and are represented by [TeamRule][team_rule].

## Sponsor

![Sponsor class diagram](./images/sponsor_class_diagram.png)

The DBX faction, [Sponsor][sponsor], is meant to be customized by the user, which will select the affinities it has, and will change from game to game, gaining ranks and money.

[sponsor]: ./apidocs/com/wandrell/tabletop/dreadball/model/faction/Sponsor.html
[team_type]: ./apidocs/com/wandrell/tabletop/dreadball/model/faction/TeamType.html
[team_rule]: ./apidocs/com/wandrell/tabletop/dreadball/model/faction/TeamRule.html