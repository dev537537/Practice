package com.example.liraxupdate.fragments.loginstuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.liraxupdate.R
import com.example.liraxupdate.databinding.FragmentUsernameBinding
import com.example.liraxupdate.viewmodels.LoginViewModel

class UsernameFragment : Fragment() {


lateinit var viewModel: LoginViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentUsernameBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_username, container, false)
      viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.usernamforgot = viewModel
           binding.lifecycleOwner = this
        return binding.root
    }


}