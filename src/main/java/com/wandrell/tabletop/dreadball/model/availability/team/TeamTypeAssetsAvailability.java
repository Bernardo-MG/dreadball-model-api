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

import com.wandrell.tabletop.dreadball.model.faction.TeamType;

/**
 * Interface for team assets availability.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface TeamTypeAssetsAvailability {

    /**
     * Returns the cost for buying a Coaching Die.
     * 
     * @return the cost for buying a Coaching Die
     */
    public Integer getCoachingDiceCost();

    /**
     * Returns the initial number of Coaching Dice for a team.
     * 
     * @return the initial number of Coaching Dice for a team
     */
    public Integer getCoachingDiceInitial();

    /**
     * Returns the maximum number of Coaching Dice which a team may buy.
     * 
     * @return the maximum number of Coaching Dice which a team may buy
     */
    public Integer getCoachingDiceMax();

    /**
     * Returns the cost for buying a Dreadball Card.
     * 
     * @return the cost for buying a Dreadball Card
     */
    public Integer getDreadballCardsCost();

    /**
     * Returns the initial number of Dreadball Cards for a team.
     * 
     * @return the initial number of Dreadball Cards for a team
     */
    public Integer getDreadballCardsInitial();

    /**
     * Returns the maximum number of Dreadball Cards which a team may buy.
     * 
     * @return the maximum number of Dreadball Cards which a team may buy
     */
    public Integer getDreadballCardsMax();

    /**
     * Returns the team type to which this availability applies.
     * 
     * @return the team type to which this availability applies
     */
    public TeamType getTeamType();

}
