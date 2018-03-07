package com.josenaves.reactnativeexperiment.reactnative.module

import com.facebook.react.bridge.ReactContextBaseJavaModule
import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.josenaves.reactnativeexperiment.MainActivity

class ActivityStarterModule: ReactContextBaseJavaModule {

    constructor(reactContext: ReactApplicationContext) : super(reactContext)

    override fun getName(): String {
        return "ActivityStarter"
    }

    @ReactMethod
    fun navigateToMain() {
        val context = reactApplicationContext
        context.startActivity(Intent(context, MainActivity::class.java))
    }

}