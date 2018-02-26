package com.example.miguelangelosoriocruz.kotlincourse

data class MediaItem(val title: String, val urlImage: String, val type: Type) {
    enum class Type {PHOTO, VIDEO}
}