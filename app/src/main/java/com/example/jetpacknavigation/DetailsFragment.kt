package com.example.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.jetpacknavigation.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDetailsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)

        var args = DetailsFragmentArgs.fromBundle(requireArguments())

        binding.animeName.text = args.name
        binding.description.text = args.description
        binding.rating.text = args.rating.toString()


        binding.finishBtn.setOnClickListener { view: View ->
            val name=binding.animeName.text.toString()
            val description=binding.description.text.toString()
            val rating = Integer.parseInt(binding.rating.text.toString());

            if (rating <= 4) {
                view.findNavController()
                    .navigate(DetailsFragmentDirections.actionDetailsFragmentToRetryFragment())
            } else {
                view.findNavController()
                    .navigate(DetailsFragmentDirections.actionDetailsFragmentToSuccessFragment(name,description,rating))
            }
        }

        return binding.root
    }

}