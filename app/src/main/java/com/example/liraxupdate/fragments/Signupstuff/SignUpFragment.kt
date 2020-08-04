package com.example.liraxupdate.fragments.Signupstuff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.liraxupdate.R
import kotlinx.android.synthetic.main.fragment_sign_up.*


class SignUpFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signuptype_private_user_btn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_privateUserFragment)
        }
        signuptype_company_user_btn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_companyAssociationFragment)
        }
        signuptype_institutions_user_btn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_institutionFragment)
        }
    }
}