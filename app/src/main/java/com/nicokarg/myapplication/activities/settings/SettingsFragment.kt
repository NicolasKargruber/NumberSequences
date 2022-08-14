package com.nicokarg.myapplication.activities.settings

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import com.nicokarg.myapplication.R

class SettingsFragment : PreferenceFragmentCompat() {
    private val logTag: String = "SettingsFragment"
    var prefListener: SharedPreferences.OnSharedPreferenceChangeListener? = null

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        // Load the preferences from an XML resource
        setPreferencesFromResource(R.xml.preferences, rootKey)

    }

    override fun onResume() {
        super.onResume()
        //preferenceScreen.sharedPreferences!!.registerOnSharedPreferenceChangeListener(prefListener)
    }
}
