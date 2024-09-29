package com.xiaopo.flying.scanner;

/**
 * Code scanner auto focus mode
 *
 * @see CodeScanner#setAutoFocusMode(com.budiyev.android.codescanner.AutoFocusMode)
 */

public enum AutoFocusMode {
    /**
     * Auto focus camera with the specified interval
     *
     * @see CodeScanner#setAutoFocusInterval(long)
     */
    SAFE,

    /**
     * Continuous auto focus, may not work on some devices
     */
    CONTINUOUS
}
