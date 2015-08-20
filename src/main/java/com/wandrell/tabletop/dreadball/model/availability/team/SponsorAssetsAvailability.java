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
 * Interface for {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor
 * Sponsors} assets availability.
 * <p>
 * These are for DBX, but are very similar to DBO. The main difference is that
 * assets are mostly paid with the {@code Sponsor} rank, and there is no limit
 * to them.
 * <p>
 * It includes also a query method to find out the minimal amount of money a
 * {@code Sponsor} should expend on a team.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface SponsorAssetsAvailability {

    /**
     * Returns the rank cost for acquiring a temporary affinities group.
     * 
     * @return the rank cost for acquiring a temporary affinities group
     */
    public Integer getAffinityGroupCost();

    /**
     * Returns the cost for buying a Cheerleader in credits.
     * <p>
     * After unlocking the cheerleaders option with rank, they can be bought for
     * creadits.
     * 
     * @return the cost for buying a Cheerleader in credits
     */
    public Integer getCheerleaderCost();

    /**
     * Returns the rank cost for unlocking the Cheerleaders buying option.
     * <p>
     * Cheerleaders needs first to be paid with rank points, which will unlock
     * them, and then can be bought for an amount of credits each.
     * 
     * @return the cost for unlocking the Cheerleaders buying option
     */
    public Integer getCheerleaderUnlockCost();

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
     * Returns the rank cost for buying a Sabotage Card.
     * 
     * @return the rank cost for buying a Sabotage Card
     */
    public Integer getSabotageCardCost();

    /**
     * Returns the rank cost for buying a Special Move Card.
     * 
     * @return the rank cost for buying a Special Move Card
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
    public Integer getWagerMaxCount();

}
