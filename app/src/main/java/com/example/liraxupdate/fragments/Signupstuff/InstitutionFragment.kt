package com.example.liraxupdate.fragments.Signupstuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.liraxupdate.R
import com.example.liraxupdate.databinding.FragmentInstitutionBinding
import com.example.liraxupdate.viewmodels.SharedViewModelSignUp


class InstitutionFragment : Fragment() {

lateinit var viewModelSignUp: SharedViewModelSignUp
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         val binding: FragmentInstitutionBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_institution,container,false)
          viewModelSignUp = ViewModelProvider(this).get(SharedViewModelSignUp::class.java)
        binding.insitutemodel = viewModelSignUp
        binding.lifecycleOwner = this
        return binding.root
    }


}