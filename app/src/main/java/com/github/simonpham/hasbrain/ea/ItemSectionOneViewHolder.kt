package com.github.simonpham.hasbrain.ea

import android.graphics.drawable.Drawable
import android.support.v7.content.res.AppCompatResources
import android.view.View
import kotlinx.android.synthetic.main.item_section_one.view.*

data class SectionOne(val title: String, val idImage: Int, val articleUrl: String) : AdapterModel

class ItemSectionOneViewHolder(itemView: View) : CustomViewHolder<SectionOne>(itemView) {

    class Factory : ViewHolderFactory {
        override val layoutRes: Int = R.layout.item_section_one
        override fun create(itemView: View): CustomViewHolder<*> = ItemSectionOneViewHolder(itemView)
    }

    private val context = itemView.context

    private val tvTitle = itemView.tvTitle
    private val ivImage = itemView.image
    private val tvTime = itemView.tvTime

    private val btnFacebook = itemView.btnFacebook
    private val btnTwitter = itemView.btnTwitter
    private val btnGithub = itemView.btnGithub
    private val btnSave = itemView.btnSave

    init {
        btnFacebook.setOnClickListener { }
        btnTwitter.setOnClickListener { }
        btnGithub.setOnClickListener { }
        btnSave.setOnClickListener {  }
    }

    override fun bind(model: SectionOne, pos: Int) {
        model.apply {
            tvTitle.text = title
            ivImage.setImageDrawable(getImage(idImage))
            tvTime.text = "3d ago"
        }
    }

    private fun getImage(idIcon: Int): Drawable? {
        return AppCompatResources.getDrawable(context, idIcon)
    }
}
