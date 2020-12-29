package com.example.newyeargreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createNewyearCard(view: View) {

        val name = nameInput.editableText.toString()

        val intent = Intent(this,NewyearGreetingActivity::class.java)
        intent.putExtra(NewyearGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}