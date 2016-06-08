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

package com.wandrell.tabletop.dreadball.model.unit.component;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.unit.Role;
import com.wandrell.tabletop.dreadball.model.unit.stats.Ability;
import com.wandrell.tabletop.dreadball.model.unit.stats.Attributes;

/**
 * Component used for creating a composite unit.
 * <p>
 * These are meant mainly for the Mechanite and Plague teams, where the units
 * are created in a custom way by choosing a series of options.
 * <p>
 * Each of these options will be a component, and they will be combined through
 * a procedure following a series of rules which goes beyond the scope of this
 * API.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface Component {

    /**
     * Returns the abilities given by the component.
     * 
     * @return the abilities given by the component
     */
    public Collection<Ability> getAbilities();

    /**
     * Returns the attributes values given by the component.
     * 
     * @return the attributes values given by the component
     */
    public Attributes getAttributes();

    /**
     * Returns the cost of this component.
     * 
     * @return the cost of this component
     */
    public Integer getCost();

    /**
     * Returns the component location to which this component applies.
     * <p>
     * Locations group components together, and also a composite unit can't have
     * more than one component for each location.
     * 
     * @return the component location to which this component applies
     */
    public ComponentLocation getLocation();

    /**
     * Returns the component name.
     * <p>
     * This serves to identify the component.
     * 
     * @return the component name
     */
    public String getName();

    /**
     * Returns the player position roles which can result from this component.
     * <p>
     * A player created with this component can only have one of the roles in
     * this list.
     * 
     * @return the player position roles which this component allows
     */
    public Collection<Role> getRoles();

}
