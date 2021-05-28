package myprofle.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class me4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me4)

        var btn6=findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            var intent5= Intent(baseContext,me3::class.java)
            startActivity(intent5)
        }
        var btn7=findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {
            var intent6= Intent(baseContext,me5::class.java)
            startActivity(intent6)
        }
    }
}