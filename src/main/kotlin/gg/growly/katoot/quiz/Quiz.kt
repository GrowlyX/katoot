package gg.growly.katoot.quiz

import com.google.gson.annotations.SerializedName
import gg.growly.katoot.question.Question
import gg.growly.katoot.quiz.type.QuizType
import java.util.UUID

/**
 * @author GrowlyX
 * @since 2/16/2022
 */
class Quiz(
    @SerializedName("uuid")
    val uniqueId: UUID,
    @SerializedName("title")
    val displayName: String,
    val description: String?,
    val quizType: QuizType,
    // timestamps
    val created: Long,
    val modified: Long,
    // creator information
    val creator: UUID,
    val creatorUsername: String,
    // questions
    val questions: List<Question>,
)
