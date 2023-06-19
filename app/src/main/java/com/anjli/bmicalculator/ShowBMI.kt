package com.anjli.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ShowBMI : AppCompatActivity()

{
    private lateinit var showbmi:TextView
    private lateinit var showtype:TextView
    private lateinit var showdesc:TextView
    private lateinit var bmi:String
    private lateinit var type:String
    private lateinit var desc:String
    private lateinit var image:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_bmi)
        bmi= intent.getStringExtra("tot").toString()
        type= intent.getStringExtra("type").toString()
        desc= intent.getStringExtra("desc").toString()
        showbmi=findViewById(R.id.textView5)
        showtype=findViewById(R.id.textView7)
        showdesc=findViewById(R.id.textView6)
        image=findViewById(R.id.imageView)
       showbmi.setText(bmi)
       showtype.setText(type)
        showdesc.setText(desc)
        if (type=="Underweight!"){
            image.setImageResource(R.drawable.underweight)
        }
    }
}