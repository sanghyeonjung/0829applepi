package com.example.a0829applepi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.a0829applepi.databinding.ItemRecyclerBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private lateinit var binding:ItemRecyclerBinding
    val list = mutableListOf<Int>()
    inner class ViewHolder : RecyclerView.ViewHolder(binding.root){
        fun OnBind(item: Int){
            binding.textItemNumber.text = item.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.item_recycler,parent,false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.OnBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}