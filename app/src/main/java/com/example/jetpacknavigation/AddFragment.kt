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

            val name =binding.nameEditText.text.toString()
            val description=binding.descriptionEditText.text.toString()
            val rating = Integer.parseInt(binding.ratingEditText.text.toString());
            view.findNavController()
                .navigate(AddFragmentDirections.actionAddFragmentToDetailsFragment(name,description,rating))
        }
        return binding.root
    }
}