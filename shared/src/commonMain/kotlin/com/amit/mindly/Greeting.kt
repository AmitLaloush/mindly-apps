package com.amit.mindly

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "This is version: ${platform.name}!"
    }
}