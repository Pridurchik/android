package com.hackton.features.main_features.home_features.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hackton.features.util.OurBlue


@Preview
@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 20.dp, end = 20.dp, bottom = 70.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(containerColor = OurBlue)
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Посещаемость",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(
                modifier = Modifier.width(20.dp)
            )

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(2f),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(width = 1.dp, color = OurBlue)
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Класс",
                    color = OurBlue,
                    fontWeight = FontWeight.Bold
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(2f),
                border = BorderStroke(1.dp, OurBlue),
                colors = CardDefaults.cardColors(containerColor = Color.White)

            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Оценки и рейтинг",
                    color = OurBlue,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(
                modifier = Modifier.width(20.dp)
            )

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(containerColor = OurBlue),
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Предметы",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(containerColor = OurBlue)
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Посещаемость",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(
                modifier = Modifier.width(20.dp)
            )

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(2f),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(width = 1.dp, color = OurBlue)
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Класс",
                    color = OurBlue,
                    fontWeight = FontWeight.Bold
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(2f),
                colors = CardDefaults.cardColors(containerColor = OurBlue)
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Посещаемость",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(
                modifier = Modifier.width(20.dp)
            )

            Card(
                modifier = Modifier
                    .height(100.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(width = 1.dp, color = OurBlue)
            ) {
                Text(
                    modifier = Modifier.padding(start = 5.dp, top = 7.dp),
                    text = "Класс",
                    color = OurBlue,
                    fontWeight = FontWeight.Bold
                )
            }

        }

    }
}

//fun test(one: String, two: String) {
//
//}
//
//fun main() {
//    test()
//}