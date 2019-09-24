package org.sideproject.validator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.sideproject.validator.entity.ValidateResult;
import org.sideproject.validator.service.PasswordValidatorService;
import org.sideproject.validator.util.ValidatorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/applicationContext.xml")
public class TestValidator {
	@Autowired 
	PasswordValidatorService service;
	
	String emptyString = "";
	
	@Test
	public void testEmptyString(){
		ValidateResult results = service.doValidate(emptyString);
		
		ValidatorUtils.outPutResult(results);
	}
}
