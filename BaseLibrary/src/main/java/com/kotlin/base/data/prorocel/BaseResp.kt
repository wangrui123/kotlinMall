package com.kotlin.base.data.prorocel

data class BaseResp<out T>(val status: Int, val message: String, val data: T)