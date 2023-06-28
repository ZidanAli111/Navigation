package com.example.jetpacknavigation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.jetpacknavigation.databinding.FragmentSuccessBinding

class SuccessFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSuccessBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_success, container, false)

        binding.homeBtn.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(SuccessFragmentDirections.actionSuccessFragmentToHomeFragment())

        }
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.share, menu)
        if (null == getSharedIntent().resolveActivity(requireActivity().packageManager)) {
            menu?.findItem(R.id.share)?.isVisible ?: false
        }
    }


    private fun getSharedIntent(): Intent {
        val args = SuccessFragmentArgs.fromBundle(requireArguments())
        val sharedText = "${args.name}, ${args.description}, ${args.rating}"
        return ShareCompat.IntentBuilder.from(requireActivity())
            .setText(sharedText)
            .setType("text/plain")
            .intent
    }


    private fun shareSuccess() {
        startActivity(getSharedIntent())
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.share -> shareSuccess()
        }
        return super.onOptionsItemSelected(item)
    }

}

