package com.carey.compose

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
import androidx.compose.ui.unit.*
import androidx.constraintlayout.compose.ConstraintLayout
import com.carey.compose.bean.Chat
import com.carey.compose.bean.Contact
import com.carey.compose.nav.MainTabs
import com.carey.compose.ui.theme.*
import com.google.accompanist.coil.rememberCoilPainter
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
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

@ExperimentalAnimationApi
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

//    // 按钮的用法
//    Column {
//        val context = LocalContext.current
//        Button(
//            modifier = Modifier
//                .height(100.dp)
//                .width(250.dp), // 大小
//            onClick = {
//                // 点击事件
//                Toast.makeText(context, "点击按钮", Toast.LENGTH_LONG).show()
//            },
//            elevation = ButtonDefaults.elevation(3.dp, 10.dp, 0.dp),
//            border = BorderStroke(6.dp, Color.Yellow),
//            shape = RoundedCornerShape(20.dp),
//            colors = ButtonDefaults.buttonColors(
//                backgroundColor = Color.Red,
//                contentColor = Color.Green,
//                disabledBackgroundColor = Color.Yellow,
//                disabledContentColor = Color.Magenta
//            ),
//            contentPadding = PaddingValues(8.dp)
//
//            ) {
//                Text(text = "按钮") // 按钮文案，对应content
//              }
//    }


    // Image用法
//    Box {
//        Text(text = "这是一个文字")
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_background),
//            modifier = Modifier.size(200.dp, 200.dp),
//            contentDescription = "这是一张图片",
//            alignment = Alignment.Center,
//            alpha = 1.0f,
//            colorFilter = ColorFilter.tint(Color.Red)
//        )
//    }
//

//    val bitmap = BitmapFactory.decodeFile("图片路径")
//    Image(bitmap = bitmap.asImageBitmap(), contentDescription = "这是一张图片")

    // 加载网络图
//    Box {
//        Image(
//            painter = rememberCoilPainter(request = "https://picsum.photos/300/300"),
//            contentDescription = null
//        )
//    }

    // 圆形进度条
//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        CircularProgressIndicator( // 圆形进度条
//            modifier = Modifier.size(80.dp),
//            color = Color.Red,
//            strokeWidth = 10.dp
//        )
//    }

    // 条形进度条
//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        LinearProgressIndicator(
//            color = Color.Red,
//            backgroundColor = Color.Yellow
//        )
//    }

    // Column用法

//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.Start)
//    {
//        DefaultText("Text1") // 控件1
//        DefaultText("Text2") // 控件2
//        DefaultText("Text3") // 控件3
//    }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceAround,
//        horizontalAlignment = Alignment.CenterHorizontally)
//    {
//        DefaultText("Text1") // 控件1
//        DefaultText("Text2") // 控件2
//        DefaultText("Text3") // 控件3
//    }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween,
//        horizontalAlignment = Alignment.End)
//    {
//        DefaultText("Text1") // 控件1
//        DefaultText("Text2") // 控件2
//        DefaultText("Text3") // 控件3
//    }

//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.spacedBy(20.dp), // 间隔20dp
//        horizontalAlignment = Alignment.CenterHorizontally)
//    {
//        DefaultText("Text1") // 控件1
//        DefaultText("Text2") // 控件2
//        DefaultText("Text3") // 控件3
//    }

    // Row用法
//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically)
//    {
//        DefaultText("Text1") // 控件1
//        DefaultText("Text2") // 控件2
//        DefaultText("Text3") // 控件3
//    }


//    Box {
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_background),
//            modifier = Modifier.size(200.dp, 200.dp),
//            contentDescription = "这是一张图片",
//            alignment = Alignment.Center,
//            alpha = 1.0f,
//            colorFilter = ColorFilter.tint(Color.Red)
//        )
//
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_background),
//            modifier = Modifier.size(100.dp, 100.dp),
//            contentDescription = "这是一张图片",
//            alignment = Alignment.Center,
//            alpha = 1.0f,
//            colorFilter = ColorFilter.tint(Color.Green)
//        )
//    }

