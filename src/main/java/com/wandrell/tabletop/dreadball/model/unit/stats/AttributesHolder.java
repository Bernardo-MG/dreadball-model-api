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
package com.wandrell.tabletop.dreadball.model.unit.stats;

/**
 * Interface representing the attributes a unit may have.
 * <p>
 * This is meant to be used not only for holding a unit's attributes, but also
 * for bonus to be applied to said attributes.
 * <p>
 * Attributes are meant to be in the range [1,6], as they are used by rolling a
 * six sided dice to try to surpass the indicated value.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AttributesHolder {

    /**
     * Returns the armor value.
     * 
     * @return the armor value
     */
    public Integer getArmor();

    /**
     * Returns the movement value.
     * 
     * @return the movement value
     */
    public Integer getMovement();

    /**
     * Returns the skill value.
     * 
     * @return the skill value
     */
    public Integer getSkill();

    /**
     * Returns the speed value.
     * 
     * @return the speed value
     */
    public Integer getSpeed();

    /**
     * Returns the strength value.
     * 
     * @return the strength value
     */
    public Integer getStrength();

}
