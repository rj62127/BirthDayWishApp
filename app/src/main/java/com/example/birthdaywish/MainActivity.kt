package com.example.birthdaywish

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.birthdaywish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createBirthdaycard(view: View) {
        val name = nameInput.editableText.toString()
        val intent = Intent(this@MainActivity, BirthdayWish::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }

}
