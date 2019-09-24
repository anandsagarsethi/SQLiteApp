package com.anand.sqliteapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.Constraints.TAG
import com.anand.sqliteapplication.db.DBCreator
import com.anand.sqliteapplication.db.TBUserInfo
import com.anand.sqliteapplication.db.dao.TBUserInfoDao
import org.jetbrains.anko.doAsync

class ShowDBList : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_dblist)
        val TBUserInfoDao = DBCreator().getAppDatabase(applicationContext).TBUserInfoDao()
        doAsync {
            try {
                val data = TBUserInfoDao.getAll()
                if (!data.isNullOrEmpty()) {
                    Log.e(TAG, data.toString())
                    }
                 }
            catch (e: Exception) {
                Log.e(TAG, e.message.toString())

            }
        }
    }
}