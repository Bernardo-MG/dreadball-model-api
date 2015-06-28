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
package com.wandrell.tabletop.dreadball.model.unit;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.ruleset.Ability;
import com.wandrell.tabletop.dreadball.model.unit.stats.AttributesHolder;

/**
 * Interface representing the basic features all the Dreadball units have. In
 * Dreadball units are called 'players', as they are players in a team.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface Unit {

    /**
     * Returns the unit's abilities.
     * 
     * @return the unit's abilities
     */
    public Collection<Ability> getAbilities();

    /**
     * Returns the unit's attributes.
     * 
     * @return the unit's attributes
     */
    public AttributesHolder getAttributes();

    /**
     * Returns the unit's position in the team.
     * 
     * @return the unit's position in the team
     */
    public TeamPosition getPosition();

    /**
     * Indicates if the unit is a giant or not.
     * 
     * @return {@code true} if the player is a giant, {@code false} otherwise
     */
    public Boolean isGiant();

}
