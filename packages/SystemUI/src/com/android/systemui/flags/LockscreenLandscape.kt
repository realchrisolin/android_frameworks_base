/*
 * Copyright (C) 2026 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.flags

import android.content.Context
import android.content.res.Resources
import com.android.systemui.res.R

/**
 * Landscape lock screen stays off unless [Flags.LOCKSCREEN_ENABLE_LANDSCAPE] is on or this
 * device's overlay sets [R.bool.config_enable_lockscreen_landscape]. The flag is unreleased, so a
 * user build leaves every other device unchanged.
 */
object LockscreenLandscape {
    @JvmStatic
    fun isEnabled(flagEnabled: Boolean, resources: Resources): Boolean {
        return flagEnabled || resources.getBoolean(R.bool.config_enable_lockscreen_landscape)
    }

    @JvmStatic
    fun isEnabled(flagEnabled: Boolean, context: Context): Boolean {
        return isEnabled(flagEnabled, context.resources)
    }
}
