package com.example.carzone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carzone.data.DataSource
import com.example.carzone.model.Car
import com.example.carzone.ui.theme.CarZoneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarZoneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CarApp()
                }
            }
        }
    }
}


@Composable
fun CarApp() {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(14.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        items(DataSource.cars) { car ->
            CarCard(car = car)
        }
    }
}


@Composable
fun CarCard(car: Car, modifier: Modifier = Modifier) {
    Card(elevation = 7.dp) {
        Box() {
            Row() {
                Image(painter = painterResource(id = car.carImage), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier.size(width = 140.dp, height = 140.dp))
                Column() {
                    Text(text = "Make: " + stringResource(id = car.make), style = MaterialTheme.typography.body2,
                        modifier = Modifier.padding(
                            start = 14.dp,
                            top = 14.dp,
                            end = 14.dp,
                            bottom = 7.dp
                        ))
                    Text(text = "Model: " + stringResource(id = car.model), style = MaterialTheme.typography.body2,
                        modifier = Modifier.padding(
                            start = 14.dp,
                            top = 14.dp,
                            end = 14.dp,
                            bottom = 7.dp
                        ))
                    Text(text = "Top Speed: " + stringResource(id = car.topSpeed), style = MaterialTheme.typography.body2,
                        modifier = Modifier.padding(
                            start = 14.dp,
                            top = 14.dp,
                            end = 14.dp,
                            bottom = 7.dp
                        ))
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CarCardPreview() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        CarCard(car = Car(R.drawable.ferrari, R.string.ferrari, R.string.la_ferrari, R.string.ferrari_speed))
    }
}