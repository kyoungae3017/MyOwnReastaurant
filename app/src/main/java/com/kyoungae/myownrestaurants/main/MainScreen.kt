package com.kyoungae.myownrestaurants.main

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kyoungae.myownrestaurants.ui.theme.MyOwnReastaurantTheme

@Composable
fun MainScreen() {
    Text(text = "hi")
}

@Preview
@Composable
fun PreviewMainScreen(){
    MyOwnReastaurantTheme {
        Surface {
            MainScreen()
        }

    }

}