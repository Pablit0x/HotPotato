package ps.code.hot_potato

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform