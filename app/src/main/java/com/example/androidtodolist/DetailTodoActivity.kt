package com.example.androidtodolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.todolistpractice_20220511.models.TodoData
import kotlinx.android.synthetic.main.activity_detail_todo.*
import kotlinx.android.synthetic.main.todo_list_item.*

class DetailTodoActivity : AppCompatActivity() {
    lateinit var  todoData : TodoData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_todo)
        setupEvents()
        setValues()
    }
    fun setupEvents() {

    }

    fun setValues() {
        todoData = intent.getSerializableExtra("TodoData") as TodoData

        titleTxt.text = todoData.todoTitle
        placeTxt.text = todoData.place
        ratingBar.rating = todoData.rating.toFloat()

    }

}