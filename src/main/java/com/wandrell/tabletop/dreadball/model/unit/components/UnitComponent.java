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
package com.wandrell.tabletop.dreadball.model.unit.components;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.ruleset.Ability;
import com.wandrell.tabletop.dreadball.model.unit.stats.AttributesHolder;

/**
 * Interface representing a component used for creating a composite unit.
 * <p>
 * These are meant mainly for the Mechanite and Plague teams.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface UnitComponent {

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
    public AttributesHolder getAttributes();

    /**
     * Returns the component name.
     * 
     * @return the component name
     */
    public String getComponentName();

}
