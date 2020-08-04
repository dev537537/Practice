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
       lateinit var binding: FragmentLoginBinding
    lateinit var viewModel: LoginViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.loginframodel= viewModel
        binding.lifecycleOwner = this
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginUsernameBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_usernameFragment)
        }
        login_username_btn.setOnClickListener {

        }


        login_forgot_password_btn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgot_password)
        }
        login_button.setOnClickListener {
            val intent = Intent(view.context,DashboardActivity::class.java)
            startActivity(intent)
        }
        login_contact.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:")
            intent.type = "text/plain"

            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject:")

            intent.putExtra(Intent.EXTRA_TEXT, "Message body:")
            startActivity(Intent.createChooser(intent, "Choose Email Client..."))
        }
    }

}