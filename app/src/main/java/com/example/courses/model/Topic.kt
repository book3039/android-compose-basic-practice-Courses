package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResId: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageResId: Int,
)
