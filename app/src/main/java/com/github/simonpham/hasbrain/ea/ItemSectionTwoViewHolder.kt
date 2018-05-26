package com.github.simonpham.hasbrain.ea

import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.support.v7.content.res.AppCompatResources
import android.view.View
import kotlinx.android.synthetic.main.item_section_two.view.*

data class SectionTwo(val title: String, val idImage: Int, val articleUrl: String) : AdapterModel

class ItemSectionTwoViewHolder(itemView: View) : CustomViewHolder<SectionTwo>(itemView) {

    class Factory : ViewHolderFactory {
        override val layoutRes: Int = R.layout.item_section_two
        override fun create(itemView: View): CustomViewHolder<*> = ItemSectionTwoViewHolder(itemView)
    }

    private val context = itemView.context

    private val tvTitle = itemView.tvTitle
    private val ivImage = itemView.image
    private val tvName = itemView.tvName
    private val tvTime = itemView.tvTime

    private val btnAvatar = itemView.btnAvatar
    private val btnSave = itemView.btnSave

    init {
        btnAvatar.setOnClickListener {  }
        btnSave.setOnClickListener {  }
    }

    override fun bind(model: SectionTwo, pos: Int) {
        model.apply {
            tvTitle.text = title
            ivImage.setImageDrawable(getImage(idImage))
            tvName.text = "Simon Pham"
            tvTime.text = "3d ago"
        }
    }

    private fun getImage(idIcon: Int): Drawable? {
        return AppCompatResources.getDrawable(context, idIcon)
    }
}
