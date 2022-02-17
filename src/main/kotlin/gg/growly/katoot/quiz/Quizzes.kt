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
        return Katoot.gson.fromJson(
            request.asJson().body
                .toPrettyString(),
            Quiz::class.java
        )
    }
}
