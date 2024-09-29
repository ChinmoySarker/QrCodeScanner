package com.xiaopo.flying.scanner;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

public interface ErrorCallback {

    @NonNull
    ErrorCallback SUPPRESS = new Utils.SuppressErrorCallback();

    @WorkerThread
    void onError(@NonNull Throwable thrown);
}
