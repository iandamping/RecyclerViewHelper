package com.ian.recyclerviewhelper.helper

import android.view.View
import androidx.paging.PagedList
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ian.recyclerviewhelper.base.paging_adapter.MyKotlinPagingAdapter
import com.ian.recyclerviewhelper.base.simple_adapter.MyKotlinAdapter
import com.ian.recyclerviewhelper.base.simple_list_with_slide_adapter.MyKotlinListAdapter
import com.ian.recyclerviewhelper.interfaces.RecyclerviewHelper

/**
 *
Created by Ian Damping on 15/04/2019.
Github = https://github.com/iandamping
 */
internal class RecyclerViewHelper : RecyclerviewHelper {

    override fun <T> RecyclerView.setUpHorizontal(
        items: List<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinAdapter<T>? {
        val snapHelper = RecyclerHorizontalSnapHelper()
        if (this.onFlingListener == null) {
            snapHelper.attachToRecyclerView(this)
        }
        requireNotNull(items){
            " your list data is null"
        }
        return MyKotlinAdapter(
            data = items,
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            itemClicks = {
                itemClick()
            }).apply {
            layoutManager = manager
            adapter = this
            notifyDataSetChanged()
        }
    }

    override fun <T> RecyclerView.setUpVertical(
        items: List<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinAdapter<T>? {
        requireNotNull(items){
            " your list data is null"
        }

        return MyKotlinAdapter(
            data = items,
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            itemClicks = {
                itemClick()
            }).apply {
            layoutManager = manager
            adapter = this
            notifyDataSetChanged()
        }

    }

    override fun <T> RecyclerView.setUpWithGrid(
        items: List<T>?,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinAdapter<T>? {

        requireNotNull(items){
            " your list data is null"
        }
        return MyKotlinAdapter(
            data = items,
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            itemClicks = {
                itemClick()
            }).apply {
            layoutManager = manager
            adapter = this
            notifyDataSetChanged()
        }

    }

    override fun <T> RecyclerView.setUpPagingVertical(
        items: PagedList<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        diffUtil: DiffUtil.ItemCallback<T>,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinPagingAdapter<T>? {

        requireNotNull(items){
            " your list data is null"
        }

        return MyKotlinPagingAdapter(
            data = items,
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            diffUtil = diffUtil,
            itemClicks = {
                itemClick()
            }).apply {
            layoutManager = manager
            adapter = this
            submitList(items)
            notifyDataSetChanged()
        }
    }

    override fun <T> RecyclerView.setUpPagingHorizontal(
        items: PagedList<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        diffUtil: DiffUtil.ItemCallback<T>,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinPagingAdapter<T>? {

        requireNotNull(items){
            " your list data is null"
        }
        return MyKotlinPagingAdapter(
            data = items,
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            diffUtil = diffUtil,
            itemClicks = {
                itemClick()
            }).apply {
            layoutManager = manager
            adapter = this
            submitList(items)
            notifyDataSetChanged()
        }


    }

    override fun <T> RecyclerView.setUpPagingWithGrid(
        items: PagedList<T>?,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        diffUtil: DiffUtil.ItemCallback<T>,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinPagingAdapter<T>? {
        requireNotNull(items){
            " your list data is null"
        }
        return MyKotlinPagingAdapter(
            data = items,
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            diffUtil = diffUtil,
            itemClicks = {
                itemClick()
            }).apply {
            layoutManager = manager
            adapter = this
            submitList(items)
            notifyDataSetChanged()
        }


    }

    override fun <T> RecyclerView.setUpVerticalListAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinListAdapter<T>? {

        requireNotNull(items){
            " your list data is null"
        }

        return MyKotlinListAdapter(
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            diffUtil = diffUtil,
            itemClicks = { itemClick() }).apply {
            layoutManager = manager
            adapter = this
            submitList(items)
            notifyDataSetChanged()
        }

    }

    override fun <T> RecyclerView.setUpVerticalGridAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinListAdapter<T>? {

        requireNotNull(items){
            " your list data is null"
        }

        return MyKotlinListAdapter(
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            diffUtil = diffUtil,
            itemClicks = { itemClick() }).apply {
            layoutManager = manager
            adapter = this
            submitList(items)
            notifyDataSetChanged()
        }


    }

    override fun <T> RecyclerView.setUpHorizontalListAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit,
        manager: RecyclerView.LayoutManager
    ): MyKotlinListAdapter<T>? {
        if (this.onFlingListener == null) {
            RecyclerHorizontalSnapHelper().attachToRecyclerView(this)
        }

        requireNotNull(items){
            " your list data is null"
        }
        return MyKotlinListAdapter(
            layout = layoutResId,
            bindHolder = { bindHolder(it) },
            diffUtil = diffUtil,
            itemClicks = { itemClick() }).apply {
            layoutManager = manager
            adapter = this
            submitList(items)
            notifyDataSetChanged()
        }
    }

}





