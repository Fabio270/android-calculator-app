package com.fabioseyiji.android_calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fabioseyiji.android_calculator_app.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.expressionTv

        binding.zeroCmBt.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        binding.oneCmBt.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }

        binding.twoCmBt.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }

        binding.threeCmBt.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        binding.fourCmBt.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }

        binding.fiveCmBt.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }

        binding.sixCmBt.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }

        binding.sevenCmBt.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }

        binding.eightCmBt.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }

        binding.nineCmBt.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }

        binding.openParenthesisCmBt.setOnClickListener {
            calculo.text = "${calculo.text}("
        }

        binding.closeParenthesisCmBt.setOnClickListener {
            calculo.text = "${calculo.text})"
        }

        binding.divideCmBt.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }

        binding.timesCmBt.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }

        binding.sumCmBt.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        binding.minusCmBt.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }

        binding.dotCmBt.setOnClickListener {
            calculo.text = "${calculo.text}."
        }

        binding.eraseCmBt.setOnClickListener {
            calculo.text = "${calculo.text.dropLast(1)}"
        }

        binding.ceCmBt.setOnClickListener {
            calculo.text = ""
            binding.resultTv.text = ""
        }

        binding.equalsCmBt.setOnClickListener {
            val finalResult = Expression(calculo.text.toString()).calculate()

            if(finalResult.isNaN()){
                binding.resultTv.text = "Expressão Inválida!"
            } else {
                binding.resultTv.text = finalResult.toString()
            }
        }
    }
}