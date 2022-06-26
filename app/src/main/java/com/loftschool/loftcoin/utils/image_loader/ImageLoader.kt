package com.loftschool.loftcoin.utils.image_loader

import android.widget.ImageView
import com.loftschool.loftcoin.utils.image_loader.ImageLoader.ImageRequest

interface ImageLoader {

    fun load(url: String?): ImageRequest

    interface ImageRequest {
        fun into(view: ImageView)
    }
}