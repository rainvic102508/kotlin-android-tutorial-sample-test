package com.rainvic.kotlinandroidsample

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.rainvic.kotlinandroidsample.fragments.DetailPageFragment
import com.rainvic.kotlinandroidsample.fragments.LandingPageFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
