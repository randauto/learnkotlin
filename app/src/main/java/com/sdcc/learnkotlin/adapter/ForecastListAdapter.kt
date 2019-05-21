package com.sdcc.learnkotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by tuanlq@mobgame.vn on 21/5/2019.
 */
class ForecastListAdapter(val items : List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return items?.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    class ViewHolder(val textView : TextView) : RecyclerView.ViewHolder(textView)
}