package com.gmail.devpelegrino.popplus.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gmail.devpelegrino.popplus.R
import com.gmail.devpelegrino.popplus.ui.mylists.MyListsActivity
import com.gmail.devpelegrino.popplus.ui.popcorn.PopcornActivity
import com.gmail.devpelegrino.popplus.ui.search.SearchActivity
import com.gmail.devpelegrino.popplus.ui.user.UserActivity
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        findViewById<NavigationBarView>(R.id.bottomNavigationView).setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.menuSearchItem -> {
                    startActivity(Intent(this, SearchActivity::class.java))
                    true
                }
                R.id.menuListItem -> {
                    startActivity(Intent(this, MyListsActivity::class.java))
                    true
                }
                R.id.menuPopcornItem -> {
                    startActivity(Intent(this, PopcornActivity::class.java))
                    true
                }
                R.id.menuUserItem -> {
                    startActivity(Intent(this, UserActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}