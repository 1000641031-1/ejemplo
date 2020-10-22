package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IntroSliderAdapter(private val introSlides: List<IntroSlider>)
    : RecyclerView.Adapter<IntroSliderAdapter.IntroSlideViewHolder>(){

    inner class IntroSlideViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val text_question_header_2 = view.findViewById<TextView>(R.id.text_question_header_2)

        fun bind(introSlides: IntroSlider) {
            text_question_header_2.text = introSlides.text_question_header_2
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSlideViewHolder {
       return IntroSlideViewHolder(LayoutInflater.from(parent.context).inflate
           (R.layout.slide_item_container,parent,false))
    }

    override fun onBindViewHolder(holder: IntroSlideViewHolder, position: Int) {
        holder.bind(introSlides[position])
    }

    override fun getItemCount(): Int {
        return introSlides.size
    }
}





