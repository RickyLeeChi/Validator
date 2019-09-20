package org.sideproject.validator;

import java.util.List;
import java.util.Scanner;

import org.sideproject.validator.entity.ValidateResult;
import org.sideproject.validator.service.PasswordValidatorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static ApplicationContext applicationContext;
	
	
    public static void main( String[] args ) {
    	init(); 	  	
    	run();
    }

    public static void run() {	
    	Scanner userInput = new Scanner(System.in);
 
    	System.out.println("Please enter your password : ");
    	
        boolean running = true;
        
        while(running){
        	System.out.print("# ");
        	
        	String input = userInput.nextLine();
        	
        	if(input.equalsIgnoreCase("close")) {
        		userInput.close();
        		running = false;
        		System.out.println("Bye ~ Bye!!");        		
        	}
        	else {
            	PasswordValidatorService service = (PasswordValidatorService) applicationContext.getBean("PasswordValidator");
            	ValidateResult results = service.doValidate(input);
        	}
        }
	}
    
	private static void init() {
    	applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
 	}
}
