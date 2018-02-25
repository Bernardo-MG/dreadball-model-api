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

package com.bernardomg.tabletop.dreadball.model.availability.asset;

import com.bernardomg.tabletop.dreadball.model.faction.TeamType;

/**
 * Assets availabilities for a {@link TeamType}, which are the Dreadball
 * Original (DBO) factions.
 * <p>
 * Assets availiabilities, in a similar way to units, should be inside a range.
 * There is an initial amount and a maximum amount for each of them.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface TeamTypeAssetsAvailability {

    /**
     * Returns the cost for buying a Cheerleader.
     * 
     * @return the cost for buying a Cheerleader
     */
    public Integer getCheerleaderCost();

    /**
     * Returns the initial number of Cheerleaders for a team.
     * 
     * @return the initial number of Cheerleaders for a team
     */
    public Integer getCheerleaderInitial();

    /**
     * Returns the maximum number of Cheerleaders which a team may buy.
     * 
     * @return the maximum number of Cheerleaders which a team may buy
     */
    public Integer getCheerleaderMax();

    /**
     * Returns the cost for buying a Coaching Die.
     * 
     * @return the cost for buying a Coaching Die
     */
    public Integer getCoachingDieCost();

    /**
     * Returns the initial number of Coaching Dice for a team.
     * 
     * @return the initial number of Coaching Dice for a team
     */
    public Integer getCoachingDieInitial();

    /**
     * Returns the maximum number of Coaching Dice which a team may buy.
     * 
     * @return the maximum number of Coaching Dice which a team may buy
     */
    public Integer getCoachingDieMax();

    /**
     * Returns the cost for buying a CoachingStaff.
     * 
     * @return the cost for buying a CoachingStaff
     */
    public Integer getCoachingStaffCost();

    /**
     * Returns the cost for buying a Dreadball Card.
     * 
     * @return the cost for buying a Dreadball Card
     */
    public Integer getDreadballCardCost();

    /**
     * Returns the initial number of Dreadball Cards for a team.
     * 
     * @return the initial number of Dreadball Cards for a team
     */
    public Integer getDreadballCardInitial();

    /**
     * Returns the maximum number of Dreadball Cards which a team may buy.
     * 
     * @return the maximum number of Dreadball Cards which a team may buy
     */
    public Integer getDreadballCardMax();

    /**
     * Indicates if the team starts with a Defensive Coaching Staff.
     * 
     * @return {@code true} if the team starts with a defensive Coaching Staff,
     *         {@code false} otherwise
     */
    public Boolean getStartingWithDefensiveCoachingStaff();

    /**
     * Indicates if the team starts with an Offensive Coaching Staff.
     * 
     * @return {@code true} if the team starts with an offensive Coaching Staff,
     *         {@code false} otherwise
     */
    public Boolean getStartingWithOffensiveCoachingStaff();

    /**
     * Indicates if the team starts with a Support Coaching Staff.
     * 
     * @return {@code true} if the team starts with a support Coaching Staff,
     *         {@code false} otherwise
     */
    public Boolean getStartingWithSupportCoachingStaff();

    /**
     * Returns the team type to which this availability applies.
     * 
     * @return the team type to which this availability applies
     */
    public TeamType getTeamType();

}
