package com.example.liraxupdate.viewmodels

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.liraxupdate.Activities.DashboardActivity
import com.example.liraxupdate.Activities.LogInActivity

class SharedViewModelSignUp : ViewModel()
{
    var auth_number:String? = null
    var email: String? = null
    var password: String? = null
    var first_name: String? = null
    var last_name: String? = null
    var company_name: String? = null
    var institute_name: String? = null

    fun privateregister(view: View)
    {
        val intent = Intent(view.context,DashboardActivity::class.java)
        view.context.startActivity(intent)
    }
    fun companyregister(view: View)
    {
        val intent = Intent(view.context,DashboardActivity::class.java)
        view.context.startActivity(intent)
    }
    fun institutregister(view: View)
    {
        val intent = Intent(view.context,DashboardActivity::class.java)
        view.context.startActivity(intent)
    }
    fun gotologin(view: View)
    {
        val intent = Intent(view.context,LogInActivity::class.java)
        view.context.startActivity(intent)
    }



}