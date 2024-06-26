package org.odk.collect.receivers;

import android.bluetooth.le.ScanResult;
import android.location.Location;

public interface LeScanUpdater {
    void handleLeScanResult(final ScanResult scanResult, Location location, final boolean batch);
}
