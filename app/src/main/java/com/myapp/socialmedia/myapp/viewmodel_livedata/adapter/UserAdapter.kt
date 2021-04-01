package com.myapp.socialmedia.myapp.viewmodel_livedata.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapp.socialmedia.myapp.viewmodel_livedata.R
import com.myapp.socialmedia.myapp.viewmodel_livedata.model.User

class UserAdapter(private var context: Context, private var userList: List<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val name:TextView=itemView.findViewById(R.id.name)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user= userList[position]
        holder.name.text= user.name
    }

    override fun getItemCount()=userList.size

    fun setData(userList: ArrayList<User>) {
        this.userList=userList
    }
}

