package com.example.internet.calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view: View){
        val buSelected=view as Button
        var buClick:String=editText.text.toString()
        when(buSelected.id){
            buZero.id->{
                buClick+="0"
            }
            buOne.id->{
                buClick+="1"
            }
            buTwo.id->{
                buClick+="2"
            }
            buThr.id->{
                buClick+="3"
            }
            buFor.id->{
                buClick+="4"
            }
            buFiv.id->{
                buClick+="5"
            }
            buSix.id->{
                buClick+="6"
            }
            buSev.id->{
                buClick+="7"
            }
            buEit.id->{
                buClick+="8"
            }
            buNin.id->{
                buClick+="9"
            }
            buDot.id->{
                buClick+="."
            }
            buSign.id->{
                buClick="-"+buClick
            }
        }
        editText.setText(buClick)
    }
}
