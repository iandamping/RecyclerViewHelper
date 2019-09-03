package com.ian.recyclerviewhelper.helper

import android.view.View
import androidx.paging.PagedList
import androidx.recyclerview.widget.*
import com.ian.recyclerviewhelper.base.paging_adapter.MyKotlinPagingAdapter
import com.ian.recyclerviewhelper.base.simple_adapter.MyKotlinAdapter
import com.ian.recyclerviewhelper.base.simple_list_with_slide_adapter.MyKotlinListWithSlideAdapter
import com.ian.recyclerviewhelper.base.simple_list_with_slide_adapter.MyListWithSlideToDelete

/**
 *
Created by Ian Damping on 15/04/2019.
Github = https://github.com/iandamping
 */
fun <T> RecyclerView.setUpHorizontal(items: List<T>?, layoutResId: Int,
    bindHolder: View.(T) -> Unit, itemClick: T.() -> Unit = {}, manager: RecyclerView.LayoutManager = LinearLayoutManager(
        this.context,
        LinearLayoutManager.HORIZONTAL,
        false
    )
): MyKotlinAdapter<T>? {
    val snapHelper = RecyclerHorizontalSnapHelper()
    if (this.onFlingListener == null) {
        snapHelper.attachToRecyclerView(this)
    }
    if (items!=null) {
        return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
            itemClick()
        }).apply {
            layoutManager = manager
            adapter = this
        }
    }
    return null
}

fun <T> RecyclerView.setUpVertical(items: List<T>?, layoutResId: Int,
    bindHolder: View.(T) -> Unit, itemClick: T.() -> Unit = {}, manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
): MyKotlinAdapter<T>? {
    if (items!=null) {
        return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
            itemClick()
        }).apply {
            layoutManager = manager
            adapter = this
        }
    }
    return null
}

fun <T> RecyclerView.setUpWithGrid(
    items: List<T>?, layoutResId: Int, gridSize: Int, bindHolder: View.(T) -> Unit, itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
): MyKotlinAdapter<T>? {
    if (items!=null) {
        return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
            itemClick()
        }).apply {
            layoutManager = manager
            adapter = this
        }
    }
    return null
}

fun <T> RecyclerView.setUpPagingVertical(
    items: PagedList<T>?,
    layoutResId: Int,
    bindHolder: View.(T) -> Unit,
    diffUtil: DiffUtil.ItemCallback<T>,
    itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
): MyKotlinPagingAdapter<T>? {
    if (items != null) {
        val adapter = MyKotlinPagingAdapter(items, layoutResId, { bindHolder(it) }, diffUtil, {
            itemClick()
        }).apply {
            layoutManager = manager
            adapter = this
        }
        adapter.submitList(items)
        return adapter
    }
    return null

}

fun <T> RecyclerView.setUpPagingHorizontal(
    items: PagedList<T>?,
    layoutResId: Int,
    bindHolder: View.(T) -> Unit,
    diffUtil: DiffUtil.ItemCallback<T>,
    itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context,
        LinearLayoutManager.HORIZONTAL,
        false)
): MyKotlinPagingAdapter<T>? {
    if (items != null) {
        val adapter = MyKotlinPagingAdapter(items, layoutResId, { bindHolder(it) }, diffUtil, {
            itemClick()
        }).apply {
            layoutManager = manager
            adapter = this
        }
        adapter.submitList(items)
        return adapter
    }
    return null

}

fun <T> RecyclerView.setUpPagingWithGrid(
    items: PagedList<T>?,
    layoutResId: Int,
    gridSize: Int,
    bindHolder: View.(T) -> Unit,
    diffUtil: DiffUtil.ItemCallback<T>,
    itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager =  GridLayoutManager(this.context, gridSize)
): MyKotlinPagingAdapter<T>? {
    if (items != null) {
        val adapter = MyKotlinPagingAdapter(items, layoutResId, { bindHolder(it) }, diffUtil, {
            itemClick()
        }).apply {
            layoutManager = manager
            adapter = this
        }
        adapter.submitList(items)
        return adapter
    }
    return null

}

fun <T> RecyclerView.setUpVerticalListAdapter(
    items: List<T>?,
    diffUtil: DiffUtil.ItemCallback<T>,
    layoutResId: Int,
    bindHolder: View.(T) -> Unit,
    itemClick: T.() -> Unit = {},
    manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
): MyKotlinListWithSlideAdapter<T>? {
    return if (items != null) {
        val adapter = MyKotlinListWithSlideAdapter(layoutResId, { bindHolder(it) }, diffUtil, { itemClick() }).apply {
            layoutManager = manager
            adapter = this
        }
        adapter.submitList(items)
        return adapter
    } else null

}

/*fun <T> RecyclerView.setUpVerticalListAdapterWithSlideLeft(
    items: List<T>?,
    diffUtil: DiffUtil.ItemCallback<T>,
    layoutResId: Int,
    bindHolder: View.(T) -> Unit,
    itemClick: T.() -> Unit = {},
    blocks:()->Unit ={},
    manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
): MyKotlinListWithSlideAdapter<T>? {
    return if (items != null) {
        val adapter = MyKotlinListWithSlideAdapter(layoutResId, { bindHolder(it) }, diffUtil, { itemClick() }).apply {
            layoutManager = manager
            adapter = this
        }
        val itemTouchHelper = ItemTouchHelper(MyListWithSlideToDelete(this.context,blocks))
        itemTouchHelper.attachToRecyclerView(this)
        adapter.submitList(items)
        return adapter
    } else null

}*/


