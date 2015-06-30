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

import java.util.Collection;

import com.google.common.collect.Multiset;
import com.wandrell.tabletop.dreadball.model.faction.TeamType;
import com.wandrell.tabletop.dreadball.model.team.asset.TeamAsset;
import com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit;

/**
 * Represents a basic team, composed of units capable of improvement.
 * <p>
 * This is the team used on DBO.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface LicensedTeam extends Team<AdvancementUnit> {

    /**
     * Adds a staff asset to the team.
     * 
     * @param staff
     *            the staff asset to add
     */
    public void addStaff(final TeamAsset staff);

    /**
     * Returns all the staff assets assigned to this team.
     * 
     * @return all the staff assets assigned to this team
     */
    public Multiset<TeamAsset> getStaff();

    /**
     * Returns the name given to the team.
     * 
     * @return the name given to the team
     */
    public String getTeamName();

    /**
     * Returns the type to which this team belongs.
     * 
     * @return the type to which this team belongs
     */
    public TeamType getType();

    /**
     * Removes a staff asset from the team.
     * 
     * @param staff
     *            the staff asset to remove
     */
    public void removeStaff(final TeamAsset staff);

    /**
     * Sets the team's staff.
     * 
     * @param staff
     *            the new team's staff
     */
    public void setStaff(final Collection<TeamAsset> staff);

}
