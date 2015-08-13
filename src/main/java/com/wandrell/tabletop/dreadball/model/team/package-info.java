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
 * Provides interfaces for teams and their assets.
 * <p>
 * There are two types of teams: the
 * {@link com.wandrell.tabletop.dreadball.model.team.LicensedTeam LicensedTeam}
 * is the basic one, which contains a series of players capable of improving,
 * while the {@link com.wandrell.tabletop.dreadball.model.team.SponsorTeam
 * SponsorTeam} contains a series of static players incapable of improving, and
 * a sponsor, which is capable of improvement.
 * <p>
 * Both of these inherit from the
 * {@link com.wandrell.tabletop.dreadball.model.team.Team Team} interface.
 * <p>
 * The {@code LicensedTeam} is for the DBO teams, while the {@code SponsorTeam}
 * is for the Dreadball Extreme teams.
 * <p>
 * There are also interfaces for any team asset which goes beyond players. These
 * are stored in the {@link com.wandrell.tabletop.dreadball.model.team.asset
 * asset} package.
 */
package com.wandrell.tabletop.dreadball.model.team;
