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

import com.wandrell.tabletop.dreadball.model.unit.stats.Ability;
import com.wandrell.tabletop.dreadball.model.unit.stats.AttributesHolder;

/**
 * Interface representing the basic features all the Dreadball units have, no
 * matter if they come from DBO or DBX, serving as a root interface for both
 * games.
 * <p>
 * It should be noted that in Dreadball units are called 'players', as they are
 * players in a team, but to keep the model similar to that of other games they
 * will be called units.
 * <p>
 * The basic qualities any player have are the attributes, abilities and team
 * position.
 * <p>
 * Additionally they may be giants, which is not so common, but still is handled
 * by a flag which can be queried with the {@code #isGiant() isGiant} method.
 * <p>
 * As the interface may represent any kind of player it can also represent the
 * templates from which said players are created. Or to say the same, the
 * profiles which appear on the books. For this reason the
 * {@code #getTemplateName() getTemplateName} method is included, which will
 * give the name of said template. Something that may good to know in all units.
 * <p>
 * Said templates also have a basic cost, which can be queried with the
 * {@link #getCost() getCost} method.
 * <p>
 * The interface is immutable, to handle editable units use the
 * {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementUnit} interface. Another interface for units, the
 * {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit AffinityUnit}
 * is for those units which have a price depending on affinities.
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
     * Returns the cost of this unit.
     * <p>
     * This indicates how much did the unit cost when it was acquired, or the
     * cost for acquiring it.
     * 
     * @return the cost of this unit at the time it was bought
     */
    public Integer getCost();

    /**
     * Returns the unit's position in the team.
     * <p>
     * This is the jack/striker/guard unit role.
     * 
     * @return the unit's position in the team
     */
    public TeamPosition getPosition();

    /**
     * Returns the template's name.
     * <p>
     * This is the basic unit from which the current unit has been created.
     * 
     * @return the template's name.
     */
    public String getTemplateName();

    /**
     * Indicates whether the unit is a giant or not.
     * 
     * @return {@code true} if the player is a giant, {@code false} otherwise
     */
    public Boolean isGiant();

}
