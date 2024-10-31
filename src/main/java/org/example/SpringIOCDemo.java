package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringIOCDemo {
    public static void main(String[] args){
        System.out.println("applicationcontext will create bean from projectbeans file");
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("projectbeans.xml");

        Engine engine1=  applicationContext.getBean("engine1",Engine.class);
      System.out.println(engine1);
        Engine engine2=  applicationContext.getBean("engine1",Engine.class);
        System.out.println(engine2);
        System.out.println(engine1==engine2);
        //result is true as it is singleton
        Car car=applicationContext.getBean("car1",Car.class);
       car.runcar();
        Engine engine2A=  applicationContext.getBean("engine2",Engine.class);
        System.out.println(engine2A);
        Engine engine2B=  applicationContext.getBean("engine2",Engine.class);
        System.out.println(engine2B);
        System.out.println(engine2A==engine2B);
        //here result is false because engine2 bean scope =proptotype that creates new object each time(not a singleton bean)
        Engine engine3=  applicationContext.getBean("engine3",Engine.class);
        System.out.println(engine3);
        applicationContext.close();
    }

}
