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
 * Provides interfaces for unit availabilities.
 * <p>
 * These are used when creating teams, and will indicate which units can be
 * acquired.
 * <p>
 * They are divided into two groups, one for each type of faction, which are the
 * {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsor} and the
 * {@link com.wandrell.tabletop.dreadball.model.faction.TeamType TeamType}.
 * <h2>TeamType availabilities</h2>
 * <p>
 * For the {@code TeamType}, DBO's faction, the
 * {@link com.wandrell.tabletop.dreadball.model.availability.unit.TeamTypeUnitAvailability
 * TeamTypeUnitAvailability} indicates a unit available for building a team and
 * its constraints.
 * <p>
 * A variant of it, the
 * {@link com.wandrell.tabletop.dreadball.model.availability.unit.TeamTypeMVPAvailability
 * TeamTypeMVPAvailability}, is used to indicate a MVP availability. These are
 * separated from the basic availabilities class as MVPs follow a single
 * different approach, as they are available as a short of mercenaries for
 * single matches.
 * <h2>Sponsor availabilities</h2>
 * <p>
 * Sponsors have access to all the units, so there is no availability to handle
 * in that aspect.
 * <p>
 * Instead, the availability interface
 * {@link com.wandrell.tabletop.dreadball.model.availability.unit.SponsorAffinityGroupAvailability
 * SponsorAffinityGroupAvailability} is used to build the affinities groups
 * availabilities table which is used when creating a sponsor.
 */
package com.wandrell.tabletop.dreadball.model.availability.unit;
