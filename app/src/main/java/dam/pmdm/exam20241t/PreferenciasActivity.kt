package dam.pmdm.exam20241t

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat


class PreferenciasActivity : AppCompatActivity() {
    private lateinit var nombre:EditText
    private lateinit var checkbox:CheckBox
    private lateinit var rg:RadioGroup
    private lateinit var rb:RadioButton
    private lateinit var switch:SwitchCompat
    private lateinit var spinner: Spinner
    private lateinit var guardar :Button
    private lateinit var restaurar :Button
    private lateinit var prefs:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencias)

        //bind
        nombre=findViewById(R.id.etNombre)
        checkbox=findViewById(R.id.checkbox)
        rg=findViewById(R.id.radioGroup1)
        rb=findViewById(R.id.radioButton2)
        switch=findViewById(R.id.Switch)
        spinner=findViewById(R.id.spinner)
        guardar=findViewById(R.id.pref_guardar)
        restaurar=findViewById(R.id.prefDefault)
        prefs = getSharedPreferences("Preferencias", MODE_PRIVATE)

        //adaptador spinner
        val adaptadorSpinner =ArrayAdapter.createFromResource(this, R.array.valoresSpinner, android.R.layout.simple_spinner_item)
        adaptadorSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptadorSpinner

        //Despuer del bindeo cargamos las opciones seleccionadas desde las preferencias
        cargarPreferencias()

        //el botón guarda las opciones elegidas en las preferencias
        guardar.setOnClickListener(View.OnClickListener {
            guardarPreferencias()
        })

        //el botón restaurar configura todos los componentes en sus valor por defecto
        restaurar.setOnClickListener(View.OnClickListener {
            defaultPreferencias()
        })
    }

    fun cargarPreferencias(){
        //TODO cargar todas las configuracines guardadas en preferencias. Los valores por defecto serán los mismo que en defaultPreferencias()

    }

    fun guardarPreferencias() {
        //TODO guardar las opciones elegidas en las preferencias. Ten en cuenta que según el componente habrá que guardar String, Int, Boolean...

    }

    fun defaultPreferencias(){

        //TODO El nombre por defecto será el tuyo
        nombre.setText("Alumno Desconocido")


        //default resto de componentes
        checkbox.isChecked=false
        rb=findViewById(R.id.radioButton1)
        rb.isChecked=true
        switch.isChecked=false
        spinner.setSelection(0)

    }
}