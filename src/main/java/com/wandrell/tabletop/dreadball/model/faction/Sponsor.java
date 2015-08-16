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

import com.wandrell.tabletop.dreadball.model.unit.AffinityGroup;

/**
 * Interface representing a sponsor, which are the DBX factions.
 * <p>
 * At a difference to what is common for factions, these are mutable, as they
 * are meant to be customized by the user.
 * <p>
 * In first place it has a series of affinity groups, which will mark the costs
 * of units for this sponsor, but also will keep track of cash and rank, which
 * will be used also when creating a team.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface Sponsor {

    /**
     * Adds an affinity group to the sponsor.
     * 
     * @param affinity
     *            the affinity group to add to the sponsor
     */
    public void addAfinityGroup(final AffinityGroup affinity);

    /**
     * Returns the affinity groups for the sponsor.
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
     * Returns the sponsor's rank.
     * 
     * @return the sponsor's rank
     */
    public Integer getRank();

    /**
     * Returns the sponsor's name.
     * 
     * @return the sponsor's name
     */
    public String getSponsorName();

    /**
     * Removes an affinity group from the sponsor.
     * 
     * @param affinity
     *            the affinity group to remove from the sponsor
     */
    public void removeAfinityGroup(final AffinityGroup affinity);

    /**
     * Sets the sponsor's cash.
     * 
     * @param cash
     *            the cash which will be available to the sponsor
     */
    public void setCash(final Integer cash);

    /**
     * Sets the sponsor's rank.
     * 
     * @param rank
     *            the sponsor's rank
     */
    public void setRank(final Integer rank);

}
