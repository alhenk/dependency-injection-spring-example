package com.epam.trainings.di.spring

import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@SpringApplicationConfiguration(classes = KungFuPandaApplication.class)
//current SPock version doesn't support SpringBootTest
@ActiveProfiles('test')
abstract class ContextRequiredSpecification extends Specification {

}
