package com.mahammadjafarzade.booking.feature.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.auth
import com.mahammadjafarzade.booking.R
import com.mahammadjafarzade.booking.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {
    lateinit var binding : FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

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
        val action = LoginFragmentDirections.actionLoginFragmentToHotelsNavigation()
        findNavController().navigate(action)
    }
    fun openRegisterPage(){
        val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
        findNavController().navigate(action)
    }
}
