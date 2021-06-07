package mx.tecnm.nlaredo.pruebaexamenu2

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        val miBoton: Button = findViewById(R.id.btnIr)
        miBoton.setOnClickListener(){
            val ir = Intent(this, activity2::class.java)
            this.startActivity(ir)
        }

        val miSalida:Button = findViewById(R.id.btnSalir)
        miSalida.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Cerrando la aplicación!")
            builder.setMessage("Estás seguro de cerrar la aplicación?")
            builder.setPositiveButton("Si",{ dialogInterface: DialogInterface, i: Int ->
                finish()
            })
            builder.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int -> })
            builder.show()
        }




        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Contacto: migangel5091@hotmail.com", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(applicationContext, "Miguel Ángel Méndez Cruz", Toast.LENGTH_LONG).show()
                true
            }
            R.id.numero_control ->{
                Toast.makeText(applicationContext, "17100254", Toast.LENGTH_LONG).show()
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}



