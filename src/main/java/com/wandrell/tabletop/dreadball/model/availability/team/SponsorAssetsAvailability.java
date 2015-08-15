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
package com.wandrell.tabletop.dreadball.model.availability.team;

/**
 * Interface for Sponsor assets availability.
 * <p>
 * This is by default shared by all Sponsors.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface SponsorAssetsAvailability {

    /**
     * Returns the cost for unlocking the Cheerleaders buying option.
     * 
     * @return the cost for unlocking the Cheerleaders buying option
     */
    public Integer getCheerleadersCost();

    /**
     * Returns the cost for buying a Cheerleader in credits.
     * 
     * @return the cost for buying a Cheerleader in credits
     */
    public Integer getCheerleadersCreditsCost();

    /**
     * Returns the rank cost for acquiring a temporary group.
     * 
     * @return the rank cost for acquiring a temporary group
     */
    public Integer getGroupCost();

    /**
     * Returns the cost for buying a Medi-Bot.
     * 
     * @return the cost for buying a Medi-Bot
     */
    public Integer getMediBotCost();

    /**
     * Returns the cost for buying a Sabotage Card.
     * 
     * @return the cost for buying a Sabotage Card
     */
    public Integer getSabotageCardCost();

    /**
     * Returns the cost for buying a Special Move Card.
     * 
     * @return the cost for buying a Special Move Card
     */
    public Integer getSpecialMovementCardCost();

    /**
     * Returns the minimum amount of money the Sponsor must spend on his team.
     * 
     * @return the minimum amount of money the Sponsor must spend on his team
     */
    public Integer getTeamCostMin();

    /**
     * Returns the cost for buying a Wager.
     * 
     * @return the cost for buying a Wager
     */
    public Integer getWagerCost();

    /**
     * Returns the maximum number of Wagers which a Sponsor may buy.
     * 
     * @return the maximum number of Wagers which a Sponsor may buy
     */
    public Integer getWagerMax();

}
