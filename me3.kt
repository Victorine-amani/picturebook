package myprofle.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class me3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me3)
        var btn4=findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            var intent3= Intent(baseContext,me2::class.java)
            startActivity(intent3)
        }
        var btn5=findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {
            var intent4= Intent(baseContext,me4::class.java)
            startActivity(intent4)
        }
    }
}