package com.example.pam3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlexDirection.Companion.Column
import androidx.compose.foundation.layout.GridFlow.Companion.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.effect.Crop
import com.google.ai.client.generativeai.common.shared.Content

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    val background = painterResource(id = R.drawable.background)
    val logo_umy = painterResource(id = R.drawable.background)
    val fotoTasya = painterResource(id =R.drawable.foto_tasya)

    Box(modifier = modifier.fillMaxSize()){
        Image(
            painter = background,
            contentDescription = null,
            modifier = modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            Text(
                text = "Login",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Logo kampus
            val logo_umy = painterResource(id = R.drawable.logo_umy)
            Image(
                painter = logo_umy,
                contentDescription = "Logo UMY",
                modifier = Modifier.size(130.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Identitas
            Text(
                text = "Nama",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Tasya Maulida Putri",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "20240140239",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(16.dp))

            val fotoTasya = painterResource(id = R.drawable.foto_tasya)
            Image(
                painter = fotoTasya,
                contentDescription = "Foto Tasya",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE8E8F4))
                    .border(width = 4.dp, color = Color.White, shape = CircleShape),
                contentScale = ContentScale.Crop
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun TugasLoginPreview() {
    TugasLogin()
}


