package com.example.liraxupdate.fragments.Signupstuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl
import androidx.lifecycle.ViewModelProvider
import com.example.liraxupdate.R
import com.example.liraxupdate.databinding.FragmentLoginBinding.inflate
import com.example.liraxupdate.databinding.FragmentPrivateUserBinding
import com.example.liraxupdate.viewmodels.SharedViewModelSignUp


class PrivateUserFragment : Fragment() {

lateinit var viewmodel : SharedViewModelSignUp
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding: FragmentPrivateUserBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_private_user, container, false)
        viewmodel = ViewModelProvider(this).get(SharedViewModelSignUp::class.java)
        binding.privatemodel = viewmodel
        binding.lifecycleOwner = this
        return binding.root
    }


}