# Dreadball Model API

API library for creating a data model for the tabletop game [Dreadball][dreadball].

This covers both the original Dreadball and Dreadball Xtreme, and includes teams, units and the availabilities during team creation.

[![Maven Central](https://img.shields.io/maven-central/v/com.bernardomg.tabletop.dreadball/dreadball-model-api.svg)][maven-repo]
[![Bintray](https://api.bintray.com/packages/bernardo-mg/tabletop-toolkits/dreadball-model-api/images/download.svg)][bintray-repo]

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

## Features

The API allows modelling the following aspects of both Dreadball and Dreadball Xtreme:

- Teams (both DBO teams and DBX sponsor-based teams)
- Team players, including advancement-capable players
- Miscellany data such as abilities and affinity groups

## Documentation

Documentation is always generated for the latest release, kept in the 'master' branch:

- The [latest release documentation page][site-release].
- The [latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [latest snapshot Javadoc site][javadoc-develop].

The documentation site is actually a Maven site, and its sources are included in the project. If required it can be generated by using the following Maven command:

```
$ mvn verify site
```

The verify phase is required, otherwise some of the reports won't be generated.

## Usage

The application is coded in Java, using Maven to manage the project.

It is a Java library, meant to be included as a dependency on any project which may want to make use of it.

### Prerequisites

The project has been tested on the following Java versions:
* JDK 7
* JDK 8
* OpenJDK 7

All other dependencies are handled through Maven, and noted in the included POM file.

### Installing

The recommended way to install the project is by setting it up as a dependency. To get the configuration information for this check the [Bintray repository][bintray-repo], or the [Maven Central Repository][maven-repo].

It is always possible installing it by using the usual Maven command:

```
$ mvn install
```

## Collaborate

Any kind of help with the project will be well received, and there are two main ways to give such help:

- Reporting errors and asking for extensions through the issues management
- or forking the repository and extending the project

### Issues management

Issues are managed at the GitHub [project issues tracker][issues], where any Github user may report bugs or ask for new features.

### Getting the code

If you wish to fork or modify the code, visit the [GitHub project page][scm], where the latest versions are always kept. Check the 'master' branch for the latest release, and the 'develop' for the current, and stable, development version.

## License

The project has been released under version 2.0 of the [Apache License][license].

[dreadball]: http://www.manticgames.com/games/dreadball.html
[bintray-repo]: https://bintray.com/bernardo-mg/tabletop-toolkits/dreadball-model-api/view
[maven-repo]: http://mvnrepository.com/artifact/com.bernardomg.tabletop.dreadball/dreadball-model-api
[issues]: https://github.com/Bernardo-MG/dreadball-model-api/issues
[javadoc-develop]: http://docs.bernardomg.com/development/maven/dreadball-model-api/apidocs
[javadoc-release]: http://docs.bernardomg.com/maven/dreadball-model-api/apidocs
[license]: http://www.apache.org/licenses/LICENSE-2.0
[scm]: https://github.com/Bernardo-MG/dreadball-model-api
[site-develop]: http://docs.bernardomg.com/development/maven/dreadball-model-api
[site-release]: http://docs.bernardomg.com/maven/dreadball-model-api