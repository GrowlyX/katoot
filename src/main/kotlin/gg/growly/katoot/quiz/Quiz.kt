package gg.growly.katoot.quiz

import com.google.gson.annotations.SerializedName
import java.util.UUID

/**
 * @author GrowlyX
 * @since 2/16/2022
 */
class Quiz(
    @SerializedName("uuid")
    val uniqueId: UUID
)
