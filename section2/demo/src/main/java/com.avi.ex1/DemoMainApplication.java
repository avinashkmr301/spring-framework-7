package com.avi.ex1;

import com.avi.ex1.bean.Vehicle;
import com.avi.ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainApplication {
    static void main() {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("TATA-SAFARI");
        IO.println(vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle bean1 = context.getBean("bmw",Vehicle.class);
        IO.println(bean1.getName());

        Vehicle bean = (Vehicle) context.getBean("xuv");
        IO.println(bean.getName());

        Vehicle bean2 = (Vehicle) context.getBean("audi",Vehicle.class);
        IO.println(bean2.getName());



    }
}
