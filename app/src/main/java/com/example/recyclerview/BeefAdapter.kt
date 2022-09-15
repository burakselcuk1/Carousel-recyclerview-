package com.example.recyclerview

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.CategoryItemBinding
import com.example.recyclerview.model.Beef
import com.example.recyclerview.model.BeefItems

class BeefAdapter(val dataSet: ArrayList<Beef>) :
    RecyclerView.Adapter<BeefAdapter.ViewHolder>() {
    private lateinit var binding: CategoryItemBinding

    class ViewHolder(var view: CategoryItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = CategoryItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.category = dataSet[position]
        /*      viewModel = ViewModelProviders.of(FragmentActivity())
                  .get(MyBagViewModel::class.java)*/




    }
    override fun getItemCount() = dataSet.size

}
