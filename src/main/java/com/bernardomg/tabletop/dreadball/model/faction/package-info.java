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
/**
 * Factions.
 * <p>
 * There are two types of factions, the
 * {@link com.bernardomg.tabletop.dreadball.model.faction.TeamType TeamType} and
 * the {@link com.bernardomg.tabletop.dreadball.model.faction.Sponsor Sponsor},
 * being the first for Dreadball Original (DBO) and the second for Dreadball
 * Xtreme (DBX). Both are used when building teams, and will affect the unit
 * availabilities.
 * <p>
 * There is an important difference between the two factions, and it is that
 * while {@code TeamType} is a static tag, the {@code Sponsor} is more like a
 * customizable faction which will also change from game to game.
 */

package com.bernardomg.tabletop.dreadball.model.faction;
