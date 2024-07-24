package com.android.dependencyinjection

import android.nfc.Tag
import android.util.Log

class UserRepository {

    fun saveUser(email:String, password:String){
        Log.d("tag", "User save in db")
    }
}