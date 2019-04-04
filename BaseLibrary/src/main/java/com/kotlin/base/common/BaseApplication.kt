package com.kotlin.base.common

import android.app.Application
import android.content.Context

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        mContext = this

    }

    companion object {
        lateinit var mContext: Context
    }

}