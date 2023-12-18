package com.example.quizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizgame.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding
    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val category = intent.getStringExtra("CATEGORY")
        displayQuestion(category)

        binding.btnSubmit.setOnClickListener {
            if (binding.btnSubmit.text == "Play Again") {
                playAgain()
            } else {
                submitAnswer()
            }
        }
    }

    private fun displayQuestion(category: String?) {

        val questions = when (category) {
            "GK" -> QuestionsData().GkQuestions
            "CS" -> QuestionsData().CSQuestions
            "Programming" -> QuestionsData().ProgrammingQuestions
            else -> emptyList()
        }

        if (questions.isNotEmpty()) {

            val currentQuestion = questions[currentQuestionIndex].options
            binding.tvQuestion.text = questions[currentQuestionIndex].question
            binding.rb1.text = currentQuestion[0]
            binding.rb2.text = currentQuestion[1]
            binding.rb3.text = currentQuestion[2]
            binding.rb4.text = currentQuestion[3]

            binding.rgMain.clearCheck()
            binding.tvFeedback.text = ""
        }else{
            binding.tvQuestion.text = "No Questions available for this category."
            binding.btnSubmit.isEnabled = false
        }
    }

    private fun submitAnswer() {

        val selectedOption = binding.rgMain.checkedRadioButtonId

        if (selectedOption == -1) {
            binding.tvFeedback.text = "Please select an option."
            return
        }

        val selectedOptionIndex = binding.rgMain.indexOfChild(findViewById(selectedOption))
        val correctAnswer = QuestionsData().GkQuestions[currentQuestionIndex].correctAnswerIndex

        if (selectedOptionIndex == correctAnswer) {
            binding.tvFeedback.text = "Correct!"
            score++
        } else {
            binding.tvFeedback.text =
                "Incorrect. Correct Answer is: ${QuestionsData().GkQuestions[currentQuestionIndex].options[correctAnswer]}"
        }

        if (currentQuestionIndex == QuestionsData().GkQuestions.lastIndex) {
            binding.tvFeedback.text =
                "Quiz Completed! Your score is $score out of ${QuestionsData().GkQuestions.size}"
            binding.btnSubmit.text = "Play Again"
        } else {
            currentQuestionIndex++
            displayQuestion(intent.getStringExtra("CATEGORY"))
        }
    }

    private fun playAgain() {
        //displayQuestion(intent.getStringExtra("CATEGORY"))
        currentQuestionIndex = 0
        score = 0
        binding.btnSubmit.text = "Submit"

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}