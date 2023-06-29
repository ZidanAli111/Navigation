package com.example.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.jetpacknavigation.databinding.FragmentDetailsBinding
import com.example.jetpacknavigation.databinding.FragmentDeveloperBinding

class DeveloperFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDeveloperBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_developer, container, false)

        return binding.root
    }
}