//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Row {
//            Box(
//                contentAlignment = Alignment.TopStart,
//                modifier = Modifier.size(100.dp).background(Color.Gray),
//            ) {
//                Text("1", fontSize = 20.sp)
//            }
//            Box(
//                contentAlignment = Alignment.TopCenter,
//                modifier = Modifier.size(100.dp).background(Color.Magenta),
//            ) {
//                Text("2", fontSize = 20.sp)
//            }
//            Box(
//                contentAlignment = Alignment.TopEnd,
//                modifier = Modifier.size(100.dp).background(Color.Cyan),
//            ) {
//                Text("3", fontSize = 20.sp)
//            }
//        }
//        Row {
//            Box(
//                contentAlignment = Alignment.CenterStart,
//                modifier = Modifier.size(100.dp).background(Color.DarkGray),
//            ) {
//                Text("4", fontSize = 20.sp)
//            }
//            Box(
//                contentAlignment = Alignment.Center,
//                modifier = Modifier.size(100.dp).background(Color.Green),
//            ) {
//                Text("5", fontSize = 20.sp)
//            }
//            Box(
//                contentAlignment = Alignment.CenterEnd,
//                modifier = Modifier.size(100.dp).background(Color.Red),
//            ) {
//                Text("6", fontSize = 20.sp)
//            }
//        }
//
//        Row {
//            Box(
//                contentAlignment = Alignment.BottomStart,
//                modifier = Modifier.size(100.dp).background(Color.Magenta),
//            ) {
//                Text("7", fontSize = 20.sp)
//            }
//            Box(
//                contentAlignment = Alignment.BottomCenter,
//                modifier = Modifier.size(100.dp).background(Color.Yellow),
//            ) {
//                Text("8", fontSize = 20.sp)
//            }
//            Box(
//                contentAlignment = Alignment.BottomEnd,
//                modifier = Modifier.size(100.dp).background(Color.Magenta),
//            ) {
//                Text("9", fontSize = 20.sp)
//            }
//        }
//
//    }

    // 修饰符Modifier
//    Text("程序员", modifier = Modifier.fillMaxSize())
//    Text("程序员", modifier = Modifier.fillMaxWidth()) // 充满宽
//    Text("程序员", modifier = Modifier.fillMaxHeight()) // 充满高
//    Text("程序员", modifier = Modifier.size(100.dp)) // 宽高都是100dp
//    Text("程序员", modifier = Modifier.size(width = 100.dp, height = 80.dp)) // 宽100dp 高80dp

//    Box {
//        Spacer(modifier = Modifier.matchParentSize().background(Color.Red))
//        Text("程序员", fontSize = 30.sp)
//    }

//    Row(
//        Modifier
//            .fillMaxSize()
//            .padding(10.dp)) {
//        Box(modifier = Modifier.weight(2f).height(50.dp).background(Color.Blue))
//        Box(modifier = Modifier.weight(1f).height(50.dp).background(Color.Red).clickable {
//            Log.e("LM" , "点击了Box")
//        })
//        Modifier.shadow()
//    }

//    Box(contentAlignment = Alignment.Center) {
//        Image(painter = painterResource(id = R.drawable.small),
////            modifier = Modifier.size(150.dp).shadow(elevation = 10.dp, shape = MaterialTheme.shapes.medium),
//            modifier = Modifier.size(150.dp).shadow(elevation = 10.dp, shape = RoundedCornerShape(18.dp)),
//            contentDescription = ""
//        )
//    }

