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

import java.util.Map;

import com.wandrell.tabletop.dreadball.model.unit.UnitTemplate;

/**
 * Interface representing the basic features all the Dreadball teams have, no
 * matter if they come from Dreadball Original (DBO) or Dreaball Xtreme (DBX),
 * serving as a root interface for both games.
 * <p>
 * It is not meant to be used by itself, instead any of the interfaces
 * overriding this should be used.
 * <p>
 * Due to the fact that the DBO and DBX unit interfaces differ, the {@code Team}
 * makes use of a template, which will reflect the actual unit being used.
 * <p>
 * Among all the features the interface offers, which are mostly query methods,
 * the most important is the {@link #getValoration() getValoration} method, as
 * it allows acquiring the current value of said team.
 * <p>
 * The strategy to calculate the valoration basically is calculating the sum of
 * the valoration of each player and the cost of each asset the team owns. All
 * the business logic required for this is expected to be handled by
 * implementations of the interface.
 * <p>
 * When assigning a player to the team it has to receive a numerical position in
 * it, which should be unassigned, as no two players may share the same number.
 * 
 * @author Bernardo Martínez Garrido
 * @param <U>
 *            the type of unit the {@code Team} contains
 */
public interface BaseTeam<U extends UnitTemplate> {

    /**
     * Adds a player to the team.
     * <p>
     * This player should be assigned to a position within the team. If there is
     * already a player on that position, then the new one will take his place.
     * 
     * @param player
     *            the new player
     * @param position
     *            the position where this player will be assigned
     */
    public void addPlayer(final U player, final Integer position);

    /**
     * Returns the number of Cheerleaders available to the team.
     * <p>
     * These are used during the game to try getting more fan checks.
     * 
     * @return the number of Cheerleaders available to the team
     */
    public Integer getCheerleaders();

    /**
     * Returns the number of Coaching Dice available to the team.
     * <p>
     * These are used during the game and added to any roll.
     * 
     * @return the number of Coaching Dice available to the team
     */
    public Integer getCoachingDice();

    /**
     * Returns all the units and their positions.
     * 
     * @return all the units and their positions
     */
    public Map<Integer, U> getPlayers();

    /**
     * Returns the current valoration of the team.
     * <p>
     * A team's valoration is the sum of the valorations and costs of all its
     * players and assets.
     * 
     * @return the team's current valoration
     */
    public Integer getValoration();

    /**
     * Clears a position on the team, removing the player assigned to it.
     * 
     * @param position
     *            the position to clear
     */
    public void removePlayer(final Integer position);

    /**
     * Removes a player from the team, also clearing the position where it was
     * assigned.
     * 
     * @param player
     *            the player to remove
     */
    public void removePlayer(final U player);

    /**
     * Sets the number of Cheerleaders available to the team.
     * 
     * @param cheerleaders
     *            the Cheerleaders which will be available to the team
     */
    public void setCheerleaders(final Integer cheerleaders);

    /**
     * Sets the number of Coaching Dice available to the team.
     * 
     * @param dice
     *            the number of Coaching Dice available to the team
     */
    public void setCoachingDice(final Integer dice);

}
