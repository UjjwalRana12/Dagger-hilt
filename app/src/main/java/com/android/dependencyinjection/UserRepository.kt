package com.android.dependencyinjection

import android.nfc.Tag
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email:String, password:String){
        Log.d("tag", "User save in db")
    }
}