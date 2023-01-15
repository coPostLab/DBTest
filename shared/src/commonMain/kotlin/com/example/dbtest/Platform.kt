package com.example.dbtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform