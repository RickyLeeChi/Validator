package org.sideproject.validator.rule;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExRule extends Rule{
	String regEx;
	
	public RegExRule(String code, String description, String regEx) {
		super(code, description);
		this.regEx = regEx;
	}

	public String getRegEx() {
		return regEx;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}

	@Override
	public boolean doAction(String data) {
		Pattern pattern = Pattern.compile(this.regEx);
		Matcher matcher = pattern.matcher(data);
	
		return matcher.matches();
	}
}
