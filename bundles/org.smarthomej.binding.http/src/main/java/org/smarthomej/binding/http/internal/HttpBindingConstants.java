/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 * Copyright (c) 2021-2023 Contributors to the SmartHome/J project
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
package org.smarthomej.binding.http.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.type.ChannelTypeUID;

/**
 * The {@link HttpBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Jan N. Klug - Initial contribution
 */
@NonNullByDefault
public class HttpBindingConstants {
    private static final String BINDING_ID = "http";

    public static final ThingTypeUID THING_TYPE_URL = new ThingTypeUID(BINDING_ID, "url");

    public static final ChannelTypeUID REQUEST_DATE_TIME_CHANNELTYPE_UID = new ChannelTypeUID(BINDING_ID,
            "requestDateTime");
    public static final String CHANNEL_LAST_SUCCESS = "lastSuccess";
    public static final String CHANNEL_LAST_FAILURE = "lastFailure";
}
