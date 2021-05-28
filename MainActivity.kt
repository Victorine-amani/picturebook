package myprofle.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.btn1)
        btn.setOnClickListener {
            var intent=Intent(baseContext,me2::class.java)
            startActivity(intent)
        }
    }
}