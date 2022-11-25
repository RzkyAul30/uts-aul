package com.example.hayooco

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import com.example.hayooco.databinding.ActivityMainBinding
import com.example.hayooco.databinding.FragmentStoreBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_login_page.*

class MainActivity : AppCompatActivity(){

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        val homefrag = HomeFragment()
        val pointfrag = poinFragment()
        val storeFragment = storeFragment()
        val profileFragment = profileFragment()

        //default fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, homefrag)
            commit()
        }

        currentFragment(homefrag)

        bottomNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.fragmentHome->currentFragment(homefrag)
                R.id.fragmentPoin->currentFragment(pointfrag)
                R.id.fragmentStore->currentFragment(storeFragment)
                R.id.fragmentProfile->currentFragment(profileFragment)
            }
            true
        }

    }


    private fun currentFragment(fragment: Fragment) =
    supportFragmentManager.beginTransaction().apply {
        replace(R.id.fragment_container, fragment)
        commit()
    }

//    private fun replaceFragment(fragment: Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragment_container, fragment)
//    }

}



