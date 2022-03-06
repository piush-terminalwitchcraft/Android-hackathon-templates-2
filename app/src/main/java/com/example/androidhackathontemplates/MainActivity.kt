package com.example.androidhackathontemplates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem

class MainActivity : AppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var bottomNavigation: np.com.susanthapa.curved_bottom_navigation.CurvedBottomNavigationView
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var drawerNavigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottom_nav)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        navController = navHostFragment.navController
        drawerLayout = findViewById(R.id.drawer_layout)
        drawerNavigationView = findViewById(R.id.nav_drawer)

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

        bottomNavigation.setMenuItems(menuItems,2)
//        bottomNavigation.setupWithNavController(navController)

    }
}