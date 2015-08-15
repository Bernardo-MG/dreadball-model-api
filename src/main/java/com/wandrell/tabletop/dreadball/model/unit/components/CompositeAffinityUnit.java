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

import com.wandrell.tabletop.dreadball.model.unit.AffinityUnit;

/**
 * Interface extension of {@link AffinityUnit} for composite units.
 * <p>
 * This adds a method to query the
 * {@link com.wandrell.tabletop.dreadball.model.unit.components.UnitComponent
 * UnitComponent}s which have been used to create the unit.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface CompositeAffinityUnit extends AffinityUnit {

    /**
     * Returns the components which make up this unit.
     * 
     * @return the components which make up this unit
     */
    public Collection<UnitComponent> getComponents();

}
