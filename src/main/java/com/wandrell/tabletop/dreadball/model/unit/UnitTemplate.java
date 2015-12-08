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
 * matter if they come from Dreadball Original (DBO) or Dreadball Xtreme (DBX),
 * serving as a root interface for both games.
 * <p>
 * It should be noted that in Dreadball units are called 'players', as they are
 * players in a team, but to keep the API similar to that of other games they
 * will be called units.
 * <p>
 * The basic qualities any player have are the attributes, abilities and team
 * position. Along the basic initial cost, and a flag indicating if they are
 * giants or not.
 * <p>
 * The attributes are kept in an {@link AttributesHolder}, mostly to avoid
 * cluttering the interface.
 * <p>
 * The main use of this interface is representing the templates from which other
 * kind of units are created. Or to say the same, the profiles which appear on
 * the books. For this reason the {@code #getTemplateName() getTemplateName}
 * method is included, which will give the name of said template, that way it is
 * possible to know the base from which any unit has been created.
 * <p>
 * While this interface can be useful for querying such templates as immutable
 * instances, when possible it is recommended using any of the extensions
 * included in the library.
 * <p>
 * To handle the editable units of DBO the
 * {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementUnit} interface should be used. While for handling DBX units there
 * is the {@link com.wandrell.tabletop.dreadball.model.unit.AffinityUnit
 * AffinityUnit} interface.
 * <p>
 * Additionally, composite versions of these interfaces are offered in the
 * {@link com.wandrell.tabletop.dreadball.model.unit.component components}
 * package.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface UnitTemplate {

    /**
     * Returns the unit's abilities.
     * <p>
     * These are a collection of tags, each of them indicating a special rules
     * to be applied to the unit during game play.
     * <p>
     * As it makes no sense for {@code Ability} instances to repeat, this is
     * expected to be actually a {@code Set}.
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
     * Returns the base cost of the unit.
     * <p>
     * This indicates how much did the unit cost when it was acquired, or the
     * cost for acquiring it, and should no reflect any cost change due to any
     * kind of modification.
     * 
     * @return the unit's base cost
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
     * This identifies the basic template from which the unit has been created.
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
