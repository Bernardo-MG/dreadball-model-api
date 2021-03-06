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
 * Player ability.
 * <p>
 * Abilities are tags which indicate which special rules will be applied to a
 * unit during gameplay.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see com.bernardomg.tabletop.dreadball.model.player.TeamPlayer TeamPlayer
 */
public interface Ability {

    /**
     * Returns the ability name.
     * <p>
     * This serves to identify the ability.
     * 
     * @return the ability name
     */
    public String getName();

}
