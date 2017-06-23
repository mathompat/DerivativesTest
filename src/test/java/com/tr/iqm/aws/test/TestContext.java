package com.tr.iqm.aws.test;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * A simple mock implementation of the {@code Context} interface. Default
 * values are stubbed out, and setters are provided so you can customize
 * the context before passing it to your function.
 */
public class TestContext implements Context {

    private String awsRequestId = "EXAMPLE";
    private ClientContext clientContext;
    private String functionName = "EXAMPLE";
    private CognitoIdentity identity;
    private String logGroupName = "EXAMPLE";
    private String logStreamName = "EXAMPLE";
//    private LambdaLogger logger = new TestLogger();
    private int memoryLimitInMB = 128;
    private int remainingTimeInMillis = 15000;
    private String functionVersion = "EXAMPLE";
    private String invokedFunctionArn = "EXAMPLE";
	public String getAwsRequestId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLogGroupName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLogStreamName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getFunctionName() {
		// TODO Auto-generated method stub
		return null;
	}
	public CognitoIdentity getIdentity() {
		// TODO Auto-generated method stub
		return null;
	}
	public ClientContext getClientContext() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getRemainingTimeInMillis() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getMemoryLimitInMB() {
		// TODO Auto-generated method stub
		return 0;
	}
	public LambdaLogger getLogger() {
		// TODO Auto-generated method stub
		return null;
	}

}
