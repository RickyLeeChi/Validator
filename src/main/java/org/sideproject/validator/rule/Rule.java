package org.sideproject.validator.rule;

public abstract class Rule {
	String code;
	String description;
	
	public Rule(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public abstract boolean doAction(String data);
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}
