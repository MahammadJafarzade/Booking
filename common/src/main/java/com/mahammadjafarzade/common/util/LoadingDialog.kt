package com.mahammadjafarzade.common.util

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.mahammadjafarzade.common.databinding.DialogLoadingBinding

@SuppressLint("SuspiciousIndentation")
class LoadingDialog(context: Context) : Dialog(context) {
    private var binding : DialogLoadingBinding = DialogLoadingBinding.inflate(LayoutInflater.from(context))

    init {
        if(context is Activity)
        setOwnerActivity(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}