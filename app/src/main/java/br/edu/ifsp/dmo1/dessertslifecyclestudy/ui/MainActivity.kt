package br.edu.ifsp.dmo1.dessertslifecyclestudy.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.dmo1.dessertslifecyclestudy.R
import br.edu.ifsp.dmo1.dessertslifecyclestudy.data.Datasource
import br.edu.ifsp.dmo1.dessertslifecyclestudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configList()
    }

    private fun configList() {
        binding.listDesserts.adapter = DessertListAdapter(this, Datasource.dessertList)
    }
}