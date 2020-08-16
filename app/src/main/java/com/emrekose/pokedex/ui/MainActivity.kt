package com.emrekose.pokedex.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emrekose.pokedex.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(main_toolbar)
    }
}