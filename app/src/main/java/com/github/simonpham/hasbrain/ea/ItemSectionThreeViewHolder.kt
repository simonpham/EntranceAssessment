package com.github.simonpham.hasbrain.ea

import android.graphics.drawable.Drawable
import android.support.v7.content.res.AppCompatResources
import android.view.View
import kotlinx.android.synthetic.main.item_section_three.view.*

data class SectionThree(val title: String, val idImage: Int, val articleUrl: String) : AdapterModel

class ItemSectionThreeViewHolder(itemView: View) : CustomViewHolder<SectionThree>(itemView) {

    class Factory : ViewHolderFactory {
        override val layoutRes: Int = R.layout.item_section_three
        override fun create(itemView: View): CustomViewHolder<*> = ItemSectionThreeViewHolder(itemView)
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

    override fun bind(model: SectionThree, pos: Int) {
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
