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
package org.openhab.binding.b22x.internal;

import org.openhab.binding.b22x.B22XBindingConstants;
import org.openhab.core.thing.ThingUID;

/**
 * Maps a Mqtt broker URL to a possible ThingUID id.
 *
 * @author Pattamon - Initial contribution
 */
public class MqttThingID {
    /**
     * Convert the url (tcp://122.123.111.123:1883) to a version without colons, dots or slashes
     * for creating a ThingUID with that string (tcp_122_123_111_123_1883).
     */
    public static String getThingID(String host, int port) {
        return host.replace('.', '_').replace("://", "_") + "_" + String.valueOf(port);
    }

    /**
     * Creates a normal broker thing with an url that will be converted to a thing ID.
     *
     * @param url The broker connection url
     * @return Returns a ThingUID
     */
    public static ThingUID getThingUID(String host, int port) {
        return new ThingUID(B22XBindingConstants.BRIDGE_TYPE_BROKER, getThingID(host, port));
    }

    public static ThingUID getTextualThingUID(String host, int port) {
        return new ThingUID(B22XBindingConstants.BRIDGE_TYPE_BROKER, getThingID(host, port));
        //return new ThingUID(B22XBindingConstants.BRIDGE_TYPE_SYSTEMBROKER, getThingID(host, port));
    }
}
