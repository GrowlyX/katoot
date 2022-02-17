package gg.growly.katoot

import gg.growly.katoot.question.Question
import gg.growly.katoot.question.QuestionChoice
import gg.growly.katoot.quiz.Quizzes
import java.util.UUID

/**
 * @author GrowlyX
 * @since 2/16/2022
 */
object KatootTest
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        val quiz = Quizzes.byGameId(
            UUID.fromString("0241cbbe-5e87-45a6-b2ab-69280d72e2af")
        )!!

        val mappings =
            mutableMapOf<String, MutableList<Pair<Question, QuestionChoice>>>()

        for (question in quiz.questions)
        {
            val choice = question
                .getFirstCorrectChoice()

            mappings.putIfAbsent(choice.answer, mutableListOf())

            mappings[choice.answer]
                ?.apply { add(Pair(question, choice)) }
        }

        for (mapping in mappings)
        {
            println("${mapping.key}:")

            for (question in mapping.value)
            {
                println(" ${question.first.value}: ${question.second.answer}")
            }
        }
    }
}
