package com.example.lazycolum_horizontalpager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.lazycolum_horizontalpager.ui.theme.LazyColum_HorizontalPagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColum_HorizontalPagerTheme {
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier.nestedScroll(rememberNestedScrollInteropConnection())
    ) {
        item {
            val imageUrlList = remember {
                val list = mutableStateListOf<String?>()
                list.add("https://res.cloudinary.com/dpzpn3dkw/image/upload/v1709116003/Scholarshi_test_app_ofp6lc.webp")
                list.add("https://res.cloudinary.com/dpzpn3dkw/image/upload/v1709116003/Scholarshi_test_app_ofp6lc.webp")
                list.add("https://res.cloudinary.com/dpzpn3dkw/image/upload/v1709116003/Scholarshi_test_app_ofp6lc.webp")
                list
            }
            val pageCount = imageUrlList.size
            val pagerState: PagerState = rememberPagerState(initialPage = 0 ,pageCount = { pageCount })

            HorizontalPager(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
//                    .nestedScroll(rememberNestedScrollInteropConnection())
//                    .height(200.dp),
//                    .height(200.dp),
                state = pagerState,
                contentPadding = PaddingValues(top = 16.dp),
                pageSpacing = 16.dp,
                beyondBoundsPageCount = pageCount,
                verticalAlignment = Alignment.CenterVertically,
            ) { page: Int ->
                val item = imageUrlList[page]
                item?.let {
                    Column {
                        Image(
                            painter = rememberAsyncImagePainter(item),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(max = 320.dp)
                                .clip(RoundedCornerShape(8.dp)),
                            contentScale = ContentScale.FillBounds,
                        )
                        Text(
                            text = "Page $page",
                            modifier = Modifier.testTag("Page $page"),
                            color = Color.Black,
                            fontSize = 16.sp
                        )
                    }
//                    Image(
//                        painter = rememberAsyncImagePainter(item),
//                        contentDescription = null,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .heightIn(max = 320.dp)
//                            .clip(RoundedCornerShape(8.dp)),
//                        contentScale = ContentScale.FillBounds,
//                    )
                }
            }
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                fontSize = 32.sp,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColum_HorizontalPagerTheme {
        Greeting("Android")
    }
}