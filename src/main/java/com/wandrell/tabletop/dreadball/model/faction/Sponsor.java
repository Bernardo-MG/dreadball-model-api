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

import com.wandrell.tabletop.dreadball.model.unit.UnitGroup;

/**
 * Interface representing a sponsor.
 * <p>
 * These serve as factions on Dreadball Extreme, with the addition of being
 * configurable.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface Sponsor {

    /**
     * Returns the cash available to the sponsor.
     * 
     * @return the sponsor's unspent cash
     */
    public Integer getCash();

    /**
     * Returns the player groups affinity for this sponsor.
     * 
     * @return the player groups affinity for this sponsor
     */
    public Collection<UnitGroup> getPlayerGroups();

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
