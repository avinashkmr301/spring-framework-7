package com.avi.ex1.ConfigClass;

import com.avi.ex1.beans.Vehical;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicalConfig {

    @Bean
    Vehical vehical(){
        var vhl = new Vehical();
        vhl.setName("Pulser NS 400");
        return vhl;
    }

    @Bean
    String name(){
        return "String bean";
    }

    @Bean
    Integer age(){
        return 100;
    }
}
