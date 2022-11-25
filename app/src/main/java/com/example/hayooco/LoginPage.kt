package com.example.loginhayooco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hayooco.MainActivity
import com.example.hayooco.R
import kotlinx.android.synthetic.main.activity_login_page.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginPage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        buttonLogin.setOnClickListener (this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonLogin->{
                val eksplisit = Intent(this@LoginPage, MainActivity::class.java)
                startActivity(eksplisit)
            }
        }
    }
}