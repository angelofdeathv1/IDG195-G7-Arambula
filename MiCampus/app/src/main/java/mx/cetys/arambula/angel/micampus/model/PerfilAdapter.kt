package mx.cetys.arambula.angel.micampus.model

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.perfil_row.view.*
import mx.cetys.arambula.angel.micampus.R.layout.perfil_row

class PerfilAdapter(val items: List<Perfil>, val context: Context) :
        RecyclerView.Adapter<PerfilAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(context).inflate(
                        perfil_row, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvPerfil.text = items.get(position).nombre

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvPerfil = view.tv_txt_perfil
    }

}