package com.example.learningjetpackcompose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LazyRow(modifier = Modifier.fillMaxSize()){
        items(10) { i->
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

        }
    }


//    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = null,
//        modifier = Modifier.background(Color.Black)
//    )
//    if(name.length > 5){
//        Icon(imageVector = Icons.Default.Add,
//            contentDescription = null
//        )
//    }
//    LazyColumn (modifier = Modifier.fillMaxSize()){
//        items(10) { i ->
//                Icon(
//                    imageVector = Icons.Default.Face,
//                    contentDescription = null,
//                    modifier = Modifier.size(100.dp)
//                )
//
//        }
//    }




//    Box(
//        modifier = Modifier
//            //.fillMaxWidth or fillMaxHeight
//            //.fillMaxSize()
//            .size(400.dp)
//    ){
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//            modifier = Modifier.align(Alignment.BottomEnd)
//        )
//
//        Text(
//            text = "other text",
//            color = Color.Blue,
//            fontSize = 30.sp
//        )
//    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearningJetpackComposeTheme {
        Greeting("Android")
    }
}

// @Preview(showBackground = true)
@Composable
fun ProfileCard() {
    Row {
        Column {
            Text("Ryan")
            Text("Locked In")
        }
    }
}