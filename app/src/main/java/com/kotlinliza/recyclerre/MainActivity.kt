package com.kotlinliza.recyclerre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rv:RecyclerView
    private lateinit var adapter: Adapter
    private lateinit var mylist:List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv=findViewById(R.id.rev)
        mylist= listOf("nam","cat","fred","liz","phiona","joan","get")
        adapter = Adapter(this, mylist)
        rv.adapter=adapter
        rv.layoutManager=LinearLayoutManager(this)
    }
}