package com.example.newyeargreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_newyear_greeting.*

class NewyearGreetingActivity : AppCompatActivity() {

    companion object{
        const val  NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newyear_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        NewyearGreeting.text = "Happy New Year\n$name!"
    }
}