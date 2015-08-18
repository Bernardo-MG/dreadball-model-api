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

import com.wandrell.tabletop.dreadball.model.faction.TeamType;
import com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit;

/**
 * Interface extending {@link Team} for DBO teams, which are composed of
 * {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementUnits} capable of changing from game to game.
 * <p>
 * These teams are of a particular {@link TeamType}, which takes relevance when
 * creating or changing it, as this type dictates the various availabilities.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AdvancementTeam extends Team<AdvancementUnit> {

    /**
     * Returns the cash available to the team.
     * <p>
     * This is the money which the team may expend to improve itself, by buying
     * new assets or players.
     * 
     * @return the team's unspent cash
     */
    public Integer getCash();

    /**
     * Returns the number of Dreadball Cards available to the team.
     * 
     * @return the number of Dreadball Cards available to the team
     */
    public Integer getDreadballCards();

    /**
     * Returns the name given to the team.
     * 
     * @return the name given to the team
     */
    public String getTeamName();

    /**
     * Returns the type of team to which this team belongs.
     * <p>
     * This is basically the Dreadball faction on which this team is based.
     * 
     * @return the type of team to which this team belongs
     */
    public TeamType getTeamType();

    /**
     * Indicates if the team has a defensive Coaching Staff.
     * 
     * @return {@code true} if the team has a defensive Coaching Staff,
     *         {@code false} otherwise
     */
    public Boolean hasDefensiveCoachingStaff();

    /**
     * Indicates if the team has an offensive Coaching Staff.
     * 
     * @return {@code true} if the team has an offensive Coaching Staff,
     *         {@code false} otherwise
     */
    public Boolean hasOffensiveCoachingStaff();

    /**
     * Indicates if the team has a support Coaching Staff.
     * 
     * @return {@code true} if the team has a support Coaching Staff,
     *         {@code false} otherwise
     */
    public Boolean hasSupportCoachingStaff();

    /**
     * Sets the team's cash.
     * 
     * @param cash
     *            the cash which will be available to the team
     */
    public void setCash(final Integer cash);

    /**
     * Sets the team's defensive coach status.
     * <p>
     * This is a flag indicating if the team has a defensive coach or not.
     * 
     * @param coach
     *            a boolean flag indicating if the team has a defensive coach or
     *            not
     */
    public void setDefensiveCoachingStaff(final Boolean coach);

    /**
     * Sets the number of Dreadball Cards available to the team.
     * 
     * @param cards
     *            the number of Dreadball Cards available to the team
     */
    public void setDreadballCards(final Integer cards);

    /**
     * Sets the team's offensive coach status.
     * <p>
     * This is a flag indicating if the team has an offensive coach or not.
     * 
     * @param coach
     *            a boolean flag indicating if the team has an offensive coach
     *            or not
     */
    public void setOffensiveCoachingStaff(final Boolean coach);

    /**
     * Sets the team's support coach status.
     * <p>
     * This is a flag indicating if the team has a support coach or not.
     * 
     * @param coach
     *            a boolean flag indicating if the team has a support coach or
     *            not
     */
    public void setSupportCoachingStaff(final Boolean coach);

    /**
     * Sets the team's name.
     * 
     * @param name
     *            the team's name
     */
    public void setTeamName(final String name);

}