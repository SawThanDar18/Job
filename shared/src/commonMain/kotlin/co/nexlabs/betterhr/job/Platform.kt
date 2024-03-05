package co.nexlabs.betterhr.job

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform