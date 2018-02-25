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

package com.bernardomg.tabletop.dreadball.model.player;

import java.util.Collection;

import com.bernardomg.tabletop.dreadball.model.player.stats.AffinityGroup;

/**
 * Player with affinity groups, and various costs which will depend on how many
 * of such affinities are shared.
 * <p>
 * These units are meant to be used for representing Dreadball Xtreme (DBX)
 * units, where both the units and the
 * {@link com.bernardomg.tabletop.dreadball.model.faction.Sponsor Sponsor}
 * trying to buy them will have a collection of affinity groups. The number of
 * these shared will mark the affinity level, and so will also mark the cost to
 * use.
 * <p>
 * There is also a special kind of affinities, the hated affinities. If a type
 * of unit hates an affinity group, then no {@code Sponsor} having that affinity
 * may hire those units.
 * <p>
 * The {@code getCost} method from the parent interface is meant to store the
 * cost at which the unit has been acquired, and is not expected to indicate
 * which of the three affinity costs is the one to be applied, in case the
 * affinities and said cost were to change.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see com.bernardomg.tabletop.dreadball.model.faction.Sponsor Sponsor
 */
public interface AffinityTeamPlayer extends TeamPlayer {

    /**
     * Returns the unit's affinity groups.
     * <p>
     * These will be used to choose the correct cost for the unit, depending on
     * how many it shares with the sponsor trying to acquire it.
     * <p>
     * As it makes no sense for affinities to repeat, this is expected to be
     * actually a {@code Set}.
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
     * This indicates how much did the unit cost when it was acquired.
     * <p>
     * If the unit still has not being acquired, then the cost is expected to be
     * 0.
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
     * If a sponsor has any of these affinities then he can not acquire the
     * unit.
     * <p>
     * As it makes no sense for affinities to repeat, this is expected to be
     * actually a {@code Set}.
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
     * Sets the name given to the unit.
     * <p>
     * This is name used by the user to identify the unit.
     * 
     * @param name
     *            the name given to the unit
     */
    public void setName(final String name);

}
