package com.kyawt.findcrush.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.findcrush.R
import com.kyawt.findcrush.model.DataClassOfIndex
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.index.view.*

class IndexViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    var name = itemView.findViewById<TextView>(R.id.txt_name)
    var profile_img = itemView.findViewById<CircleImageView>(R.id.img_profile)
    var posted_img = itemView.findViewById<ImageView>(R.id.img_posted)
}

class IndexAdapter(val indexinfo : ArrayList<DataClassOfIndex>) : RecyclerView.Adapter<IndexViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndexViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.index, parent ,false)
        return IndexViewHolder(view)
    }

    override fun getItemCount(): Int {
        return indexinfo.size
    }

    override fun onBindViewHolder(holder: IndexViewHolder, position: Int) {
        holder.name.text = indexinfo[position].name
        holder.profile_img.setImageResource(indexinfo[position].profile_img)
        holder.posted_img.setImageResource(indexinfo[position].post_img)
    }

}