package com.pr7.kotlin_bottomsheet_dialog


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.pr7.kotlin_bottomsheet_dialog.R


class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var linearLayout1:LinearLayout
    lateinit var dialog: BottomSheetDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textview1)
        linearLayout1=findViewById(R.id.linearlay1)

        //dialog = BottomSheetDialog(this@MainActivity)
        dialog = BottomSheetDialog(this@MainActivity,R.style.bottomsheettheme)
       val view1: View = LayoutInflater.from(this@MainActivity).inflate(R.layout.layoutbottomsheet, linearLayout1, null == true)



        dialog.setContentView(view1)

        textView.setOnClickListener {
            dialog.show()
        }
    }
}