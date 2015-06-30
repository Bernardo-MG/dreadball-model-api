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
 * Interface for representing a unit which may advance and develop it's skills.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AdvancementUnit extends Unit {

    /**
     * Returns the unit's current rank.
     * 
     * @return the unit's current rank
     */
    public Integer getRank();

    /**
     * Returns the unit's unspent experience.
     * 
     * @return the unit's unspent experience
     */
    public Integer getUnspentExperience();

    /**
     * Returns the unit's current valoration.
     * <p>
     * This value will change as the unit advances.
     * 
     * @return the unit's current valoration
     */
    public Integer getValoration();

    /**
     * Sets the unit's current rank.
     * 
     * @param rank
     *            the unit's new rank
     */
    public void setRank(final Integer rank);

    /**
     * Sets the unit's unspent experience.
     * 
     * @param experience
     *            the unit's unspent experience
     */
    public void setUnspentExperience(final Integer experience);

}
