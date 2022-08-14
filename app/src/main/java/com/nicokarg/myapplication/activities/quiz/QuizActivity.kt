package com.nicokarg.myapplication.activities.quiz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.nicokarg.myapplication.R
import com.nicokarg.myapplication.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityQuizBinding

    val logTag = "QuizActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            // give the navigation icon functionality
            toolbar.setNavigationOnClickListener {
                Log.d(logTag, "Navigation icon clicked")
                onBackPressed()
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            // implement if options (three dots) are used
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this).setTitle(getString(R.string.quit)).setMessage(getString(R.string.quit_message))
            .setNegativeButton(getString(R.string.continue_quiz)) { _, _ -> }
            .setPositiveButton(getString(R.string.give_up)) { _, _ -> super.onBackPressed() }.show()
    }

}