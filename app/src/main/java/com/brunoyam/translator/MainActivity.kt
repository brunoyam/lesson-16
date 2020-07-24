package com.brunoyam.translator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton.setOnClickListener {
            progressBar.visibility = View.VISIBLE
        }

        // userTextInput?.setText(R.string.text_for_input)
    }

}
