package com.rohit.gpstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.rohit.gpstracker.adapter.RecyclerViewAdapter
import com.rohit.gpstracker.viewmodel.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewModel()
        initMainViewModel()
    }

    private fun initViewModel() {
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)

            val decoration  =  DividerItemDecoration(applicationContext, DividerItemDecoration.VERTICAL)
            addItemDecoration(decoration)
            recyclerViewAdapter = RecyclerViewAdapter()
            adapter =recyclerViewAdapter
        }
    }

    private fun initMainViewModel() {
        val viewModel  = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getAllRepositoryList().observe(this) {
            recyclerViewAdapter.setListData(it)
            recyclerViewAdapter.notifyDataSetChanged()
        }


        viewModel.makeApiCall("ny")
    }
}