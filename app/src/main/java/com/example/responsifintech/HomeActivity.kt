package com.example.responsifintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.responsifintech.fragment.HistoryFragment
import com.example.responsifintech.fragment.HomeFragment
import com.example.responsifintech.fragment.PaymentFragment
import com.example.responsifintech.fragment.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private val homeFragment = HomeFragment()
    private val paymentFragment = PaymentFragment()
    private val historyFragment = HistoryFragment()
    private val settingFragment = SettingFragment()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar!!.title = "Bayar Dulu"

        replaceFragment(homeFragment)

        val bottomNavv = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNavv.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(homeFragment)
                R.id.payment -> replaceFragment(paymentFragment)
                R.id.history -> replaceFragment(historyFragment)
                R.id.settings -> replaceFragment(settingFragment)
            }
            true
        }


    }

        private fun replaceFragment(fragment: Fragment){
            if (fragment != null){
                val transactionn = supportFragmentManager.beginTransaction()
                transactionn.replace(R.id.fragment_frame_layout, fragment)
                transactionn.commit()
            }
        }
}