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
 * Represents a basic team, composed of units capable of improvement.
 * <p>
 * This is the team used on DBO.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface LicensedTeam extends Team<AdvancementUnit> {

    /**
     * Returns the cash available to the team.
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
     * Returns the type to which this team belongs.
     * 
     * @return the type to which this team belongs
     */
    public TeamType getType();

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
     * Sets the number of Dreadball Cards available to the team.
     * 
     * @param cards
     *            the number of Dreadball Cards available to the team
     */
    public void setDreadballCards(final Integer cards);

}
