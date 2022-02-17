package gg.growly.katoot.quiz

import gg.growly.katoot.Katoot
import java.util.UUID

/**
 * @author GrowlyX
 * @since 2/16/2022
 */
object Quizzes
{
    fun byGameId(gameId: UUID): Quiz?
    {
        val request = Katoot
            .request(gameId.toString())

        val serialized = request
            .asJson().body.toString()

        return Katoot.gson.fromJson(
            serialized, Quiz::class.java
        )
    }
}
