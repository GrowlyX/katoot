package gg.growly.katoot

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import kong.unirest.GetRequest
import kong.unirest.Unirest

/**
 * @author GrowlyX
 * @since 2/16/2022
 */
object Katoot
{
    val gson: Gson = GsonBuilder()
        .setLongSerializationPolicy(LongSerializationPolicy.STRING)
        .create()

    fun request(request: String): GetRequest
    {
        return Unirest.get("$REST$request")
            .connectTimeout(1000)
    }
}
