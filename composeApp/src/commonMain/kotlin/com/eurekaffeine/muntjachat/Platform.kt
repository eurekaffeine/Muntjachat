package com.eurekaffeine.muntjachat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform