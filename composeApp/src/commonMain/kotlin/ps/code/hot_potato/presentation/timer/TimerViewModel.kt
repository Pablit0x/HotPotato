package ps.code.hot_potato.presentation.timer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class TimerViewModel : ViewModel() {

    private val _timer = MutableSharedFlow<Float>()
    val timer = _timer.asSharedFlow()

    private val _uiEvent = MutableSharedFlow<UiEvent>()
    val uiEvent = _uiEvent.asSharedFlow()

    fun onUserEvent(userEvent: UserEvent) {
        when(userEvent) {
            UserEvent.OnStartTimer -> viewModelScope.launch { _uiEvent.emit(value = UiEvent.TimerStopped) }
            UserEvent.NavigateBack -> viewModelScope.launch { _uiEvent.emit(value = UiEvent.NavigateBack) }
        }
    }


}