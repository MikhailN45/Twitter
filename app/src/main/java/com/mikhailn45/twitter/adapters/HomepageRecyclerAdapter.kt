package com.mikhailn45.twitter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mikhailn45.twitter.R

class HomepageRecyclerAdapter(
    private val avatar: List<Int>,
    private val name: List<String>,
    private val nickname: List<String>,
    private val tweetText: List<String>,
    private val tweetImage: List<Int>
) : RecyclerView.Adapter<HomepageRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemAvatar: ImageView = itemView.findViewById(R.id.sender_avatar)
        val itemName: TextView = itemView.findViewById(R.id.sender_name)
        val itemNickName: TextView = itemView.findViewById(R.id.sender_nick_name)
        val itemTweetText: TextView = itemView.findViewById(R.id.tweetText)
        val itemTweetImage: ImageView = itemView.findViewById(R.id.tweetImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.tweet_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemAvatar.setImageResource(avatar[position])
        holder.itemName.text = name[position]
        holder.itemNickName.text = nickname[position]
        holder.itemTweetText.text = tweetText[position]
        holder.itemTweetImage.setImageResource(tweetImage[position])
    }

    override fun getItemCount(): Int {
        return tweetText.size

    }

}