package com.example.liraxupdate.viewmodels

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation.findNavController
import com.example.liraxupdate.Activities.SignUpActivity


import com.example.liraxupdate.R

class LoginViewModel  : ViewModel() {

var username: String? = null
    var password: String? = null

    fun movetoSignup(view: View)
    {
        val intent = Intent(view.context,SignUpActivity::class.java)
        view.context.startActivity(intent)
    }




}