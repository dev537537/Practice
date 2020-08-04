package com.example.liraxupdate.fragments.Signupstuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.liraxupdate.R
import com.example.liraxupdate.databinding.FragmentSignUpBinding
import com.example.liraxupdate.viewmodels.FrageSignupViewModel
import kotlinx.android.synthetic.main.fragment_sign_up.*


class SignUpFragment : Fragment() {

lateinit var viewModel: FrageSignupViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

  val signUpBinding: FragmentSignUpBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up,container,false)
       viewModel = ViewModelProvider(this).get(FrageSignupViewModel::class.java)
        signUpBinding.signfragmodel = viewModel
        signUpBinding.lifecycleOwner = this
        return signUpBinding.root
    }


}