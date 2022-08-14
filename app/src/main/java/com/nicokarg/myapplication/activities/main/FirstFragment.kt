package com.nicokarg.myapplication.activities.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nicokarg.myapplication.R
import com.nicokarg.myapplication.activities.about.AboutMeActivity
import com.nicokarg.myapplication.activities.quiz.QuizActivity
import com.nicokarg.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    val logTag = "FirstFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            firstMatCardQuick.setOnClickListener {
                Log.d(logTag, "Quick Button clicked")
                val intent = Intent(requireContext(), QuizActivity::class.java)
                startActivity(intent)
            }
            firstMatCardRun.setOnClickListener {
                Log.d(logTag, "Run Button clicked")
                val intent = Intent(requireContext(), QuizActivity::class.java)
                startActivity(intent)
            }
            firstMatCardStats.setOnClickListener {
                findNavController().navigate(R.id.action_FirstFragment_to_StatsFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}