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
package com.wandrell.tabletop.dreadball.model.team;

import com.wandrell.tabletop.dreadball.model.faction.Sponsor;
import com.wandrell.tabletop.dreadball.model.unit.UnitTemplate;

/**
 * Interface extending {@link BaseTeam} for DBX teams, which are composed of
 * {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit AffinityUnit}
 * instances and a {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor
 * Sponsor}.
 * <p>
 * While said units are immutable, the {@code Sponsor} will store the changes
 * which occur from game to game.
 * <p>
 * This fact means that these teams, unlike the DBO ones, which are represented
 * by {@link com.wandrell.tabletop.dreadball.model.team.AdvancementTeam
 * AdvancementTeam}, are meant to be used once and then discarded.
 * <p>
 * It should be noted that some assets, such as the cards, are part of the team
 * and not the {@code Sponsor}. This is because these are bought before a match,
 * and will only last for that match.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface SponsorTeam extends BaseTeam<UnitTemplate> {

    /**
     * Returns the number of Medi-Bots available to the team for the next game.
     * <p>
     * Medi-Bots move through the field, trying to heal wounded units.
     * 
     * @return the number of Medi-Bots available to the team
     */
    public Integer getMediBots();

    /**
     * Returns the number of Sabotage Cards available to the team for the next
     * game.
     * <p>
     * These are special events which are damaging to the enemy.
     * 
     * @return the number of Sabotage Cards available to the team
     */
    public Integer getSabotageCards();

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
