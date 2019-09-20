package org.sideproject.validator.entity;

import java.util.HashMap;
import java.util.Map;

import org.sideproject.validator.message.ValidatorMessager;

public class ValidateResult {
	private Map<String, String> invalidResults;
	
	public ValidateResult() {
		invalidResults = new HashMap<String, String>();
	}

	public void addValidteResult(String code) {
		invalidResults.put(code, ValidatorMessager.getInstance().decode(code));
	}
	
	public boolean isValidateSuccess() {
		return invalidResults.isEmpty();
	}
	
	public Map<String, String> getInvalidResults() {
		return invalidResults;
	}
	
}
