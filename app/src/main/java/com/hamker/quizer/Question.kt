package com.hamker.quizer

data class Question(
    val id: Int,
    val text: String,
    val image: Int,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestions(): ArrayList<Question> {
    val questions = ArrayList<Question>()

    questions.add(
        Question(
            0,
            "Đáp án nào không phải là ngôn ngữ lập trình?",
            R.drawable.kotlin_mascot,
            "Java",
            "Marshmallow",
            "C++",
            "Kotlin",
            "Marshmallow"
        )
    )
    questions.add(
        Question(
            1,
            "Ngôn ngữ nào dễ học nhất?",
            R.drawable.languages,
            "Kotlin",
            "C++",
            "Java",
            "Python",
            "Java"
        )
    )

    questions.add(
        Question(
            2,
            "Vòng lặp nào là vòng lặp vô tận?",
            R.drawable.loop,
            "For loop",
            "Infinix loop",
            "While loop",
            "Repeat loop",
            "While loop"
        )
    )

    questions.add(
        Question(
            3,
            "Int chính xác được gọi là gì trong lập trình?",
            R.drawable.datatypes,
            "Loop",
            "Data type",
            "Collection",
            "International",
            "Data type"
        )
    )
    questions.add(
        Question(
            4,
            "Đâu là điểm bắt đầu 1 app android?",
            R.drawable.kotlin,
            "MainActivity",
            "Top",
            "Enter",
            "Func",
            "MainActivity"
        )
    )

    return questions
}