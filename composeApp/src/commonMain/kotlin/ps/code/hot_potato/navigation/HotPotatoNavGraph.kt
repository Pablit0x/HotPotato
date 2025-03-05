package ps.code.hot_potato.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ps.code.hot_potato.presentation.start.Start
import ps.code.hot_potato.presentation.start.StartScreen
import ps.code.hot_potato.presentation.timer.Timer
import ps.code.hot_potato.presentation.timer.TimerScreen

@Composable
fun HotPotatoNavGraph(
    modifier: Modifier = Modifier,
    startDestination: Any = Start,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        modifier = modifier,
        startDestination = startDestination,
        navController = navController,
    ) {
        composable<Start> {
            StartScreen(navController = navController)
        }

        composable<Timer> {
            Timer(navController = navController)
        }
    }
}