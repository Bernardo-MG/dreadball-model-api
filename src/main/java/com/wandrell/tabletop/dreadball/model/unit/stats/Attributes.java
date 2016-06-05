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

package com.wandrell.tabletop.dreadball.model.unit.stats;

/**
 * Interface representing unit attributes.
 * <p>
 * This can be used not only for holding a unit's attributes, but also for the
 * bonus to be applied to said attributes.
 * <p>
 * Attributes are meant to be in the range [1,6], as they are used by comparing
 * their values to the result of rolling a six sided dice.
 * <p>
 * The only exception is the movement, which can be any positive value. Still it
 * usually is in the same range.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.dreadball.model.unit.Unit UnitTemplate
 */
public interface Attributes {

    /**
     * Returns the armor value.
     * <p>
     * This is used when resisting an attack, to cancel the enemy's successes to
     * avoid being wounded.
     * 
     * @return the armor value
     */
    public Integer getArmor();

    /**
     * Returns the movement value.
     * <p>
     * This indicates how many tiles may the unit move. For this reason this is
     * the only stats which may be higher than 6.
     * 
     * @return the movement value
     */
    public Integer getMovement();

    /**
     * Returns the skill value.
     * <p>
     * This is used for handling the ball.
     * 
     * @return the skill value
     */
    public Integer getSkill();

    /**
     * Returns the speed value.
     * <p>
     * This is used for dodging enemies and stealing the ball.
     * 
     * @return the speed value
     */
    public Integer getSpeed();

    /**
     * Returns the strength value.
     * <p>
     * This is used for attacking the enemies.
     * <p>
     * In Dreadball Xtreme it is also used to recover from wounds.
     * 
     * @return the strength value
     */
    public Integer getStrength();

}
