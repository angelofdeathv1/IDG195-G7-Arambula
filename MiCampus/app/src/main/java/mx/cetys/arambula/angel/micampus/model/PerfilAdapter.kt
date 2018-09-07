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
        holder.txt_perfil.text = items.get(position).nombre
        holder.txt_apellido.text = items.get(position).apellido
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txt_perfil = view.tv_txt_nombre
        val txt_apellido = view.tv_txt_apellido
    }

}