//    Box(contentAlignment = Alignment.Center) {
//        Image(painter = painterResource(id = R.drawable.small),
////            modifier = Modifier.size(150.dp).shadow(elevation = 10.dp, shape = MaterialTheme.shapes.medium),
//            modifier = Modifier.size(150.dp).shadow(elevation = 0.dp, shape = RoundedCornerShape(18.dp), clip = true),
//            contentDescription = ""
//        )
//    }

    // Scaffold的使用
//    Scaffold(
//        topBar = { /*标题栏*/
//            TopAppBar(title = { Text("标题") }, navigationIcon = {
//                IconButton(onClick = {  /*点击事件*/ }) {
//                    Icon(Icons.Filled.ArrowBack, "")
//                }})
//        },
//        floatingActionButton = { /*悬浮按钮*/
//            FloatingActionButton(onClick = {
//                // Floating点击事件
//                Log.e("LM" , "点击了FloatingButton")
//            }) {
//                Text("OK")
//            }
//        },
//        content = { /*主内容*/
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//            ) {
//                Text("主屏幕", fontSize = 40.sp)
//            }
//        },
//
//        drawerContent = {
//            Column(modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Blue),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "侧边栏抽屉", fontSize = 30.sp)
//            }
//        }
//    )

    // 约束布局
//    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
//        val (one, two) = createRefs()
//        val three = createRef()
//        DefaultText(
//            "",
//            modifier = Modifier.constrainAs(one) {
//                start.linkTo(parent.start)
//                end.linkTo(parent.end)
//                top.linkTo(parent.top, margin = 16.dp)
//            }
//        )
//
//        DefaultText("Two", Modifier.constrainAs(two) {
//            start.linkTo(parent.start)
//            end.linkTo(parent.end)
//            top.linkTo(one.bottom, margin = 16.dp)
//        })
//
//
//        DefaultText("Three", Modifier.constrainAs(three) {
//            start.linkTo(parent.start)
//            end.linkTo(parent.end)
//            bottom.linkTo(parent.bottom, margin = 16.dp)
//        })
//    }

    // LazyColumn使用
//    val dataList = arrayListOf<Int>()
//    for (index in 0 .. 10) {
//        dataList.add(index)
//    }
//    LazyColumn {
//        items(dataList) { data ->
//            Text("item:$data")
//        }
//    }

//    val dataList = arrayListOf<String>()
//    for (index in 0 .. 10) {
//        dataList.add("ind".repeat(index))
//    }
//    LazyColumn {
//        itemsIndexed(dataList) { index, data ->
//            Text("item:第${index}个数据为$data")
//        }
//    }

//    val dataList = arrayListOf<String>()
//    for (index in 0 .. 10) {
//        dataList.add("ind".repeat(index))
//    }
//    LazyColumn {
//        itemsIndexed(dataList.toArray()) { index, data ->
//            Text("item:第${index}个数据为$data")
//        }
//    }

//    val chatList = arrayListOf<Chat>()
//    chatList.apply {
//        add(Chat("你好"))
//        add(Chat("在家干啥呢？"))
//        add(Chat("出来玩啊？"))
//        add(Chat("没啥事", false))
//        add(Chat("在家呆着呢", false))
//        add(Chat("好吧，我去找你玩！"))
//        add(Chat("好，快来！"))
//    }

//    LazyColumn {
//        items(chatList) { data ->
//            if (data.isLeft) {
//                Column(modifier = Modifier.padding(end = 15.dp)) {
//                    Spacer(modifier = Modifier.height(5.dp))
//                    Text(
//                        data.content, modifier = Modifier.fillMaxWidth().height(25.dp)
//                            .background(Color.Yellow)
//                    )
//                }
//            } else {
//                Column(modifier = Modifier.padding(start = 15.dp)) {
//                    Spacer(modifier = Modifier.height(5.dp))
//                    Text(
//                        data.content, modifier = Modifier.fillMaxWidth()
//                            .background(Color.Green).height(25.dp)
//                    )
//                }
//            }
//        }
//    }

    // 粘性标题
