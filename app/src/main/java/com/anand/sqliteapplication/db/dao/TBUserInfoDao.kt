package com.anand.sqliteapplication.db.dao

import androidx.room.*
import com.anand.sqliteapplication.db.TBUserInfo


@Dao
interface TBUserInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recording: TBUserInfo)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(recordingList: List<TBUserInfo>)

    @Query("SELECT * FROM TBUserInfo WHERE id = :id")
    fun get(id: Int): TBUserInfo?

    @Query("SELECT * FROM TBUserInfo ORDER BY id DESC")
    fun getAll(): List<TBUserInfo>?

    @Query("SELECT * FROM TBUserInfo ORDER BY id DESC LIMIT :limit OFFSET :offset")
    fun getAllByOffsetAndLimit(offset: Int, limit: Int): List<TBUserInfo>?

    @Delete
    fun delete(recording: TBUserInfo)
}