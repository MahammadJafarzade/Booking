package com.mahammadjafarzade.hotels.searchlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.mahammadjafarzade.common.base.BaseFragment
import com.mahammadjafarzade.hotels.databinding.FragmentSearchListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchListFragment : BaseFragment <FragmentSearchListBinding, SearchListViewModel>(FragmentSearchListBinding::inflate) {

    val viewModel : SearchListViewModel by viewModels()

    private lateinit var adapter: SearchListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRvAdapter()

        lifecycleScope.launch {
            viewModel.getHotels()
        }


        viewModel.data.observe(viewLifecycleOwner){
            adapter.setData(it?.hotels ?: listOf())
        }
    }

    override fun mViewModel(): SearchListViewModel {
        return viewModel
    }
    private fun initRvAdapter(){
        adapter = SearchListAdapter()
        binding.recylerView.layoutManager = LinearLayoutManager(context)
        binding.recylerView.adapter = adapter
    }
}
