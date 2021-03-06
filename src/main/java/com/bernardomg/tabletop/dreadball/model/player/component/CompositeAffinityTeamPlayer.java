/**
 * Copyright 2015-2018 the original author or authors
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

package com.bernardomg.tabletop.dreadball.model.player.component;

import java.util.Collection;

import com.bernardomg.tabletop.dreadball.model.player.AffinityTeamPlayer;

/**
 * Composite affinity player.
 * <p>
 * Composite units are created from {@link Component} instances. These represent
 * such units as those from the Mechanite and Plague teams, and in this concrete
 * case it is meant for the Dreadball Xtreme (DBX) units.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 */
public interface CompositeAffinityTeamPlayer extends AffinityTeamPlayer {

    /**
     * Returns the components which make up this unit.
     * <p>
     * The attributes and abilities of the unit will be the sum of those from
     * these components.
     * 
     * @return the components which make up this unit
     */
    public Collection<Component> getComponents();

}
