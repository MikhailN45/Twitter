package com.mikhailn45.twitter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mikhailn45.twitter.R
import com.mikhailn45.twitter.adapters.MessageRecyclerAdapter

lateinit var messageRecyclerView: RecyclerView

private var avatarMList = mutableListOf<Int>()
private var nameMList = mutableListOf<String>()
private var nickNameMList = mutableListOf<String>()
private var messageMText = mutableListOf<String>()

class MessageFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val messageRecyclerView = view.findViewById<RecyclerView>(R.id.messages_rv)
        messageRecyclerView.layoutManager = LinearLayoutManager(activity)
        messageRecyclerView.adapter =
            MessageRecyclerAdapter(avatarMList, nameMList, nickNameMList, messageMText)
        postToMessageList()
    }


}


private fun addToMessageList(avatar: Int, name: String, nickname: String, message:String ) {
    avatarMList.add(avatar)
    nameMList.add(name)
    nickNameMList.add(nickname)
    messageMText.add(message)

}

private fun postToMessageList() {
    for (i in 1..20) {
        addToMessageList(
            R.drawable.avatar_picture,
            "Name",
            "@nickname",
            "Message text"
        )
    }
}