package com.example.liraxupdate.utils

import android.content.Context
import android.widget.Toast
import androidx.navigation.Navigation


    fun Context.toastt(messages: String)
    {
        Toast.makeText(applicationContext,messages,Toast.LENGTH_SHORT).show()
    }


