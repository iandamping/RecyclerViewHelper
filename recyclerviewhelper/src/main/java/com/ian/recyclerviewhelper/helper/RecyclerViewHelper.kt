package com.ian.recyclerviewhelper.helper

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ian.recyclerviewhelper.base.MyKotlinAdapter

/**
 *
Created by Ian Damping on 15/04/2019.
Github = https://github.com/iandamping
 */
fun <T> RecyclerView.setUpHorizontal(
    items: List<T>,
    layoutResId: Int,
    bindHolder: View.(T) -> Unit,
    itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager = LinearLayoutManager(
        this.context,
        LinearLayoutManager.HORIZONTAL,
        false
    )
): MyKotlinAdapter<T> {
    val snapHelper = RecyclerHorizontalSnapHelper()
    if (this.onFlingListener == null) {
        snapHelper.attachToRecyclerView(this)
    }
    return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
        itemClick()
    }).apply {
        layoutManager = manager
        adapter = this
    }
}

fun <T> RecyclerView.setUpVertical(
    items: List<T>,
    layoutResId: Int,
    bindHolder: View.(T) -> Unit,
    itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
): MyKotlinAdapter<T> {
    val snapHelper = RecyclerHorizontalSnapHelper()
    return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
        itemClick()
    }).apply {
        layoutManager = manager
        adapter = this
    }
}

fun <T> RecyclerView.setUpWithGrid(
    items: List<T>, layoutResId: Int, gridSize: Int, bindHolder: View.(T) -> Unit, itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
): MyKotlinAdapter<T> {

    return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
        itemClick()
    }).apply {
        layoutManager = manager
        adapter = this
    }
}
