package com.nicokarg.myapplication.activities.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nicokarg.myapplication.databinding.FragmentStatsBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class StatsFragment : Fragment() {

    private var _binding: FragmentStatsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentStatsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}