package com.anand.sqliteapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anand.sqliteapplication.db.TBUserInfo
import com.anand.sqliteapplication.db.dao.TBUserInfoDao

@Database(entities = [TBUserInfo::class], version = 1)
//@TypeConverters(StudentTypeConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun TBUserInfoDao(): TBUserInfoDao

}