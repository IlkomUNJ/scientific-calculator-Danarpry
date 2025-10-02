//package com.example.miapigos
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.material3.Button
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.ElevatedButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.miapigos.ui.theme.MiapigosTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MiapigosTheme {
//                MyApp(modifier = Modifier.fillMaxSize())
//            }
//        }
//    }
//}
//
//@Composable
//fun MyApp(modifier: Modifier = Modifier) {
//
//    var shouldShowOnboarding by remember { mutableStateOf(true) }
//
//    Surface(modifier) {
//        if (shouldShowOnboarding) {
//            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
//        } else {
//            Greetings()
//        }
//    }
//}
//
//@Composable
//private fun Greetings(
//    modifier: Modifier = Modifier,
//    names: List<String> = List(1000) { "$it" }
//) {
//    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
//        items(items = names) { name ->
//            Greeting(name = name)
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//
//    var expanded by remember { mutableStateOf(false) }
//
//    val extraPadding = if (expanded) 48.dp else 0.dp
//
//    Surface(
//        color = MaterialTheme.colorScheme.primary,
//        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
//    ) {
//        Row(modifier = Modifier.padding(24.dp)) {
//            Column(modifier = Modifier
//                .weight(1f)
//                                "padding theme elit, sed do bouncy. ").repeat(4),
//                    )
//                }
//            }
//            ElevatedButton(
//                onClick = { expanded = !expanded }
//            ) {.padding(bottom = extraPadding)
//                ) {
//                    Text(text = "Hello ")
//                    Text(text = name)
//                    Text("")
//                    if (expanded) {
//                        Text(
//                            text = ("Composem ipsum color sit lazy, " +
//
//                                    Text(if (expanded) "Show less" else "Show more")
//            }
//        }
//    }
//}
//
//@Composable
//fun OnboardingScreen(
//    onContinueClicked: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//
//    Column(
//        modifier = modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text("Welcome to Los Pollos Hermanos Family!")
//        Button(
//            modifier = Modifier.padding(vertical = 24.dp),
//            onClick = onContinueClicked
//        ) {
//            Text("Continue")
//        }
//    }
//}
//
//@Preview(showBackground = true, widthDp = 320, heightDp = 320)
//@Composable
//fun OnboardingPreview() {
//    MiapigosTheme {
//        OnboardingScreen(onContinueClicked = {})
//    }
//}
//
//@Preview
//@Composable
//fun MyAppPreview() {
//    MiapigosTheme {
//        MyApp(Modifier.fillMaxSize())
//    }
//}
//
//@Preview(showBackground = true, widthDp = 320)
//@Composable
//fun GreetingPreview() {
//    MiapigosTheme {
//        Greetings()
//    }
//}

package com.example.miapigos
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miapigos.ui.theme.MiapigosTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import java.text.DecimalFormat
import net.objecthunter.exp4j.ExpressionBuilder
import net.objecthunter.exp4j.function.Function

val DarkGray = Color(0xFF2E2E2E)
val LightGray = Color(0xFFA2BBCF)
val Blue = Color(0xFF205B7A)
val White = Color.White
val Black = Color.Black

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiapigosTheme {
                MyApp()
//                Greetings(modifier = Modifier.fillMaxSize())
//                CalculatorApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun AppNavbar(
    title: String,
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF205B7A))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = onBack,
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkGray,
                contentColor = White
            ),
            shape = RectangleShape
        ) {
            Text("<- Back")
        }

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = White
        )
    }
}

@Composable
fun MyApp() {
    var currentScreen by rememberSaveable { mutableStateOf("menu") }

    Surface(Modifier.fillMaxSize()) {
        when (currentScreen) {
            "menu" -> MainMenu(
                onSelectApp = { selected -> currentScreen = selected }
            )
            "calculator" -> CalculatorApp(
                onBack = { currentScreen = "menu" }
            )
//            "texteditor" -> TextEditApp(
//                onBack = { currentScreen = "menu" }
//            )
//            "imageviewer" -> ImageViewApp(
//                onBack = { currentScreen = "menu" }
//            )
        }
    }
}

@Composable
fun MainMenu(onSelectApp: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome! Pilih aplikasi:")

        Button(onClick = { onSelectApp("greetings") }) {
            Text("Greetings App")
        }
        Button(onClick = { onSelectApp("calculator") }) {
            Text("Calculator App")
        }
        Button(onClick = { onSelectApp("other") }) {
            Text("Other App")
        }
    }
}

