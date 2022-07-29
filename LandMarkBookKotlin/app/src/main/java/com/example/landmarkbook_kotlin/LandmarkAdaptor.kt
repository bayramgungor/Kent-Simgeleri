package com.example.landmarkbook_kotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.landmarkbook_kotlin.databinding.RecyclerviewRowBinding

class LandmarkAdaptor(val landmarkList:ArrayList<LandMark>) :RecyclerView.Adapter<LandmarkAdaptor.LandmarkHolder>() {


    class LandmarkHolder(val binding :RecyclerviewRowBinding):RecyclerView.ViewHolder(binding.root){

    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
      val binding=RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
         return LandmarkHolder(binding)
     }

     override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
         holder.binding.recyclerViewTextView.text=landmarkList.get(position).name


         holder.itemView.setOnClickListener{
             val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
             intent.putExtra("landmark",landmarkList.get(position))

             holder.itemView.context.startActivities(arrayOf(intent))
         }
     }

     override fun getItemCount(): Int {
         return landmarkList.size
     }
 }