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

package com.wandrell.tabletop.dreadball.model.availability.asset;

/**
 * Interface for {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor
 * Sponsors} assets availability.
 * <p>
 * These are for Dreadball Xtreme (DBX), but are very similar to the ones for
 * Dreadball Original (DBO), even sharing some like the Coaching Die.
 * <p>
 * The biggest difference is conceptual, as these assets are mostly meant to be
 * bought with an allowance equal to the {@code Sponsor} rank. And also there is
 * not a maximum number of times they can be bought. After all, raising the
 * {@code Sponsor} rank is hard.
 * <p>
 * The interface includes, just for avoid adding an additional interface, a
 * method for finding out the minimal amount of money a {@code Sponsor} should
 * expend on a team.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface SponsorAssetsAvailability {

    /**
     * Returns the rank cost for acquiring a temporary affinities group.
     * <p>
     * These are affinities acquired for a single game, to reduce the cost of
     * certain units.
     * 
     * @return the rank cost for acquiring a temporary affinities group
     */
    public Integer getAffinityGroupCost();

    /**
     * Returns the cost for buying a Cheerleader in credits.
     * <p>
     * After unlocking the cheerleaders option with rank they can be bought for
     * credits.
     * <p>
     * These are used during the game to try getting more fan checks.
     * 
     * @return the cost for buying a Cheerleader in credits
     */
    public Integer getCheerleaderCost();

    /**
     * Returns the rank cost for unlocking the Cheerleaders buying option.
     * <p>
     * Cheerleaders needs first to be paid with rank points, which will unlock
     * them, and then can be bought one by one for an amount of credits each.
     * 
     * @return the cost for unlocking the Cheerleaders buying option
     */
    public Integer getCheerleaderUnlockCost();

    /**
     * Returns the rank cost for buying a Coaching Die.
     * <p>
     * These are dire which can be added to any roll.
     * 
     * @return the rank cost for buying a Coaching Die
     */
    public Integer getCoachingDieCost();

    /**
     * Returns the rank cost for buying a Medi-Bot.
     * <p>
     * These are robots which move through the field healing units.
     * 
     * @return the rank cost for buying a Medi-Bot
     */
    public Integer getMediBotCost();

    /**
     * Returns the rank cost for buying a Sabotage Card.
     * <p>
     * These are special events which are damaging to the enemy.
     * 
     * @return the rank cost for buying a Sabotage Card
     */
    public Integer getSabotageCardCost();

    /**
     * Returns the rank cost for buying a Special Move Card.
     * <p>
     * These are events which are helpful to the player.
     * 
     * @return the rank cost for buying a Special Move Card
     */
    public Integer getSpecialMovementCardCost();

    /**
     * Returns the minimum amount of money the Sponsor must spend on his team.
     * <p>
     * A team with a valoration lower than this amount would be illegal.
     * 
     * @return the minimum amount of money the Sponsor must spend on his team
     */
    public Integer getTeamCostMin();

    /**
     * Returns the cost for buying a Wager.
     * <p>
     * These will be used to try getting more money after the match ends.
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
