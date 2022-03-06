package com.example.androidhackathontemplates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem

class MainActivity : AppCompatActivity() {



    private lateinit var bottomNavigation: np.com.susanthapa.curved_bottom_navigation.CurvedBottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuItems = arrayOf(
            CbnMenuItem(
                R.drawable.ic_notifications,
                R.drawable.avd_notifications
            ),
            CbnMenuItem(
                R.drawable.ic_dashboard,
                R.drawable.avd_dashboard
            ),
            CbnMenuItem(
                R.drawable.ic_home,
                R.drawable.avd_home
            ),
            CbnMenuItem(
                R.drawable.ic_profile,
                R.drawable.avd_profile
            ),
            CbnMenuItem(
                R.drawable.ic_settings,
                R.drawable.avd_settings
            )
        )

        bottomNavigation = findViewById(R.id.bottom_nav)
        bottomNavigation.setMenuItems(menuItems,2)

    }
}