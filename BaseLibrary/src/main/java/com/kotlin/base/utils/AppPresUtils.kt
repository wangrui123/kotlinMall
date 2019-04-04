package com.kotlin.base.utils

import android.content.Context
import android.content.SharedPreferences
import com.kotlin.base.common.BaseApplication
import com.kotlin.base.common.BaseConstant

object AppPresUtils {

    val pres: SharedPreferences = BaseApplication.mContext.getSharedPreferences(BaseConstant.TABLE_PREFS, Context.MODE_PRIVATE)
    val edit: SharedPreferences.Editor


    init {
        edit = pres.edit()
    }

    fun getString(key: String): String {
        return pres.getString(key, "")
    }

}