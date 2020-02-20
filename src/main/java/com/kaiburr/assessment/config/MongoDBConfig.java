package com.kaiburr.assessment.config;

import com.kaiburr.assessment.repository.Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = Repository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(Repository repository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

            }
        };
    }
}
