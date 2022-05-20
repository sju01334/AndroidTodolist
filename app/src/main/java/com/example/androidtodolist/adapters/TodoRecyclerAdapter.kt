package com.example.androidtodolist.adapters

import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtodolist.DetailTodoActivity
import com.example.androidtodolist.R
import com.neppplus.todolistpractice_20220511.models.TodoData

class TodoRecyclerAdapter(val mContext : Context, val mList : List<TodoData>) : RecyclerView.Adapter<TodoRecyclerAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.todo_list_item, parent, false )
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bind(item : TodoData){
            val todoRatingBar = itemView.findViewById<RatingBar>(R.id.todoRatingBar)
            val todoTxt = itemView.findViewById<TextView>(R.id.todoTxt)
            val finishedCb = itemView.findViewById<CheckBox>(R.id.finishedCb)

            todoRatingBar.rating = item.rating.toFloat()
            todoTxt.text = item.todoTitle
            finishedCb.isChecked = item.isFinished

            if(item.isFinished){
                todoTxt.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            }else{
                todoTxt.paintFlags = 0
            }

            finishedCb.setOnCheckedChangeListener { compoundButton, b ->
                item.isFinished = b
                if(b){
                    todoTxt.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
                }else{
                    todoTxt.paintFlags = 0
                }
            }

            itemView.setOnClickListener {
                val todoList = ArrayList<TodoData>()
                todoList.addAll(mList)

                val myIntent = Intent(mContext, DetailTodoActivity::class.java)
                myIntent.putExtra("TodoList", item).putExtra("List", todoList)
                mContext.startActivity(myIntent)
            }
        }
    }

}