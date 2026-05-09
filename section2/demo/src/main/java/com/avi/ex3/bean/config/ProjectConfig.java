package com.avi.ex3.bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.avi.ex3.bean"})
public class ProjectConfig {

   /*
   As we're not setting the value for the name... buz we marked the class @Component

   So we can add dependency- jakarta annotation api
   and will create a method (and marked with @PostConstruct) to initialize the name

   or

   we can implements initializeBean in the Vehicle (@Component) class
   and override the method and initialize the name there

   by above two wat we initialize the name in Vehicle.class
    */

}
