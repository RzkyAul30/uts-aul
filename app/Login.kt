package com.example.loginhayooco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hayooco.R
import kotlinx.android.synthetic.main.activity_login_page.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener (this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonLogin->{
                val eksplisit = Intent(this@LoginPage, com.example.hayooco.MainActivity::class.java)
                startActivity(eksplisit)
            }
        }
    }
}