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
 * Provides interfaces for team assets availability classes.
 * <p>
 * In a similar way to unit availabilities, these are meant to be used during
 * the team building procedure, but are simpler, as assets have little more
 * information than the cost and the number of times they appear on a team.
 * <p>
 * The interfaces are divided into DBO, with the
 * {@link com.wandrell.tabletop.dreadball.model.availability.team.TeamTypeAssetsAvailability
 * TeamTypeAssetsAvailability}, and DBX, with the
 * {@link com.wandrell.tabletop.dreadball.model.availability.team.SponsorAssetsAvailability
 * SponsorAssetsAvailability}.
 * <p>
 * They are very similar, being the main difference which assets each game has.
 */
package com.wandrell.tabletop.dreadball.model.availability.team;
