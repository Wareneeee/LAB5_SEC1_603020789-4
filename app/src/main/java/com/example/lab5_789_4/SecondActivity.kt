package com.example.lab5_789_4

import kotlinx.android.synthetic.main.activity_second.*
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data : Bundle? = intent.extras
        var newStudent : Student? = data?.getParcelable<Student>("stdData")
        idText.text = "Student ID : ${newStudent?.id}"
        nameText.text = "Student Name : ${newStudent?.name}"
        ageText.text = "Student  Age: ${newStudent?.age}"

    }
    fun onClickClose(view: View){
        finish()
    }
}
