# Units

Most of the game revolves around units, as these are what the player's point of interaction with the game, this makes them the most complex part of the model, which include a small set of supporting interfaces.

It should be noted that the units are actually called players in the game. But to keep coherency with other miniature games, and to avoid mistakes with the actual human players, they will be called units.

These units are meant to be divided into two kinds, one for each main version of the game: Dreadball Original (DBO) and Dreadball Xtreme (DBX). While for the most part they are identical, there are some fundamental differences between them.

## DBO and DBX units

While DBO and DBX are, at their core, the same game there are some differences between them:

- DBO units are meant to change from game to game, while DBX ones not.
- DBX units will cost more or less depending on the affinities they have.

## Support interfaces

Attributes and abilities are stored in their own interfaces. In the cases of attributes this is mostly to avoid cluttering the unit interfaces.

Additionally, the DBX affinities also have their own interface.

### Base Unit

![Unit class diagram](./images/unit_class_diagram.png)

The [Unit][unit_template] interface serves as a root for the other unit interfaces. It just keeps all the common methods for them, and its direct use is discouraged.

### Advancement-capable units

![Advancement unit class diagram](./images/advancement_unit_class_diagram.png)

The most defining point of DBO units is that they are capable of changing from game to game, something which the [AdvancementUnit][advancement_unit] interface allows.

Such changes mainly happen as the unit gains experience and raises ranks, but it is also possible for them to lose characteristics, for example when resurrecting them for cheap. For this reason all the fields should become mutable.

### Units with affinities

![Affinity unit class diagram](./images/affinity_unit_class_diagram.png)

DBX possess is a series of affinities which will mark their costs, which the [AffinityUnit][affinities_unit] keeps track of.

## Statistics

### Attributes

![Attributes class diagram](./images/attributes_holder_class_diagram.png)

Attributes are kept separated from the units on the [Attributes][attributes] interface. This way the units are less cluttered and also it is possible to refer to the attributes independently from units, for example in the case of using attribute bonus.

### Abilities

![Ability class diagram](./images/ability_class_diagram.png)

Abilities are very simple, as they just serve as a short of a tag, indicating which special rules are to be applied to the unit. They are represented by the [Ability][ability] interface.

## Composite players

![Components class tree](./images/components_class_tree.png)

Some players, such as those from the Mechanite an Plague teams, are customly made out of pieces, the [Component][component], which are grouped by the locations, the [ComponentLocation][component_location], where they are applied.

An additional version, the [AffinityComponent][affinity_unit_component], includes affinities and is meant to be used for DBX units.

## MVPs

MVPs, which are the game's heroes and mercenaries, are a special case of unit. But the thing is that they only have importance, taking into consideration the model's scope, during the team creation procedure.

For this reason the unit interfaces won't handle them, and this job instead will be taken care by the [availabilities interfaces][availabilities].

[unit_template]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/Unit.html
[advancement_unit]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/AdvancementUnit.html
[affinities_unit]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/AffinityUnit.html

[attributes]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/stats/Attributes.html
[ability]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/stats/Ability.html

[component]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/component/Component.html
[component_location]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/component/ComponentLocation.html
[affinity_unit_component]: ./apidocs/com/wandrell/tabletop/dreadball/model/unit/component/AffinityComponent.html

[availabilities]: ./availabilities.html