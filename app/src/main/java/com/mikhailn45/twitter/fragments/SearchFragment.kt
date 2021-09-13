package com.mikhailn45.twitter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mikhailn45.twitter.R
import com.mikhailn45.twitter.adapters.RecommendationsRecyclerAdapter

lateinit var searchRecyclerView: RecyclerView

private var avatarRList = mutableListOf<Int>()
private var nameRList = mutableListOf<String>()
private var nickNameRList = mutableListOf<String>()

class SearchFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val searchRecyclerView = view.findViewById<RecyclerView>(R.id.readable_rv)
        searchRecyclerView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        searchRecyclerView.adapter =
            RecommendationsRecyclerAdapter(avatarRList, nameRList, nickNameRList)
        postToRecommendList()

    }
}

private fun addToRecommendList(avatar: Int, name: String, nickname: String) {
    avatarRList.add(avatar)
    nameRList.add(name)
    nickNameRList.add(nickname)
}

private fun postToRecommendList() {
    for (i in 1..10) {
        addToRecommendList(
            R.drawable.avatar_picture,
            "Name",
            "@nickname"
        )
    }
}
