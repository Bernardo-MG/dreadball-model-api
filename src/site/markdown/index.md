# Dreadball

[Dreadball][dreadball] is a futuristic sports tabletop game created by Mantic, a bit in the style of BloodBowl, but much faster and divided into two main versions: the original (DBO) and Dreadball Xtreme (DBX).

## Model API

A model API defines the interface upon which a model can be built. This way it is possible to easily extend the model, as the application will make use of the API, and not the actual implementation.

In this concrete case it allows having various data handling libraries: one for persisting data, one for transforming to JSON and one for generic use of such data, and knowing that all of them will can be used in the same exact way, allowing at the same time the creation of new similar libraries.

## What exactly does this library offer?

A model defining all the entities which take part on the Dreadball game, meant mostly for storing data to be used on a more complex system.

This includes:

- Support for both DBO and DBX.
- [Units][units], which are the players composing the teams.
- [Composite units][composite-units], for those units made up of pieces, such as the Mechanite or Plague players.
- [Teams][teams], both the DBX sponsor-based and the basic DBO ones.
- [Factions][factions], which are the DBX sponsors and DBO team types
- Data classes, such as the abilities.
- [Availabilities][availabilities], used for knowing what can a player acquire when creating teams.

[dreadball]: www.manticgames.com/games/dreadball.html

[units]: ./units.html
[teams]: ./teams.html
[factions]: ./factions.html
[availabilities]: ./availabilities.html
[composite-units]: ./units.html#compositeplayers