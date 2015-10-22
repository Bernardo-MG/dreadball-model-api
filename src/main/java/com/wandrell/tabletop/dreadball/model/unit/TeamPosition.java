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
 * Enumeration for all the possible position roles in a Dreadball team.
 * <p>
 * These position roles have a big impact on the rules and game play, and all
 * the players have one assigned.
 * <p>
 * Most of the time there are three such roles: guard, jack and striker. Guards
 * and strikers are specialists, the first can't take the ball while the second
 * can't do offensive actions. Jacks don't have any limitation on the actions
 * they may do, but suffer a movement handicap when doing most actions.
 * <p>
 * A fourth role, the keeper, is very rare, as usually it is created from a
 * Guard or it is a MVP, a special unit. This role is a Guard which can take the
 * ball, albeit with heavy limitations.
 * <p>
 * These roles are meant to be used primarily by units, which are created from
 * the {@link com.wandrell.tabletop.dreadball.model.unit.UnitTemplate
 * UnitTemplate} root interface.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.dreadball.model.unit.UnitTemplate
 */
public enum TeamPosition {

    /**
     * Guard position role.
     * <p>
     * Offensive specialist.
     */
    GUARD,
    /**
     * Jack position role.
     * <p>
     * General purpose role, with reduced mobility.
     */
    JACK,
    /**
     * Keeper position role.
     * <p>
     * Enhanced guard, capable of grabbing the ball, albeit with limitations.
     */
    KEPER,
    /**
     * Striker position role.
     * <p>
     * Ball-user specialist.
     */
    STRIKER

}