//    LazyColumn {
//        items(chatList) { item ->
//            Text(
//                item.content,
//                modifier = Modifier.padding(10.dp).background(Color.Red).height(150.dp)
//                    .fillMaxWidth(), textAlign = TextAlign.Center,
//                fontSize = 35.sp
//            )
//        }
//
//        stickyHeader {
//            Text(
//                "粘性标题啊",
//                modifier = Modifier.padding(10.dp).background(Color.Green).height(150.dp)
//                    .fillMaxWidth(), textAlign = TextAlign.Center,
//                fontSize = 35.sp
//            )
//        }
//
//        items(chatList) { item ->
//            Text(
//                item.content,
//                modifier = Modifier.padding(10.dp).background(Color.Red).height(150.dp)
//                    .fillMaxWidth(), textAlign = TextAlign.Center,
//                fontSize = 35.sp
//            )
//        }
//
//    }

    // 通讯录
//    val listState = rememberLazyListState()
//    val coroutineScope = rememberCoroutineScope()
//
//    val letters = arrayListOf("A", "B", "C", "D", "E")
//    val contactList = arrayListOf<Contact>()
//    val nameList = arrayListOf<String>()
//    for (index in 0..5) {
//        nameList.add("路人$index")
//    }
//    for (index in letters.iterator()) {
//        contactList.add(Contact(letters = index, nameList))
//    }
//
//    Box(modifier = Modifier.fillMaxSize()) {
//        LazyColumn(state = listState) {
//            contactList.forEach { (letter, nameList) ->
//                stickyHeader {
//                    Text(
//                        letter,
//                        modifier = Modifier
//                            .padding(10.dp)
//                            .background(Color.Green)
//                            .fillMaxWidth(), textAlign = TextAlign.Center,
//                        fontSize = 35.sp
//                    )
//                }
//
//                items(nameList) { contact ->
//                    Text(
//                        contact,
//                        modifier = Modifier
//                            .padding(10.dp)
//                            .background(Color.Red)
//                            .height(50.dp)
//                            .fillMaxWidth(), textAlign = TextAlign.Center,
//                        fontSize = 35.sp
//                    )
//                }
//            }
//        }
//
//        Button(
//            modifier = Modifier.width(200.dp).height(40.dp).align(Alignment.BottomEnd),
//            onClick = {
//                coroutineScope.launch {
//                    listState.animateScrollToItem(index = 0)
//                }
//            }) {
//            Text("点击回到顶部")
//        }
//    }

    // 横向列表LazyRow
//    val dataList = arrayListOf<Int>()
//    for (index in 0 .. 10) {
//        dataList.add(index)
//    }
//    LazyRow {
//        items(
//            items = dataList,
//            key = { index ->
//                index
//            }
//        ) { data ->
//            Text(text = "$data")
//        }
//    }

    // 网格列表
//    val photos = arrayListOf<Int>()
//    for(index in 0 .. 20) { // 添加21张图片
//        photos.add(R.drawable.ic_launcher_background)
//    }

//    LazyVerticalGrid(
//        cells = GridCells.Fixed(count = 5)) {
//        items(photos) { photo ->
//            Image(
//                painter = painterResource(id = photo),
//                contentDescription = "",
//                modifier = Modifier.padding(2.dp)
//            )
//        }
//    }

//    LazyVerticalGrid(
//        cells = GridCells.Fixed(count = 3)) {
//        items(photos.toArray()) { photo ->
//            Image(
//                painter = painterResource(id = photo as Int),
//                contentDescription = "",
//                modifier = Modifier.padding(2.dp)
//            )
//        }
//    }

    // 底部导航栏
//    BottomNavigationTest()

    // 自定义View
//    CustomViewTest()

    // 简单动画
//    EasyAnimation()

    // 其他动画
//    OtherAnimation()

    // transition
//    TransitionTest()

    // infiniteTransition
    InfiniteTransitionTest()

}

