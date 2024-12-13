package com.hackton.features.main_features.profile_features.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hackton.features.R
import com.hackton.features.util.OurBlue


@Preview(showBackground = true)
@Composable
fun Profile() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxWidth(),
        ) {
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "Профиль",
                fontSize = 29.sp,
                fontWeight = FontWeight(600),
                color = Color.Black
            )
        }

        Row(
            modifier = Modifier.padding(start = 20.dp, top = 45.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.clip(CircleShape).size(75.dp),
                painter = painterResource(R.drawable.icon_logo_profile),
                contentDescription = null,
            )

            Column(
                modifier = Modifier.padding(start = 20.dp)
            ) {

                Text(
                    modifier = Modifier,
                    text = "Магомедов Гарун М.",
                    fontWeight = FontWeight(800),
                    color = OurBlue,
                    fontSize = 18.sp,
                )

                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                Text(
                    text = "Ученик",
                    color = Color.Gray
                )


            }
        }

        Column(
            modifier = Modifier.padding(top = 10.dp)
        ){
            ItemInProfile(
                topText = "МБОУ “Лицей  №39” им. Б. Астемирова",
                bottomText = "школа"
            )
            ItemInProfile(
                topText = "6В",
                bottomText = "класс"
            )
            ItemInProfile(
                topText = "magomedovgarun02@mail.ru",
                bottomText = "e-mail"
            )
            ItemInProfile(
                topText = "+79896540041",
                bottomText = "e-mail"
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 50.dp),
            shape = RoundedCornerShape(10.dp),
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(containerColor = OurBlue)
        ) {
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "Редактировать профиль"
            )
        }
    }
}

@Composable
private fun ItemInProfile(
    topText: String = "Example Text Top",
    bottomText: String = "Example Text Bottom"
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp)
            .background(Color.White)
    ) {
        Text(
            text = topText,
            fontWeight = Bold,
            fontSize = 18.sp,
        )

        Text(
            text = bottomText,
            fontWeight = Bold,
            color = Color.Gray
        )
    }
}


@Composable
private fun test() {
    ItemInProfile(
        topText = "МБОУ “Лицей  №39” им. Б. Астемировa",
        bottomText = "Школа"
    )
}