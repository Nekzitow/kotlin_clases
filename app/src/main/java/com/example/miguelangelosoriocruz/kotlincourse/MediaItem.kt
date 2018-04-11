package com.example.miguelangelosoriocruz.kotlincourse

import android.view.View
import android.widget.EditText
import android.widget.TextView

data class MediaItem(val title: String, val urlImage: String, val type: Type) {
    enum class Type {PHOTO, VIDEO}
}

fun test(type: MediaItem.Type) {
    when(type) {
        MediaItem.Type.PHOTO -> print("es de tipo foto")
        MediaItem.Type.VIDEO -> print("es una foto")
    }
}

fun test2(view: View) {
    when(view) {
        is TextView -> view.text = "asopotamdre"
        is EditText -> view.setText("")

    }
}

fun test3(number: String) : Int{
    val response: Int = when(number) {
        "que pacho" -> 1
        "hello world" -> 2
        else -> 0
    }

    return response
}