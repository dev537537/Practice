package com.example.liraxupdate.fragments.loginstuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.liraxupdate.R
import com.example.liraxupdate.databinding.FragmentForgotPasswordBinding
import com.example.liraxupdate.viewmodels.LoginViewModel


class forgot_password : Fragment() {


lateinit var viewmodel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         var binding: FragmentForgotPasswordBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_forgot_password,container,false)
      viewmodel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.resetviewmodel = viewmodel
        binding.lifecycleOwner = this
        return binding.root
    }


}