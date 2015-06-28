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
package com.wandrell.tabletop.dreadball.model.team;

import com.wandrell.tabletop.dreadball.model.faction.Sponsor;
import com.wandrell.tabletop.dreadball.model.unit.BilledUnit;

/**
 * Represents a team composed of units incapable of improvement and with a
 * sponsor, who is capable of improving.
 * <p>
 * This is the team used on Dreadball Extreme.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface SponsorTeam extends Team<BilledUnit> {

    /**
     * Returns the {@code Sponsor} which owns this team.
     * 
     * @return the {@code Sponsor} which owns this team
     */
    public Sponsor getSponsor();

}
