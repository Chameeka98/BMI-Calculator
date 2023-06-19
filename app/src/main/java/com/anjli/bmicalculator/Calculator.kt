package com.anjli.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Calculator : AppCompatActivity() {
    private lateinit var cal:Button
    private lateinit var height:EditText
    private lateinit var weight:EditText
    private lateinit var type:String
    private lateinit var desc:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        cal=findViewById(R.id.button3)
        height=findViewById(R.id.editTextNumber)
        weight=findViewById(R.id.editTextNumber2)
        cal.setOnClickListener(View.OnClickListener {
        var h=height.text.toString().toDouble()
            var w=weight.text.toString().toDouble()

            var total=w/(h*h)
            if(total<18.5){
                type="Underweight!"
                desc="You are underweight! Increase your weight."
            }
            else if (total<24.9){
                type="Normalweight"
                desc="You are healthy."
            }
            else if (total<29.9){
                type="Overweight!"
                desc="You are overweight! Decrease your weight."
            }
            else{
                type="Obesity!"
                desc="You weight too much! Decrease your weight."
            }


            var i=Intent(this,ShowBMI::class.java)
            i.putExtra("tot",total.toString())
            i.putExtra("type",type)
            i.putExtra("desc",desc)
            startActivity(i)

        })
    }
}