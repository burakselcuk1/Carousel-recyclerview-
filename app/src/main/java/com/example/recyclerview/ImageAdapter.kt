package com.example.recyclerview

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("url")
fun ImageView.loadImage( url: String) {
    Glide.with(this.context)
        .load(url)
        .into(this)
}