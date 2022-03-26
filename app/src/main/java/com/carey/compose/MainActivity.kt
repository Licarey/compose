package com.carey.compose

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.carey.compose.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FourTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)

@Composable
fun FourTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    MaterialTheme(colors = colors, typography = Typography, shapes = Shapes, content = content)
}

@Composable
fun Greeting(isShowName: Boolean) {
    val showName = if (isShowName) "显示名字" else "不显示名字"
    Text(text = "Hello ${stringResource(id = R.string.compose_coder)}! $showName")
}

@Composable
fun Greeting() {
//    Text(
//        text = stringResource(R.string.compose_coder),
//        color = Color.Red,
//        fontSize = 35.sp,
//        fontStyle = FontStyle.Italic,
////        fontWeight = FontWeight.Bold
//        fontWeight = FontWeight(1)
//    )
//    Column {
//        Text(text = "Hello World", fontFamily = FontFamily.Default)
//        Text(text = "Hello World", fontFamily = FontFamily.SansSerif)
//        Text(text = "Hello World", fontFamily = FontFamily.Serif)
//        Text(text = "Hello World", fontFamily = FontFamily.Monospace)
//        Text(text = "Hello World", fontFamily = FontFamily.Cursive)
//    }
//    // 自定义字体
//    val customFamily = FontFamily(Font(R.font.coming_soon, FontWeight.Light))
//    Text(
//        text = stringResource(id = R.string.compose_coder),
//        fontFamily = customFamily,
//        letterSpacing = 5.sp
//    )

//    // 装饰
//    Column {
//        Text(text = "Hello World", textDecoration = TextDecoration.None)
//        Text(text = "Hello World", textDecoration = TextDecoration.LineThrough)
//        Text(text = "Hello World", textDecoration = TextDecoration.Underline)
//    }

//    // 文字对齐方式
//      Text(
//          text = "Hello World",
//          textAlign = TextAlign.Center,
//          modifier = Modifier.width(150.dp)
//      )
    // 行高
//    Text(
//          text = "我是Compose爱好者",
//          lineHeight = 80.sp
//      )
    // 文字溢出
//    Column {
//        Text(
//            modifier = Modifier.width(100.dp),
//            text = "青出于蓝而胜于蓝",
//            maxLines = 1,
//            overflow = TextOverflow.Clip
//        )
//        Text(
//            modifier = Modifier.width(100.dp),
//            text = "青出于蓝而胜于蓝",
//            maxLines = 1,
//            overflow = TextOverflow.Ellipsis
//        )
//        Text(
//            modifier = Modifier.width(100.dp),
//            text = "青出于蓝而胜于蓝",
//            maxLines = 1,
//            overflow = TextOverflow.Visible)
//    }
//    // 多样式
//    Text(
//        buildAnnotatedString {
//            withStyle(
//                style = SpanStyle(color = Color.Blue)
//            ) {
//                append("H")
//            }
//            append("ello")
//
//            withStyle(
//                style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)
//            ) {
//                append("W")
//            }
//            append("orld")
//        }
//    )
    // 可长按选择
//    SelectionContainer(modifier = Modifier.fillMaxSize()) {
//        Text("This is a selectable text", fontSize = 30.sp)
//    }

//    SelectionContainer(modifier = Modifier.fillMaxSize()) {
//        Column {
//            Text("曾经有一份爱情")
//            Text("摆在我面前")
//            Text("我没有珍惜")
//            DisableSelection { // 不可选择
//                Text("如果再给我一次机会")
//                Text("我会对她说")
//            }
//            Text("滚...")
//        }
//    }

    // 可点击文字
//    ClickableText(
//        text = AnnotatedString("点击"),
//        onClick = { offset ->
//            Log.v("LM", "$offset")
//        }
//    )

//    val annotatedText = buildAnnotatedString {
//        append("点击")
//        pushStringAnnotation(tag = "URL", annotation = "http://www.baidu.com")
//        withStyle(style = SpanStyle(color = Color.Blue)) {
//            append("Url")
//        }
//        pop() // 结束符
//    }
//
//    ClickableText(
//        text = annotatedText,
//        style = TextStyle(fontSize = 30.sp),
//        onClick = { offest ->
//        annotatedText.getStringAnnotations(tag = "URL", start = offest, end = offest
//        ).firstOrNull()?.let { annotation ->
//            Log.v("LM", "click url " + annotation.item)
//        }
//    })

    // TextField用法
//    val text = remember {
//        mutableStateOf("你好")
//    }
//    TextField(
//        value = text.value,
//        onValueChange = {text.value = it},
//        label = { Text("标签") }
//    )

    // OutlinedTextField用法

//    Column {
//        val text = remember {
//            mutableStateOf("你好")
//        }
//        OutlinedTextField(
//            value = text.value,
//            onValueChange = {text.value = it},
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.Red)
//                .padding(15.dp),
//            label = { Text("标签") }
//        )
//    }


    // BasicTextField用法
//    Column {
//        val text = remember {
//            mutableStateOf("你好")
//        }
//        BasicTextField(
//            value = text.value,
//            onValueChange = {text.value = it}
//        )
//    }


    // TextField其他属性用法
//    Column {
//        val context = LocalContext.current
//        val text = remember {
//            mutableStateOf("你好")
//        }
//        TextField(
//            value = text.value,
//            onValueChange = {text.value = it},
//            label = { Text("Enter text") },
//            keyboardOptions = KeyboardOptions(
//                capitalization = KeyboardCapitalization.Characters, // 全部字符大写
//                keyboardType = KeyboardType.Email, // 输入email
//                autoCorrect = true, // 自动纠正
//                imeAction = ImeAction.Search // IME动作设置为搜索
//            ),
//            keyboardActions = KeyboardActions(
//                onSearch = {
//                    Toast.makeText(context, "点击了Search", Toast.LENGTH_LONG).show()
//                }
//            ),
//            textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
//            modifier = Modifier.padding(15.dp).background(Color.Red)
//        )
//    }

    // 按钮的用法
    Column {
        val context = LocalContext.current
        Button(
            modifier = Modifier
                .height(100.dp)
                .width(250.dp), // 大小
            onClick = {
                // 点击事件
                Toast.makeText(context, "点击按钮", Toast.LENGTH_LONG).show()
            },
            elevation = ButtonDefaults.elevation(3.dp, 10.dp, 0.dp),
            border = BorderStroke(6.dp, Color.Yellow),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Red,
                contentColor = Color.Green,
                disabledBackgroundColor = Color.Yellow,
                disabledContentColor = Color.Magenta
            ),
            contentPadding = PaddingValues(8.dp)

            ) {
                Text(text = "按钮") // 按钮文案，对应content
              }
    }

}

@Preview(showBackground = true, widthDp = 250, heightDp = 400)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting()
    }
}