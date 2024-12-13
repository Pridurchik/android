package com.hackton.features.regist_features.ui

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.runtime.State
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
fun Registration(
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

        val buttonTeatherState : State<Users> = remember {
            mutableStateOf(Users.Teather(state = UserState()))
        }

        val buttonStudentState : State<Users> = remember {
            mutableStateOf(Users.Student(state = UserState()))
        }
        val buttonParentState : State<Users> = remember {
            mutableStateOf(Users.Parent(state = UserState()))
        }

        Row(
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxWidth(),
        ) {
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = "Создайте свою\nучетную запись",
                fontSize = 29.sp,
                fontWeight = FontWeight(600),
                color = Color.Black
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 10.dp),
        ) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                onClick = {
                    changeStatic(
                        users = Users.Student(state = UserState()),
                        stateStudent = buttonStudentState,
                        stateTeather = buttonTeatherState,
                        stateParent = buttonParentState,
                    )

                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = if (buttonStudentState.value.state.state) OurBlue else Color.White),
                border = if(!buttonStudentState.value.state.state) BorderStroke(width = 1.dp, color = OurBlue) else null
            ) {
                Text(
                    text = "Ученик",
                    color = if (buttonStudentState.value.state.state) Color.White else OurBlue
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                onClick = {
                    changeStatic(
                        users = Users.Student(state = UserState()),
                        stateStudent = buttonStudentState,
                        stateTeather = buttonTeatherState,
                        stateParent = buttonParentState,
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = if (buttonTeatherState.value.state.state) OurBlue else Color.White),
                border = if(!buttonTeatherState.value.state.state) BorderStroke(width = 1.dp, color = OurBlue) else null
            ) {
                Text(
                    text = "Учитель",
                    color = if (buttonTeatherState.value.state.state) Color.White else OurBlue
                )
            }

            Button(
                modifier = Modifier.weight(1f),
                onClick = {
                    changeStatic(
                        users = Users.Student(state = UserState()),
                        stateStudent = buttonStudentState,
                        stateTeather = buttonTeatherState,
                        stateParent = buttonParentState,
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = if (buttonTeatherState.value.state.state) OurBlue else Color.White),
                border = if(!buttonTeatherState.value.state.state) BorderStroke(width = 1.dp, color = OurBlue) else null
            ) {
                Text(
                    text = "Родитель",
                    color = if (buttonTeatherState.value.state.state) Color.White else OurBlue
                )
            }
        }


        Text(
            modifier = Modifier.padding(start = 20.dp, bottom = 4.dp, top = 10.dp),
            text = "ФИО",
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
                Text(text = "Введите свое ФИО")
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
            text = "Номер",
            fontWeight = FontWeight(350),
            fontSize = 14.sp
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, bottom = 40.dp),
            value = textFieldStatePassword.value,
            onValueChange = { newText -> textFieldStatePassword.value = newText},
            label = {
                Text(text = "Введите свой номер телефона")
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
                .padding(start = 20.dp, end = 20.dp,),
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
            modifier = Modifier
                .fillMaxWidth()
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


data class UserState(
    var state: Boolean = true,
    val color: Color = OurBlue
)

sealed class Users(
    val state: UserState
) {
     class Student(
        state: UserState
    ) : Users(state)
    class Parent(
        state: UserState
    ): Users(state)
    class Teather(
        state: UserState
    ) : Users(state)
}

private fun changeStatic(
    users: Users,
    stateStudent: State<Users>,
    stateTeather: State<Users>,
    stateParent: State<Users>,
) {
    when(users) {
        is Users.Parent -> {
            stateParent.value.state.state = false
            stateTeather.value.state.state = true
            stateStudent.value.state.state = false
        }
        is Users.Student -> {
            stateParent.value.state.state = true
            stateTeather.value.state.state = false
            stateStudent.value.state.state = true
        }
        is Users.Teather -> {

            val onestate = stateParent
            onestate.value.state.state = true
//            stateParent.value = onestate

            stateTeather.value.state.state = true

            stateStudent.value.state.state = true
        }
    }
}
