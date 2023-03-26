package com.example.carzone.data

import com.example.carzone.R
import com.example.carzone.model.Car

object DataSource {
    val cars: List<Car> = listOf(
        Car(R.drawable.ferrari, R.string.ferrari, R.string.la_ferrari, R.string.ferrari_speed),
        Car(R.drawable.bugatti, R.string.bugatti, R.string.veyron, R.string.bugatti_speed),
        Car(R.drawable.koenigsegg, R.string.koenigsegg, R.string.agera_r, R.string.koenigsegg_speed),
        Car(R.drawable.mclaren, R.string.mclaren, R.string.p1, R.string.mclaren_speed),
        Car(R.drawable.pagani, R.string.pagani, R.string.huayra, R.string.pagani_speed),
        Car(R.drawable.mercedes, R.string.mercedes, R.string.roadster, R.string.mercedes_speed)
    )
}