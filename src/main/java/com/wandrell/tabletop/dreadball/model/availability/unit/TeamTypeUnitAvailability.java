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

import com.wandrell.tabletop.dreadball.model.faction.TeamType;
import com.wandrell.tabletop.dreadball.model.unit.Unit;

/**
 * Unit availabilities for a {@link TeamType}, which are the Dreadball Original
 * (DBO) factions.
 * <p>
 * Each unit is available to a {@code TeamType} up to an amount, which is the
 * maximum number of that type of unit it is allowed to acquire.
 * <p>
 * There is also an initial number of them the team has. By the basic rules, any
 * new team will begin with all the initial units.
 * <p>
 * By default the maximum number for a unit is the double of the initial number,
 * but there are exceptions for this rule, as it happens with the initial number
 * is too high or way too low.
 * <p>
 * The interface works with {@link Unit}, and these are meant to be used to
 * build the actual unit class to be used, usually an implementation of
 * {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementUnit}.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface TeamTypeUnitAvailability {

    /**
     * Returns the initial number of times this unit should be taken.
     * <p>
     * Any new team of the indicated type will begin with this amount of copies
     * of the unit.
     * 
     * @return the initial number of times this unit should be taken
     */
    public Integer getInitialNumber();

    /**
     * Returns the maximum number of times this unit can be taken.
     * <p>
     * No team of the indicated type may acquire the unit more times than the
     * indicated amount.
     * 
     * @return the maximum number of times this unit can be taken
     */
    public Integer getMaxNumber();

    /**
     * Returns the {@code TeamType} to which this availability applies.
     * 
     * @return the {@code TeamType} to which this availability applies
     */
    public TeamType getTeamType();

    /**
     * Returns the {@code Unit} to which this availability applies.
     * 
     * @return the {@code Unit} to which this availability applies
     */
    public Unit getUnit();

}
