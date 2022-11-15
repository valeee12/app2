package cl.yhf.app2vale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtEnviado = findViewById<EditText>(R.id.txtEnvio)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val intent = Intent ( this,Ventana2::class.java)
            intent.putExtra("nombre",txtEnviado.text.toString())

            startActivity(intent)

        }

    }
}

