package com.mahammadjafarzade.hotels.searchlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.mahammadjafarzade.common.flowState.Status
import com.mahammadjafarzade.hotels.databinding.FragmentSearchListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchListFragment : Fragment() {
    lateinit var binding: FragmentSearchListBinding
    val viewModel : SearchListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            viewModel.getHotels()
        }

        lifecycleScope.launch {
            viewModel.state.collectLatest { state->
//                when(it.status){
//                    Status.SUCCESS -> showLoadingProgress(true)
//                }
            }
        }
        viewModel.data.observe(viewLifecycleOwner){

        }
    }
    fun showLoadingProgress(isLoad : Boolean){

    }

}