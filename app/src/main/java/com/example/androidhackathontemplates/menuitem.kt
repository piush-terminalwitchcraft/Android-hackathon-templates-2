package com.example.androidhackathontemplates

import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem

class menuitem {

    public val menuItems = arrayOf(
        CbnMenuItem(
            R.drawable.ic_notifications,
            R.drawable.ic_notifications
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
    fun getMenu(): Array<CbnMenuItem> = this.menuItems
}