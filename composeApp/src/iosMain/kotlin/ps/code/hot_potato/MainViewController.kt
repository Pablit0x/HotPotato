package ps.code.hot_potato

import androidx.compose.ui.window.ComposeUIViewController
import org.koin.core.context.startKoin
import ps.code.hot_potato.di.initKoin

fun MainViewController() = ComposeUIViewController (
    configure = {
        initKoin()
    }
){ App() }