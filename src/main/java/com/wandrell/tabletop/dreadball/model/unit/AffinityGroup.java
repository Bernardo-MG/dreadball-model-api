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
package com.wandrell.tabletop.dreadball.model.unit;

/**
 * Interface for affinity groups.
 * <p>
 * These are used on DBX to calculate unit prices. Both units and sponsors will
 * have them, depending on how many they share they will fall into an affinity
 * level, which will mark the cost for adding the unit into a team.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AffinityGroup {

    /**
     * Returns the affinity group's name.
     * 
     * @return the affinity group's name
     */
    public String getAffinityGroupName();

}
