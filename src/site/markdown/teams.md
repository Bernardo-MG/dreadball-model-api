# Teams

Units are grouped into teams, which also serve to store various assets used during a game, such as the initial Coaching Dice or Dreadball Cards.

Like with units, these are divided into two main groups, one of each game. Dreadball Original (DBO) teams are made out of editable units which can evolve between games, while Dreadball Xtreme (DBX) teams are based around a Sponsor, which will be the one which changes from game to game.

## Base Team

![Base team class diagram](./images/team_class_diagram.png)

The [BaseTeam][base_team] interface serves as a root for the other team interfaces. It just keeps all the common methods for them, which include handling players and the common assets, and its direct use is discouraged.

## Advancement-capable teams

![Advancement team class diagram](./images/advancement_team_class_diagram.png)

DBO teams, represented by [AdvancementTeam][advancement_team] are composed of units capable of changing from game to game. The full team will be reused for each of these games, keeping track of units gained or lost, and the changes to both these units and the various assets which the team can own.

## Sponsor teams

![Sponsor team class diagram](./images/sponsor_team_class_diagram.png)

DBX teams, represented by [SponsorTeam][sponsor_team] are meant to be used on a single game and then discarded, along all the assets they have. They are owned by a Sponsor, which will be the one keeping changes from game to game.

## Assets

Team assets are all those things on a team which are not team players (which are represented by the units), but take an important part in the gameplay, and should be tracked in the team sheet. These are for example the Coaching Dice, Dreadball Cards, Special Move Cards or Cheerleaders.

[advancement_team]: ./apidocs/com/wandrell/tabletop/dreadball/model/team/AdvancementTeam.html
[sponsor_team]: ./apidocs/com/wandrell/tabletop/dreadball/model/team/SponsorTeam.html
[base_team]: ./apidocs/com/wandrell/tabletop/dreadball/model/team/BaseTeam.html