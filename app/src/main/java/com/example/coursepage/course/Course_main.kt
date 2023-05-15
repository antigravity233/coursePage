package com.example.coursepage.course

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.coursepage.R
import com.example.coursepage.databinding.CourseMainBinding

/**
 * A simple [Fragment] subclass.
 * Use the [Course_main.newInstance] factory method to
 * create an instance of this fragment.
 */
class Course_main : Fragment() {

    private var binding: CourseMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<CourseMainBinding>(
            inflater,
            R.layout.course_main, container, false
        )

        binding.courseArrow1.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_1)
        }
        binding.courseArrow2.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_2)
        }
        binding.courseArrow3.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_3)
        }
        binding.courseArrow4.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_4)
        }
        binding.courseArrow4.setOnClickListener {
                view : View -> view.findNavController().navigate(R.id.action_course_main_to_course_5)
        }

        return binding.root
    }
}