package com.example.geal_list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberAsyncImagePainter

@ExperimentalCoilApi
@Composable
fun GealListItem(
    geal: Geal,
    onItemClick: (Geal) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .clickable { onItemClick(geal) }
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = rememberAsyncImagePainter(
                geal.imageUrl
            ),
            contentDescription = "Geal",
            modifier = Modifier.size(128.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = geal.name,
                style = MaterialTheme.typography.body1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = geal.description,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}