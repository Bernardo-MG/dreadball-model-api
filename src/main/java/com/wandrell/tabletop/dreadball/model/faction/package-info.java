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
 * Provides interfaces for faction related classes.
 * <p>
 * There are two types of factions, team types and sponsors, being the first for
 * DBO and the second for DBX. Both are used when building teams, and will
 * affect the unit availabilities.
 * <p>
 * DBO team types are represented by
 * {@link com.wandrell.tabletop.dreadball.model.faction.TeamType TeamType},
 * which is a static identifier.
 * <p>
 * The DBX {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsor}
 * on the other hand is modifiable, and will contain both the data required to
 * build teams, and can receive long term changes.
 */
package com.wandrell.tabletop.dreadball.model.faction;
