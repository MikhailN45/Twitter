package com.mikhailn45.twitter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mikhailn45.twitter.R

class MessageRecyclerAdapter(
    private val avatar: List<Int>,
    private val name: List<String>,
    private val nickName: List<String>,
    private val message: List<String>
) : RecyclerView.Adapter<MessageRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemAvatar: ImageView = itemView.findViewById(R.id.sender_avatar)
        val itemName: TextView = itemView.findViewById(R.id.sender_name)
        val itemNickName: TextView = itemView.findViewById(R.id.sender_nick_name)
        val message: TextView = itemView.findViewById(R.id.incoming_message_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.message_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemAvatar.setImageResource(avatar[position])
        holder.itemName.text = name[position]
        holder.itemNickName.text = nickName[position]
        holder.message.text = message[position]
    }

    override fun getItemCount(): Int {
        return message.size
    }


}