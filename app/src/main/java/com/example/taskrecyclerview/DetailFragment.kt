package com.example.taskrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowId
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.taskrecyclerview.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var: FragmentDetailBinding
    private lateinit var imageId: ArrayList<Int>
    private lateinit var model: ArrayList<String>
    private lateinit var year: ArrayList<Int>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val imageUrl = "https://www.example.com/image.jpg"


        Glide.with(this)
            .load(imageUrl)
            .apply(RequestOptions().placeholder(R.drawable.placeholder)) // optional placeholder
            .into(binding.imageView) // replace with the actual ImageView instance in your layout


        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        model = arrayListOf(
            "Mercedes",
            "Toyota",
            "Subaru",
            "Mazda",
            "Kia",
            "Porsche",
            "Lambo",
            "Ferrari",
            "Rolls-Rois",
            "Hummer",
            "Lexus",
            "Honda",
            "Hyundai"
        )

        year = arrayListOf(
            2001,
            2002,
            2023,
            2024,
            2020,
            2022,
            2019,
            2000,
            2017,
            2016,
            2009,
            2019
        )

        imageId = ArrayList()

        return view
    }
}
