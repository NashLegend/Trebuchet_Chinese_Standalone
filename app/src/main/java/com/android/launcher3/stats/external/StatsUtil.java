/*
 *  Copyright (c) 2015. The CyanogenMod Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.android.launcher3.stats.external;

import android.content.Context;
import android.os.Bundle;

/**
 * StatsUtil
 * <pre>
 *     Utility for interfacing with CyanogenStats
 * </pre>
 */
public class StatsUtil {

    // Tag and logging
    private static final String TAG = StatsUtil.class.getSimpleName();

    // Constants
    private static final String KEY_TRACKING_ID = "tracking_id";

    /**
     * Send an event to CyangenStats
     *
     * @param context        {@link Context} not null
     * @param trackingBundle {@link Bundle}
     * @throws IllegalArgumentException
     */
    public static void sendEvent(Context context, Bundle trackingBundle)
            throws IllegalArgumentException {
    }

}
