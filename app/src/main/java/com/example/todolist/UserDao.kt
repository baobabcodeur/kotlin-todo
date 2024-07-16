package com.example.todolist

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    //CRUD INSERT , CREATE, UPDATE, DELETE

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)
    @Query("SELECT * FROM user")
    suspend fun getAllUser() : Flow<List<User>>

    @Delete
    suspend fun deleteUser(user: User)

  /*  @Update
    suspend fun insertUser(user: User)

*/

}