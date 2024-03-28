package kz.kizirov.template

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse

class TemplateApiKtor(private val httpClient: HttpClient) {

    suspend fun getDog(): HttpResponse {
        return httpClient.get("api/breeds/image/random"){
        }
    }
}