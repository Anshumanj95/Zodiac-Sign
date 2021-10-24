package com.example.astrosign

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.astrosign.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    private var _binding:FragmentInputBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentInputBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            submit.setOnClickListener {
                if(date.text.isEmpty()||month.text.isEmpty())
                    Toast.makeText(activity,"please enter date of birth Thank you",Toast.LENGTH_SHORT).show()
                else {
                    val action = InputFragmentDirections.actionInputFragmentToResultFragment(
                        date.text.toString().toInt(), month.text.toString().toInt()
                    )
                    findNavController().navigate(action)
                }
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

}