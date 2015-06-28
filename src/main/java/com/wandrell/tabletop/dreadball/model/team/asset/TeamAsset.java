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
 * Interface for representing team assets.
 * <p>
 * These represent such things as Coaching Dice, Cards or Cheerleaders.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface TeamAsset {

    /**
     * Returns the cost of the team asset.
     * 
     * @return the team asset's name
     */
    public Integer getCost();

    /**
     * Returns the name of the team asset.
     * 
     * @return the team asset's name
     */
    public String getTeamAssetName();

}
