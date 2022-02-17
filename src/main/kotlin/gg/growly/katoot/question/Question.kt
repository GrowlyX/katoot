package gg.growly.katoot.question

import com.google.gson.annotations.SerializedName
import gg.growly.katoot.quiz.type.QuizType

/**
 * @author GrowlyX
 * @since 2/16/2022
 */
data class Question(
    val type: QuizType,
    @SerializedName("question")
    val value: String,
    // points
    val points: Boolean,
    val pointsMultiplier: Int,
    // choices
    val choices: List<QuestionChoice>
)
