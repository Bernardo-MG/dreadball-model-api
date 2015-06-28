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
 * There are two types of factions: team types and sponsors.
 * <p>
 * The first is represented by
 * {@link com.wandrell.tabletop.dreadball.model.faction.TeamType TeamType}, and
 * serves to identify the DBO teams.
 * <p>
 * The second is represented by
 * {@link com.wandrell.tabletop.dreadball.model.faction.Sponsor Sponsor}, and is
 * used for the sponsors of Dreadball Extreme. This interface contains
 * additional complexity, as sponsors are meant to be configurable by the user.
 */
package com.wandrell.tabletop.dreadball.model.faction;

