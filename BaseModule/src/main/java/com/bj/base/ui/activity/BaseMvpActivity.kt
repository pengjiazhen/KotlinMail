package com.bj.base.ui.activity

import com.bj.base.presenter.BasePresenter
import com.bj.base.presenter.view.BaseView

/**
 * Created by jiazhen on 2018/4/2.
 * Desc:
 */
open class BaseMvpActivity<T:BasePresenter<*>> : BaseActivity(),BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter:T
}