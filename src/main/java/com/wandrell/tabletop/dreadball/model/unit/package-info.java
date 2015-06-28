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
/**
 * Provides interfaces for units and related data.
 * <p>
 * While there are several interfaces representing units, they all take care of
 * different facets of their use.
 * <p>
 * Note that in Dreadball units are called 'players', and this will be kept on
 * the classes names, but otherwise they will be referred as 'units'.
 * <h1>Units</h1>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.Unit Player} interface
 * represents the basic unit profile, which will apply to all the units, no
 * matter their actual purpose, as this is the data all of them have.
 * <p>
 * Extending this, the
 * {@link com.wandrell.tabletop.dreadball.model.unit.UnitTemplate
 * PlayerTemplate} gives a bit of additional information, and is meant to be
 * used for representing the unit profiles shown in the books, and which the
 * player picks to build his team.
 * <p>
 * An additional extension, the
 * {@link com.wandrell.tabletop.dreadball.model.unit.BilledUnit BilledPlayer}
 * represents one of said templates, after being bought by the player.
 * <p>
 * There is also the
 * {@link com.wandrell.tabletop.dreadball.model.unit.AdvancementUnit
 * AdvancementPlayer}, for handling the advancement of units.
 * <h2>Additional info</h2>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.UnitPosition
 * PlayerPosition} is an enumeration representing all the possible positions a
 * unit may take on a team.
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.UnitGroup PlayerGroup}
 * represents the groups to which a unit template may belong. This is meant to
 * be used for Dreadball Extreme, where the costs of a unit will be marked by
 * said groups.
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.stats stats} package
 * contains interfaces for the statistics.
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.components components}
 * package contains interfaces for components used to create composite units.
 */
package com.wandrell.tabletop.dreadball.model.unit;

