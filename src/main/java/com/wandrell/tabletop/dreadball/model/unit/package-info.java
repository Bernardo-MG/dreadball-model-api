/**
 * Copyright 2015 the original author or authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 * Provides interfaces for units.
 * <p>
 * Note that in Dreadball units are called 'players', as they are players in a
 * team, but for ease, and to make the library structure closer to that of other
 * games, they will be referred as units.
 * <p>
 * The interfaces on the package cover both DBO and DBX. After all, there is
 * little difference between each of them, the main being than in DBO players
 * can advance, and in DBX the players have affinities groups.
 * <h2>Units</h2>
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.Unit Unit} interface
 * represents a basic unit profile and contains the data which all units will
 * have, no matter if they come from DBO or DBX. Mostly, this means such things
 * as attributes, abilities, team position roles or the unit's base cost.
 * <p>
 * To cover the differences from both games there are two extensions of the
 * interface:
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementUnit} is meant for DBO units, which can change from game to game.
 * <p>
 * For DBX units the
 * {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit AffinityUnit}
 * has various costs and a collection of
 * {@link com.wandrell.tabletop.dreadball.model.unit.AffinityGroup
 * AffinityGroup} instances, used to calculate the final cost based on how many
 * it shares with the sponsor trying to acquire it.
 * <p>
 * Still for DBX, once the correct affinity cost has been found it can be better
 * to revert to the basic {@code Unit} interface.
 * <h2>Additional info</h2>
 * <p>
 * Units require various supporting interfaces to handle additional data. These
 * are:
 * <h3>Stats</h3>
 * <p>
 * Units attributes and abilities are handled by their own interfaces, which are
 * kept on the {@link com.wandrell.tabletop.dreadball.model.unit.stats stats}
 * package.
 * <h3>Composite players</h3>
 * <p>
 * Some teams, such as the Mechanites or Mutants, include customized players.
 * For these the {@link com.wandrell.tabletop.dreadball.model.unit.component
 * components} package includes interfaces which represent the pieces used to
 * build them.
 * <h3>Team position</h3>
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.TeamPosition
 * TeamPosition} is an enumeration representing all the possible position roles
 * a unit may take on a team.
 */
package com.wandrell.tabletop.dreadball.model.unit;
