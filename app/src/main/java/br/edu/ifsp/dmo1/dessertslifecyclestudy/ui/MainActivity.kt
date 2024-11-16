package br.edu.ifsp.dmo1.dessertslifecyclestudy.ui

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.dmo1.dessertslifecyclestudy.R
import br.edu.ifsp.dmo1.dessertslifecyclestudy.data.Datasource
import br.edu.ifsp.dmo1.dessertslifecyclestudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnItemClickListener {
    private lateinit var binding: ActivityMainBinding
    private var units: Int = 0;
    private var amount: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configList()
        updateUI()
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val dessert = Datasource.dessertList[position]
        units += 1
        amount += dessert.price
        updateUI()
    }

    private fun configList() {
        binding.listDesserts.adapter = DessertListAdapter(this, Datasource.dessertList)
        binding.listDesserts.onItemClickListener = this
    }

    private fun updateUI() {
        binding.textUnitSolds.text = units.toString()
        binding.textTotalSold.text = "$ ${amount.toString()}"
    }
}