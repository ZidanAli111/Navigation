package com.example.jetpacknavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.jetpacknavigation.databinding.FragmentSuccessBinding

class SuccessFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSuccessBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_success, container, false)

        return binding.root
    }

}