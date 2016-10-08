package com.epam.trainings.di.spring

import io.restassured.RestAssured
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.IntegrationTest
import org.springframework.test.context.web.WebAppConfiguration

import static io.restassured.config.LogConfig.logConfig
import static io.restassured.config.RestAssuredConfig.newConfig

@WebAppConfiguration
@IntegrationTest("server.port:0")
class EmbeddedServerSpecification extends ContextRequiredSpecification {

    @Value('${local.server.port}')
    int port;

    def setup() {
        RestAssured.port = port;
        RestAssured.config = newConfig().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails())
    }

}
