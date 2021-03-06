/**
 * Copyright 2015-2018 the original author or authors
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
 * Dreadball players.
 * <p>
 * The interfaces cover both Dreadball Original (DBO) and Dreadball Xtreme
 * (DBX). After all, there is little difference between each of them, the main
 * being than in DBO players can evolve from game to game, and in DBX the
 * players have affinity groups which will mark their cost.
 * <h2>Players</h2>
 * <p>
 * The {@link com.bernardomg.tabletop.dreadball.model.player.TeamPlayer
 * TeamPlayer} interface represents a root profile, which is similar to those
 * seen in the books when the player lists are detailed. This is meant to hold
 * all the common data for all kinds of units, no matter the game or type.
 * <p>
 * The two main extensions of this, one for each game, are:
 * <ul>
 * <li>{@link com.bernardomg.tabletop.dreadball.model.player.AdvancementTeamPlayer
 * AdvancementTeamPlayer}, for DBO. These are units which can change from game
 * to game.</li>
 * <li>{@link com.bernardomg.tabletop.dreadball.model.player.AffinityTeamPlayer
 * AffinityTeamPlayer}, for DBX. Has various costs and a collection of
 * {@link com.bernardomg.tabletop.dreadball.model.player.stats.AffinityGroup
 * AffinityGroup} instances.</li>
 * </ul>
 * <p>
 * If possible, it is recommended using one of these two interfaces, instead of
 * the root one.
 * <h2>Additional info</h2>
 * <p>
 * Players require a few supporting interfaces to handle additional data:
 * <h3>Stats</h3>
 * <p>
 * Players attributes and abilities are handled by their own interfaces, which
 * are kept on the {@code stats} package.
 * <h3>Composite players</h3>
 * <p>
 * Some teams, such as the Mechanites or Mutants, include customized players.
 * For these the {@code components} package includes interfaces which represent
 * the pieces they are built from.
 * <h3>Team position</h3>
 * <p>
 * The {@link com.bernardomg.tabletop.dreadball.model.player.Role Role} is an
 * enumeration representing all the possible position roles a unit may take on a
 * team.
 */

package com.bernardomg.tabletop.dreadball.model.player;
