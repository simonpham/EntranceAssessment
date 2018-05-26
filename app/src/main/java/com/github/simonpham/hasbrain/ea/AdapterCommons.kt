package com.github.simonpham.hasbrain.ea

import android.support.v7.widget.RecyclerView
import android.view.View

interface AdapterModel

interface HasIdLong {
    val idLong: Long
}

abstract class CustomViewHolder<in T : AdapterModel>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(model: T, pos: Int)

    open fun onAttachedToWindow() = Unit

    open fun onDetachedFromWindow() = Unit
}