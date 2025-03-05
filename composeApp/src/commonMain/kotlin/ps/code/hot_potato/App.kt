package ps.code.hot_potato

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.reload.DevelopmentEntryPoint
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import ps.code.hot_potato.navigation.HotPotatoNavGraph

@Composable
@Preview
fun App() {
    DevelopmentEntryPoint {
            MaterialTheme {
                KoinContext {
                    HotPotatoNavGraph()
                }
            }
    }
}