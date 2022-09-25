package org.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoApplication.class, args);
    }

}
