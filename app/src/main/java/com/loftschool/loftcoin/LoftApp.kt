package com.loftschool.loftcoin

import android.app.Application
import android.os.StrictMode
import androidx.viewbinding.BuildConfig
import com.loftschool.loftcoin.utils.DebugTree
import timber.log.Timber

class LoftApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            StrictMode.enableDefaults()
            Timber.plant(DebugTree())
        }
    }
}