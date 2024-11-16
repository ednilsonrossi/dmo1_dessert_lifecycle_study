package br.edu.ifsp.dmo1.dessertslifecyclestudy.ui

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import br.edu.ifsp.dmo1.dessertslifecyclestudy.R
import br.edu.ifsp.dmo1.dessertslifecyclestudy.data.model.Dessert
import br.edu.ifsp.dmo1.dessertslifecyclestudy.databinding.ItemDessertListBinding
import java.text.NumberFormat

class DessertListAdapter(context: Context, array: List<Dessert>) :
    ArrayAdapter<Dessert>(context, R.layout.item_dessert_list, array) {

    @SuppressLint("UseCompatLoadingForDrawables", "SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: ItemDessertListBinding
        if (convertView == null) {
            binding = ItemDessertListBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false)

            binding.root.tag = binding

        } else {
            binding = convertView.tag as ItemDessertListBinding
        }

        val dessert = getItem(position)
        if (dessert != null) {
            binding.imageDessert.setImageDrawable(context.getDrawable(dessert.imageId))
            binding.textDessertPrice.text = "$ ${dessert.price}"
        } else {
            binding.imageDessert.setImageDrawable(context.getDrawable(R.drawable.nofood))
            binding.textDessertPrice.text = "$ 000"
        }

        return binding.root
    }
}