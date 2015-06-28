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
 * Interface representing a player template. These are the profiles found on the
 * books, and carry additional data to identify them, and to know if they are
 * MVPs.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface UnitTemplate extends Unit {

    /**
     * Returns the template's name.
     * 
     * @return the template's name.
     */
    public String getTemplateName();

    /**
     * Indicates if the player is a MVP.
     * <p>
     * MVPs are Dreadball's mercenaries.
     * 
     * @return {@code true} if the player is a MVP, {@code false} otherwise
     */
    public Boolean isMVP();

}
