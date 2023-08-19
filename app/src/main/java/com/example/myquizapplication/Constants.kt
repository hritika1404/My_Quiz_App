package com.example.myquizapplication

object Constants {
    const val USER_NAME :String = "user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val QuestionList =  ArrayList<Question>()

        val que1 = Question(
            1, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_brazil, "Australia" , "Brazil", "Peru", "India", 2
        )
        QuestionList.add(que1)
        val que2 = Question(
            2, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_argentina, "Argentina" , "Brazil", "Armenia", "Germany", 1
        )
        QuestionList.add(que2)
        val que3 = Question(
            3, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_australia, "Australia" , "Brazil", "Spain", "None", 1
        )
        QuestionList.add(que3)
        val que4 = Question(
            4, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_fiji, "Japan" , "Philippines", "Morocco", "Fiji", 4
        )
        QuestionList.add(que4)
        val que5 = Question(
            5, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_denmark, "Spain" , " Brazil", "Denmark", "Malta", 3
        )
        QuestionList.add(que5)
        val que6 = Question(
            6, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_germany, "France" , "Germany", "Peru", "North Korea", 2
        )
        QuestionList.add(que6)
        val que7 = Question(
            7, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_india, "India" , "Brazil", "New Zealand", "Italy", 1
        )
        QuestionList.add(que7)
        val que8 = Question(
            8, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_kuwait, "Bhutan" , "Kuwait", "Morocco", "USA", 2
        )
        QuestionList.add(que8)
        val que9 = Question(
            9, "What Country Does this Flag Represents?",
            R.drawable.ic_flag_of_new_zealand, "Queensland" , "Bahrain", "Australia", "New Zealand", 4
        )
        QuestionList.add(que9)
        return QuestionList
    }
}