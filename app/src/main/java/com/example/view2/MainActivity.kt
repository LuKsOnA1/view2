package com.example.view2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.view2.Adapter.viewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var layout1 : TabLayout
    private lateinit var viewpager2 : ViewPager2
    private lateinit var viewPagerFragmentAdapter : viewPagerFragmentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        viewpager2.adapter = viewPagerFragmentAdapter
        TabLayoutMediator(layout1,viewpager2){tab,position->
            tab.text = "tab ${position+1}"
        }.attach()
    }


    private fun init(){


        viewpager2 = findViewById(R.id.viewpager2)
        layout1 = findViewById(R.id.layout1)
        viewPagerFragmentAdapter = viewPagerFragmentAdapter(this)

    }
}