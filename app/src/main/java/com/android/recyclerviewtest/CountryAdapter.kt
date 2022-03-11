package com.android.recyclerviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imagelist: ArrayList<Int>,
    var context: Context) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var countryName : TextView = itemView.findViewById(R.id.countryName)
        var textDetails : TextView = itemView.findViewById(R.id.textDetail)
        var imageView : CircleImageView = itemView.findViewById(R.id.imageview)
        var cardView : CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {

        val view : View = LayoutInflater.from(context)
            .inflate(R.layout.card_design,parent,false)

        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.countryName.text = countryNameList[position]
        holder.textDetails.text = detailsList[position]
        holder.imageView.setImageResource(imagelist[position])

        holder.cardView.setOnClickListener{
            Toast.makeText(context,"You have selected ${countryNameList[position]}",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {

        return countryNameList.size
    }
}