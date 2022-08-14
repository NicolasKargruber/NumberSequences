package com.nicokarg.myapplication.activities.quiz

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import com.nicokarg.myapplication.R
import com.nicokarg.myapplication.databinding.FragmentQuizPageBinding
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class QuizPageFragment : Fragment() {

    private var _binding: FragmentQuizPageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    val logTag = "QuizPageFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuizPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().addMenuProvider(menuProvider, viewLifecycleOwner, Lifecycle.State.RESUMED) // adds hint and bookmark icon to app bar
        binding.quizPageInclude.apply {
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private val menuProvider = object : MenuProvider {
        override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
            // Add menu items here
            menuInflater.inflate(R.menu.top_app_bar_menu_quiz, menu)
        }

        override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
            // Handle the menu selection
            return when (menuItem.itemId) {
                R.id.action_hint -> {
                    Log.d(logTag, "Menu icon hint clicked")
                    true
                }
                R.id.action_bookmark -> {
                    Log.d(logTag, "Menu icon bookmark clicked")
                    menuItem.icon = bookmarkIcon[false]
                    true
                }
                else -> false
            }
        }
    }

    val bookmarkIcon get() =  mapOf(
        true to ContextCompat.getDrawable(requireContext(),R.drawable.ic_round_bookmark_added_24),
        false to ContextCompat.getDrawable(requireContext(),R.drawable.ic_round_bookmark_border_24)
    )
}