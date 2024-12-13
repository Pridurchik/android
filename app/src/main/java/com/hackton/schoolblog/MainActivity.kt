package com.hackton.schoolblog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hackton.features.main_features.home_features.ui.Home
import com.hackton.features.main_features.schedule_features.ui.Schedule
import com.hackton.features.regist_features.ui.Registration
import com.hackton.schoolblog.ui.composable.ScreenProject
import com.hackton.schoolblog.ui.theme.SchoolBlogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SchoolBlogTheme {
                ScreenProject()
            }
        }
    }
}

