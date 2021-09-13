package com.mikhailn45.twitter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mikhailn45.twitter.R
import com.mikhailn45.twitter.adapters.HomepageRecyclerAdapter

lateinit var homeRecycler:RecyclerView

private var avatarList = mutableListOf<Int>()
private var nameList = mutableListOf<String>()
private var nickNameList = mutableListOf<String>()
private var tweetTextList = mutableListOf<String>()
private var tweetImage = mutableListOf<Int>()

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeRecyclerView = view.findViewById<RecyclerView>(R.id.tweetRecyclerView)
        homeRecyclerView.layoutManager = LinearLayoutManager(activity)
        homeRecyclerView.adapter = HomepageRecyclerAdapter(avatarList, nameList, nickNameList, tweetTextList, tweetImage)
        postToTweetsList()
    }

}

private fun addToMainList(
    avatar: Int,
    name: String,
    nickname: String,
    twText: String,
    twImage: Int
) {
    avatarList.add(avatar)
    nameList.add(name)
    nickNameList.add(nickname)
    tweetTextList.add(twText)
    tweetImage.add(twImage)
}

private fun postToTweetsList() {
    for (i in 1..10) {
        addToMainList(
            R.drawable.avatar_picture,
            "Name",
            "@nickname",
            "Random tweet $i",
            R.drawable.cat
        )
    }
}