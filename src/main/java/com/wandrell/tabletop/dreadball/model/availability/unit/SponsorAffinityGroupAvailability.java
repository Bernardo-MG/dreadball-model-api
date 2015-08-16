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
package com.wandrell.tabletop.dreadball.model.availability.unit;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.unit.AffinityGroup;

/**
 * Interface for representing the player groups affinities which
 * {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsors} may
 * acquire during their creation.
 * <p>
 * Each instance of this interface is one row of the affinities table from the
 * Dreadball Xtreme Player Manual.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsors
 */
public interface SponsorAffinityGroupAvailability {

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
     * Returns the player groups affinities available for sponsors.
     * 
     * @return the player groups affinities available for sponsors
     */
    public Collection<AffinityGroup> getPlayerGroups();

    /**
     * Indicates if it allows increasing the Sponsor's rank instead of acquiring
     * a group.
     * 
     * @return {@code true} if it allows increasing the rank instead of buying a
     *         group, {@code false} otherwise
     */
    public Boolean isIncludingRankIncrease();

}
