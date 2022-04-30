package com.carey.compose

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.asImageBitmap
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.carey.compose.bean.Chat
import com.carey.compose.bean.Contact
import com.carey.compose.nav.MainTabs
import com.carey.compose.ui.theme.*
import com.google.accompanist.coil.rememberCoilPainter
import kotlinx.coroutines.launch

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

@OptIn(ExperimentalFoundationApi::class)
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
    BottomNavigationTest()

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

@Preview(showBackground = true, widthDp = 250, heightDp = 400)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting()
    }
}