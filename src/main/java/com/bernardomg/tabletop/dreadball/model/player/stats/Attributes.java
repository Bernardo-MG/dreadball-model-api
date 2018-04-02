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

package com.bernardomg.tabletop.dreadball.model.player.stats;

/**
 * Player attributes.
 * <p>
 * This can be used not only for holding a unit's attributes, but also for the
 * bonus to be applied to said attributes.
 * <p>
 * Attributes are meant to be in the range [1,6], as they are used by comparing
 * their values to the result of rolling a six sided dice. This should be
 * handled by implementations as they see fit.
 * <p>
 * The only exception to this is the movement, which can be any positive value.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see com.bernardomg.tabletop.dreadball.model.player.TeamPlayer TeamPlayer
 */
public interface Attributes {

    /**
     * Returns the armor value.
     * <p>
     * Used when resisting an attack, to cancel the enemy's successes to avoid
     * being wounded.
     * 
     * @return the armor value
     */
    public Integer getArmor();

    /**
     * Returns the movement value.
     * <p>
     * Indicates how many tiles may the unit move. For this reason this is the
     * only attribute which may be higher than 6.
     * 
     * @return the movement value
     */
    public Integer getMovement();

    /**
     * Returns the skill value.
     * <p>
     * Used for handling the ball.
     * 
     * @return the skill value
     */
    public Integer getSkill();

    /**
     * Returns the speed value.
     * <p>
     * Used for dodging enemies and stealing the ball.
     * 
     * @return the speed value
     */
    public Integer getSpeed();

    /**
     * Returns the strength value.
     * <p>
     * Used for attacking the enemies.
     * <p>
     * In Dreadball Xtreme it is also used to recover from wounds.
     * 
     * @return the strength value
     */
    public Integer getStrength();

}
