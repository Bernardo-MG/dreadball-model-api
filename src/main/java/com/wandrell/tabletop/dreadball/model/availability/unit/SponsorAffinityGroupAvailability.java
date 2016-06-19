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

package com.wandrell.tabletop.dreadball.model.availability.unit;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.unit.AffinityGroup;

/**
 * Affinity group availabilities for a
 * {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsors}, to be
 * acquired during their creation.
 * <p>
 * This is used for building the affinity table from the Dreadball Xtreme Player
 * Manual, and each instance will represent one row.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsors
 */
public interface SponsorAffinityGroupAvailability {

    /**
     * Returns the player groups affinities available for sponsors.
     * <p>
     * This will make up a single row, meaning that the player will have to pick
     * one of these affinities.
     * 
     * @return the player groups affinities available for sponsors
     */
    public Collection<AffinityGroup> getAffinityGroups();

    /**
     * Name of the availability.
     * <p>
     * This is the name of the equivalent row on the affinities groups
     * availabilities table, and meant to be used for shorting the
     * availabilities.
     * 
     * @return the availability name
     */
    public String getName();

    /**
     * Indicates if it allows increasing the Sponsor's rank instead of acquiring
     * a group.
     * <p>
     * Some rows allow this option, which may mean less discounts for units in
     * exchange of more assets for a game.
     * <p>
     * Remember that some units hate certain affinities, and so having fewer
     * affinity groups may mean more available units.
     * 
     * @return {@code true} if it allows increasing the rank instead of buying a
     *         group, {@code false} otherwise
     */
    public Boolean isIncludingRankIncrease();

}
