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

import java.util.Collection;

/**
 * Interface extension for {@link UnitTemplate} representing one with affinities
 * groups, and various costs depending on affinities levels.
 * <p>
 * These are DBX units, where both the units and the sponsor trying to buy them
 * have affinities groups. Depending on how many they share the affinity level,
 * and so the price, will vary.
 * <p>
 * There is also a special kind of affinities, the hated affinities. If a type
 * of unit hates an affinity group, then no sponsor with that affinity may hire
 * those units.
 * <p>
 * The {@code getCost} method from the parent interface is meant to store the
 * cost at which the unit has been acquired, and is not expected to indicate
 * which of the three affinity costs is the one to be applied, but may do so,
 * depending on the implementation.
 * <p>
 * It should be noted that this interface makes sense when calculating the cost
 * a unit will have for a sponsor. Once it has been found, then it may be better
 * to revert to the basic {@code Unit}.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AffinityUnit extends UnitTemplate {

    /**
     * Returns this unit's affinity groups.
     * <p>
     * As it makes no sense for {@code AffinityGroup} instances to repeat, this
     * is expected to be actually a {@code Set}.
     * 
     * @return this unit's affinity groups
     */
    public Collection<AffinityGroup> getAffinityGroups();

    /**
     * Returns the cost of the unit when the affinity level is 'an ally'.
     * <p>
     * This is the best affinity level, and so this will be the lowest cost.
     * 
     * @return the cost of the unit when the affinity level is 'an ally'
     */
    public Integer getAllyCost();

    /**
     * Returns the cost of this unit.
     * <p>
     * This indicates how much did the unit cost when it was acquired, being
     * said cost one assigned to one of the affinity levels.
     * <p>
     * If the unit still has not being acquired, then the cost is expected to be
     * 0, but depending on the implementation it may instead indicate which of
     * the three costs is the one to be applied.
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
     * Returns this affinity groups hated by the unit.
     * <p>
     * As it makes no sense for {@code AffinityGroup} instances to repeat, this
     * is expected to be actually a {@code Set}.
     * 
     * @return affinity groups hated by the unit
     */
    public Collection<AffinityGroup> getHatedAffinityGroups();

    /**
     * Returns the cost of the unit when the affinity level is 'a stranger'.
     * <p>
     * This is the worse affinity level, and so this will be the highest cost.
     * 
     * @return the cost of the unit when the affinity level is 'a stranger'
     */
    public Integer getStrangerCost();

    /**
     * Returns the name given to the unit.
     * <p>
     * This is the basic unit from which the current unit has been created.
     * 
     * @return the template's name.
     */
    public String getUnitName();

    /**
     * Sets the name given to the unit.
     * 
     * @param name
     *            the name given to the unit
     */
    public void setUnitName(final String name);

}
