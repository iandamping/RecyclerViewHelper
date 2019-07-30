package com.ian.recyclerviewhelper.base.simple_list_with_slide_adapter

import android.view.View
import androidx.recyclerview.widget.DiffUtil

/**
 *
Created by Ian Damping on 30/07/2019.
Github = https://github.com/iandamping
 */
class MyKotlinListWithSlideAdapter<T>(
    layout: Int, private val bindHolder: View.(T) -> Unit, diffUtil: DiffUtil.ItemCallback<T>,
    private val itemClicks: T.() -> Unit
) : MyListWithSliderAdapter<T>(layout, diffUtil, itemClicks) {

    override fun onBindViewHolder(holder: MyListWithSliderViewHolder, position: Int) {
        val data = getItem(position)
        holder.itemView.bindHolder(data)
        holder.itemView.setOnClickListener { itemClicks(data) }
    }
}