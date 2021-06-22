package fr.eni.colore_moi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import fr.eni.colore_moi.R
import fr.eni.colore_moi.databinding.FragmentPinkBinding
import fr.eni.colore_moi.databinding.FragmentRedBinding

class PinkFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {
        val binding = DataBindingUtil.inflate<FragmentPinkBinding>(inflater, R.layout.fragment_pink, container, false)

        binding.btnValider.setOnClickListener{
            if (((binding.etNom.text.toString().hashCode() - binding.etAnnee.text.toString().toInt())) > 0 ) {
                Navigation.findNavController(it).navigate((R.id.action_pinkFragment_to_yellowFragment))
            }else{
                Navigation.findNavController(it).navigate((R.id.action_pinkFragment_to_greenFragment))
            }
        }

        return binding.root
    }
}