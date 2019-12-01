package com.ian.recyclerviewhelper.helper


/**
 * Created by Ian Damping on 01,December,2019
 * Github https://github.com/iandamping
 * Indonesia.
 */
internal class BackupCode {

    /*fun <T> RecyclerView.setUpHorizontal(
        items: List<T>?, layoutResId: Int,
        bindHolder: View.(T) -> Unit, itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(
            this.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    ): MyKotlinAdapter<T>? {
        val snapHelper = RecyclerHorizontalSnapHelper()
        if (this.onFlingListener == null) {
            snapHelper.attachToRecyclerView(this)
        }
        if (items != null) {
            return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
                itemClick()
            }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
        }
        return null
    }*/

    /*fun <T> RecyclerView.setUpVertical(
        items: List<T>?,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
    ): MyKotlinAdapter<T>? {
        if (items != null) {
            return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
                itemClick()
            }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
        }
        return null
    }*/

    /*fun <T> RecyclerView.setUpWithGrid(
        items: List<T>?,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
    ): MyKotlinAdapter<T>? {
        if (items != null) {
            return MyKotlinAdapter(items, layoutResId, { bindHolder(it) }, {
                itemClick()
            }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
        }
        return null
    }*/

    /*fun <T> RecyclerView.setUpPagingVertical(
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
                notifyDataSetChanged()
            }
            adapter.submitList(items)
            return adapter
        }
        return null

    }*/

    /*fun <T> RecyclerView.setUpPagingHorizontal(
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
    ): MyKotlinPagingAdapter<T>? {
        if (items != null) {
            val adapter = MyKotlinPagingAdapter(items, layoutResId, { bindHolder(it) }, diffUtil, {
                itemClick()
            }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
            adapter.submitList(items)
            return adapter
        }
        return null

    }*/

    /*fun <T> RecyclerView.setUpPagingWithGrid(
        items: PagedList<T>?,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        diffUtil: DiffUtil.ItemCallback<T>,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
    ): MyKotlinPagingAdapter<T>? {
        if (items != null) {
            val adapter = MyKotlinPagingAdapter(items, layoutResId, { bindHolder(it) }, diffUtil, {
                itemClick()
            }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
            adapter.submitList(items)
            return adapter
        }
        return null

    }*/

    /*fun <T> RecyclerView.setUpVerticalListAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
    ): MyKotlinListAdapter<T>? {
        return if (items != null) {
            val adapter = MyKotlinListAdapter(
                layoutResId,
                { bindHolder(it) },
                diffUtil,
                { itemClick() }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
            adapter.submitList(items)
            return adapter
        } else null

    }*/

    /*fun <T> RecyclerView.setUpVerticalGridAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        gridSize: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = GridLayoutManager(this.context, gridSize)
    ): MyKotlinListAdapter<T>? {
        return if (items != null) {
            val adapter = MyKotlinListAdapter(
                layoutResId,
                { bindHolder(it) },
                diffUtil,
                { itemClick() }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
            adapter.submitList(items)
            return adapter
        } else null

    }*/

    /*fun <T> RecyclerView.setUpHorizontalListAdapter(
        items: List<T>?,
        diffUtil: DiffUtil.ItemCallback<T>,
        layoutResId: Int,
        bindHolder: View.(T) -> Unit,
        itemClick: T.() -> Unit = {},
        manager: RecyclerView.LayoutManager = LinearLayoutManager(
            this.context, LinearLayoutManager.HORIZONTAL,
            false
        )
    ): MyKotlinListAdapter<T>? {
        if (this.onFlingListener == null) {
            RecyclerHorizontalSnapHelper().attachToRecyclerView(this)
        }

        return if (items != null) {
            val adapter = MyKotlinListAdapter(
                layoutResId,
                { bindHolder(it) },
                diffUtil,
                { itemClick() }).apply {
                layoutManager = manager
                adapter = this
                notifyDataSetChanged()
            }
            adapter.submitList(items)
            return adapter
        } else null

    }*/


/*fun <T> RecyclerView.setUpVerticalListAdapterWithSlideLeft(
    items: List<T>?,
    diffUtil: DiffUtil.ItemCallback<T>,
    layoutResId: Int,
    bindHolder: View.(T) -> Unit,
    itemClick: T.() -> Unit = {},
    blocks:()->Unit ={},
    manager: RecyclerView.LayoutManager = LinearLayoutManager(this.context)
): MyKotlinListAdapter<T>? {
    return if (items != null) {
        val adapter = MyKotlinListAdapter(layoutResId, { bindHolder(it) }, diffUtil, { itemClick() }).apply {
            layoutManager = manager
            adapter = this
        }
        val itemTouchHelper = ItemTouchHelper(MyListWithSlideToDelete(this.context,blocks))
        itemTouchHelper.attachToRecyclerView(this)
        adapter.submitList(items)
        return adapter
    } else null

}*/
}