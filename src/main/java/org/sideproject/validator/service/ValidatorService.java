package org.sideproject.validator.service;

import org.sideproject.validator.entity.ValidateResult;

public interface ValidatorService {
	public ValidateResult doValidate(String data); 
}
