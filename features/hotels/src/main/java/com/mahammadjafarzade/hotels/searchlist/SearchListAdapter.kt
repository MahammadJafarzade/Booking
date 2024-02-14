package com.mahammadjafarzade.hotels.searchlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mahammadjafarzade.entities.uimodel.HotelListUIModel
import com.mahammadjafarzade.hotels.databinding.ListItemHotelsBinding

class SearchListAdapter : RecyclerView.Adapter<SearchListViewHolder>() {
    private val differ = AsyncListDiffer(this, diffCallBack)

    fun setData(items : List<HotelListUIModel>){
        differ.submitList(items)
    }
    override fun getItemCount(): Int {
        return differ.currentList.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchListViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemHotelsBinding.inflate(inflater, parent,false)

        return SearchListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchListViewHolder, position: Int) {
       differ.currentList.getOrNull(position)?.let {
           holder.bind(it)
       }
    }
    companion object{
        private var diffCallBack = object : DiffUtil.ItemCallback<HotelListUIModel>(){
            override fun areItemsTheSame(
                oldItem: HotelListUIModel,
                newItem: HotelListUIModel
            ): Boolean {
                return oldItem.enuId == newItem.enuId
            }

            override fun areContentsTheSame(
                oldItem: HotelListUIModel,
                newItem: HotelListUIModel
            ): Boolean {
                return oldItem == newItem
            }

        }
    }
}



class SearchListViewHolder(private val binding: ListItemHotelsBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(viewModel : HotelListUIModel){
        binding.txtTitle.text = viewModel.name
        binding.txtAddress.text = viewModel.address
        binding.txtPrice.text = "${viewModel.price} ₺"
        binding.txtCity.text = "${viewModel.city} ,  ${viewModel.country}"
        binding.txtStartRating.text = "${viewModel.reviewScore}".replace(".", ",")
        binding.txtNear.text = "merkezine ${viewModel.cityCenterPointDistance} km"
        val url = viewModel.thumbnailImage.replace("/0x0", "")
        Glide.with(binding.root).load(url).into(binding.imageView)

    }
}