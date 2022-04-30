package com.carey.compose.nav

import androidx.annotation.DrawableRes
import com.carey.compose.R

/**
 * 底tab资源
 */

enum class MainTabs(val tabName: String, @DrawableRes val icon: Int) {
    ONE("One", R.drawable.ic_nav_news_normal),
    TWO("Two", R.drawable.ic_nav_tweet_normal),
    THREE("Three", R.drawable.ic_nav_discover_normal),
    FOUR("Four", R.drawable.ic_nav_my_normal)
}