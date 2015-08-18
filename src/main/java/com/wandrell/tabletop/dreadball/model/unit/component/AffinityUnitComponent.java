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
package com.wandrell.tabletop.dreadball.model.unit.component;

/**
 * Interface for a component with affinities groups, which will affect its cost.
 * <p>
 * The affinities groups will be those of the unit to which this component is
 * assigned, which is expected to be a
 * {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit AffinityUnit}.
 * <p>
 * The {@code getCost} method from the parent interface is meant to store the
 * cost at which the component has been acquired, and is not expected to
 * indicate which of the three affinity costs is the one to be applied, but may
 * do so, depending on the implementation.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.dreadball.model.unit.AffinityUnit AffinityUnit
 */
public interface AffinityUnitComponent extends UnitComponent {

    /**
     * Returns the cost of the unit when the affinity level is 'an ally'.
     * <p>
     * This is the best affinity level, and so this will be the lowest cost.
     * 
     * @return the cost of the unit when the affinity level is 'an ally'
     */
    public Integer getAllyCost();

    /**
     * 
     * Returns the cost paid this component.
     * <p>
     * This indicates how much did the component cost when it was acquired,
     * being said cost one assigned to one of the affinity levels.
     * <p>
     * If the component still has not being acquired, then the cost is expected
     * to be 0, but depending on the implementation it may instead indicate
     * which of the three costs is the one to be applied.
     * 
     * @return the cost of this unit at the time it was bought
     */
    @Override
    public Integer getCost();

    /**
     * Returns the cost of the unit when the affinity level is 'a friend'.
     * <p>
     * This is the average affinity level, and so this will be the average cost.
     * 
     * @return the cost of the unit when the affinity level is 'a friend'
     */
    public Integer getFriendCost();

    /**
     * Returns the cost of the unit when the affinity level is 'a stranger'.
     * <p>
     * This is the worse affinity level, and so this will be the highest cost.
     * 
     * @return the cost of the unit when the affinity level is 'a stranger'
     */
    public Integer getStrangerCost();

}
