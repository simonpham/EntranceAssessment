package com.github.simonpham.hasbrain.ea.ui

import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v7.content.res.AppCompatResources
import android.view.View
import com.github.simonpham.hasbrain.ea.NO_IMAGE
import com.github.simonpham.hasbrain.ea.R
import com.github.simonpham.hasbrain.ea.ui.browser.BrowserActivity
import com.github.simonpham.hasbrain.ea.ui.common.AdapterModel
import com.github.simonpham.hasbrain.ea.ui.common.CustomViewHolder
import com.github.simonpham.hasbrain.ea.ui.common.ViewHolderFactory
import kotlinx.android.synthetic.main.item_section_two.view.*

data class SectionTwo(val title: String, val idImage: Int, val articleUrl: String) : AdapterModel

class ItemSectionTwoViewHolder(itemView: View) : CustomViewHolder<SectionTwo>(itemView) {

    class Factory : ViewHolderFactory {
        override val layoutRes: Int = R.layout.item_section_two
        override fun create(itemView: View): CustomViewHolder<*> = ItemSectionTwoViewHolder(itemView)
    }

    private val context = itemView.context

    private val ivImage = itemView.image

    private val tvTitle = itemView.tvTitle
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
            tvName.text = "Simon Pham"
            tvTime.text = "3d ago"

            if (idImage == NO_IMAGE) {
                ivImage.visibility = View.INVISIBLE
            } else {
                ivImage.setImageDrawable(getImage(idImage))
            }

            val intent = Intent(context, BrowserActivity::class.java)
            intent.putExtra("MainActivity.ARTICLE_URL", articleUrl)

            ivImage.setOnClickListener {
                context.startActivity(intent)
            }
            tvTitle.setOnClickListener {
                context.startActivity(intent)
            }
        }
    }

    private fun getImage(idIcon: Int): Drawable? {
        return AppCompatResources.getDrawable(context, idIcon)
    }
}
