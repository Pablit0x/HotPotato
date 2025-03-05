package ps.code.hot_potato.presentation.timer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import kotlinx.serialization.Serializable
import org.koin.compose.viewmodel.koinViewModel

@Serializable
data object Timer

@Composable
fun Timer(navController: NavController) {
    val viewModel = koinViewModel<TimerViewModel>()
    val snackBarHostState = remember { SnackbarHostState() }

    LaunchedEffect(Unit) {
        viewModel.uiEvent.collect { event ->
            when (event) {
                UiEvent.NavigateBack -> navController.popBackStack()
                UiEvent.TimerStopped -> snackBarHostState.showSnackbar(message = "Timer Stopped")
            }
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) }) { innerPadding ->
        TimerScreen(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            onUserEvent = viewModel::onUserEvent
        )
    }

}

sealed interface UserEvent {
    data object NavigateBack : UserEvent
    data object OnStartTimer : UserEvent
}

sealed interface UiEvent {
    data object NavigateBack : UiEvent
    data object TimerStopped : UiEvent
}