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
 * Teams, grouping together units.
 * <p>
 * Teams group together all the units and options which can be taken to a game,
 * and are divided into two types.
 * <p>
 * For DBO there is the
 * {@link com.bernardomg.tabletop.dreadball.model.team.AdvancementTeam
 * AdvancementTeam}, which uses the
 * {@link com.bernardomg.tabletop.dreadball.model.player.AdvancementTeamPlayer
 * AdvancementTeamPlayer}.
 * <p>
 * While for DBX there is the
 * {@link com.bernardomg.tabletop.dreadball.model.team.SponsorTeam SponsorTeam},
 * {@link com.bernardomg.tabletop.dreadball.model.player.AffinityTeamPlayer
 * AffinityTeamPlayer} instances and a
 * {@link com.bernardomg.tabletop.dreadball.model.faction.Sponsor Sponsor}.
 * <p>
 * Both of them inherit from the
 * {@link com.bernardomg.tabletop.dreadball.model.team.Team Team} interface, a
 * generic root interface storing all the methods common to the different teams,
 * which is not meant to be used by itself.
 */

package com.bernardomg.tabletop.dreadball.model.team;
