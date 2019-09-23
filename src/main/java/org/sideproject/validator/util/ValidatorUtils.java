package org.sideproject.validator.util;

import java.util.Map;

import org.sideproject.validator.entity.ValidateResult;

public class ValidatorUtils {
	public static String outPutResult(ValidateResult results) {
		if(results == null) {
			return "";
		}
		
		StringBuilder str = new StringBuilder();
		
		Map<String, String> invalidResults = results.getInvalidResults();
		
		invalidResults.forEach((k,v)->System.out.println(str.append(v) + ". "));
		
		return null;	
	}
}
