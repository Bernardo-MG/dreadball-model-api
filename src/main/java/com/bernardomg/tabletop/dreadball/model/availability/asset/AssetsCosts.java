/**
 * Copyright 2015-2018 the original author or authors
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

package com.bernardomg.tabletop.dreadball.model.availability.asset;

/**
 * Asset availabilities for a
 * {@link com.bernardomg.tabletop.dreadball.model.faction.Sponsor Sponsors}.
 * <p>
 * These are for Dreadball Xtreme (DBX), but are very similar to the ones for
 * Dreadball Original (DBO), even sharing some assets like the Coaching Die.
 * <p>
 * The biggest difference is that in DBX the assets do not need to be inside a
 * defined range, and that there are two sets of costs: assets can be paid with
 * the sponsor rank or with credits.
 * <p>
 * To avoid cluttering the interface there is only a single set of cost methods.
 * To handle both the rank and credit costs two different instances of the
 * interface should be used.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface AssetsCosts {

    /**
     * Returns the rank cost for acquiring a temporary affinities group.
     * 
     * @return the rank cost for acquiring a temporary affinities group
     */
    public Integer getAffinityGroupCost();

    /**
     * Returns the cost for buying a Cheerleader in credits.
     * 
     * @return the cost for buying a Cheerleader in credits
     */
    public Integer getCheerleaderCost();

    /**
     * Returns the rank cost for buying a Coaching Die.
     * 
     * @return the rank cost for buying a Coaching Die
     */
    public Integer getCoachingDieCost();

    /**
     * Returns the rank cost for buying a Medi-Bot.
     * 
     * @return the rank cost for buying a Medi-Bot
     */
    public Integer getMediBotCost();

    /**
     * Returns the rank cost for buying a Nasty Surprise Card.
     * 
     * @return the rank cost for buying a Nasty Surprise Card
     */
    public Integer getNastySurpriseCardCost();

    /**
     * Returns the rank cost for buying a Special Move Card.
     * 
     * @return the rank cost for buying a Special Move Card
     */
    public Integer getSpecialMoveCardCost();

    /**
     * Returns the cost for buying a Wager.
     * 
     * @return the cost for buying a Wager
     */
    public Integer getWagerCost();

}
