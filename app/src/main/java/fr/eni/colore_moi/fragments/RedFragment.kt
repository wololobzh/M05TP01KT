package fr.eni.colore_moi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import fr.eni.colore_moi.R
import fr.eni.colore_moi.databinding.FragmentGreenBinding
import fr.eni.colore_moi.databinding.FragmentRedBinding

class RedFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {
        val binding = DataBindingUtil.inflate<FragmentRedBinding>(inflater, R.layout.fragment_red, container, false)

        binding.btnValider.setOnClickListener{
            if(((binding.etMot.text.toString() + binding.etNom.text.toString()).hashCode())>0)
            {
                Navigation.findNavController(it).navigate((R.id.action_redFragment_to_orangeFragment))
            }else{
                Navigation.findNavController(it).navigate((R.id.action_redFragment_to_blueFragment))
            }
        }

        return binding.root
    }
}