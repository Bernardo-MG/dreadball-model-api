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
 * Provides interfaces for teams.
 * <p>
 * Teams are what group together all the units and options the player takes to a
 * game, and are divided into two types.
 * <p>
 * For DBO there is the
 * {@link com.wandrell.tabletop.dreadball.model.team.LicensedTeam LicensedTeam},
 * which uses the
 * {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementUnit}.
 * <p>
 * While for DBX there is the
 * {@link com.wandrell.tabletop.dreadball.model.team.SponsorTeam SponsorTeam},
 * composed of {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit
 * AffinityUnit}s and a
 * {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsor}.
 * <p>
 * Both of them inherit from the
 * {@link com.wandrell.tabletop.dreadball.model.team.Team Team} interface, a
 * generic root interface storing all the methods common to the different teams.
 */
package com.wandrell.tabletop.dreadball.model.team;
