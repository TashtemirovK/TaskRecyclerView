package com.example.taskrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class CarsAdapter(private val carsList: ArrayList<Cars>) :
    RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_cars,
            parent, false
        )
        return CarsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        val currentItem = carsList[position]
    }

    override fun getItemCount(): Int {
        return carsList.size
    }


    class CarsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val model: TextView = itemView.findViewById(R.id.tvModel)
        val year: TextView = itemView.findViewById(R.id.tvYear)

    }

}