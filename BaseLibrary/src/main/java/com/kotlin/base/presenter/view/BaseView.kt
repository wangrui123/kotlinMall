package com.kotlin.base.presenter.view

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onErroring(text:String)
}