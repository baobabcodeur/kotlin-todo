package com.example.todolist
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class User(
    @PrimaryKey(autoGenerate = false)
    val  id: String,
    val nom: String,
    val prenoms: String,
    val email: String,
    val motDePasse: String
)


