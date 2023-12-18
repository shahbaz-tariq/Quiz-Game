package com.example.quizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.quizgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnGKQuiz = binding.btnGKQuiz
        val btnCSQuiz = binding.btnCSQuiz
        val btnProgrammingQuiz = binding.btnProgrammingQuiz

        btnGKQuiz.setOnClickListener {
            startQuizActivity("GK")
        }

        btnCSQuiz.setOnClickListener {
            startQuizActivity("CS")
        }

        btnProgrammingQuiz.setOnClickListener {
            startQuizActivity("Programming")
        }

    }

    private fun startQuizActivity(category: String) {
        val intent = Intent(this, QuizActivity::class.java)
        intent.putExtra("CATEGORY", category)
        startActivity(intent)
    }
}