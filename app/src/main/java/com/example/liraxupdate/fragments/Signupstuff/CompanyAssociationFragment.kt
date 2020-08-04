package com.example.liraxupdate.fragments.Signupstuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.liraxupdate.R
import com.example.liraxupdate.databinding.FragmentCompanyAssociationBinding
import com.example.liraxupdate.viewmodels.SharedViewModelSignUp

class CompanyAssociationFragment : Fragment() {

lateinit var viewModelSignUp: SharedViewModelSignUp
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentCompanyAssociationBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_company_association,container,false)
      viewModelSignUp = ViewModelProvider(this).get(SharedViewModelSignUp::class.java)
        binding.companymodel = viewModelSignUp
        binding.lifecycleOwner = this
        return binding.root
    }


}