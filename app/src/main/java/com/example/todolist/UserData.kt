package com.example.todolist

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [User::class], version = 1)
abstract class UserData: RoomDatabase(){

    abstract val dao: UserDao
}
