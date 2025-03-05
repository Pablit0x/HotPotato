package ps.code.hot_potato.presentation.timer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TimerScreen(modifier : Modifier = Modifier, onUserEvent: (UserEvent) -> Unit) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { onUserEvent(UserEvent.NavigateBack) }) {
                Text(text = "Navigate Back")
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = { onUserEvent(UserEvent.OnStartTimer) }) {
                Text(text = "Start Timer")
            }
        }
}