@Composable
fun BottomNavigationTest() {
    val tabs = MainTabs.values() // tab数据
    var position by remember { mutableStateOf(MainTabs.ONE)}
    Scaffold(
        backgroundColor = Color.Yellow, // 背景色
        bottomBar = { // bottomBar
            BottomNavigation(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.Red
            ) {
                tabs.forEach { tab ->
                    BottomNavigationItem(
                        modifier = Modifier.background(MaterialTheme.colors.primary),
                        icon = { Icon(painterResource(id = tab.icon), contentDescription = null) },
                        label = { Text(tab.tabName) },
                        selected = tab == position,
                        onClick = {
                            position = tab
                        },
                        alwaysShowLabel = false,
                        selectedContentColor = Color.Green,
                        unselectedContentColor = Color.Red
                    )
                }
            }
        }
    ) {
        when(position) { // 根据state值的变化动态切换当面显示的页面
            MainTabs.ONE -> One()
            MainTabs.TWO -> Two()
            MainTabs.THREE -> Three()
            MainTabs.FOUR -> Four()
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun CustomViewTest() {
    val points = arrayListOf(
        Offset(100f, 100f),
        Offset(300f, 300f),
        Offset(500f, 500f),
        Offset(700f, 700f),
        Offset(900f, 900f)
    )
    val points2 = arrayListOf(
        Offset(900f, 100f),
        Offset(700f, 300f),
        Offset(500f, 500f),
        Offset(300f, 700f),
        Offset(100f, 900f)
    )
//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
////            pointMode = PointMode.Points,
////            pointMode = PointMode.Lines,
//            pointMode = PointMode.Polygon,
//            color = Color.Blue,
//            strokeWidth = 30f,
//            cap = StrokeCap.Butt
//        )
//        drawPoints(
//            points = points2,
////            pointMode = PointMode.Points,
////            pointMode = PointMode.Lines,
//            pointMode = PointMode.Polygon,
//            color = Color.Blue,
//            strokeWidth = 30f,
//            cap = StrokeCap.Square
//        )
//    }

//    Canvas(modifier = Modifier.fillMaxSize()) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Polygon,
//            brush = Brush.linearGradient( // 线性渐变
//                colors = arrayListOf(
//                    Color.Red,
//                    Color.Green,
//                    Color.Blue
//                )
//            ),
//            strokeWidth = 30f,
//        )
//    }

//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPoints(
//            points = points,
//            pointMode = PointMode.Polygon,
//            brush = Brush.linearGradient( // 精准渐变
//                0.0f to Color.Red,
//                0.3f to Color.Green,
//                0.6f to Color.Yellow,
//                1.0f to Color.Blue
//
//            ),
//            strokeWidth = 30f,
//        )
//    }

    // 绘制线段
//    DrawLineTest();

//    // 绘制矩形
//    DrawRectTest()

    // 绘制圆角矩形
//    DrawRoundRectTest()

    // 绘制圆
//    DrawCircleTest()

    // 绘制椭圆
//    DrawOvalTest()

    // 绘制圆弧
//    DrawArcTest()

    // 绘制图片
//    DrawImageTest()

    // 绘制path
//    DrawPathTest()

    // 混合模式
//    DrawBlendModeTest()

}

@Composable
fun DrawLineTest() {
    val start = Offset(100f, 100f)
    val end = Offset(900f, 900f)
    Canvas(modifier = Modifier.size(360.dp)) {
        drawLine(
            color = Color.Red,
            start = start,
            end = end,
            strokeWidth = 30f,
            cap = StrokeCap.Round
        )
    }
}

@Composable
fun DrawRectTest() {
    val topLeft = Offset(100f, 100f)
    val rectSize = Size(400f, 600f)
    Canvas(modifier = Modifier.size(360.dp)) {
        drawRect(
            color = Color.Red,
            topLeft = topLeft,
            size = rectSize,
            style = Stroke(
                width = 30f,
                miter = 4f,
//                cap = StrokeCap.Round
                join = StrokeJoin.Round
            )
        )
    }
}

@Composable
fun DrawRoundRectTest() {
    val topLeft = Offset(100f, 100f)
    val rectSize = Size(400f, 600f)
    Canvas(modifier = Modifier.size(360.dp)) {
        drawRoundRect(
            color = Color.Red,
            topLeft = topLeft,
            size = rectSize,
            cornerRadius = CornerRadius(50f),
            style = Stroke(
                width = 30f,
                miter = 4f,
                join = StrokeJoin.Round
            )
        )
    }
}

@Composable
fun DrawCircleTest() {
    Canvas(modifier = Modifier.size(360.dp)) {
        drawCircle(
            color = Color.Blue,
            radius = 300f,
            center = center,
            style = Stroke(
                width = 30f
            )
        )
    }
}

@Composable
fun DrawOvalTest() {
    val topLeft = Offset(100f, 100f)
    val ovalSize = Size(600f, 800f)
    Canvas(modifier = Modifier.size(360.dp)) {
        drawOval(
            color = Color.Blue,
            topLeft = topLeft,
            size = ovalSize
        )

        drawRect(
            color = Color.Red,
            topLeft = topLeft,
            size = ovalSize
        )
    }
}

@Composable
fun DrawArcTest() {
    Canvas(modifier = Modifier.size(360.dp)) {
        drawArc(
            color = Color.Blue,
            startAngle = 90f,
            sweepAngle = 150f,
            useCenter = false,
            style = Stroke(width = 10f)
        )
    }
}

@Composable
fun DrawImageTest() {
    val context = LocalContext.current
    val bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.small)
    val image = bitmap.asImageBitmap()
    Canvas(modifier = Modifier.size(360.dp)) {
        drawImage(
            image = image,
            srcOffset = IntOffset(0, 0),
            srcSize = IntSize(100, 100),
            dstOffset = IntOffset(100, 100),
            dstSize = IntSize(800, 800)
        )
    }
}

@Composable
fun DrawPathTest() {
//    val path = Path()
//    path.moveTo(100f, 300f)
//    path.lineTo(100f, 700f)
//    path.lineTo(800f, 700f)
//    path.lineTo(900f, 300f)
//    path.lineTo(600f, 100f)
//    path.close()
//    Canvas(modifier = Modifier.size(360.dp)) {
//        drawPath(
//            path = path,
//            color = Color.Red,
//            style = Stroke(width = 10f)
//        )
//    }

    // 贝塞尔曲线
    val path = Path()
    path.moveTo(100f, 300f)
    path.lineTo(100f, 700f)
    // 二阶贝塞尔曲线
    path.quadraticBezierTo(800f, 700f, 600f, 100f)
    // 三阶贝塞尔曲线
    path.cubicTo(700f, 200f, 800f, 400f, 100f, 100f)
    path.close()
    Canvas(modifier = Modifier.size(360.dp)) {
        drawPath(
            path = path,
            color = Color.Red,
            style = Stroke(width = 10f)
        )
    }

}

@ExperimentalAnimationApi
@Composable
fun EasyAnimation() {
//    val visible = remember {
//        mutableStateOf(true)
//    }
//    Column(modifier = Modifier
//        .size(360.dp)
//        .padding(10.dp)) {
//            Button(onClick = {visible.value = !visible.value}) {
//            Text("可见性动画")
//        }
//        AnimatedVisibility(
//            visible = visible.value,
//            enter = slideIn({ IntOffset(400, 400)}) + expandIn(),
//            exit = slideOut({ IntOffset(400, 400)}) + shrinkOut()
//        ) {
//            Text(text = "验证可见性动画", modifier = Modifier.size(150.dp))
//
//        }
//
//    }
    // "全文"展开
//    val expend = remember {
//        mutableStateOf(false)
//    }
//
//    Column(modifier = Modifier
//        .size(360.dp)
//        .padding(10.dp)) {
//
//        Text(
//            text = "直接抒情能更好的更强烈的表达自己内心的情感,喜怒哀乐流露于外,给人的感觉更直观,心中有话不吐不快," +
//                    "胸中有情不抒不快。依附性抒情就是把自己的情感依附于其他事物上进行抒情,这种抒情,比较间接,也比较委婉和含蓄。",
//            fontSize = 16.sp,
//            textAlign = TextAlign.Justify,
//            overflow = TextOverflow.Ellipsis,
//            modifier = Modifier.animateContentSize(),
//            maxLines = if (expend.value) Int.MAX_VALUE else 2
//        )
//        Text(if (expend.value) "收起" else "全文", color = Color.Blue, modifier = Modifier.clickable {
//            expend.value = !expend.value
//        })
//
//    }
    // 底bar切换动画
    val tabs = MainTabs.values() // tab数据
    var position by remember { mutableStateOf(MainTabs.ONE)}
    Scaffold(
        backgroundColor = Color.Yellow, // 背景色
        bottomBar = { // bottomBar
            BottomNavigation(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.Red
            ) {
                tabs.forEach { tab ->
                    BottomNavigationItem(
                        modifier = Modifier.background(MaterialTheme.colors.primary),
                        icon = { Icon(painterResource(id = tab.icon), contentDescription = null) },
                        label = { Text(tab.tabName) },
                        selected = tab == position,
                        onClick = {
                            position = tab
                        },
                        alwaysShowLabel = false,
                        selectedContentColor = Color.Green,
                        unselectedContentColor = Color.Red
                    )
                }
            }
        }
    ) {
        Crossfade(targetState = position) { screen ->
            when(screen) { 
                MainTabs.ONE -> One()
                MainTabs.TWO -> Two()
                MainTabs.THREE -> Three()
                MainTabs.FOUR -> Four()
            }
        }

    }
}

@Composable
fun OtherAnimation() {
//    var isSmall by remember { mutableStateOf(true)}
//    val size: Dp by animateDpAsState(targetValue = if (isSmall) 40.dp else 100.dp) {
//        Log.e("LM" , "AnimateAsState: $it")
//    }
//    Column(Modifier.padding(16.dp)) {
//        Button(onClick = {
//            isSmall = !isSmall
//        }, modifier = Modifier.padding(vertical = 16.dp)) {
//            Text("Change Size Dp")
//        }
//        Box(Modifier.size(size).background(Color.Red))
//    }

    var count by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Button(onClick = { count++ }) {
            Text("Count $count")
        }
        LineAnimation(count)
    }
}

@Composable
fun LineAnimation(lives: Int) {
    val animVal = remember { Animatable(0f) }
    if (lives > 5) {
        LaunchedEffect(animVal) {
            animVal.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 1000, easing = LinearEasing)
            )
        }
    }
    Canvas(modifier = Modifier.size(200.dp, 200.dp)) {
        drawLine(
            color = Color.Black,
            start = Offset(0f, 0f),
            end = Offset(animVal.value * size.width, animVal.value * size.height),
            strokeWidth = 2f
        )
    }
}

