package com.nicokarg.myapplication.activities.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nicokarg.myapplication.R
import com.nicokarg.myapplication.databinding.FragmentFirstBinding
import com.nicokarg.myapplication.databinding.FragmentResultPageBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ResultPageFragment : Fragment() {

    private var _binding: FragmentResultPageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultPageBinding.inflate(inflater, container, false)
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