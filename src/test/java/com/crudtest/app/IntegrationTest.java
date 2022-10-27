package com.crudtest.app;

import com.crudtest.app.Crudtestposgresqlv5App;
import com.crudtest.app.config.AsyncSyncConfiguration;
import com.crudtest.app.config.EmbeddedElasticsearch;
import com.crudtest.app.config.EmbeddedKafka;
import com.crudtest.app.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Crudtestposgresqlv5App.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
