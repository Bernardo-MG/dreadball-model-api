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

package com.bernardomg.tabletop.dreadball.model.unit;

/**
 * Enumeration for all the possible position roles in a Dreadball team.
 * <p>
 * These position roles have a big impact on the rules and gameplay, and all the
 * players have one assigned.
 * <p>
 * Most of the time there are three such roles: guard, jack and striker. Guards
 * and strikers are specialists, while jacks are all-around players.
 * <p>
 * A fourth role, the keeper, is very rare, as usually it is created from
 * gameplay decisions, or luck. Still in some cases it is possible to acquire a
 * player with this role, which basically is another kind of guard.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see Unit
 */
public enum Role {

    /**
     * Guard position role.
     * <p>
     * Offensive specialist.
     */
    GUARD,
    /**
     * Jack position role.
     * <p>
     * General purpose role.
     */
    JACK,
    /**
     * Keeper position role.
     * <p>
     * Enhanced guard.
     */
    KEEPER,
    /**
     * Striker position role.
     * <p>
     * Ball-user specialist.
     */
    STRIKER

}
