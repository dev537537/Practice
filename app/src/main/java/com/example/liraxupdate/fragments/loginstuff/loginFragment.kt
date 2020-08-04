package com.example.liraxupdate.fragments.loginstuff

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.liraxupdate.Activities.DashboardActivity
import com.example.liraxupdate.Activities.SignUpActivity
import com.example.liraxupdate.R
import com.example.liraxupdate.databinding.FragmentLoginBinding
import com.example.liraxupdate.viewmodels.LoginViewModel

import kotlinx.android.synthetic.main.fragment_login.*


class loginFragment : Fragment() {

    lateinit var viewModel: LoginViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

     val     binding : FragmentLoginBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.loginframodel= viewModel
        binding.lifecycleOwner = this
        return binding.root

    }



}