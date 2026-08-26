package GabrielJS2005.com.github.toDoList

import GabrielJS2005.com.github.toDoList.navigation.AppNavigation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import GabrielJS2005.com.github.toDoList.ui.theme.FiaptodolistTheme
import GabrielJS2005.com.github.toDoList.viewmodel.TarefaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FiaptodolistTheme {

                val viewModel: TarefaViewModel = viewModel(
                    factory = TarefaViewModel.factory(applicationContext)
                )
                AppNavigation(viewModel = viewModel)

            }
        }
    }
}
