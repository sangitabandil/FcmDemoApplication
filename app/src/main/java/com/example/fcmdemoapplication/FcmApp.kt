package com.example.fcmdemoapplication

import android.app.Application
import com.google.android.gms.common.GoogleApiAvailability
import com.google.firebase.FirebaseApp

class FcmApp : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(applicationContext)
    }
}