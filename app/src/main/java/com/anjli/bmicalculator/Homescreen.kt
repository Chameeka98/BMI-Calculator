package com.anjli.bmicalculator

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Homescreen : AppCompatActivity() {
    private lateinit var calbmi:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)
        calbmi=findViewById(R.id.button)
        calbmi.setOnClickListener(View.OnClickListener {
            var i=Intent(this,Calculator::class.java)
            startActivity(i)
        })
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)
        constraintLayout.id = View.generateViewId()
        val animationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration (2500)
        animationDrawable.setExitFadeDuration (2500)
        animationDrawable.start()
    }
}