package myprofle.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class me5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me5)

        var btn9=findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener {
            var intent7= Intent(baseContext,MainActivity::class.java)
            startActivity(intent7)
        }
        var btn8=findViewById<Button>(R.id.BTN8)
        btn8.setOnClickListener {
            var intent8= Intent(baseContext,me4::class.java)
            startActivity(intent8)
        }
    }
}