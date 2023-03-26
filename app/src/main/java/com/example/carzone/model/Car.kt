package com.example.carzone.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Car(@DrawableRes val carImage: Int,
               @StringRes val make: Int,
               @StringRes val model: Int,
               @StringRes val topSpeed: Int,)
