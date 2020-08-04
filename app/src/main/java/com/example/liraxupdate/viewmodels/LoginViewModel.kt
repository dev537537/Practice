package com.example.liraxupdate.viewmodels

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.example.liraxupdate.Activities.DashboardActivity
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

fun moveusernmae(view: View)
{
    Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_usernameFragment)
}
 fun movetoforgot(view: View)
 {
     Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_forgot_password)
 }

    fun openemail(view: View)
    {
        val intent = Intent(Intent.ACTION_SEND)
        intent.data = Uri.parse("mailto:")
        intent.type = "text/plain"

        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject:")

        intent.putExtra(Intent.EXTRA_TEXT, "Message body:")
       view.context.startActivity(Intent.createChooser(intent, "Choose Email Client..."))
    }

    fun movetoDashboard(view: View)
    {
        val intent = Intent(view.context, DashboardActivity::class.java)
        view.context.startActivity(intent)
    }

}