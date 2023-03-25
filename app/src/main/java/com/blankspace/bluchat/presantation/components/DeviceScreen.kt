package com.blankspace.bluchat.presantation.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blankspace.bluchat.domain.chat.BluetoothDevice
import com.blankspace.bluchat.presantation.BluetoothUiState

@Composable
fun DeviceScreen(
    state : BluetoothUiState,
    onStartScan : () -> Unit,
    onStopScan : () -> Unit
){
    Column (
        modifier = Modifier
            .fillMaxSize()
        ){
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Button(onClick = onStartScan) {
                Text(text = "Start Scan")
            }
            Button(onClick = onStopScan) {
                Text(text = "Stop Scan")
            }
        }
    }
}

@Composable
fun BluetoothDeviceList(
    pairedDevice : List<BluetoothDevice>,
    scannedDevices : List<BluetoothDevice>,
    onClick : (BluetoothDevice) -> Unit,
    modifier: Modifier = Modifier
){
    LazyColumn(
        modifier = modifier
    ){
        item {
            Text(
                text = "Paired Device",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(pairedDevice){devices->
            Text(
                text = devices.name?:"(No name)",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onClick(devices) }
                    .padding(16.dp)
            )
        }

        item {
            Text(
                text = "Scanned Device",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(scannedDevices){devices->
            Text(
                text = devices.name?:"(No name)",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onClick(devices) }
                    .padding(16.dp)
            )
        }
    }
}