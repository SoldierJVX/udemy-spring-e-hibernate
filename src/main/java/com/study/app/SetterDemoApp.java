package com.study.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.study.model.*;

class SetterDemoApp {

    public static void main(String[] args){
        
        // Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        
        // Call methods on bean 
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        
        // Call our new methods to get literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        
        // Close the context
        context.close();
    }

}