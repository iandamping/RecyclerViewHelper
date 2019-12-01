package com.ian.recyclerviewhelper.di

import com.ian.recyclerviewhelper.helper.RecyclerViewHelper
import com.ian.recyclerviewhelper.interfaces.RecyclerviewHelper
import org.koin.dsl.module


/**
 * Created by Ian Damping on 01,December,2019
 * Github https://github.com/iandamping
 * Indonesia.
 */
val baseRecyclerViewModule = module {
    factory { RecyclerViewHelper()as RecyclerviewHelper }
}