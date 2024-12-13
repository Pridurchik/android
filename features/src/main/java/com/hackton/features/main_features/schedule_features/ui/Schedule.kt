package com.hackton.features.main_features.schedule_features.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hackton.features.R
import com.hackton.features.util.OurBlue

@Preview
@Composable
fun Schedule() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Row(
            modifier = Modifier
                .padding(top = 100.dp, start = 20.dp, end = 20.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                modifier = Modifier.padding(bottom = 20.dp),
                text = "Расписание",
                fontSize = 34.sp,
                fontWeight = FontWeight(600),
                color = Color.Black
            )

            Spacer(
                modifier = Modifier
                     .weight(1f)
            )
            Image(
                modifier = Modifier.size(30.dp),
                painter = painterResource(R.drawable.icon_notify),
                contentDescription = null
            )
        }


        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp)
        ) {
            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFECE9E9)),
                shape = RoundedCornerShape(
                    topStart = 14.dp,
                    topEnd = 14.dp,
                    bottomStart = 14.dp,
                    bottomEnd = 14.dp
                )
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 2.dp),
                    text = "Декабрь",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }


        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.padding(10.dp))
            ScheduleItem(
                lessonNumber = "1",
                time = "8:00-8:40",
                lessonName = "Математика"
            )
            Spacer(modifier = Modifier.padding(10.dp))
            ScheduleItem(
                lessonNumber = "2",
                time = "8:45-9:25",
                lessonName = "Литература"
            )
            Spacer(modifier = Modifier.padding(10.dp))
            ScheduleItem(
                lessonNumber = "3",
                time = "9:30-10:10",
                lessonName = "Информатика"
            )
            Spacer(modifier = Modifier.padding(10.dp))
            ScheduleItem(
                lessonNumber = "4",
                time = "10:20-11:00",
                lessonName = "Биология"
            )
        }



    }
}

@Preview
@Composable
private fun ScheduleItem(
    lessonNumber: String = "0",
    time: String = "8:00 - 8:40",
    lessonName: String = "Русский язык"
) {
    val color = Color(0xFFECE9E9)

    Card(
        colors = CardDefaults.cardColors(containerColor = color)
    ) {
        Column(
            modifier = Modifier
                .padding(start = 10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
            ) {
                Text(
                    text = "$lessonNumber урок",
                    fontSize = 16.sp,
                    color = Color.Gray
                )

                Spacer(
                    modifier = Modifier.width(20.dp)
                )

                Text(
                    text = time,
                    fontSize = 16.sp,
                    color = Color.Gray

                )
            }

            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = lessonName,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )
        }
    }
}