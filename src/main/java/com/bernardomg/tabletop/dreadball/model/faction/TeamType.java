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

package com.bernardomg.tabletop.dreadball.model.faction;

import java.util.Collection;

/**
 * Team type, which are the Dreadball Original (DBO) factions. They are also
 * used to group together Dreadball Xtreme (DBX) units.
 * <p>
 * They are used to mark availabilities through the availabilities interfaces.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see com.bernardomg.tabletop.dreadball.model.team.AdvancementTeam
 *      AdvancementTeam
 */
public interface TeamType {

    /**
     * Returns the team type's name.
     * <p>
     * This serves to identify the team type.
     * 
     * @return the team type's name
     */
    public String getName();

    /**
     * Returns the special rules this team type has.
     * <p>
     * These are infrequent global rules which affect the team's gameplay.
     * 
     * @return the special rules this team type has
     */
    public Collection<TeamRule> getTeamRules();

}
