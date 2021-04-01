package com.myapp.socialmedia.myapp.viewmodel_livedata.repository

import com.myapp.socialmedia.myapp.viewmodel_livedata.model.User

class userRepository {

    companion object{
       fun setUserData():List<User>{
       val names =  ArrayList<User>()
           names.add(User("Name1"))
           names.add(User("Name2"))
           names.add(User("Name3"))
           names.add(User("Name4"))
           names.add(User("Name5"))
           names.add(User("Name6"))
           names.add(User("Name7"))
           names.add(User("Name8"))
           names.add(User("Name9"))
           names.add(User("Name0"))
           return names
       }
    }
}