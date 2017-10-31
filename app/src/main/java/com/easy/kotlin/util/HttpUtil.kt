package com.easy.kotlin.util

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL


/**
 * Created by jack on 2017/10/31.
 */
object HttpUtil {
    fun getBitmapFromURL(src: String): Bitmap? {
        try {
            val url = URL(src)
            val input = url.openStream()
            val myBitmap = BitmapFactory.decodeStream(input)
            return myBitmap
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }
}
