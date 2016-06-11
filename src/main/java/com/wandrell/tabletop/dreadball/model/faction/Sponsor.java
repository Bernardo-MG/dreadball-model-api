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

package com.wandrell.tabletop.dreadball.model.faction;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.unit.AffinityGroup;

/**
 * Sponsor, which are the Dreadball Xtreme (DBX) factions.
 * <p>
 * At a difference to what is common for factions, these are mutable, as they
 * are meant to be customized by the user, and also change from game to game.
 * <p>
 * The most important feature they have are the affinity groups, which will mark
 * the costs of units for this sponsor. And also the units available, as some of
 * them won't be available for a {@code Sponsor} with certain affinities.
 * <p>
 * Additionally, it will keep track of cash and rank, which will also be used
 * when creating a team.
 * <p>
 * For each game a {@code Sponsor} will be used to build a team, which will last
 * only for that game. These teams are represented by the
 * {@link com.wandrell.tabletop.dreadball.model.team.SponsorTeam SponsorTeam}
 * interface.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface Sponsor {

    /**
     * Adds an affinity group to the sponsor.
     * 
     * @param affinity
     *            the affinity group to add to the sponsor
     */
    public void addAffinityGroup(final AffinityGroup affinity);

    /**
     * Returns the affinity groups for the sponsor.
     * <p>
     * These will be used when buying players for creating a team, and will mark
     * the costs and availabilities.
     * 
     * @return the affinity groups for the sponsor
     */
    public Collection<AffinityGroup> getAffinityGroups();

    /**
     * Returns the cash available to the sponsor.
     * 
     * @return the sponsor's unspent cash
     */
    public Integer getCash();

    /**
     * Returns the sponsor's name.
     * <p>
     * This is name used by the user to identify the sponsor.
     * 
     * @return the sponsor's name
     */
    public String getName();

    /**
     * Returns the sponsor's rank.
     * <p>
     * This is the level of the {@code Sponsor}, and will be used to calculate
     * how many assets he may buy for a game.
     * 
     * @return the sponsor's rank
     */
    public Integer getRank();

    /**
     * Removes an affinity group from the sponsor.
     * 
     * @param affinity
     *            the affinity group to remove from the sponsor
     */
    public void removeAffinityGroup(final AffinityGroup affinity);

    /**
     * Sets the affinity groups of the sponsor.
     * <p>
     * The old affinity groups will be removed and changed for these.
     * 
     * @param affinities
     *            the new affinity groups for the sponsor
     */
    public void setAffinityGroups(final Collection<AffinityGroup> affinities);

    /**
     * Sets the sponsor's cash.
     * 
     * @param cash
     *            the cash which will be available to the sponsor
     */
    public void setCash(final Integer cash);

    /**
     * Sets the sponsor's name.
     * <p>
     * This is name used by the user to identify the sponsor.
     * 
     * @param name
     *            the sponsor name
     */
    public void setName(final String name);

    /**
     * Sets the sponsor's rank.
     * 
     * @param rank
     *            the sponsor's rank
     */
    public void setRank(final Integer rank);

}
