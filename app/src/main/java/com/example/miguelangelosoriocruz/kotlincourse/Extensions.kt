package com.example.miguelangelosoriocruz.kotlincourse

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}

fun RecyclerView.ViewHolder.toast(message: String, length: Int) {
    itemView.context.toast(message, length)
}

fun ViewGroup.inflate(idRes: Int) : View {
    return LayoutInflater.from(context).inflate(idRes, this, false)
}

fun ImageView.loadURL(url: String) {
    Picasso.with(context).load(url).into(this)
}

inline  fun <reified T : View > View.find(res: Int) : T {
    return findViewById<T>(res)
}

inline fun <reified  T : View> RecyclerView.ViewHolder.find(res: Int) : T {
    return itemView.find(res)
}