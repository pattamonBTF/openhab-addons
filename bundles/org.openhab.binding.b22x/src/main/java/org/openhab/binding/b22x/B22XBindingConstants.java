/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.b22x;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link B22XBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Pattamon - Initial contribution
 */
@NonNullByDefault
public class B22XBindingConstants {

    private static final String BINDING_ID = "b22x";

    // List of all Thing Type UIDs
    //public static final ThingTypeUID BRIDGE_TYPE_SYSTEMBROKER = new ThingTypeUID(BINDING_ID, "systemBroker");
    public static final ThingTypeUID BRIDGE_TYPE_BROKER = new ThingTypeUID(BINDING_ID, "b22x_broker");
    public static final ThingTypeUID B22X_WALL_CONTROLLER = new ThingTypeUID(BINDING_ID, "structure_bwc");
    

    // List of all Channel ids
    public static final String PUBLISH_TRIGGER_CHANNEL = "publishTrigger";
    public static final String COMMAND_STATE = "command_state";
    public static final String STATE_VALUE = "state_value";
    public static final String CONTACT_VALUE = "contact_value";
    
}
