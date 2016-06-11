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
 * MVP availabilities for a {@link TeamType}, which are the Dreadball Original
 * (DBO) factions.
 * <p>
 * MVPs are the equivalent of heroes or mercenaries for Dreadball, and can be
 * acquired for just a single match, for this reason they follow different
 * availability rules to the other units.
 * <p>
 * The interface works with {@link Unit}. As MVPs are one-time players they need
 * nothing more.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface TeamTypeMvpAvailability {

    /**
     * Returns the team to which this availability applies.
     * <p>
     * This is the team which may hire the MVP.
     * 
     * @return the team to which this availability applies
     */
    public TeamType getTeamType();

    /**
     * Returns the unit to which this availability applies.
     * <p>
     * This is the MVP available.
     * 
     * @return the unit to which this availability applies
     */
    public Unit getUnit();

}
