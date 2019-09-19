package org.sideproject.validator.service;

import java.util.List;

import org.sideproject.validator.CheckRule;

public class PasswordValidatorService extends ValidatorService{
	public List<CheckRule> rules;
	
	public PasswordValidatorService(List<CheckRule> rules) {
		this.rules = rules;
	}
	
	@Override
	protected boolean doAction() {
		// TODO Auto-generated method stub
		return false;
	}

}
