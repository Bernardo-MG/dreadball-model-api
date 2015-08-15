# Dreadball

[Dreadball][dreadball] is a futuristic sports tabletop game created by Mantic, a bit in the style of BloodBowl, but much faster and divided into two main versions: the original (DBO) and Dreadball Xtreme (DBX).

---

## Model API

A model API defines the interface upon which a model can be built. This way it is possible to easily extend the model, as the application will make use of the API, and not the actual implementation.

In this concrete case it allows having various data handling libraries: one for persisting data, one for transforming to JSON and one for generic use of such data, and knowing that all of them will can be used in the same exact way, allowing at the same time the creation of new similar libraries.

## What exactly does this library offer?

A model defining all the entities which take part on the Dreadball game, oriented to handling workflows such as team creation.

This includes:

- Support for all versions of Dreadball, meaning not only DBO and Dreadball Extreme, but also all the smaller expansions.
- Units, which are the players composing the teams.
- Teams, both the sponsor-based and the basic ones.
- Data classes, such as the abilities.
- Availabilities, used for knowing what can a player acquire when creating teams

[dreadball]: www.manticgames.com/games/dreadball.html