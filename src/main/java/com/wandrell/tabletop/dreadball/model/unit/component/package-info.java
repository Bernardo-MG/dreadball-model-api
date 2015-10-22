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
 * Provides interfaces for components and composite units. These are such units
 * as those from the Mechanite or Plague teams.
 * <p>
 * The {@link com.wandrell.tabletop.dreadball.model.unit.component.UnitComponent
 * UnitComponent} contains the data of said components, while the
 * {@link com.wandrell.tabletop.dreadball.model.unit.component.ComponentLocation
 * ComponentLocation} represents the selection groups to which components are
 * applied.
 * <p>
 * Two interfaces are offered for units created from these components, each
 * extending one of the unit interfaces for each version of Dreadball. These are
 * {@link com.wandrell.tabletop.dreadball.model.unit.component.CompositeAdvancementUnit
 * CompositeAdvancementUnit} and
 * {@link com.wandrell.tabletop.dreadball.model.unit.component.CompositeAffinityUnit
 * CompositeAffinityUnit}.
 */
package com.wandrell.tabletop.dreadball.model.unit.component;
