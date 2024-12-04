package com.example.ejemplonavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SegundoFragmento : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_segundo_fragmento, container, false)

        val btn3 = root.findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener{
            findNavController().navigate(R.id.action_segundoFragmento_to_cuartoFragmento)
        }

        return root
    }
}