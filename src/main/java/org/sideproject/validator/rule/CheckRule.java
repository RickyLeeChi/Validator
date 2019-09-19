package org.sideproject.validator.rule;

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
