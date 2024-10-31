package com.example.navigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentABinding

class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater, container, false)

        val bundle = Bundle()
        bundle.putString("message", "Hello from fragment A")
        binding.buttonA.setOnClickListener {
            val controller =
                activity?.let { Navigation.findNavController(it, R.id.fragmentContainerView) }
            controller?.navigate(R.id.action_AFragment_to_BFragment, bundle)
        }
        return binding.root

    }


}