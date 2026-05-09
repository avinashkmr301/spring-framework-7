package com.avi;



import com.avi.ex3.bean.Vehicle;
import com.avi.ex3.bean.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainApplication {
    static void main() {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("TATA-SAFARI");
        IO.println(vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle bean = context.getBean(Vehicle.class);   // it will take @Primary bean
        IO.println(bean.getName());

        bean.sayHello();




    }
}
