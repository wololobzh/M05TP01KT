package fr.eni.colore_moi.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import fr.eni.colore_moi.R
import fr.eni.colore_moi.databinding.FragmentPrincipalBinding


class PrincipalFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {
        val binding = DataBindingUtil.inflate<FragmentPrincipalBinding>(inflater, R.layout.fragment_principal, container, false)

        binding.btnValider.setOnClickListener {

            Log.i("ACOS","INFO binding.etPrenom.text.toString() : " + binding.etPrenom.text.toString())

            if((binding.etPrenom.text.toString().hashCode() / 1000000)>665)
            {
                Navigation.findNavController(it).navigate(R.id.action_principalFragment_to_redFragment)
            }else{
                Navigation.findNavController(it).navigate(R.id.action_principalFragment_to_pinkFragment)
            }
        }

       return binding.root
    }

}