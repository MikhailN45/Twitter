package com.mikhailn45.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.mikhailn45.twitter.adapters.HomepageRecyclerAdapter
import com.mikhailn45.twitter.adapters.NotificationsPagerAdapter
import com.mikhailn45.twitter.adapters.RecommendationsRecyclerAdapter
import com.mikhailn45.twitter.fragments.AllNotificationsListFragment
import com.mikhailn45.twitter.fragments.MentionsListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navController)
        //setupTabs()
    }

    //add viewpager to notify screen

    private fun setupTabs() {
        val adapter = NotificationsPagerAdapter(supportFragmentManager)
        adapter.addFragment(AllNotificationsListFragment(), "1")
        adapter.addFragment(MentionsListFragment(), "2")


        viewPager.adapter = adapter

        val tabs: TabLayout = findViewById(R.id.tab_layout)
        tabs.setupWithViewPager(viewPager)

    }
}