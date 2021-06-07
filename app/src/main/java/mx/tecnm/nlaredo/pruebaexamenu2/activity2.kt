package mx.tecnm.nlaredo.pruebaexamenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // this.supportActionBar?.hide()
        setContentView(R.layout.activity_activity2)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = CustomAdapter()
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter


        var bundle = intent.extras
        var saludo = bundle?.getString("saludos")
        Toast.makeText(this,saludo,Toast.LENGTH_LONG)

    }
}