package com.example.androidtodolist

import android.graphics.pdf.PdfDocument
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.todolistpractice_20220511.adapters.MainViewPagerAdapter
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
        mPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }
}