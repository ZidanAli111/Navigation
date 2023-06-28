package com.example.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.jetpacknavigation.databinding.FragmentAddBinding


class AddFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentAddBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add, container, false)

        binding.submitBtn.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(AddFragmentDirections.actionAddFragmentToDetailsFragment())
        }
        return binding.root
    }
}