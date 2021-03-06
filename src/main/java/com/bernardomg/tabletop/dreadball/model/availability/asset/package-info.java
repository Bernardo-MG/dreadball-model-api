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
 * Assets availabilities.
 * <p>
 * These are used when creating teams, and will indicate which assets the costs
 * of the assets and how many are available.
 * <p>
 * In the case of building a DBO team the
 * {@link com.bernardomg.tabletop.dreadball.model.availability.asset.TeamTypeAssetsAvailability
 * TeamTypeAssetsAvailability} will be used. It indicates costs and range of
 * each asset.
 * <p>
 * In the case of building a DBX team the
 * {@link com.bernardomg.tabletop.dreadball.model.availability.asset.SponsorAssetsCosts
 * SponsorAssetsAvailability} will be used, and it only indicates the cost of
 * each asset.
 */

package com.bernardomg.tabletop.dreadball.model.availability.asset;
