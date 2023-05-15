package com.example.coursepage.puzzle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.coursepage.R
import com.example.coursepage.databinding.PuzzleMainBinding

/**
 * A simple [Fragment] subclass.
 * Use the [Puzzle_main.newInstance] factory method to
 * create an instance of this fragment.
 */
class Puzzle_main : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<PuzzleMainBinding>(
            inflater,
            R.layout.puzzle_main, container, false
        )

        binding.easyPuzzleArrow.setOnClickListener{
                view : View -> view.findNavController().navigate(R.id.action_puzzle_main_to_easy_puzzle)
        }
        binding.normalPuzzleArrow.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_puzzle_main_to_normal_puzzle)
        }
        binding.hardPuzzleArrow.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_puzzle_main_to_hard_puzzle)
        }
        return binding.root
    }

}