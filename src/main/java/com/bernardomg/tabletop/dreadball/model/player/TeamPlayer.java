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

package com.bernardomg.tabletop.dreadball.model.player;

import java.util.Collection;

import com.bernardomg.tabletop.dreadball.model.player.stats.Ability;
import com.bernardomg.tabletop.dreadball.model.player.stats.Attributes;

/**
 * Root for the basic features all the Dreadball players have, no matter if they
 * come from Dreadball Original (DBO) or Dreadball Xtreme (DBX).
 * <p>
 * The basic qualities any player have are the attributes, abilities and team
 * position. Along the basic initial cost, and a flag indicating if they are
 * giants or not.
 * <p>
 * The attributes are kept in an {@link Attributes} instance, mostly to avoid
 * cluttering the interface.
 * <p>
 * The main use of this interface is representing the templates from which other
 * kind of units are created. Or to say the same, the profiles which appear on
 * the books. For this reason the {@link #getTemplateName() getTemplateName}
 * method is included, which will give the name of said template, that way it is
 * possible to know the base from which any unit has been created.
 * <p>
 * While this interface can be useful for querying such templates as immutable
 * instances, when possible it is recommended using any of the extensions
 * included in the library.
 * <p>
 * To handle the editable units of DBO the
 * {@link com.bernardomg.tabletop.dreadball.model.player.AdvancementTeamPlayer
 * AdvancementTeamPlayer} interface should be used. While for handling DBX units
 * there is the
 * {@link com.bernardomg.tabletop.dreadball.model.player.AffinityTeamPlayer
 * AffinityTeamPlayer} interface.
 * <p>
 * Additionally, composite versions of these interfaces, for customizable units,
 * are offered in the {@code component} package.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface TeamPlayer {

    /**
     * Returns the unit's abilities.
     * <p>
     * Each ability indicates a special rules to be applied to the unit during
     * gameplay.
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
    public Attributes getAttributes();

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
     * Indicates whether the unit is a giant or not.
     *
     * @return {@code true} if the player is a giant, {@code false} otherwise
     */
    public Boolean getGiant();

    /**
     * Indicates whether the unit is a MVP or not.
     *
     * @return {@code true} if the player is a MVP, {@code false} otherwise
     */
    public Boolean getMvp();

    /**
     * Returns the name given to the unit.
     * <p>
     * This is name used by the user to identify the unit.
     *
     * @return the template's name.
     */
    public String getName();

    /**
     * Returns the unit's role in the team.
     * <p>
     * This is the jack/striker/guard unit role.
     *
     * @return the unit's role in the team
     */
    public Role getRole();

    /**
     * Returns the template's name.
     * <p>
     * This identifies the basic template from which the unit has been created.
     *
     * @return the template's name.
     */
    public String getTemplateName();

}
