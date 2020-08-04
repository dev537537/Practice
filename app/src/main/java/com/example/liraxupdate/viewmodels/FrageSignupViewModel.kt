package com.example.liraxupdate.viewmodels

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.liraxupdate.R

class FrageSignupViewModel : ViewModel() {
    fun movetoprivate(view: View)
    {
        Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_privateUserFragment)
    }
    fun movetocompany(view:View)
    {
        Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_companyAssociationFragment)
    }

    fun movetoinsitute(view : View)
    {
        Navigation. findNavController(view).navigate(R.id.action_signUpFragment_to_institutionFragment)
    }
}