/**
 * Copyright 2015-2016 the original author or authors
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
 * Interface for units.
 * <p>
 * Note that in Dreadball units are called 'players', as they are players in a
 * team, but for ease, and to make the API structure closer to that of other
 * games, they will be referred as units.
 * <p>
 * The interfaces on the package cover both Dreadball Original (DBO) and
 * Dreadball Xtreme (DBX). After all, there is little difference between each of
 * them, the main being than in DBO players can evolve from game to game, and in
 * DBX the players have affinity groups which will mark their cost.
 * <h2>Units</h2>
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.UnitTemplate
 * UnitTemplate} interface represents a basic unit profile similar to those
 * found in the books. Mostly this means such things as attributes, abilities,
 * team position roles or the unit's base cost.
 * <p>
 * While this information is useful, it is meant to serve as a root interface
 * for units. Still it can be useful for such things as querying the profiles
 * found on the books as immutable instances, but if possible it is better using
 * any of the other interfaces which extend over this.
 * <p>
 * The two main extensions, one for each game, are:
 * <ul>
 * <li>The {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementUnit}, for DBO. These are units which can change from game to
 * game.</li>
 * <li>The {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit
 * AffinityUnit}, for DBX, has various costs and a collection of
 * {@link com.wandrell.tabletop.dreadball.model.unit.AffinityGroup
 * AffinityGroup} instances. These will be used to calculate the final cost
 * based on how many it shares with the sponsor trying to acquire it.</li>
 * </ul>
 * <h2>Additional info</h2>
 * <p>
 * Units require a few supporting interfaces to handle additional data. These
 * are as follows:
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
 * The {@link com.wandrell.tabletop.dreadball.model.unit.Role TeamPosition} is
 * an enumeration representing all the possible position roles a unit may take
 * on a team.
 */

package com.wandrell.tabletop.dreadball.model.unit;
