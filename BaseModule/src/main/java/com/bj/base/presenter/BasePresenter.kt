package com.bj.base.presenter

import com.bj.base.presenter.view.BaseView

/**
 * Created by jiazhen on 2018/4/2.
 * Desc:
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T
}