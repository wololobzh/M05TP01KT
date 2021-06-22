package fr.eni.colore_moi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fr.eni.colore_moi.R
import fr.eni.colore_moi.databinding.FragmentBlueBinding
import fr.eni.colore_moi.databinding.FragmentPrincipalBinding

class BlueFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?  ): View? {
        val binding = DataBindingUtil.inflate<FragmentBlueBinding>(inflater, R.layout.fragment_blue, container, false)
        return binding.root
    }
}