@SuppressLint("UnusedTransitionTargetStateParameter")
@Composable
fun TransitionTest() {
    var boxState: BoxState by remember { mutableStateOf(BoxState.Small) }
    val transition = updateTransition(targetState = boxState, label = "transition")
    val color by transition.animateColor(label = "color") {
        boxState.color
    }
    val size by transition.animateDp(label = "size") {
        boxState.size
    }
    val offset by transition.animateDp(label = "offset") {
        boxState.offset
    }
    val angle by transition.animateFloat(label = "angle") {
        boxState.angle
    }
    Column(Modifier.padding(16.dp).size(360.dp)) {
        Button(
            onClick = { boxState = !boxState }
        ) {
            Text("Transition Test")
        }
        Box(
            Modifier.padding(top = 20.dp)
                .rotate(angle)
                .size(size)
                .offset(x = offset)
                .background(color)
        )
    }
}

@Composable
fun InfiniteTransitionTest() {
    val infiniteTransition = rememberInfiniteTransition()
    val color by infiniteTransition.animateColor(
        initialValue = Color.Red,
        targetValue = Color.Green,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(Modifier.size(360.dp).background(color))

}

@Composable
fun AnimationSpecs() {
    val value by animateFloatAsState(
        targetValue = 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioHighBouncy,
            stiffness = Spring.StiffnessMedium
        )
    )

    val value1 by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(
            durationMillis = 300,
            delayMillis = 50,
            easing = LinearOutSlowInEasing
        )
    )

    val value2 by animateFloatAsState(
        targetValue = 1f,
        animationSpec = keyframes {
            durationMillis = 375
            0.0f at 0 with LinearOutSlowInEasing // for 0-15 ms
            0.2f at 15 with FastOutLinearInEasing // for 15-75 ms
            0.4f at 75 // ms
            0.4f at 225 // ms
        }
    )

    val value3 by animateFloatAsState(
        targetValue = 1f,
        animationSpec = repeatable(
            iterations = 2,
            animation = tween(durationMillis = 300),
            repeatMode = RepeatMode.Reverse
        )
    )

    val value4 by animateFloatAsState(
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 300),
            repeatMode = RepeatMode.Reverse
        )
    )

    val value5 by animateFloatAsState(
        targetValue = 1f,
        animationSpec = snap(delayMillis = 50)
    )

}


