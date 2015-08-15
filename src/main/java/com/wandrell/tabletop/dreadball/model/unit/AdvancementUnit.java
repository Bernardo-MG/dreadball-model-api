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

import com.wandrell.tabletop.dreadball.model.unit.components.UnitComponent;
import com.wandrell.tabletop.dreadball.model.unit.stats.Ability;
import com.wandrell.tabletop.dreadball.model.unit.stats.AttributesHolder;

/**
 * Interface extension for {@link Unit} representing one which may advance and
 * develop it's skills.
 * <p>
 * These are the DBO players which can improve after a game, mainly by gaining
 * experience and increasing his level, but can also deteriorate, for example by
 * using the cheap revival option.
 * <p>
 * For this the interface makes the basic {@link Unit} mutable, allowing any
 * kind of modification, but also adds support for unspent experience points and
 * rank, which stands for the player's level.
 * <p>
 * Said level is meant to be handled as part of the team customization
 * mechanics, and the {@code Unit} will just hold all the required information
 * for this.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AdvancementUnit extends Unit {

    /**
     * Adds an ability to the unit.
     * 
     * @param ability
     *            the ability to add
     */
    public void addAbility(final Ability ability);

    /**
     * Returns the implant this player has received, if any.
     * <p>
     * If no implant has been grafted, it is recommended returning a stub
     * implementation of the {@code UnitComponent} interface.
     * 
     * @return the implant this player has received
     */
    public UnitComponent getGraftedImplant();

    /**
     * Returns the unit's current rank.
     * <p>
     * This is the unit's level, and raised by expending experience.
     * 
     * @return the unit's current rank
     */
    public Integer getRank();

    /**
     * Returns the unit's unspent experience.
     * <p>
     * Experience is used to raise the unit's level.
     * 
     * @return the unit's unspent experience
     */
    public Integer getUnspentExperience();

    /**
     * Returns the unit's current valoration.
     * <p>
     * This value will change as the unit advances, and is calculated by adding
     * the values of its enhancements to the unit base cost.
     * <p>
     * Ranks and implants will affect said cost, which the {@code Unit} will
     * calculate.
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
     * This will remove all of the abilities, and change them for the received
     * ones.
     * 
     * @param abilities
     *            the unit's new abilities
     */
    public void setAbilities(final Collection<Ability> abilities);

    /**
     * Sets the player's attributes.
     * <p>
     * As the {@code AttributesHolder} interface is immutable it may be
     * necessary to just swap it to allow editing it.
     * 
     * @param attributes
     *            the player's attributes
     */
    public void setAttributes(final AttributesHolder attributes);

    /**
     * Sets the unit's current rank.
     * <p>
     * Increasing the rank should consume experience, and should not be possible
     * without enough experience, but that is not to be handled by the unit,
     * allowing deeper customization of the unit.
     * 
     * @param rank
     *            the unit's new rank
     */
    public void setRank(final Integer rank);

    /**
     * Sets the unit's unspent experience.
     * <p>
     * Experience is gained after matches, based on what the player has done
     * during it, and serves to be spent to raise the rank.
     * <p>
     * Also, experience may be lost, for example by reviving the unit.
     * 
     * @param experience
     *            the unit's unspent experience
     */
    public void setUnspentExperience(final Integer experience);

}
