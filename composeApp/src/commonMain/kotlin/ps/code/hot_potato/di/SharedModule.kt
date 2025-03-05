package ps.code.hot_potato.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ps.code.hot_potato.presentation.timer.TimerViewModel

val sharedModule = module {
    viewModelOf(::TimerViewModel)
}