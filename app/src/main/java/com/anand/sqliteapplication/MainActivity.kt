package com.anand.sqliteapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anand.sqliteapplication.db.*
import com.anand.sqliteapplication.db.dao.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recordingDao = DBCreator().getAppDatabase(applicationContext).TBUserInfoDao()
        btSubmit.setOnClickListener {

            doAsync {
                val recording = TBUserInfo(edtID.text.toString().toInt(), edtName.text.toString())
                recordingDao.insert(recording)

            }

            this.startActivity(Intent(this,ShowDBList::class.java))

        }

        bt_ShowList.setOnClickListener {
            this.startActivity(Intent(this,ShowDBList::class.java))
        }
    }
}
