package com.ian.recyclerviewhelper.helper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *
Created by Ian Damping on 06/05/2019.
Github = https://github.com/iandamping
 */
internal fun ViewGroup.inflates(layout: Int): View {
    return LayoutInflater.from(context).inflate(layout, this, false)
}

internal fun View.visible() {
    this.visibility = View.VISIBLE
}

internal fun View.gone() {
    this.visibility = View.GONE
}