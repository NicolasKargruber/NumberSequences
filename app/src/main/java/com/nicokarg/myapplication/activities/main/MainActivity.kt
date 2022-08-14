package com.nicokarg.myapplication.activities.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.nicokarg.myapplication.R
import com.nicokarg.myapplication.activities.about.AboutMeActivity
import com.nicokarg.myapplication.activities.settings.SettingsActivity
import com.nicokarg.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    val logTag = "MainActivity"
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle( // implements functionality of NavigationDrawer
                this@MainActivity,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
            )
            drawerLayout.addDrawerListener(toggle) //listener for drawer events
            toggle.syncState() // switch between hamburger and back arrow

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.nav_settings -> {
                        Log.d(logTag, "Menu Item Settings clicked")
                        val intent = Intent(this@MainActivity, SettingsActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.nav_about -> {
                        Log.d(logTag, "Menu Item About clicked")
                        val intent = Intent(this@MainActivity, AboutMeActivity::class.java)
                        startActivity(intent)
                    }
                }
                true
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            // include if menu is used
            else -> super.onOptionsItemSelected(item)
        }
    }
}