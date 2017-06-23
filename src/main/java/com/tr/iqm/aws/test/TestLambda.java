package com.tr.iqm.aws.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TestLambda implements RequestHandler<String, String> {
	public String handleRequest(Object input, Context context) {
		String output = "Hello, " + input + "!";
    	return output;
	}

	public String handleRequest(String arg0, Context arg1) {
		// TODO Auto-generated method stub
		return null;
	}
}
