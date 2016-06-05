# Availabilities

There are two types of availabilities, one for units and another for assets. These are additionally divided into Dreadball Original (DBO) and Dreadball Xtreme (DBX) availability interfaces.

Unit availabilities indicate which units can be used for building or extending a team, and the constraints they have. Asset availabilities indicate which consumables or special properties a team can acquire.

## Unit availabilities

---

### Team Type Units

![Team type units ava class diagram](./images/team_type_unit_ava_class_diagram.png)

The [TeamTypeUnitAvailability][team_type_unit_ava] represents a unit availability and its constraints.

It makes reference to a single unit, and also contains the initial number of copies of said unit a new team will have.

### Team Type MVPs

![Team type MVPs ava class diagram](./images/team_type_mvp_ava_class_diagram.png)

The [TeamTypeMvpAvailability][team_type_mvp_ava] represents a MVP availability.

A MVP is similar in most aspects to a normal unit, but as they are the mercenaries or heroes of Dreadball there are some differences when acquiring them, which make a different interface necessary.

---

## Asset availabilities

---

### Team Type Assets

![Team type assets ava class diagram](./images/team_type_assets_ava_class_diagram.png)

The [TeamTypeAssetsAvailability][team_type_assets_ava] contains the list of all the assets a team may acquire and their costs.

It also includes the initial number of said assets a new team has.

### Sponsor Assets

![Sponsor assets ava class diagram](./images/sponsor_assets_ava_class_diagram.png)

The [SponsorAssetsAvailability][sponsor_assets_ava] contains the list of all the assets a Sponsor may acquire and their costs.

It also includes minimum cost a Sponsor-based team should have.

---

## Affinities availabilities

### Sponsor Affinity Groups

![Sponsor Affinity Groups ava class diagram](./images/sponsor_affinity_ava_class_diagram.png)

The [SponsorAffinityGroupAvailability][sponsor_affinities_ava] serves to build the initial affinities table, used to create a new Sponsor.

[team_type_unit_ava]: ./apidocs/com/wandrell/tabletop/dreadball/model/availability/unit/TeamTypeUnitAvailability.html
[team_type_mvp_ava]: ./apidocs/com/wandrell/tabletop/dreadball/model/availability/unit/TeamTypeMvpAvailability.html

[team_type_assets_ava]: ./apidocs/com/wandrell/tabletop/dreadball/model/availability/asset/TeamTypeAssetsAvailability.html
[sponsor_assets_ava]: ./apidocs/com/wandrell/tabletop/dreadball/model/availability/asset/SponsorAssetsAvailability.html

[sponsor_affinities_ava]: ./apidocs/com/wandrell/tabletop/dreadball/model/availability/unit/SponsorAffinityGroupAvailability.html