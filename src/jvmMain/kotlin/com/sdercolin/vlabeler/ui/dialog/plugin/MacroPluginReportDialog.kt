package com.sdercolin.vlabeler.ui.dialog.plugin

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdercolin.vlabeler.ui.common.plainClickable
import com.sdercolin.vlabeler.ui.string.LocalizedJsonString
import com.sdercolin.vlabeler.ui.string.Strings
import com.sdercolin.vlabeler.ui.string.string
import com.sdercolin.vlabeler.ui.theme.Black50

@Composable
fun MacroPluginReportDialog(report: LocalizedJsonString, finish: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = Black50)
            .plainClickable(),
        contentAlignment = Alignment.Center,
    ) {
        Surface(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.65f)) {
            Column(modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp, horizontal = 30.dp)) {
                Spacer(Modifier.height(10.dp))
                Text(
                    text = string(Strings.MacroPluginReportDialogTitle),
                    style = MaterialTheme.typography.h6,
                )
                Spacer(Modifier.height(15.dp))
                Box(
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)
                        .background(MaterialTheme.colors.background)
                        .padding(20.dp),
                ) {
                    val scrollState = rememberScrollState()
                    Box(modifier = Modifier.fillMaxWidth().verticalScroll(scrollState)) {
                        Text(
                            text = report.get(),
                            style = MaterialTheme.typography.body2,
                        )
                    }
                    VerticalScrollbar(
                        adapter = rememberScrollbarAdapter(scrollState),
                        modifier = Modifier.align(Alignment.CenterEnd).width(15.dp),
                    )
                }
                Spacer(Modifier.height(30.dp))
                ButtonBar(finish = finish)
            }
        }
    }
}

@Composable
private fun ButtonBar(finish: () -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
        Button(onClick = { finish() }) {
            Text(string(Strings.CommonOkay))
        }
    }
}