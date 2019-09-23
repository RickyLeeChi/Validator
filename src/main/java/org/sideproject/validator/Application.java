package org.sideproject.validator;

import java.util.Scanner;

import org.sideproject.validator.entity.ValidateResult;
import org.sideproject.validator.service.ValidatorService;
import org.sideproject.validator.util.ValidatorUtils;
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
        		ValidatorService service = (ValidatorService) applicationContext.getBean("PasswordValidator");
            	ValidateResult results = service.doValidate(input);
            	
            	if(results.isValidateSuccess()) {
            		System.out.println("Validate success");     
            	}
            	else {
            		ValidatorUtils.outPutResult(results);
            	}
        	}
        }
	}
	/**
	 * 
	 */
	private static void init() {
    	applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
 	}
}
