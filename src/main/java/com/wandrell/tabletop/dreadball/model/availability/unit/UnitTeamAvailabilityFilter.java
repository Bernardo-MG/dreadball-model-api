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

import com.wandrell.tabletop.dreadball.model.faction.TeamType;
import com.wandrell.tabletop.dreadball.model.unit.BilledUnit;

/**
 * Interface representing the availability limitations for a unit.
 * <p>
 * This is meant to be used for DBO MVPs.
 * <p>
 * Only the black list or the black list should be used, no both.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface UnitTeamAvailabilityFilter {

    /**
     * Returns the teams blacklisted for this player.
     * 
     * @return the teams blacklisted for this player
     */
    public Collection<TeamType> getTeamsBlackList();

    /**
     * Returns the teams whitelisted for this player.
     * 
     * @return the teams whitelisted for this player
     */
    public Collection<TeamType> getTeamsWhiteList();

    /**
     * Returns the unit to which this filter applies.
     * 
     * @return the unit to which this filter applies
     */
    public BilledUnit getUnit();

}
