package com.example.androidtodolist.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtodolist.R
import com.neppplus.todolistpractice_20220511.models.TodoData

class TodoRecyclerAdapter(val mContext : Context, val mList : List<TodoData>) : RecyclerView.Adapter<TodoRecyclerAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.todo_list_item, parent, false )
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){

    }

}