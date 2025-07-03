package com.exaples.config;

import com.examples.bean.vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConfig {


    @Bean
    vehicle vehicles(){
        var veh = new vehicle();
        veh.setName("Skoda laura");
        return veh;

    }

    //here return type string is converted and returned as spring bean
    //hence purpose of this annotation
    @Bean
    String hello(){
        return "Hello OPENAI";
    }

    @Bean
    Integer value(){
        return 1;
    }

}
