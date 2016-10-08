package com.epam.trainings.di.spring.end2end

import com.epam.trainings.di.spring.EmbeddedServerSpecification
import io.restassured.http.ContentType

import javax.ws.rs.core.Response

import static io.restassured.RestAssured.given

class FightersEndToEndTest extends EmbeddedServerSpecification {

    def 'GET fighters names'() {
        given: 'nothing is predefined'
        when: 'performs GET fighters'
        def response = given().get('/api/fighters}')
        then: 'response status should be 200 and contain fighters names'
        response.then()
                .statusCode(Response.Status.OK.getStatusCode())
                .contentType(ContentType.JSON)
    }
}