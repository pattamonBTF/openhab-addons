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
package org.openhab.binding.b22x.structure.values;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.b22x.structure.ChannelConfig;
import org.openhab.binding.b22x.B22XBindingConstants;

/**
 * A factory t
 *
 * @author David Graeff - Initial contribution
 */
@NonNullByDefault
public class ValueFactory {
    /**
     * Creates a new channel state value.
     *
     * @param config The channel configuration
     * @param channelTypeID The channel type, for instance TEXT_CHANNEL.
     */
    public static Value createValueState(ChannelConfig config, String channelTypeID) throws IllegalArgumentException {
        Value value;
        switch (channelTypeID) {
            case B22XBindingConstants.COMMAND_STATE:
                value = StringUtils.isBlank(config.allowedStates) ? new TextValue()
                        : new TextValue(config.allowedStates.split(","));
                break;
            case B22XBindingConstants.STATE_VALUE:
                value = StringUtils.isBlank(config.allowedStates) ? new TextValue()
                        : new TextValue(config.allowedStates.split(","));
                break;
            case B22XBindingConstants.CONTACT_VALUE:
                value = StringUtils.isBlank(config.allowedStates) ? new TextValue()
                        : new TextValue(config.allowedStates.split(","));
                break;
            
            /* case B22XBindingConstants.TRIGGER:
                config.trigger = true;
                value = new TextValue();
                break; */
            default:
                throw new IllegalArgumentException("ChannelTypeUID not recognised: " + channelTypeID);
        }
        return value;
    }
}
