package com.mahammadjafarzade.common.util

import android.net.Uri
import androidx.navigation.NavController
import com.mahammadjafarzade.entities.model.User

fun NavController.toLogin(){
    val uri = Uri.parse("booking://login/")
    this.navigate(uri)
}
fun NavController.toHotel(){
    val uri = Uri.parse("booking://hotel/")
    this.navigate(uri)
}
fun NavController.toRegister(){
    val uri = Uri.parse("booking://register/")
    this.navigate(uri)
}