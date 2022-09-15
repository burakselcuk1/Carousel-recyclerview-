package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.Beef
import com.example.recyclerview.model.BeefItems
import com.example.recyclerview.viewModel.ActivityMainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var homeBinding: ActivityMainBinding
    private lateinit var adapter: BeefAdapter
    private lateinit var viewModel: ActivityMainViewModel

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(homeBinding.root)

         viewModel = ViewModelProviders.of(this).get(ActivityMainViewModel::class.java)

         viewModel.cateforyValues.observe(this, Observer {
             adapter = BeefAdapter(it)
             homeBinding.carouselRecyclerview.adapter = adapter
             homeBinding.carouselRecyclerview.apply {
                 set3DItem(true)
                 setAlpha(true)
                 setInfinite(true)

             }
         })
    }
}