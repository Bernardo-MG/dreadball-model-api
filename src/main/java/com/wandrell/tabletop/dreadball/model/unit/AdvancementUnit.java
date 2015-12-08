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

package com.wandrell.tabletop.dreadball.model.unit;

import java.util.Collection;

import com.wandrell.tabletop.dreadball.model.unit.component.UnitComponent;
import com.wandrell.tabletop.dreadball.model.unit.stats.Ability;
import com.wandrell.tabletop.dreadball.model.unit.stats.AttributesHolder;

/**
 * Interface extension for {@link UnitTemplate} representing a unit which may
 * change and evolve between matches.
 * <p>
 * These are the Dreadball Original (DBO) units. Mainly they improve by gaining
 * experience and increasing ranks, which equal to the unit level, but they may
 * also deteriorate, for example by using the cheap revival option (which will
 * remove experience), or improve in other special ways, such as acquiring an
 * implant.
 * <p>
 * To allow such changes the interface makes the basic {@link UnitTemplate}
 * mutable, allowing any kind of modification. And also adds methods to track
 * the changes and advancement.
 * <p>
 * It should be noted that increasing the rank consumes experience, and there
 * are some additional limitations, such as only allowing a single rank raise
 * between games. This can't be tracked easily by implementations of the
 * interface, and for this reason it is expected to be handled externally. Units
 * are expected to only store the experience and rank, and not work with them,
 * making these attributes devoid of business logic.
 * <p>
 * On the other hand, there is the unit valoration. As the unit evolves its cost
 * increases. This is handled through a simple formula, which consists on adding
 * the cost of the improvements to the basic cost, the same cost which can be
 * queried with {@link #getCost()}. The resulting unit valoration can be checked
 * with the {@link #getValoration() getValoration} method, and all logic
 * required for such calculation is expected to be handled by the
 * implementation.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AdvancementUnit extends UnitTemplate {

    /**
     * Adds an ability to the unit.
     * <p>
     * If the ability already exists it is expected to be ignored, as it makes
     * no sense for abilities to repeat.
     * 
     * @param ability
     *            the ability to add
     */
    public void addAbility(final Ability ability);

    /**
     * Returns the implant this unit has received, if any.
     * <p>
     * If no implant has been grafted, it is recommended returning a stub
     * implementation of the {@code UnitComponent} interface and not
     * {@code null}.
     * 
     * @return the implant this player has received
     */
    public UnitComponent getGraftedImplant();

    /**
     * Returns the name given to the unit.
     * <p>
     * This is name used by the user to identify the unit.
     * 
     * @return the template's name.
     */
    public String getName();

    /**
     * Returns the unit's current rank.
     * <p>
     * This is the unit's level. It is raised by expending experience, and such
     * procedure is expected to be handled outside the implementation.
     * 
     * @return the unit's current rank
     */
    public Integer getRank();

    /**
     * Returns the unit's unspent experience.
     * <p>
     * Experience is used to raise the unit's rank. Such procedure is expected
     * to be handled outside the implementation.
     * 
     * @return the unit's unspent experience
     */
    public Integer getUnspentExperience();

    /**
     * Returns the unit's current valoration.
     * <p>
     * This value will change as the unit evolves, and is calculated by adding
     * the values of its enhancements to the unit base cost, the same base cost
     * which can be acquired with {@link #getCost()}.
     * 
     * @return the unit's current valoration
     */
    public Integer getValoration();

    /**
     * Removes an ability from the unit.
     * 
     * @param ability
     *            the ability to remove
     */
    public void removeAbility(final Ability ability);

    /**
     * Sets the unit's abilities.
     * <p>
     * This will remove all of the abilities, and change them for the specified
     * ones.
     * 
     * @param abilities
     *            the unit's new abilities
     */
    public void setAbilities(final Collection<Ability> abilities);

    /**
     * Sets the unit's attributes.
     * <p>
     * As the {@code AttributesHolder} interface is immutable it may be
     * necessary to just swap it to allow editing it, and this method serves for
     * such purpose.
     * 
     * @param attributes
     *            the player's new attributes
     */
    public void setAttributes(final AttributesHolder attributes);

    /**
     * Sets the grafted implant for this unit.
     * <p>
     * Adding an implant changes the attribute values and the skills. It is
     * recommended editing the attributes and skills in the same procedure which
     * adds the implant, and not querying the implant each time the attributes
     * or abilities are queried.
     * 
     * @param implant
     *            the implant grafted to this unit
     */
    public void setGraftedImplant(final UnitComponent implant);

    /**
     * Sets the name given to the unit.
     * <p>
     * This is name used by the user to identify the unit.
     * 
     * @param name
     *            the name given to the unit
     */
    public void setName(final String name);

    /**
     * Sets the unit's current rank.
     * <p>
     * Increasing the rank should consume experience, and should not be possible
     * without enough experience. Such procedure is expected to be handled
     * outside the implementation.
     * 
     * @param rank
     *            the unit's new rank
     */
    public void setRank(final Integer rank);

    /**
     * Sets the unit's unspent experience.
     * <p>
     * Experience is gained after matches, based on what the player has done
     * during it, and serves to be spent to raise the rank. The rank and
     * experience control is expected to be handled outside the implementation.
     * <p>
     * It should be noted that experience may be lost, for example by reviving
     * the unit.
     * 
     * @param experience
     *            the unit's unspent experience
     */
    public void setUnspentExperience(final Integer experience);

}
