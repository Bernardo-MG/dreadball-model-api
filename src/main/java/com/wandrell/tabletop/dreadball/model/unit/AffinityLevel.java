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

package com.wandrell.tabletop.dreadball.model.unit;

/**
 * Indicates the level of affinity between an sponsor and a unit.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see AffinityGroup
 * @see AffinityUnit
 * @see com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsor
 */
public enum AffinityLevel {
    /**
     * Ally affinity level.
     * <p>
     * This is the average level.
     */
    ALLY,
    /**
     * Friend affinity level.
     * <p>
     * This is the highest level.
     */
    FRIEND,
    /**
     * Stranger affinity level.
     * <p>
     * This is the lowest level.
     */
    STRANGER
}
