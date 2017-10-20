package com.soyeon.week1_hw

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var nextButton : Button?= null
    var editText : EditText?= null
    var text : String ?= null // 넘겨줄 값
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.main_next) as Button //as가 형변환 해주는 것
        editText = findViewById(R.id.first_edit) as EditText

        nextButton!!.setOnClickListener { //버튼 null을 방지하고 이벤트를 호출
            text = editText!!.text.toString()
            val intent = Intent(applicationContext, Main3Activity::class.java)
            intent.putExtra("firstData", text)
            startActivity(intent) //applicatonContext생성자사용 하고 Main2Activity를 띄움
        }
    }
}
