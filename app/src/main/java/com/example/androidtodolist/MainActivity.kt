package com.example.androidtodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.androidtodolist.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    private fun setupEvents(){

    }

    private fun setValues(){
        mPagerAdapter = MainViewPagerAdapter(this)
        mainViewPager.adapter = mPagerAdapter

        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> mainViewPager.currentItem = 0
                R.id.paper -> mainViewPager.currentItem = 1
                R.id.profile -> mainViewPager.currentItem = 2
            }
            return@setOnItemSelectedListener true
        }

        mainViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                bottomNav.menu.getItem(position).isChecked = true
            }
        })



    }
}