package com.bj.user.ui.activity

import android.os.Bundle
import com.bj.base.ui.activity.BaseMvpActivity
import com.bj.user.R
import com.bj.user.presenter.RegisterPresenter
import com.bj.user.view.RegisterView
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {
    override fun onRegisterSuccess() {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        /*mBtnRegister.setOnClickListener{
            //Toast.makeText(RegisterActivity@this,"注册",Toast.LENGTH_SHORT).show()
            //toast("注册")
            //startActivity(intentFor<LoginActivity>("id" to 12))
            mPresenter = RegisterPresenter()
            mPresenter.mView = this
            mPresenter.doRegister("18317907145","3244534")
        }*/
    }
}
