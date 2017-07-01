/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.lgtvserial;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link LgTvSerialBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Marius Bjoernstad - Initial contribution
 */
public class LgTvSerialBindingConstants {

    public static final String BINDING_ID = "lgtvserial";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_LGTV = new ThingTypeUID(BINDING_ID, "lgtv");

    // List of all Channel ids
    public static final String CHANNEL_POWER = "power";
    public static final String CHANNEL_INPUT = "input";
    public static final String CHANNEL_VOLUME = "volume";
    public static final String CHANNEL_MUTE = "mute";
    public static final String CHANNEL_BACKLIGHT = "backlight";
    public static final String CHANNEL_COLOR_TEMPERATURE = "color-temperature";

}
