package com.mahammadjafarzade.booking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handleDeepLink()
    }
    fun handleDeepLink(){
        val uri = intent.dataString ?: ""
        if(uri.contains("Login")){

        }
    }
}