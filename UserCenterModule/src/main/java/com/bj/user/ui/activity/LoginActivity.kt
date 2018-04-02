package com.bj.user.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bj.user.R
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        toast("${intent.getIntExtra("id", -1)}")
    }
}
