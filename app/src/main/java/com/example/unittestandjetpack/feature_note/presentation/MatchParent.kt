package com.example.unittestandjetpack.feature_note.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout


@Preview
@Composable
fun ComposeUI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Column {
            Box(modifier = Modifier.background(Color(255, 0, 0, 0xFF))) {
                Text("Wrap content")
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0, 255, 0, 0xFF))
            ) {
                Text("Match parent")
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(3 / 1f)
                    .background(Color(0, 0, 255, 0xff))
            ) {
                Text("Match parent with ratio w:h - 1:2")

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(4 / 1f)
                    .background(Color(255, 0, 255, 0xff)), contentAlignment = Alignment.CenterEnd
            ) {
                Text("Align center | end")

            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(3 / 1f)
                    .background(Color.DarkGray)
                    , horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween
            ) {

                Box(modifier = Modifier.background(Color(255, 0, 0, 0xff))) {
                    Text("Alignment")

                }
                Box(modifier = Modifier.background(Color(255, 255, 0, 0xff))) {
                    Text("Arrangement")

                }
            }

            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {

                val (box0,box1) = createRefs()

                Box(modifier = Modifier.constrainAs(box0){
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                } .background(Color(255, 0, 0, 0xff))) {
                    Button(onClick = {
                    }) {
                        Text(text = "Button")
                    }
                }

                Box(modifier = Modifier.constrainAs(box1){
                    end.linkTo(box0.start)
                    bottom.linkTo(parent.bottom)
                }.background(Color(255,255,0,0xff)))
                {
                    Text("new new button")
                }



            }
        }


    }

}