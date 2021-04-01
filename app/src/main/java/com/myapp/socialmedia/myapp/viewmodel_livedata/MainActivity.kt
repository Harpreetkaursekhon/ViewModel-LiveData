package com.myapp.socialmedia.myapp.viewmodel_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.myapp.socialmedia.myapp.viewmodel_livedata.adapter.UserAdapter
import com.myapp.socialmedia.myapp.viewmodel_livedata.model.User
import com.myapp.socialmedia.myapp.viewmodel_livedata.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userAdapter: UserAdapter
    private lateinit var userViewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

        userViewModel.getUserData()
        userViewModel.userLiveData.observe(this, Observer {
            userAdapter.setData(it as ArrayList<User>)
        })
    }

    private fun initRecyclerView(){
        recyclerView= findViewById(R.id.recycler_view)
        userAdapter= UserAdapter(this, ArrayList())
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=userAdapter
        }

    }
}