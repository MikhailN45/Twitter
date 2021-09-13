package com.mikhailn45.twitter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.mikhailn45.twitter.R
import com.mikhailn45.twitter.adapters.NotificationsPagerAdapter

    val viewPager:ViewPager = TODO()

class NotificationsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*val adapter = activity?.supportFragmentManager?.let { NotificationsPagerAdapter(it) }
        adapter?.addFragment(AllNotificationsListFragment(), "1")
        adapter?.addFragment(MentionsListFragment(), "2")

        viewPager.adapter = adapter
        val tabs: TabLayout = view.findViewById(R.id.tab_layout)
        tabs.setupWithViewPager(viewPager)*/
    }
}

