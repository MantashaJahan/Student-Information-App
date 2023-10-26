package com.example.studentinformation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import javax.security.auth.Subject

class DataAdapter (private val data:List<Data>,private val itemClickListener: ItemClickListener):
    RecyclerView.Adapter<DataAdapter.ViweHolder>(){
    interface ItemClickListener{
        fun onEditItemClick(data: Data)
        fun onDeleteItemClick(data: Data)

    }

    class ViweHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val StudentID = itemView.findViewById<TextView>(R.id.studentIdTV)
        val Name = itemView.findViewById<TextView>(R.id.nameTV)
        val Subject = itemView.findViewById<TextView>(R.id.subTV)
        val Birthday = itemView.findViewById<TextView>(R.id.birthdayTV)
        val Ddit = itemView.findViewById<TextView>(R.id.editBtn)
        val EDit = itemView.findViewById<TextView>(R.id.deleteBtn)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViweHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return ViweHolder(view)

    }

    override fun onBindViewHolder(holder:ViweHolder, position: Int) {
        val item= data[position]
        holder.StudentID.text = item.studentId
        holder.name.text = item.nameId
        holder.StudentID.text = item.studentId
        holder.StudentID.text = item.studentId
        holder.StudentID.text = item.studentId

        holder.edit.setOnClickListener {
            itemClickListener.onEditItemClick(item)
        }
        holder.delete.setOnClickListener {
            itemClickListener.onDeleteItemClick(item)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }


}