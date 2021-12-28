package com.onursercanyilmaz.kucukcekmecedernekler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onursercanyilmaz.kucukcekmecedernekler.R
import kotlinx.android.synthetic.main.dernek_list_item_layout.view.*

class GeneralListAdapter() : RecyclerView.Adapter<GeneralListAdapter.MovieListHolder>() {

    var movieList : ArrayList<Any> = arrayListOf()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GeneralListAdapter.MovieListHolder = MovieListHolder(LayoutInflater.from(parent.context).inflate(R.layout.dernek_list_item_layout, parent,false))

    override fun onBindViewHolder(holder: GeneralListAdapter.MovieListHolder, position: Int) {
        holder.bind(movieList[position].toString())
    }

    override fun getItemCount(): Int = movieList.size

    inner class MovieListHolder(view: View): RecyclerView.ViewHolder(view)
    {
        fun bind(s: String)
        {
            itemView.textView3.text = s

        }

    }

    fun getData(movieResponse: ArrayList<String>){
        movieList.addAll(movieResponse)
        notifyDataSetChanged()

    }
}