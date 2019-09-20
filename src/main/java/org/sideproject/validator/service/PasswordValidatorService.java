package org.sideproject.validator.service;

import java.util.List;

import org.sideproject.validator.entity.ValidateResult;
import org.sideproject.validator.rule.Rule;

public class PasswordValidatorService implements ValidatorService{
	public List<Rule> rules;

	public PasswordValidatorService(List<Rule> rules) {
		this.rules = rules;
	}
	
	@Override
	public ValidateResult doValidate(String data) {
		ValidateResult results = new ValidateResult();
		
		for(Rule rule : rules) {
			boolean success = rule.doAction(data);
			
			if(!success) {
				results.addValidteResult(rule.getCode());
			}
		}
		
		return results;
	}
}
