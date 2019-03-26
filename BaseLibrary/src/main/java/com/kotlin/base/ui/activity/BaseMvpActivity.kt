package com.kotlin.base.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.BaseView

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun onErroring(text: String) {
    }

    lateinit var mPresenter: T

    override fun hideLoading() {
    }



    override fun showLoading() {
    }

}