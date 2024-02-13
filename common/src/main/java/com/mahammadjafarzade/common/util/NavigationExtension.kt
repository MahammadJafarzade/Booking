package com.mahammadjafarzade.common.util

import android.net.Uri
import androidx.navigation.NavController
import com.mahammadjafarzade.entities.model.User

fun NavController.toLogin(user: User){
    var uri = Uri.parse("booking://login/?user=$user")
    this.navigate(uri)
}