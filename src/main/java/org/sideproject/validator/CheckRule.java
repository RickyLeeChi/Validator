package org.sideproject.validator;

public class CheckRule {
	String regEx;

	public CheckRule(String regEx) {
		this.regEx = regEx;
	}

	public String getRegEx() {
		return regEx;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}
}
