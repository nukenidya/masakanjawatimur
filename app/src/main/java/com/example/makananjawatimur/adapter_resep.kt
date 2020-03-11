package com.example.makananjawatimur

package com.example.makananjawatimur

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.resep.view.*

class adapter_resep (val resepItemList: List<data_resep>, val clickListener: (data_resep) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.resep,parent,false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }
    override fun getItemCount() = resepItemList.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(judul: data_resep, clickListener: (data_resep) -> Unit){
            itemView.judul2.text = judul.nama
            Picasso.get().load(judul.gambar).into(itemView.gambar2)
            itemView.setOnClickListener{ clickListener(judul)}
        }
    }

}