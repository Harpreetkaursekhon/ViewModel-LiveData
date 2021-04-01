package com.myapp.socialmedia.myapp.viewmodel_livedata.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.myapp.socialmedia.myapp.viewmodel_livedata.model.User
import com.myapp.socialmedia.myapp.viewmodel_livedata.repository.userRepository

class UserViewModel:ViewModel() {
    val userLiveData:MutableLiveData<List<User>> = MutableLiveData()

    fun getUserData (){
        val response= userRepository.setUserData()
        userLiveData.value= response
    }
}