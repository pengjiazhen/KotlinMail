package com.bj.user.presenter

import com.bj.base.presenter.BasePresenter
import com.bj.user.view.RegisterView
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by jiazhen on 2018/4/2.
 * Desc:
 */
class RegisterPresenter : BasePresenter<RegisterView>() {

    fun doRegister(phone: String, code: String) {
        Observable.create<Boolean> {
            it.onNext(true)
        }.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    if (it)
                        mView.onRegisterSuccess()
                },{

                },{

                })

    }

}


