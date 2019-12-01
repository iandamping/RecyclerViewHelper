package com.ian.recyclerviewhelper.interfaces

import android.view.View
import androidx.paging.PagedList
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ian.recyclerviewhelper.base.paging_adapter.MyKotlinPagingAdapter
import com.ian.recyclerviewhelper.base.simple_adapter.MyKotlinAdapter
import com.ian.recyclerviewhelper.base.simple_list_with_slide_adapter.MyKotlinListAdapter

interface RecyclerviewHelper {

    fun <T> RecyclerView.setUpHorizontal(
        items: List<T>?, layoutResId: Int,
        bindHolder: View.(T) -> Unit, itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(
            this.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    ): MyKotlinAdapter<T>?

    fun <T> RecyclerView.setUpVertical(
        items: List<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
    ): MyKotlinAdapter<T>?

    fun <T> RecyclerView.setUpWithGrid(
        items: List<T>?,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
    ): MyKotlinAdapter<T>?

    fun <T> RecyclerView.setUpPagingVertical(
        items: PagedList<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        diffUtil: DiffUtil.ItemCallback<T>,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
    ): MyKotlinPagingAdapter<T>?

    fun <T> RecyclerView.setUpPagingHorizontal(
        items: PagedList<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        diffUtil: DiffUtil.ItemCallback<T>,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(
            this.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    ): MyKotlinPagingAdapter<T>?

    fun <T> RecyclerView.setUpPagingWithGrid(
        items: PagedList<T>?,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        diffUtil: DiffUtil.ItemCallback<T>,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
    ): MyKotlinPagingAdapter<T>?

    fun <T> RecyclerView.setUpVerticalListAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
    ): MyKotlinListAdapter<T>?

    fun <T> RecyclerView.setUpVerticalGridAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
    ): MyKotlinListAdapter<T>?

    fun <T> RecyclerView.setUpHorizontalListAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(
            this.context, LinearLayoutManager.HORIZONTAL,
            false
        )
    ): MyKotlinListAdapter<T>?
}