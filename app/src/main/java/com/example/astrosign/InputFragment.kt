package com.example.astrosign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            val date=if(date.text.isNotEmpty())date.text.toString() else 0
            val month=if(month.text.isNotEmpty())month.text.toString() else 0
            submit.setOnClickListener {
                val action=InputFragmentDirections.actionInputFragmentToResultFragment(date.toString().toInt(),month.toString().toInt())
                findNavController().navigate(action)
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

}