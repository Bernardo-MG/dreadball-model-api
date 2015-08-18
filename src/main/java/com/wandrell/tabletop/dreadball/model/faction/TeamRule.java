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

/**
 * Interface for representing a special rule for teams. It is used by the
 * {@link com.wandrell.tabletop.dreadball.model.faction.TeamType TeamType}
 * interface.
 * <p>
 * While this is an uncommon feature it is still used to indicate very specific
 * rules, which affect a single DBO team type.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.dreadball.model.faction.TeamType TeamType
 */
public interface TeamRule {

    /**
     * Returns the team rule's name.
     * 
     * @return the team rule's name
     */
    public String getTeamRuleName();

}