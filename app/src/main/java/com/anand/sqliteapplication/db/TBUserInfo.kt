package com.anand.sqliteapplication.db

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class TBUserInfo(
    @PrimaryKey
    @NonNull
    val id: Int,
    val name: String?
)