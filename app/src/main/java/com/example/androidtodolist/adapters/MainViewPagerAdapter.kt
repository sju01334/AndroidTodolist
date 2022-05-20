package com.neppplus.todolistpractice_20220511.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.todolistpractice_20220511.fragments.GoalFragment
import com.neppplus.todolistpractice_20220511.fragments.SettingFragment
import com.neppplus.todolistpractice_20220511.fragments.TodoFragment

class MainViewPagerAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TodoFragment()
            1 -> GoalFragment()
            else -> SettingFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "TodoList"
            1 -> "Goal"
            else -> "Setting"
        }
    }
}