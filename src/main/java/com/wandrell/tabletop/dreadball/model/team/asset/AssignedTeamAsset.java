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
package com.wandrell.tabletop.dreadball.model.team.asset;

/**
 * Interface for representing a {@code TeamAsset} assigned to a
 * {@code com.wandrell.tabletop.dreadball.model.team.Team Team}.
 * 
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.tabletop.dreadball.model.team.Team Team
 */
public interface AssignedTeamAsset extends TeamAsset {

    /**
     * Returns the number of copies of this asset the {@code Team} owns.
     * 
     * @return the number of copies of this asset the {@code Team} owns
     */
    public Integer getCount();

}
