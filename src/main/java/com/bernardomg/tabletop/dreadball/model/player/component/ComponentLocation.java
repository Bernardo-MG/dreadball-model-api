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

package com.bernardomg.tabletop.dreadball.model.player.component;

/**
 * Location where a unit component may be applied.
 * <p>
 * This, as the name implies, is where the component will be applied, and serves
 * both to group components together, which is done with the availability
 * interfaces, and to limit their use, as a unit can't have more than one
 * component for each location.
 * 
 * @author Bernardo Mart&iacute;nez Garrido
 * @see Component
 */
public interface ComponentLocation {

    /**
     * Returns the name of the component location.
     * <p>
     * This serves to identify the component location.
     * 
     * @return the component location's name
     */
    public String getName();

}