@Composable
fun CalculatorApp(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {}
) {
    var display by rememberSaveable { mutableStateOf("0") }
    var expression by rememberSaveable { mutableStateOf("") }
    var isInverse by rememberSaveable { mutableStateOf(false) }

    fun evaluateExpression(exp: String): String {
        return try {
            val sanitizedExp = exp
                .replace("×", "*")
                .replace("÷", "/")
                .replace("√", "sqrt")
                .replace("π", Math.PI.toString())

            val expressionBuilder = ExpressionBuilder(sanitizedExp)
                .function(factorial)
                .build()

            val result = expressionBuilder.evaluate()

            // Format hasil
            val df = DecimalFormat("#.#######")
            df.format(result)
        } catch (e: Exception) {
            "Error"
        }
    }

    val onButtonClick: (String) -> Unit = { buttonText ->
        var currentText = buttonText
        if (isInverse) {
            currentText = when (buttonText) {
                "sin" -> "asin"
                "cos" -> "acos"
                "tan" -> "atan"
                else -> buttonText
            }
        }

        when (currentText) {
            "AC" -> {
                expression = ""
                display = "0"
            }
            "⌫" -> { // Backspace
                if (expression.isNotEmpty()) {
                    expression = expression.dropLast(1)
                    display = if (expression.isEmpty()) "0" else expression
                }
            }
            "=" -> {
                if (expression.isNotEmpty()) {
                    val result = evaluateExpression(expression)
                    display = result
                    expression = if (result != "Error") result else ""
                }
            }
            "inv" -> {
                isInverse = !isInverse
            }
            "sin", "cos", "tan", "asin", "acos", "atan", "log", "ln", "√" -> {
                if (expression == "0" || expression == "Error") {
                    expression = "$currentText("
                } else {
                    expression += "$currentText("
                }
                display = expression
            }
            "x!" -> {
                expression += "fact("
                display = expression
            }
            "1/x" -> {
                if (expression == "0" || expression == "Error") {
                    expression = "1/"
                } else {
                    expression = "1/($expression)"
                }
                display = expression
            }
            "xʸ" -> {
                expression += "^"
                display = expression

            }
            else -> {
                if (display == "0" || expression == "Error") {
                    expression = currentText
                } else {
                    expression += currentText
                }
                display = expression
            }
        }
    }

    Box(
        modifier = modifier
            .background(color = Black)
            .padding(16.dp)
    ) {
        AppNavbar(title = "Calculator", onBack = onBack)
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = display,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp, start = 8.dp, end = 8.dp),
                fontSize = if (display.length > 9) 48.sp else 72.sp,
                fontWeight = FontWeight.Light,
                color = White,
                textAlign = TextAlign.End,
                maxLines = 2
            )

            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                val buttonRows = listOf(
                    listOf("inv", "sin", "ln", "cos", "log", "tan"),
                    listOf("√", "xʸ", "x!", "(", ")", "π"),
                    listOf("AC", "⌫", "%", "÷"),
                    listOf("7", "8", "9", "×"),
                    listOf("4", "5", "6", "-"),
                    listOf("1", "2", "3", "+"),
                    listOf("0", ".", "=")
                )

                buttonRows.forEach { rowItems ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        rowItems.forEach { buttonText ->
                            val weight = if (buttonText == "0") 2.1f else 1f
                            val modifier = Modifier.weight(weight).aspectRatio(if(buttonText == "0") 2f else 1f)

                            val label = when {
                                buttonText == "inv" && isInverse -> "inv"
                                buttonText == "sin" -> if (isInverse) "sin⁻¹" else "sin"
                                buttonText == "cos" -> if (isInverse) "cos⁻¹" else "cos"
                                buttonText == "tan" -> if (isInverse) "tan⁻¹" else "tan"
                                else -> buttonText
                            }

                            CalculatorButton(
                                text = label,
                                modifier = modifier,
                                onClick = { onButtonClick(buttonText) }
                            )
                        }
                    }
                }
            }
        }
    }
}

val factorial = object : Function("fact", 1) {
    override fun apply(vararg args: Double): Double {
        val n = args[0].toInt()
        if (n < 0 || n != args[0].toInt()) {
            throw IllegalArgumentException("Argument for factorial must be a non-negative integer")
        }
        var result = 1.0
        for (i in 2..n) {
            result *= i
        }
        return result
    }
}

@Composable
fun CalculatorButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val (backgroundColor, textColor) = when (text) {
        "AC", "⌫", "%" -> LightGray to Black
        "÷", "×", "-", "+", "=" -> Blue to White
        "inv" -> if (text == "inv") Blue to White else LightGray to Black
        else -> DarkGray to White
    }

    ElevatedButton(
        onClick = onClick,
        modifier = modifier.fillMaxSize(),
        shape = RectangleShape,
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = backgroundColor,
            contentColor = textColor
        ),
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 4.dp,
            pressedElevation = 2.dp
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(text = text, fontSize = 28.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
fun TextEditApp(modifier: Modifier = Modifier){

}

@Composable
fun ImageViewApp(modifier: Modifier = Modifier){

}

@Composable
fun Greetings(modifier: Modifier = Modifier, onBack: () -> Unit = {}) {
    Row(modifier = Modifier.padding(24.dp)) {
        Column(modifier = Modifier.weight(1f)) {

        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview() {
    MiapigosTheme {
        Greetings()
    }
}