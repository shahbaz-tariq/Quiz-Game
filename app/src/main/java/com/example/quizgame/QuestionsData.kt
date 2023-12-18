package com.example.quizgame

class QuestionsData() {

    val GkQuestions = listOf<Question>(

        Question(
            "What is the capital of Australia?",
            listOf("Sydney", "Melbourne", "Canberra", "Perth"),
            2
        ),
        Question(
            "Which mountain range is the highest in the world?",
            listOf("The Himalayas", "The Andes", "The Rockies", "The Alps"),
            0
        ),
        Question(
            "Which is the largest ocean on Earth?",
            listOf("Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"),
            0
        ),
        Question(
            "Who painted the Mona Lisa?",
            listOf("Leonardo da Vinci", "Michelangelo", "Raphael", "Sandro Botticelli"),
            0
        ),
        Question(
            "Which year did the first moon landing take place?",
            listOf("1962", "1969", "1975", "1983"),
            1
        ),
        Question(
            "Which country is known as the 'Land of the Rising Sun'?",
            listOf("China", "Japan", "Korea", "Vietnam"),
            1
        ),
        Question(
            "What is the biggest desert in the world?",
            listOf("The Sahara", "The Gobi", "The Arabian", "The Antarctic"),
            0
        ),
        Question(
            "Which river is the longest in the world?",
            listOf("The Nile", "The Amazon", "The Yangtze", "The Mississippi"),
            1
        ),
        Question(
            "What is the chemical symbol for gold?",
            listOf("Au", "Ag", "Cu", "Fe"),
            0
        ),
        Question(
            "Which city is known as the 'Big Apple'?",
            listOf("New York City", "Los Angeles", "Chicago", "Philadelphia"),
            0
        ),
    )

    val CSQuestions = listOf<Question>(

        Question(
            "What does RAM stand for?",
            listOf(
                "Random Access Memory",
                "Read Access Memory",
                "Register Access Memory",
                "Real Access Memory"
            ),
            0
        ),
        Question(
            "What is the binary equivalent of the decimal number 10?",
            listOf("1010", "0101", "1100", "1001"),
            3
        ),
        Question(
            "In Java, what is the keyword used to create a loop that runs a specific number of times?",
            listOf("for", "while", "do-while", "repeat-until"),
            0
        ),
        Question(
            "What is the difference between HTTP and HTTPS?",
            listOf(
                "HTTPS uses encryption, HTTP does not",
                "HTTP is faster, HTTPS is slower",
                "HTTPS is only used for websites, HTTP is for all protocols",
                "There is no difference"
            ),
            0
        ),
        Question(
            "What is the purpose of a compiler in programming?",
            listOf(
                "To translate code into machine language",
                "To detect and fix errors in code",
                "To run a program",
                "To store data"
            ),
            0
        ),
        Question(
            "In Python, what is the data type of the value 'True'?",
            listOf("String", "Integer", "Boolean", "Float"),
            2
        ),
        Question(
            "What is the most popular programming language in the world?",
            listOf("Java", "Python", "JavaScript", "C"),
            2
        ),
        Question(
            "What is an algorithm?",
            listOf(
                "A step-by-step set of instructions to solve a problem",
                "A computer program",
                "A type of data structure",
                "A programming language"
            ),
            0
        ),
        Question(
            "What is the difference between a variable and a constant in programming?",
            listOf(
                "A variable can change its value, a constant cannot",
                "A constant is always a number, a variable can be any data type",
                "There is no difference",
                "A variable is used to store data, a constant is used to define functions"
            ),
            0
        ),
        Question(
            "What is the purpose of debugging in programming?",
            listOf(
                "To find and fix errors in code",
                "To improve the performance of a program",
                "To document the code",
                "To create new features"
            ),
            0
        ),
    )

    val ProgrammingQuestions = listOf<Question>(

        Question(
            "What does OOP stand for?",
            listOf(
                "Object-Oriented Programming",
                "Open-Oriented Programming",
                "Optimal-Oriented Programming",
                "Operator-Oriented Programming"
            ),
            0
        ),
        Question(
            "In C++, what does the keyword 'delete' do?",
            listOf(
                "Releases memory allocated for a dynamically created object",
                "Deletes a variable from memory",
                "Ends a program",
                "Prints a message to the console"
            ),
            0
        ),
        Question(
            "What is the difference between a function and a method in programming?",
            listOf(
                "A method belongs to a specific class, a function is independent",
                "There is no difference",
                "A function can return a value, a method cannot",
                "A method is always called on an object, a function can be called directly"
            ),
            0
        ),
        Question(
            "What is the purpose of recursion in programming?",
            listOf(
                "To solve a problem by calling itself repeatedly with smaller inputs",
                "To break down a large problem into smaller subproblems",
                "To store data efficiently",
                "To improve the performance of a program"
            ),
            0
        ),
        Question(
            "What is the concept of data structures in programming?",
            listOf(
                "Different ways to organize and store data",
                "Instructions for performing calculations",
                "The building blocks of programs",
                "The user interface of a program"
            ),
            0
        ),
        Question(
            "What is an array in programming?",
            listOf(
                "A collection of data elements of the same type",
                "A variable that can store multiple values",
                "A function that returns multiple values",
                "A block of code that is executed repeatedly"
            ),
            0
        ),
        Question(
            "What is the difference between a while loop and a do-while loop in programming?",
            listOf(
                "A do-while loop always executes at least once, a while loop may not",
                "A while loop is faster, a do-while loop is slower",
                "There is no difference",
                "A do-while loop is only used for specific conditions, a while loop can be used for any condition"
            ),
            0
        ),
        Question(
            "What is a conditional statement in programming?",
            listOf(
                "A statement that controls the flow of execution based on a condition",
                "A variable that stores a true or false value",
                "A function that takes a condition as input",
                "A block of code that is executed repeatedly"
            ),
            0
        ),
        Question(
            "What is the difference between a local variable and a global variable in programming?",
            listOf(
                "A local variable is declared inside a function and is only accessible within that function, a global variable is declared outside a function and is accessible throughout the program",
                "There is no difference",
                "A local variable is always initialized, a global variable may not be initialized",
                "A global variable is always faster to access than a local variable"
            ),
            0
        ),
        Question(
            "What is the purpose of comments in programming?",
            listOf(
                "To explain the code and make it easier to understand",
                "To add functionality to the program",
                "To store data",
                "To debug errors"
            ),
            0
        ),
    )
}