@Composable
fun DrawBlendModeTest() {
    Canvas(modifier = Modifier.size(360.dp)) {
        drawCircle(
            color = Color.Yellow,
            radius = 175f,
            center = Offset(350f, 350f),
            blendMode = BlendMode.Clear
        )

        drawRect(
            color = Color.Blue,
            topLeft = Offset(300f, 300f),
            size = Size(350f, 350f),
            blendMode = BlendMode.Clear
        )
    }
}


@Composable
fun One() {
    BaseDefault(content = "One")
}

@Composable
fun Two() {
    BaseDefault(content = "Two")
}

@Composable
fun Three() {
    BaseDefault(content = "Three")
}

@Composable
fun Four() {
    BaseDefault(content = "Four")
}

@Composable
fun BaseDefault(content: String) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = content, fontSize = 50.sp) // tab对应的页面要展示的内容
    }
}

@Composable
fun DefaultText(text: String, modifier: Modifier) {
    Text(
        text,
        modifier = modifier
            .size(100.dp)
            .background(Color.Red),
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )
}


@Composable
fun DefaultText(text: String) {
    Text(text = text,
        modifier = Modifier
            .size(100.dp)
            .background(Color.Red),
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )
}

data class TestSize(val width: Dp, val height: Dp)

@Composable
fun TestAnimation(targetSize: TestSize) {
    val animSize: TestSize by animateValueAsState<TestSize, AnimationVector2D>(
        targetSize,
        TwoWayConverter(
            convertToVector = { size: TestSize ->
                AnimationVector2D(size.width.value, size.height.value)
            },
            convertFromVector = { vector: AnimationVector2D ->
                TestSize(vector.v1.dp, vector.v2.dp)
            }
        )
    )
}


@ExperimentalAnimationApi
@Preview(showBackground = true, widthDp = 250, heightDp = 400)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting()
    }
}

private sealed class BoxState(
    val color: Color,
    val size: Dp,
    val offset: Dp,
    val angle: Float) {

    operator fun not() = if (this is Small) Large else Small

    object Small : BoxState(Blue, 60.dp, 20.dp, 0f)
    object Large : BoxState(Red, 90.dp, 50.dp, 45f)
}