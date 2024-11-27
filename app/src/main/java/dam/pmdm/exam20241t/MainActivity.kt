package dam.pmdm.exam20241t

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import dam.pmdm.exam20241t.adaptadores.ViewPagerAdapter

const val NPESTAÑAS=2

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        viewPager = findViewById(R.id.viewpager)
        val adapta = ViewPagerAdapter(this, NPESTAÑAS)
        viewPager.adapter = adapta
        //TODO enlazar toblayout





        //fin enlazar tablelayout

    }

    //asociamos menú a la actividad
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    //oyentes del menú
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_fav -> {
            true
        }

        R.id.action_preferences -> {
            startActivity(Intent(this, PreferenciasActivity::class.java))
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}


