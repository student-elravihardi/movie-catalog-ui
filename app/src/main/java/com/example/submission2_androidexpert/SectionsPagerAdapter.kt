package com.example.submission2_androidexpert

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SectionsPagerAdapter (private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    @StringRes
    private val tabsTitle = intArrayOf (
        R.string.tab_text_movies,
        R.string.tab_text_tvshows
    )

    override fun getItem(position: Int): Fragment {
        return TabsFragment.newInstance(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(tabsTitle[position])
    }

    override fun getCount(): Int {
        return 2
    }
}