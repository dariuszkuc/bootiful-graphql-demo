package com.example.bootiful

import com.expediagroup.graphql.execution.GraphQLContext
import com.expediagroup.graphql.spring.execution.GraphQLContextFactory
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.stereotype.Component

@Component
class CustomContextFactory: GraphQLContextFactory<CustomContext> {

    override suspend fun generateContext(request: ServerHttpRequest, response: ServerHttpResponse): CustomContext {
        val language = request.headers.acceptLanguage.firstOrNull()?.range ?: "en-us"
        return CustomContext(language = language)
    }
}

class CustomContext(val language: String) : GraphQLContext