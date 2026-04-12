package com.avi.ex1;

import com.avi.ex1.ConfigClass.VehicalConfig;
import com.avi.ex1.beans.Vehical;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainApplication {
    static void main() {
        IO.println("Hello World!");

        Vehical vehical = new Vehical();
        vehical.setName("Audi 8");
        IO.println("without contex: " + vehical.getName());

        var context = new AnnotationConfigApplicationContext(VehicalConfig.class);

        Vehical vehical1 = context.getBean(Vehical.class);
        System.out.println("with context: "+vehical1.getName());

        // String bean
        String bean = context.getBean(String.class);
        IO.println("with contex: " + bean);

        //integer bean
        Integer bean1 = context.getBean(Integer.class);
        IO.println("with contex: " + bean1);
    }
}
