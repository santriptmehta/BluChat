package com.blankspace.bluchat.presantation.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import com.blankspace.bluchat.presantation.BluetoothUiState
import java.lang.reflect.Modifier

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
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement =  Arrangement.SpaceAround
            ){

        }
    }
}