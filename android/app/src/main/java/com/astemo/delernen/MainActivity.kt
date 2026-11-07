package com.astemo.delernen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.astemo.delernen.data.DataRepo
import com.astemo.delernen.nav.AppRoot
import com.astemo.delernen.ui.theme.DelernenTheme
import com.astemo.delernen.util.TtsHelper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataRepo.init(applicationContext)
        enableEdgeToEdge()
        setContent {
            DelernenTheme {
                AppRoot()
            }
        }
    }

    override fun onDestroy() {
        TtsHelper.release()
        super.onDestroy()
    }
}
