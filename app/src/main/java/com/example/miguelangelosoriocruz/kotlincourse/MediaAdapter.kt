package com.example.miguelangelosoriocruz.kotlincourse

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MediaAdapter( var items: List<MediaItem>) : RecyclerView.Adapter<MediaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(parent!!.inflate(R.layout.layout_item))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bindData(items.get(position))
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        //var imageView = itemView!!.findViewById<ImageView>(R.id.image_view)
        //var textView = itemView!!.findViewById<TextView>(R.id.txtv)
        var imageView = itemView!!.find<ImageView>(R.id.image_view)
        var textView = itemView!!.find<TextView>(R.id.txtv)

        fun bindData(item: MediaItem) {
            imageView.loadURL(item.urlImage)
            textView.text = item.title
        }
    }
}

