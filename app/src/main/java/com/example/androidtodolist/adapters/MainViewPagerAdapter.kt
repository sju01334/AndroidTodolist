package com.example.androidtodolist.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.neppplus.todolistpractice_20220511.fragments.GoalFragment
import com.neppplus.todolistpractice_20220511.fragments.SettingFragment
import com.neppplus.todolistpractice_20220511.fragments.TodoFragment

class MainViewPagerAdapter(fa : FragmentActivity): FragmentStateAdapter(fa){
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> TodoFragment()
            1 -> GoalFragment()
            else -> SettingFragment()
        }

    }

}