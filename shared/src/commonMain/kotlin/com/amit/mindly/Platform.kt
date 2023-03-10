package com.amit.mindly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform