package com.example.tutorly.database

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Database {
    var database : FirebaseDatabase = FirebaseDatabase.getInstance()

    fun addUser (user: User) {
        var users = database.getReference("users")
        users.child(user.getUserID()!!).setValue(user)
    }


}