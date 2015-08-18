# Teams

Units are grouped into teams, which also store various assets, such as the Coaching Dice or the various types of cards available for a game.

Like with units, these are divided into two main groups, one of each game. DBO teams are made out of editable units, and have a parent team type which will mark the units they can acquire. DBX teams have a Sponsor, which will be the one which changes from game to game, while the team itself is composed of immutable units.

## Base Team

![Team class diagram](./images/team_class_diagram.png)

The base [Team][team] interface serves as a root for the other team interfaces. It just keeps all the common methods, which include handling players and the common assets.

## Advancement-capable teams

![Advancement team class diagram](./images/advancement_team_class_diagram.png)

DBO teams, represented by [AdvancementTeam][advancement_team] are composed of units capable of changing from game to game. The full team will be reused for each of these games, keeping track of units lost or bought, and the changes to various assets.

## Sponsor teams

![Sponsor team class diagram](./images/sponsor_team_class_diagram.png)

DBX teams, represented by [SponsorTeam][sponsor_team] are meant to be used on a single game and then discarded, along all the assets they have. They are owned by a Sponsor, which will be the one which changes from game to game.

## Assets

When talking about assets I mean all those things on a team which are not team players (these are represented by the units). This is Coaching Dice, Dreadball Cards, Special Move Cards, Cheerleaders and other things which can be bought for a team.

[advancement_team]: ./apidocs/com/wandrell/tabletop/dreadball/model/team/AdvancementTeam.html
[sponsor_team]: ./apidocs/com/wandrell/tabletop/dreadball/model/team/SponsorTeam.html
[team]: ./apidocs/com/wandrell/tabletop/dreadball/model/team/Team.html