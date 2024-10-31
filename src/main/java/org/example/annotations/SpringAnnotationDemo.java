package org.example.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemo {
public static void main(String[] args){
//we shd let spring know that we are using annotations
    ApplicationContext applicationContext= new AnnotationConfigApplicationContext("org.example.annotations");
    //now it will scan the whole package
    NotificationService notificationService1=applicationContext.getBean("notificationService",NotificationService.class);
    NotificationService notificationService2=applicationContext.getBean("notificationService",NotificationService.class);
    System.out.println(notificationService1==notificationService2);
    notificationService2.sendNotification("OTP : 1234");
    //creating objs without using applicationcontext
    NotificationService notificationServicea=new NotificationService();
    NotificationService notificationServiceb=new NotificationService();
    System.out.println(notificationServicea==notificationServiceb);
    //output is false because scope is for spring conatiner not jvm
    /*
    *every bean in spring container has default scope singleton
    * that's why while comparing objects belonging to same bean it was giving true
    * in case of normal jvm objects its false
    * */
}
}
