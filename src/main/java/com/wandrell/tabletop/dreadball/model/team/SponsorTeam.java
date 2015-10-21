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
 * Interface extending {@link BaseTeam} for DBX team, which are composed of
 * {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit AffinityUnits}
 * , and a {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsor}
 * , which is the one capable of changing.
 * <p>
 * The fact that the {@code Sponsor} is where the long term changes are kept
 * means that these teams, unlike the DBO ones, represented by
 * {@link com.wandrell.tabletop.dreadball.model.team.AdvancementTeam
 * AdvancementTeam}, are meant to be used once and then discarded.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface SponsorTeam extends BaseTeam<UnitTemplate> {

    /**
     * Returns the number of Medi-Bots available to the team for the next game.
     * 
     * @return the number of Medi-Bots available to the team
     */
    public Integer getMediBots();

    /**
     * Returns the number of Sabotage Cards available to the team for the next
     * game.
     * 
     * @return the number of Sabotage Cards available to the team
     */
    public Integer getSabotageCards();

    /**
     * Returns the number of Special Move Cards available to the team for the
     * next game.
     * 
     * @return the number of Special Move Cards available to the team
     */
    public Integer getSpecialMoveCards();

    /**
     * Returns the {@code Sponsor} which owns this team for the next game.
     * 
     * @return the {@code Sponsor} which owns this team
     */
    public Sponsor getSponsor();

    /**
     * Returns the number of Wagers available to the team for the next game.
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
