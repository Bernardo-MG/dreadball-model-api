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
package com.wandrell.tabletop.dreadball.model.availability.components;

/**
 * Interface representing the components available to create a unit which is
 * assigned to unit groups.
 * <p>
 * This is meant to be used for Dreadball Extreme teams.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface GroupedUnitComponentAvailability extends
        UnitComponentAvailability {

    /**
     * Returns the cost when the affinity level is 'an ally'.
     * 
     * @return the cost when the affinity level is 'an ally'
     */
    public Integer getAllyCost();

    /**
     * Returns the cost when the affinity level is 'a friend'.
     * 
     * @return the cost when the affinity level is 'a friend'
     */
    public Integer getFriendCost();

    /**
     * Returns the cost when the affinity level is 'a stranger'.
     * 
     * @return the cost when the affinity level is 'a stranger'
     */
    public Integer getStrangerCost();

}
