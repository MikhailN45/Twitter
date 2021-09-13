package com.mikhailn45.twitter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mikhailn45.twitter.R

class RecommendationsRecyclerAdapter(
    private val avatar: List<Int>,
    private val name: List<String>,
    private val nickName: List<String>
) : RecyclerView.Adapter<RecommendationsRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemAvatar: ImageView = itemView.findViewById(R.id.recommend_profile_picture)
        val itemName: TextView = itemView.findViewById(R.id.recommend_name_text)
        val itemNickName: TextView = itemView.findViewById(R.id.recommend_nick_name_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recommendations_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemAvatar.setImageResource(avatar[position])
        holder.itemName.text = name[position]
        holder.itemNickName.text = nickName[position]
    }

    override fun getItemCount(): Int {
        return name.size
    }

}