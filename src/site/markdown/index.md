# Dreadball

Dreadball is a futuristic sports tabletop game created by Mantic, a bit in the style of BloodBowl, but much faster. To find out more check out [it's website][dreadball].

---

## Model API

A model API defines the interface upon which a model can be built. This way it is possible to easily extend the model, as the application will make use of the API, and not the actual implementation.

This, of course, also means that this library lacks any kind of business logic.

## What exactly does this library offer?

A model defining all the entities which take part on the Dreadball game, oriented to handling workflows such as team creation.

This includes:

- Support for all versions of Dreadball, meaning not only DBO and Dreadball Extreme, but also all the smaller expansions.
- Units, which are the players composing the teams.
- Teams, both the sponsor-based and the basic ones.
- Data classes, such as the abilities.
- Availabilities, used for knowing what can a player acquire when creating teams

[dreadball]: www.manticgames.com/games/dreadball.html