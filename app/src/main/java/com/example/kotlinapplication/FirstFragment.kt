package com.example.kotlinapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBt1.setOnClickListener(View.OnClickListener {
            val num1 = binding.tvZero.text.toString().toIntOrNull()?:0
            val res: Int = num1 + 1
            binding.tvZero.text = res.toString()
        })

        binding.btnBt2.setOnClickListener(View.OnClickListener {
            val num2 = binding.tvZero.text.toString().toIntOrNull()?:0
            val res: Int = num2 - 1
            binding.tvZero.text = res.toString()
        })
    }

}