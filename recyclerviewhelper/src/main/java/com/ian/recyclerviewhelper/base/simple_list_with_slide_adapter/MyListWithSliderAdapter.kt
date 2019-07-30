package com.ian.recyclerviewhelper.base.simple_list_with_slide_adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.ian.recyclerviewhelper.base.simple_adapter.MyAbstractAdapter
import com.ian.recyclerviewhelper.helper.inflates
import kotlinx.android.extensions.LayoutContainer

/**
 *
Created by Ian Damping on 08/06/2019.
Github = https://github.com/iandamping
 */
abstract class MyListWithSliderAdapter<T>(
    private val layout: Int,
    diffUtil: DiffUtil.ItemCallback<T>,
    private val clickListener: (T) -> Unit
) : ListAdapter<T, MyListWithSliderAdapter.MyListWithSliderViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyListWithSliderViewHolder {
        return MyListWithSliderViewHolder(parent.inflates(layout))
    }

    override fun onBindViewHolder(holder: MyListWithSliderViewHolder, position: Int) {
        val item = getItem(position)
        holder.itemView.bind(item)
        holder.itemView.setOnClickListener { clickListener(item) }
    }

    protected open fun View.bind(item: T) {
    }

    class MyListWithSliderViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer
}