package com.ian.recyclerviewhelper.base.paging_adapter

import android.view.View
import androidx.paging.PagedList
import androidx.recyclerview.widget.DiffUtil
import com.ian.app.moviesapi.util.MyAbstractPagingAdapter

/**
 *
Created by Ian Damping on 03/06/2019.
Github = https://github.com/iandamping
 */
class MyKotlinPagingAdapter<T>(data: PagedList<T>, layout: Int,
                               private val bindHolder: View.(T) -> Unit,
                               diffUtil: DiffUtil.ItemCallback<T>,
                               private val itemClicks: T.() -> Unit
) : MyAbstractPagingAdapter<T>(data, layout, diffUtil,itemClicks) {

    override fun onBindViewHolder(holder: MyAbstractPagingViewHolder, position: Int) {
        val item = getItem(position)
        if (item!=null){
            holder.itemView.bindHolder(item)
            holder.itemView.setOnClickListener { itemClicks(item)
            }
        }
    }
}