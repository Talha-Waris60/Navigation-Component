package com.example.navigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentABinding
import com.example.navigationcomponent.databinding.FragmentBBinding


class BFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(inflater, container, false)
        val controller =
            activity?.let { Navigation.findNavController(it, R.id.fragmentContainerView) }
        binding.buttonB.setOnClickListener {
            controller?.navigate(R.id.action_BFragment_to_AFragment)
        }
        return binding.root
    }

}