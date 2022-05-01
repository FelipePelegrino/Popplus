package com.gmail.devpelegrino.popplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        findViewById<NavigationBarView>(R.id.bottomNavigationView).setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.menuHomeItem -> {

                    true
                }
                R.id.menuSearchItem -> {

                    true
                }
                R.id.menuListItem -> {

                    true
                }
                R.id.menuPopcornItem -> {

                    true
                }
                R.id.menuUserItem -> {

                    true
                }
                else -> false
            }
        }
    }
}