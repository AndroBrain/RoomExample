package com.androbrain.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: UserEntity)

    @Update
    suspend fun update(user: UserEntity)

    @Delete
    suspend fun delete(user: UserEntity)

    @Query("SELECT * FROM users WHERE name LIKE :name")
    suspend fun getAllWhereName(name: String): List<UserEntity>

    @Query("SELECT * FROM users")
    fun getAll(): Flow<List<UserEntity>>
}
