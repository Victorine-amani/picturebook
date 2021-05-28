package myprofle.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class me2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me2)
        var btn2=findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            var intent2=Intent(baseContext,MainActivity::class.java)
            startActivity(intent2)
        }
        var btn3=findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            var intent3=Intent(baseContext,me3::class.java)
startActivity(intent3)
        }
    }
}