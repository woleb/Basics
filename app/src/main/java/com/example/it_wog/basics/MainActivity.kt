package com.example.it_wog.basics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var zahl1 = 5
        var zahl2 = 5.5
        var sum = zahl1 * zahl2

        var wahr : Boolean = true
        var long : Long = 23L
        var text : String = "ABC"
        var float : Float = 4.4f

        var textName = "Helmut ist "
        var alter = 34
        var textEnd = " Jahre alt"

        //textfeld.setText(textName + alter + textEnd)
        //textfeld.setText("$textName $alter $textEnd") //besser so in Kotlin
        textfeld.setText("Das Alter ist $alter. In einem Jahr ist das Alter ${alter + 1}")

        //textfeld.setText("Summe" + sum)
    }



}
