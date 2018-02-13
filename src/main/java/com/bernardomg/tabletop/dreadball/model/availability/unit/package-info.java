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
 * Unit availabilities.
 * <p>
 * These are used when creating teams, and will indicate which units can be
 * acquired by which faction.
 * <p>
 * They are divided into two groups, one for each type of faction, which are the
 * {@link com.bernardomg.tabletop.dreadball.model.faction.Sponsor Sponsor}, the
 * Dreadball Xtreme (DBX) faction, and the
 * {@link com.bernardomg.tabletop.dreadball.model.faction.TeamType TeamType},
 * the Dreadball Original (DBO) faction.
 * <h2>TeamType availabilities</h2>
 * <p>
 * For the {@code TeamType} the
 * {@link com.bernardomg.tabletop.dreadball.model.availability.unit.TeamTypeRangedUnitAvailability
 * TeamTypeUnitAvailability} indicates a unit which is available for building a
 * team, and its constraints, including the cost but also the initial amount of
 * them, which is the number of said type of players a team begins with.
 * <h2>Sponsor availabilities</h2>
 * <p>
 * A {@code Sponsor} has access to all the units, so there is no availability to
 * handle in that aspect.
 * <p>
 * Instead, the availability interface
 * {@link com.bernardomg.tabletop.dreadball.model.availability.unit.SponsorAffinityGroupAvailability
 * SponsorAffinityGroupAvailability} is used to know which affinity groups
 * compose the affinities table which is used when creating a {@code Sponsor}.
 */

package com.bernardomg.tabletop.dreadball.model.availability.unit;
