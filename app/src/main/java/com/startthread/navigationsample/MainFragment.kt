package com.startthread.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        getView()?.findViewById<Button>(R.id.button)?.setOnClickListener {
            Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment
            ).navigate(
                R.id.action_to_dynamic_feature_activity
            )
        }

        getView()?.findViewById<Button>(R.id.include_button)?.setOnClickListener {
            Navigation.findNavController(
                requireActivity(),
                R.id.nav_host_fragment
            ).navigate(
                R.id.action_to_include_dynamic_feature_activity
            )
        }
    }
}
