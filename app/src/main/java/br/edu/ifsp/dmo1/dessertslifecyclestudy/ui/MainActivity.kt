package br.edu.ifsp.dmo1.dessertslifecyclestudy.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.dmo1.dessertslifecyclestudy.data.Datasource
import br.edu.ifsp.dmo1.dessertslifecyclestudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnItemClickListener {
    private val TAG = "DessertsLifecycle"
    private lateinit var binding: ActivityMainBinding
    private var units: Int = 0;
    private var amount: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Caso exista uma instância de estado salva, recupera-se
         * os dados que foram gravados quando
         */
        if (savedInstanceState != null) {
            units = savedInstanceState.getInt("units")
            amount = savedInstanceState.getInt("amount")
        }

        configList()
        updateUI()
        Log.d(TAG, "State == created")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "State == started (visible)")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "State == resumed (visible)")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "State == paused (partialy visible)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "State == stopped (hidden)")
    }

    /**
     * Método é chamado antes que a Activity seja destruída, então é utilizado
     * para salvar o estado de uma Activity para que seja restaurado posteriormente.
     *
     * Método é chamado quando existe processo que destroi a Activity como em rotação
     * da tela, mudança de idioma ou mesmo para liberação de memória do dispositivo.
     *
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "Save Instance")
        outState.putInt("units", units)
        outState.putInt("amount", amount)
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