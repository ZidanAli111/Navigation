package com.example.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.jetpacknavigation.databinding.FragmentRetryBinding

class RetryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentRetryBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_retry, container, false)

        binding.retryBtn.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(RetryFragmentDirections.actionRetryFragmentToAddFragment())
        }
        return binding.root
    }

}