package com.example.simplecalculator

//fun main() {
//    while(true) {
//        println("""
//		        1. Add
//		        2. Subtract
//		        3. Multipy
//		        4. Divide
//		        """.trimIndent())
//        val op = readln().toInt()
//
//        println("Enter two numbers:\n")
//        val num1 = readln().toInt()
//        val num2 = readln().toInt()
//        var res: Int = 0
//
//        if(op == 1) {
//            res = add(num1,num2)
//        } else if(op == 2) {
//            res = sub(num1,num2)
//        } else if(op == 3) {
//            res = mul(num1,num2)
//        } else {
//            if(num2!= 0) {
//                res = div(num1,num2)
//            } else {
//                println("Can't divide by 0")
//            }
//        }
//        println(res)
//
//    }
//}
//
//fun add(num1: Int,num2: Int):Int{
//    val result:
//            Int =  num1 +num2
//    return result
//}
//
//
//fun sub(num1: Int,num2: Int):Int{
//    val result:
//            Int =  num1 - num2
//    return result
//}
//
//fun mul(num1: Int,num2: Int):Int{
//    val result:
//            Int =  num1 * num2
//    return result
//}
//
//fun div(num1: Int,num2: Int):Int{
//    val result:
//            Int
//    result =  num1 / num2
//    return result
//}



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplecalculator.ui.theme.SimpleCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleCalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleCalculatorTheme {
        Greeting("Android")
    }
}