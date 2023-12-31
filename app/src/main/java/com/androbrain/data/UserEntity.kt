package com.androbrain.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("surname") val surname: String,
)
