package com.mahammadjafarzade.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.mahammadjafarzade.common.util.toHotel
import com.mahammadjafarzade.common.util.toRegister
import com.mahammadjafarzade.entities.model.User
import com.mahammadjafarzade.login.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {
    lateinit var binding : FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        binding.loginButton.setOnClickListener{
            loginEmail()
        }
        binding.registerButton.setOnClickListener{
            openRegisterPage()
        }
        // Inflate the layout for this fragment
        return (binding.root)
    }
    fun loginEmail(){
            val firebaseAuth = Firebase.auth
        firebaseAuth.signInWithEmailAndPassword(
            binding.usernameEditText.text.toString(),
            binding.passwordEditText.text.toString()
        ).addOnSuccessListener {
            openApp()
        }.addOnFailureListener{
        }
    }
    fun openApp(){
        findNavController().toHotel()
    }
    fun openRegisterPage(){
        findNavController().toRegister() }
}
