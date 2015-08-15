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

import com.wandrell.tabletop.dreadball.model.faction.TeamType;
import com.wandrell.tabletop.dreadball.model.unit.Unit;

/**
 * Interface for representing the unit availabilities for a DBO team.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface TeamTypeUnitAvailability {

    /**
     * Returns the initial number of times this unit should be taken.
     * 
     * @return the initial number of times this unit should be taken
     */
    public Integer getInitialNumber();

    /**
     * Returns the maximum number of times this unit can be taken.
     * 
     * @return the maximum number of times this unit can be taken
     */
    public Integer getMaxNumber();

    /**
     * Returns the team to which this availability applies.
     * 
     * @return the team to which this availability applies
     */
    public TeamType getTeamType();

    /**
     * Returns the unit to which this availability applies.
     * 
     * @return the unit to which this availability applies
     */
    public Unit getUnit();

}
