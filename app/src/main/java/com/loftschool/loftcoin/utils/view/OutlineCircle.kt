package com.loftschool.loftcoin.utils.view

import android.graphics.Outline
import android.view.View
import android.view.ViewOutlineProvider

class OutlineCircle : ViewOutlineProvider() {
    override fun getOutline(view: View, outline: Outline) {
        val minSize = Math.min(view.width, view.height)
        outline.setRoundRect(0, 0, view.width, view.height, minSize / 2f)
    }

    companion object {
        fun apply(view: View) {
            view.outlineProvider = object : ViewOutlineProvider() {
                override fun getOutline(view: View, outline: Outline) {
                    val minSize = Math.min(view.width, view.height)
                    outline.setRoundRect(0, 0, view.width, view.height, minSize / 2f)
                }
            }
            view.clipToOutline = true
        }
    }
}