package com.example.a0829applepi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a0829applepi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val recyclerAdapter = RecyclerAdapter()
        binding.recyclerMainNumberList.adapter = recyclerAdapter
        recyclerAdapter.apply {
            list.add(1)
            list.add(2)
            list.add(3)
        }

    }
}