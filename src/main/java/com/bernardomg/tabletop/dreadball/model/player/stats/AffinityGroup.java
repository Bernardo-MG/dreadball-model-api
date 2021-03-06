/**
 * Copyright 2015-2018 the original author or authors
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

package com.bernardomg.tabletop.dreadball.model.player.stats;

import com.bernardomg.tabletop.dreadball.model.player.AffinityTeamPlayer;

/**
 * Affinity group.
 * <p>
 * These are used on Dreadball Xtreme (DBX) to calculate unit prices. Both units
 * and sponsors will have them, and depending on how many they share they will
 * fall into an affinity level. This will mark the cost for adding the unit into
 * a team.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see AffinityTeamPlayer
 * @see com.bernardomg.tabletop.dreadball.model.faction.Sponsor Sponsor
 */
public interface AffinityGroup {

    /**
     * Returns the affinity group name.
     * <p>
     * This serves to identify the affinity group.
     * 
     * @return the affinity group name
     */
    public String getName();

}
