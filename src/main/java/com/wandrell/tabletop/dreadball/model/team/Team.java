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

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.dreadball.model.team.asset.AssignedTeamAsset;
import com.wandrell.tabletop.dreadball.model.unit.Unit;

/**
 * Interface representing a Dreadball Team.
 * <p>
 * It offers support for the most basic features which are players, cash and
 * valoration.
 * <p>
 * This is meant to be extended for use, and due to this it contains a template
 * indicating which kind of player it can store.
 * <p>
 * Any player assigned to the team also receives a position on it. No two
 * players may share the same position.
 * 
 * @author Bernardo Martínez Garrido
 *
 * @param <P>
 *            the type of player the {@code Team} is made of
 */
public interface Team<P extends Unit> {

    /**
     * Adds a player to the team.
     * <p>
     * This player should receive a position where it will be assigned. If there
     * is already a player on that position, then the new one will take his
     * place.
     * 
     * @param player
     *            the new player
     * @param position
     *            the position where this player will be assigned
     */
    public void addPlayer(final P player, final Integer position);

    /**
     * Returns the assets assigned to the team.
     * <p>
     * These can be anything from dice to cheerleaders.
     * 
     * @return the assets assigned to the team
     */
    public Collection<AssignedTeamAsset> getAssets();

    /**
     * Returns the cash the team still has.
     * 
     * @return the cash the team still has
     */
    public Integer getCash();

    /**
     * Returns the {@code Team}'s players and their positions.
     * 
     * @return the {@code Team}'s players and their positions
     */
    public Map<Integer, P> getPlayers();

    /**
     * Returns the current valoration of the team.
     * 
     * @return the team's current valoration
     */
    public Integer getValoration();

    /**
     * Clears a position on the team.
     * 
     * @param position
     *            the position to clear
     */
    public void removePlayer(final Integer position);

    /**
     * Removes a player from the team.
     * 
     * @param player
     *            the player to remove
     */
    public void removePlayer(final P player);

    /**
     * Sets the team's cash.
     * 
     * @param cash
     *            the cash the team will have
     */
    public void setCash(final Integer cash);

}
