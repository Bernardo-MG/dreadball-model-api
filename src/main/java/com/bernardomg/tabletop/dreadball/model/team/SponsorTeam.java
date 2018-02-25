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

package com.bernardomg.tabletop.dreadball.model.team;

import com.bernardomg.tabletop.dreadball.model.faction.Sponsor;
import com.bernardomg.tabletop.dreadball.model.player.AffinityGroup;
import com.bernardomg.tabletop.dreadball.model.player.TeamPlayer;

/**
 * Dreadball Xtreme (DBX) team, composed of units with affinities, and a Sponsor
 * which changes over time.
 * <p>
 * This fact means that these teams, unlike the DBO ones, which are represented
 * by {@link com.bernardomg.tabletop.dreadball.model.team.AdvancementTeam
 * AdvancementTeam}, are meant to be used once and then discarded.
 * <p>
 * It should be noted that some assets, such as the cards, are part of the team
 * and not the {@code Sponsor}. This is because these are bought before a match,
 * and will only last for that match.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface SponsorTeam extends Team<TeamPlayer> {

    /**
     * Adds an additional affinity group for the team for the next game.
     * 
     * @param affinityGroup
     *            additional affinity group
     */
    public void addAdditionalAffinityGroup(final AffinityGroup affinityGroup);

    /**
     * Removes all the additional affinity groups.
     */
    public void clearAdditionalAffinityGroups();

    /**
     * Returns the additional affinity groups available to the team for the next
     * game.
     * <p>
     * Affinity groups affect unit costs.
     * 
     * @return the additional affinity groups available to the team
     */
    public Iterable<AffinityGroup> getAdditionalAffinityGroups();

    /**
     * Returns the base rank.
     * <p>
     * This is calculated from the Sponsor rank.
     * 
     * @return the current rank
     */
    public Integer getBaseRank();

    /**
     * Returns the current rank.
     * <p>
     * This is calculated from the Sponsor rank, reduced by the rank spent.
     * 
     * @return the current rank
     */
    public Integer getCurrentRank();

    /**
     * Returns the number of Medi-Bots available to the team for the next game.
     * <p>
     * Medi-Bots move through the field, trying to heal wounded units.
     * 
     * @return the number of Medi-Bots available to the team
     */
    public Integer getMediBots();

    /**
     * Returns the number of Nasty Surprise Cards available to the team for the
     * next game.
     * <p>
     * These are special events which are damaging to the enemy.
     * 
     * @return the number of Nasty Surprise available to the team
     */
    public Integer getNastySurpriseCards();

    /**
     * Returns the rank cost of the team assets.
     * 
     * @return the rank cost of the team assets
     */
    public Integer getRankCost();

    /**
     * Returns the number of Special Move Cards available to the team for the
     * next game.
     * <p>
     * These are events which are helpful to the player.
     * 
     * @return the number of Special Move Cards available to the team
     */
    public Integer getSpecialMoveCards();

    /**
     * Returns the {@code Sponsor} which owns this team for the next game.
     * <p>
     * This will store all the important changes from game to game.
     * 
     * @return the {@code Sponsor} which owns this team
     */
    public Sponsor getSponsor();

    /**
     * Returns the number of Wagers available to the team for the next game.
     * <p>
     * These will be used to try getting more money after the match ends.
     * 
     * @return the number of Wagers available to the team
     */
    public Integer getWagers();

    /**
     * Sets the number of Medi-Bots available to the team for the next game.
     * 
     * @param medibots
     *            the number of Medi-Bots available to the team
     */
    public void setMediBots(final Integer medibots);

    /**
     * Sets the number of Sabotage Cards available to the team for the next
     * game.
     * 
     * @param cards
     *            the number of Sabotage Cards available to the team
     */
    public void setSabotageCards(final Integer cards);

    /**
     * Sets the number of Special Move Cards available to the team for the next
     * game.
     * 
     * @param cards
     *            the number of Special Move Cards available to the team
     */
    public void setSpecialMoveCards(final Integer cards);

    /**
     * Sets the number of Wagers available to the team for the next game.
     * 
     * @param wagers
     *            the number of Wagers available to the team
     */
    public void setWagers(final Integer wagers);

}
