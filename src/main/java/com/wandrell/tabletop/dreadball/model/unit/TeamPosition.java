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
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.dreadball.model.unit.Unit
 */
public enum TeamPosition {

    /**
     * Guard position role.
     */
    GUARD, /**
            * Jack position role.
            */
    JACK, /**
           * Striker position role.
           */
    STRIKER

}
