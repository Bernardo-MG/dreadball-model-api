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

package com.bernardomg.tabletop.dreadball.model.availability.player;

import com.bernardomg.tabletop.dreadball.model.faction.TeamType;
import com.bernardomg.tabletop.dreadball.model.player.TeamPlayer;

/**
 * Player availabilities for a {@link TeamType}, to be used for both Dreadball
 * Original (DBO) and Dreadball Xtreme (DBX).
 * <p>
 * With this each unit is linked to a {@code TeamType}.
 * <p>
 * The interface works with {@link TeamPlayer}, no matter the actual
 * implementation used.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface TeamPlayerAvailability {

    /**
     * Returns the {@link TeamPlayer} to which this availability applies.
     * 
     * @return the {@code TeamPlayer} to which this availability applies
     */
    public TeamPlayer getTeamPlayer();

    /**
     * Returns the {@link TeamType} to which this availability applies.
     * 
     * @return the {@code TeamType} to which this availability applies
     */
    public TeamType getTeamType();

}
