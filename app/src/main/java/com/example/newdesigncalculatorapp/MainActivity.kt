package com.example.newdesigncalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.method.ScrollingMovementMethod
import android.util.Log
import com.example.newdesigncalculatorapp.databinding.ActivityMainBinding
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.ScriptException

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.inputText.movementMethod = ScrollingMovementMethod()
        binding.inputText.isActivated
        binding.inputText.isPressed

        var text: String

        binding.btn0.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "0"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"0"
                expressionText(text)
                resultText()
            }
        }
        binding.btn1.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "1"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"1"
                expressionText(text)
                resultText()
            }
        }
        binding.btn2.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "2"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"2"
                expressionText(text)
                resultText()
            }
        }
        binding.btn3.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "3"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"3"
                expressionText(text)
                resultText()
            }
        }
        binding.btn4.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "4"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"4"
                expressionText(text)
                resultText()
            }
        }
        binding.btn5.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "5"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"5"
                expressionText(text)
                resultText()
            }
        }
        binding.btn6.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "6"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"6"
                expressionText(text)
                resultText()
            }
        }
        binding.btn7.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "7"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"7"
                expressionText(text)
                resultText()
            }
        }
        binding.btn8.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "8"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"8"
                expressionText(text)
                resultText()
            }
        }
        binding.btn9.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "9"
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"9"
                expressionText(text)
                resultText()
            }
        }
        binding.btnDot.setOnClickListener {
            if(binding.inputText.toString().startsWith("0")){
                text = binding.inputText.text.toString().replace("0", "") + "."
                expressionText(text)
                resultText()
            }
            else{
                text = binding.inputText.text.toString()+"."
                expressionText(text)
                resultText()
            }
        }

        binding.btnPlus.setOnClickListener {
            if(binding.inputText.text.toString().endsWith("%") || binding.inputText.text.toString().endsWith("÷")
                || binding.inputText.text.toString().endsWith("×") || binding.inputText.text.toString().endsWith("+")
                || binding.inputText.text.toString().endsWith("-") || binding.inputText.text.toString().endsWith(".")){
                text = binding.inputText.text.toString()
                expressionText(text)
            }
            else{
                text = binding.inputText.text.toString()+ "+"
                expressionText(text)
            }
        }
        binding.btnMinus.setOnClickListener {
            if(binding.inputText.text.toString().endsWith("%") || binding.inputText.text.toString().endsWith("÷")
                || binding.inputText.text.toString().endsWith("×") || binding.inputText.text.toString().endsWith("+")
                || binding.inputText.text.toString().endsWith("-") || binding.inputText.text.toString().endsWith(".")){
                text = binding.inputText.text.toString()
                expressionText(text)
            }
            else{
                text = binding.inputText.text.toString()+ "-"
                expressionText(text)
            }
        }
        binding.btnMultiply.setOnClickListener {
            if(binding.inputText.text.toString().endsWith("%") || binding.inputText.text.toString().endsWith("÷")
                || binding.inputText.text.toString().endsWith("×") || binding.inputText.text.toString().endsWith("+")
                || binding.inputText.text.toString().endsWith("-") || binding.inputText.text.toString().endsWith(".")){
                text = binding.inputText.text.toString()
                expressionText(text)
            }
            else{
                text = binding.inputText.text.toString()+ "×"
                expressionText(text)
            }
        }
        binding.btnDivision.setOnClickListener {
            if(binding.inputText.text.toString().endsWith("%") || binding.inputText.text.toString().endsWith("÷")
                || binding.inputText.text.toString().endsWith("×") || binding.inputText.text.toString().endsWith("+")
                || binding.inputText.text.toString().endsWith("-") || binding.inputText.text.toString().endsWith(".")){
                text = binding.inputText.text.toString()
                expressionText(text)
            }
            else{
                text = binding.inputText.text.toString()+ "+"
                expressionText(text)
            }
        }
        binding.btnEqual.setOnClickListener {

        }
        binding.btnC.setOnClickListener {
            expressionText("")
            resultText()
        }
        binding.btnBackspace.setOnClickListener {
            if (binding.inputText.text.toString().isNotEmpty()) {
                val lastIndex = binding.inputText.text.toString().lastIndex
                text = binding.inputText.text.toString().substring(0, lastIndex)
                expressionText(text)
                resultText()
            }
        }
        binding.btnPercentage.setOnClickListener {
            if(binding.inputText.text.toString().endsWith("%") || binding.inputText.text.toString().endsWith("÷")
                || binding.inputText.text.toString().endsWith("×") || binding.inputText.text.toString().endsWith("+")
                || binding.inputText.text.toString().endsWith("-") || binding.inputText.text.toString().endsWith(".")){
                text = binding.inputText.text.toString()
                expressionText(text)
            }
            else{
                text = binding.inputText.text.toString()+ "%"
                expressionText(text)
            }
        }

    }
    private fun expressionText(text: String) {
        binding.inputText.setText(text)
    }

    private fun resultText() {

        val exp = binding.inputText.text.toString()
        val engine: ScriptEngine = ScriptEngineManager().getEngineByName("rhino")
        try {
            val result = engine.eval(exp)

            if (result.toString().endsWith(".0")) {
                binding.resultText.setText(result.toString().replace(".0", ""))
            } else {
                binding.resultText.setText("$result")
            }
        } catch (e: ScriptException) {
            binding.inputText.setText(binding.inputText.text.toString())
            binding.resultText.setText(binding.inputText.text.toString())
        }
    }
}

