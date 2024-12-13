package com.hackton.features.auth_features.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hackton.features.util.OurBlue

@Preview
@Composable
fun Auth(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .background(Color(0xFFEBEEF1)),
    ) {

        val textFieldStateEmail = remember {
            mutableStateOf("")
        }

        val textFieldStatePassword = remember {
            mutableStateOf("")
        }

        Row(
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxWidth(),
        ) {
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "Войдите в свою\nучетную запись",
                fontSize = 29.sp,
                fontWeight = FontWeight(600),
                color = Color.Black
            )
        }


        Text(
            modifier = Modifier.padding(start = 20.dp, bottom = 4.dp,  top = 60.dp),
            text = "Почта",
            fontWeight = FontWeight(350),
            fontSize = 14.sp
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, bottom = 40.dp),
            value = textFieldStateEmail.value,
            onValueChange = {newText -> textFieldStateEmail.value = newText},
            label = {
                Text(text = "Введите свою почту")
            },
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,

                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.White,
            ),
            shape = RoundedCornerShape(10.dp)
        )


        Text(
            modifier = Modifier.padding(start = 20.dp, bottom = 4.dp),
            text = "Пароль",
            fontWeight = FontWeight(350),
            fontSize = 14.sp
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, ),
            value = textFieldStatePassword.value,
            onValueChange = { newText -> textFieldStatePassword.value = newText},
            label = {
                Text(text = "Введите пароль")
            },
            maxLines = 1,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,

                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.White,
            ),
            shape = RoundedCornerShape(10.dp)
        )


        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(
                    top = 20.dp,
                    bottom = 20.dp,
                    end = 20.dp
                ),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "Забыли пароль ?",
                color = OurBlue
            )
        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 35.dp, end = 35.dp),
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = OurBlue),
                shape = RoundedCornerShape(
                    topStart = 14.dp,
                    topEnd = 14.dp,
                    bottomStart = 14.dp,
                    bottomEnd = 14.dp
                )

            ) {
                Text(
                    text = "Войти",
                )
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, top = 40.dp, end = 40.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(Color.Gray)

            )
            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = "или",
                color = Color(0xFFb9bdbd)
            )
            Spacer(modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(Color.Gray))
        }

//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 40.dp),
//            horizontalArrangement = Arrangement.Center
//        ) {
////            Button(
////                modifier = Modifier
////                    .weight(1f)
////                    .padding(start = 20.dp, end = 20.dp),
////                onClick = {
////
////                },
////                colors = ButtonDefaults.buttonColors(containerColor = OurGreen),
////                shape = RoundedCornerShape(10.dp)
////            ) {
////                Icon(
////                    modifier = Modifier.size(20.dp),
////                    painter = painterResource(id = R.drawable.icon_vk),
////                    contentDescription = null
////                )
////
////                Spacer(
////                    modifier = Modifier
////                        .size(ButtonDefaults.ButtonWithIconContentPadding.calculateTopPadding()))
////                Text(text = "ВКонтакте")
////            }
//
//            Button(
//                modifier = Modifier
//                    .padding(start = 20.dp, end = 20.dp)
//                    .weight(1f),
//                colors = ButtonDefaults.buttonColors(containerColor = OurGreen),
//                onClick = {
//
//                },
//                shape = RoundedCornerShape(10.dp)
//            ) {
//                Icon(
//                    modifier = Modifier.size(20.dp),
//                    painter = painterResource(id = R.drawable.icon_google),
//                    contentDescription = null
//                )
//
//                Spacer(
//                    modifier = Modifier
//                        .size(ButtonDefaults.ButtonWithIconContentPadding.calculateTopPadding()))
//                Text(text = "Google")
//            }
//        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Нет аккаунта?",
                color = Color.Black,
                fontSize = 14.sp
            )

            Text(
                modifier = Modifier.clickable {
//                    navigateToRegist.invoke()
                },
                text = " Зарегестрируйтесь",
                color = OurBlue,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                fontStyle = FontStyle.Italic
            )
        }
    }
}