package com.avi.ex2.bean.config;

import com.avi.ex2.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "audi")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("AUDI-8");
        return veh;
    }

    @Bean(value = "bmw")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    @Primary
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("XUV-700");
        return veh;
    }
}
