package com.mahammadjafarzade.booking.feature.splashScreen

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.mahammadjafarzade.splash.SplashViewModel
import com.mahammadjafarzade.splash.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : Fragment() {

    private val viewModel: SplashViewModel by viewModels()
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        playLottie()
        return binding.root
    }

    private fun playLottie() {
        binding.animationView.repeatCount = 0
        binding.animationView.playAnimation()
        binding.animationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                // Add any necessary logic when animation starts
            }

            override fun onAnimationEnd(animation: Animator) {
               // openApp()
            }

            override fun onAnimationCancel(animation: Animator) {
                // Add any necessary logic when animation is cancelled
            }

            override fun onAnimationRepeat(animation: Animator) {
                // Add any necessary logic when animation repeats
            }
        })
    }

//    private fun openApp() {
//        val action = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
//        findNavController().navigate(action)
//    }
}