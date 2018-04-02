package com.bj.user.presenter

import com.bj.base.presenter.BasePresenter
import com.bj.user.view.RegisterView

/**
 * Created by jiazhen on 2018/4/2.
 * Desc:
 */
class RegisterPresenter : BasePresenter<RegisterView>(){

    fun doRegister(phone:String,code:String){
        mView.onRegisterSuccess()
    }

}