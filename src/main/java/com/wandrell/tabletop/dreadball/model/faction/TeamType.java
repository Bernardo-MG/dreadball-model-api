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
package com.wandrell.tabletop.dreadball.model.faction;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.ruleset.TeamRule;

/**
 * Represents a team type. These are the factions of DBO, the base group to
 * which each team belongs.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface TeamType {

    /**
     * Returns the special rules this team type has.
     * 
     * @return the special rules this team type has
     */
    public Collection<TeamRule> getRules();

    /**
     * Returns the team type's name.
     * 
     * @return the team type's name
     */
    public String getTeamTypeName();

}
