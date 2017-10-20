package com.soyeon.week1_hw

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    var getText : TextView?= null
    var setText : String ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        setText = getIntent().getStringExtra("firstData") //String을 받아오고

        getText = findViewById(R.id.main2_get_text) as TextView


        getText!!.text = setText

    }
}
