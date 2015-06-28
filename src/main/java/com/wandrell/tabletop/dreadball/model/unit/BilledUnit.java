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

/**
 * Interface representing a player bought into a team.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface BilledUnit extends UnitTemplate {

    /**
     * Returns the cost of this unit.
     * <p>
     * This indicates how much did the unit cost when buying it.
     * 
     * @return the cost of this unit at the time it was bought
     */
    public Integer getCost();

}
