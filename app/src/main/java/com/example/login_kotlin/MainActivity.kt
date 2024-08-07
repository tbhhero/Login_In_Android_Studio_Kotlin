package com.example.login_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    private var username: EditText? = null
    private var password: EditText? = null
    private var loginbtn: Button? = null
    private var reset: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Initialize
        username = findViewById<EditText>(R.id.et1) as EditText
        password = findViewById<EditText>(R.id.et2) as EditText
        loginbtn = findViewById<Button>(R.id.btn1) as Button
        reset = findViewById<Button>(R.id.btn2) as Button

        reset!!.setOnClickListener {
            username!!.setText("")
            password!!.setText("")
        }

        loginbtn!!.setOnClickListener {

            val user =username!!.getText().toString()
            val pass =password!!.getText().toString()

            if (user=="dhiraj" && pass=="dhiraj"){
                Toast.makeText(this@MainActivity,"login successful",Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this@MainActivity, "Login unscuccesful", Toast.LENGTH_SHORT).show()
            }

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}