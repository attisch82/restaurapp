package org.atesz.restaurapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform