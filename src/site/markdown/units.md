# Units

Most of the game revolves around units, as these are what the player's point of interaction with the game. For this reason units are the most complex part of the model, and include a small bunch of supporting interfaces.

Also, as all the model, units are divided into two kinds, one for DBO and another for DBX, which while they are mostly the same have a fundamental difference, and that is that while in DBO units can change their statistics from game to game, in DBX the units are static and never change from the profiles written in the manual books.

As a note, the units are actually called players in the game. But to keep coherency with other miniature games, and to avoid mistakes with the actual human players, they will be called units.

## DBO and DBX units

While DBO and DBX are, at their core, the same, there is a big difference between them: DBO units are capable of changing from game to game. This means that while DBX will make use of immutable units, the ones for DBO should be modifiable, creating two interfaces for units.

A third one appears due to the way DBX costs are calculated. Both units and sponsors have a collection of affinities, and the more they share the cheaper it is to buy a unit. For this an additional interface, keeping those affinities, is required.

---

### Base unit

![Unit class diagram](./images/unit_class_diagram.png)

The base unit, represented by the [Unit][unit] interface, contains all the attributes which are shared between the different types of units. This serves as a root for all other unit interfaces, but also it can be used as a fallback for DBX, as the affinities are only required when calculating costs.

### Advancement-capable units

![Advancement unit class diagram](./images/advancement_unit_class_diagram.png)

The most defining point of DBO units is that they are capable of changing from game to game, something which the [AdvancementUnit][advancement_unit] interface allows.

Such changes mainly happen as the unit gains experience and raises ranks, but it is also possible for them to lose characteristics, for example when resurrecting them for cheap. For this reason all the fields should become mutable.

### Units with affinities

![Affinity unit class diagram](./images/affinity_unit_class_diagram.png)

DBX possess is a series of affinities which will mark their costs, which the [AffinityUnit][affinities_unit] keeps track of. As otherwise they don't add anything to the base interface, it is recommended using the unit with affinities interface only when calculating the costs.

---

## Statistics

---

### Attributes

![Attributes Holder class diagram](./images/attributes_holder_class_diagram.png)

Attributes are kept separated from the units on the [AttributesHolder][attributes] interface. This way it is possible to refer to them independently from units, for example in the case of using attribute bonus, and also reduces the clutter on the unit interface.

### Abilities

![Ability class diagram](./images/ability_class_diagram.png)

Abilities are very simple, as they just serve as a short of a tag, indicating which special rules are to be applied to the unit. They are represented by the [Ability][ability] interface.

---

## Composite players

![Components class tree](./images/components_class_tree.png)

Some players, such as those from the Mechanite an Plague teams, are customly made out of pieces, the [UnitComponent][component], which are grouped by the locations, the [ComponentLocation][component_location], where they are applied.

An additional version, the [AffinityUnitComponent][affinity_unit_component], includes affinities and is meant to be used for DBX units.

## MVPs

MVPs, which are the game's heroes and mercenaries, are a special case of unit. But the thing is that they only have importance, taking into consideration the model's scope, during the team creation procedure.

For this reason the unit interfaces won't handle them, and this job instead will be taken care by the availabilities interfaces.

[unit]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/Unit.html
[advancement_unit]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/AdvancementUnit.html
[affinities_unit]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/AffinityUnit.html

[attributes]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/stats/AttributesHolder.html
[ability]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/stats/Ability.html

[component]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/component/UnitComponent.html
[component_location]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/component/ComponentLocation.html
[affinity_unit_component]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/component/AffinityUnitComponent.html