/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.ArmableTransaction;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.http.vp.IHTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.http.vp.impl.HTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SuppressWarnings("all")
public class JPetStoreDemo1_Test_A1F0A0BE89BA3E40FAF6B53435663735 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(13);
	private DataVar[] vars = new DataVar[2];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public JPetStoreDemo1_Test_A1F0A0BE89BA3E40FAF6B53435663735(IContainer container, String invocationId) {
		super(container, "JPetStoreDemo1", invocationId, "A1F0A0BE89BA3E40FAF6B53435663735", "/JPetStore_LoopDemo/JPetStoreDemo1.testsuite", "C:/Users/rajesh-a/HCL/devopstest/workspace_DevOpsPerf/JPetStore_LoopDemo/JPetStoreDemo1.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(transaction_1(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: JPetStoreDemo1_Test_A1F0A0BE89BA3E40FAF6B53435663735 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F0A0BE89D95F03FAF6B53435663735");	
			vars[0] = new DataVar("JPetStoreDemo1_Host", "10.115.154.35", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("JPetStoreDemo1_Host_Port", "8081", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[0].getValue()== null?"10.115.154.35": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[1].getValue()== null?"8081": (String)vars[1].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"10.115.154.35",  // unsubstituted host name
					Integer.parseInt((String)("8081")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private ArmableTransaction transaction_1(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "MyTransaction", "A1F0A829AE14A740C526B73730323032") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));
	this.add(page_4(this));
	this.add(page_5(this));
	this.add(page_6(this));
	this.add(page_7(this));
	this.add(page_8(this));
	this.add(page_9(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1F0A0BE8A0B1D67FAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo", "A1F0A0BE8A0B1D67FAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1F0A0BE8A0A0BF0FAF6B53435663735", false, true,
						"Config_1", "JPetStoreDev",	"/JPetStoreDev/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1F0A0BE8A0A0BF0FAF6B53435663735", false, false,
						"Config_1", "logo-topbar.gif",	"/JPetStoreDev/images/logo-topbar.gif", true, false), 74, 100, "A1F0A0BE8A0E78C7FAF6B53435663735", 3);
				httpParallel.addRequest(1, request_3(this, false, "A1F0A0BE8A1D45D0FAF6B53435663735", false, false,
						"Config_1", "cart.gif",	"/JPetStoreDev/images/cart.gif", true, false), 76, 100, "A1F0A0BE8A0E78C7FAF6B53435663735", 2);
				httpParallel.addRequest(2, request_4(this, false, "A1F0A0BE8A1DE210FAF6B53435663735", false, false,
						"Config_1", "separator.gif",	"/JPetStoreDev/images/separator.gif", true, false), 101, 100, "A1F0A0BE8A0E78C7FAF6B53435663735", 2);
				httpParallel.addRequest(3, request_5(this, false, "A1F0A0BE8A1E5747FAF6B53435663735", false, false,
						"Config_1", "sign-in.gif",	"/JPetStoreDev/images/sign-in.gif", true, false), 101, 100, "A1F0A0BE8A0E78C7FAF6B53435663735", 2);
				httpParallel.addRequest(0, request_6(this, false, "A1F0A0BE8A0A0BF0FAF6B53435663735", false, false,
						"Config_1", "bkg-topbar.gif",	"/JPetStoreDev/images/bkg-topbar.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_7(this, false, "A1F0A0BE8A1F68B2FAF6B53435663735", false, false,
						"Config_1", "help.gif",	"/JPetStoreDev/images/help.gif", true, false), 125, 100, "A1F0A0BE8A0E78C7FAF6B53435663735", 2);
				httpParallel.addRequest(5, request_8(this, false, "A1F0A0BE8A2004F7FAF6B53435663735", false, false,
						"Config_1", "search.gif",	"/JPetStoreDev/images/search.gif", true, false), 126, 100, "A1F0A0BE8A0E78C7FAF6B53435663735", 2);
				httpParallel.addRequest(2, request_9(this, false, "A1F0A0BE8A1DE210FAF6B53435663735", false, false,
						"Config_1", "poweredby.gif",	"/JPetStoreDev/images/poweredby.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_10(this, false, "A1F0A0BE8A1DE210FAF6B53435663735", false, false,
						"Config_1", "favicon.ico",	"/favicon.ico", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A0E78C7FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[0], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_74", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_73", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A0E9FD0FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A118600FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_72", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_36", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_71", null, 0, false);
	subContainer_2.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A118603FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A1D45D8FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_5 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_70", null, 0, false);
	subContainer_3.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_35", null, 0, false);
	subContainer_3.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_69", null, 0, false);
	subContainer_3.addSubInstruction(sub_7);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A1D45DBFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A1DE218FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_8 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_68", null, 0, false);
	subContainer_4.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_34", null, 0, false);
	subContainer_4.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_67", null, 0, false);
	subContainer_4.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A1DE21BFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A1E574FFAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_11 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_66", null, 0, false);
	subContainer_5.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_33", null, 0, false);
	subContainer_5.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_65", null, 0, false);
	subContainer_5.addSubInstruction(sub_13);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A1E5752FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A1ECC84FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_14 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_64", null, 0, false);
	subContainer_6.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_32", null, 0, false);
	subContainer_6.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_63", null, 0, false);
	subContainer_6.addSubInstruction(sub_16);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A1ECC87FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A1F68BAFAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_17 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_62", null, 0, false);
	subContainer_7.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_31", null, 0, false);
	subContainer_7.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_61", null, 0, false);
	subContainer_7.addSubInstruction(sub_19);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A1F68BDFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A2004FFFAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_20 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_60", null, 0, false);
	subContainer_8.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_30", null, 0, false);
	subContainer_8.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_59", null, 0, false);
	subContainer_8.addSubInstruction(sub_22);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A200502FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A207A27FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_23 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_58", null, 0, false);
	subContainer_9.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_29", null, 0, false);
	subContainer_9.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_57", null, 0, false);
	subContainer_9.addSubInstruction(sub_25);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A207A2AFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A20EF6BFAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_26 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_56", null, 0, false);
	subContainer_10.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_28", null, 0, false);
	subContainer_10.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_55", null, 0, false);
	subContainer_10.addSubInstruction(sub_28);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A0E78C7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1F0A0BE8A211660FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-icon");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(3392, 1, parent, parent, "A1F0A0BE8A236050FAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {1}", "A1F0A0BE8A236050FAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_11(this, true, "A1F0A0BE8A1DE210FAF6B53435663735", false, true,
						"Config_1", "index.shtml",	"/JPetStoreDev/shop/index.shtml", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_12(this, false, "A1F0A0BE8A1DE210FAF6B53435663735", false, false,
						"Config_1", "sm_fish.gif",	"/JPetStoreDev/images/sm_fish.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_13(this, false, "A1F0A0BE8A1F68B2FAF6B53435663735", false, false,
						"Config_1", "sm_dogs.gif",	"/JPetStoreDev/images/sm_dogs.gif", true, false), 7, 100, "A1F0A0BE8A236054FAF6B53435663735", 2);
				httpParallel.addRequest(2, request_14(this, false, "A1F0A0BE8A2004F7FAF6B53435663735", false, false,
						"Config_1", "sm_reptiles.gif",	"/JPetStoreDev/images/sm_reptiles.gif", true, false), 11, 100, "A1F0A0BE8A236054FAF6B53435663735", 2);
				httpParallel.addRequest(3, request_15(this, false, "A1F0A0BE8A1E5747FAF6B53435663735", false, false,
						"Config_1", "sm_birds.gif",	"/JPetStoreDev/images/sm_birds.gif", true, false), 11, 100, "A1F0A0BE8A236054FAF6B53435663735", 2);
				httpParallel.addRequest(4, request_16(this, false, "A1F0A0BE8A0A0BF0FAF6B53435663735", false, false,
						"Config_1", "sm_cats.gif",	"/JPetStoreDev/images/sm_cats.gif", true, false), 11, 100, "A1F0A0BE8A236054FAF6B53435663735", 2);
				httpParallel.addRequest(5, request_17(this, false, "A1F0A0BE8A1D45D0FAF6B53435663735", false, false,
						"Config_1", "fish_icon.gif",	"/JPetStoreDev/images/fish_icon.gif", true, false), 11, 100, "A1F0A0BE8A236054FAF6B53435663735", 2);
				httpParallel.addRequest(0, request_18(this, false, "A1F0A0BE8A1DE210FAF6B53435663735", true, false,
						"Config_1", "birds_icon.gif",	"/JPetStoreDev/images/birds_icon.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_19(this, false, "A1F0A0BE8A1E5747FAF6B53435663735", true, false,
						"Config_1", "reptiles_icon.gif",	"/JPetStoreDev/images/reptiles_icon.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_20(this, false, "A1F0A0BE8A1D45D0FAF6B53435663735", false, false,
						"Config_1", "splash.gif",	"/JPetStoreDev/images/splash.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_21(this, false, "A1F0A0BE8A0A0BF0FAF6B53435663735", false, false,
						"Config_1", "cats_icon.gif",	"/JPetStoreDev/images/cats_icon.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_22(this, false, "A1F0A0BE8A2004F7FAF6B53435663735", true, false,
						"Config_1", "dogs_icon.gif",	"/JPetStoreDev/images/dogs_icon.gif", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A236054FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[1], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[2], " href=\"(.*?)\"", 9, 9, 0, 0, false, "href", null, 0, false);
	IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_29 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_54", null, 0, false);
	subContainer_11.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Referer_1", 0, 39, false, (IDCCoreVar)dcVars[0], false, "Referer_27", null, 0, false);
	subContainer_11.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_53", null, 0, false);
	subContainer_11.addSubInstruction(sub_31);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"ISO-8859-1",
			"A1F0A0BE8A236057FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A27A610FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_52", null, 0, false);
	subContainer_12.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_26", null, 0, false);
	subContainer_12.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_51", null, 0, false);
	subContainer_12.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A27CD21FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A284253FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_35 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_50", null, 0, false);
	subContainer_13.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_25", null, 0, false);
	subContainer_13.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_49", null, 0, false);
	subContainer_13.addSubInstruction(sub_37);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A284256FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A28B793FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_48", null, 0, false);
	subContainer_14.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_24", null, 0, false);
	subContainer_14.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_47", null, 0, false);
	subContainer_14.addSubInstruction(sub_40);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A28B796FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A2953C0FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_41 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_46", null, 0, false);
	subContainer_15.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_23", null, 0, false);
	subContainer_15.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_45", null, 0, false);
	subContainer_15.addSubInstruction(sub_43);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A2953C3FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A29C8F1FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_44 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_44", null, 0, false);
	subContainer_16.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_22", null, 0, false);
	subContainer_16.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_43", null, 0, false);
	subContainer_16.addSubInstruction(sub_46);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A29C8F4FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A30A6C0FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_42", null, 0, false);
	subContainer_17.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_21", null, 0, false);
	subContainer_17.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_41", null, 0, false);
	subContainer_17.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A30A6C3FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A314308FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_50 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_40", null, 0, false);
	subContainer_18.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_20", null, 0, false);
	subContainer_18.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_39", null, 0, false);
	subContainer_18.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A31430BFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A31B84BFAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_53 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_38", null, 0, false);
	subContainer_19.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_19", null, 0, false);
	subContainer_19.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_37", null, 0, false);
	subContainer_19.addSubInstruction(sub_55);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A31B84EFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A325470FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_56 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_36", null, 0, false);
	subContainer_20.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_18", null, 0, false);
	subContainer_20.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_35", null, 0, false);
	subContainer_20.addSubInstruction(sub_58);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A325473FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A338CF0FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_59 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_34", null, 0, false);
	subContainer_21.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_17", null, 0, false);
	subContainer_21.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_33", null, 0, false);
	subContainer_21.addSubInstruction(sub_61);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A338CF3FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A340235FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_62 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_32", null, 0, false);
	subContainer_22.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_16", null, 0, false);
	subContainer_22.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_31", null, 0, false);
	subContainer_22.addSubInstruction(sub_64);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A236054FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A340238FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(3227, 1, parent, parent, "A1F0A0BE8A349E60FAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {2}", "A1F0A0BE8A349E60FAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_23(this, true, "A1F0A0BE8A1F68B2FAF6B53435663735", false, true,
						"Config_1", "viewCategory.shtml;jsessionid=C106E0BBF28106198737C82C68F00E5A",	"/JPetStoreDev/shop/viewCategory.shtml;jsessionid=C106E0BBF28106198737C82C68F00E5A?categoryId=BIRDS", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A349E64FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/index.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[3], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[4], "\\?productId=(.*?)\"", 1, 1, 0, 0, false, "productId_2", null, 0, false);
	IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_65 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_30", null, 0, false);
	subContainer_23.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_15", null, 0, false);
	subContainer_23.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_uri", 0, 98, false, (IDCCoreVar)dcVars[2], false, "JPetStore Demo {2}_url", null, 0, false);
	subContainer_23.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_29", null, 0, false);
	subContainer_23.addSubInstruction(sub_68);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A349E67FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(4391, 1, parent, parent, "A1F0A0BE8A3513A0FAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {3}", "A1F0A0BE8A3513A0FAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_24(this, true, "A1F0A0BE8A1F68B2FAF6B53435663735", false, true,
						"Config_1", "viewProduct.shtml",	"/JPetStoreDev/shop/viewProduct.shtml?productId=AV-CB-01", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_25(this, false, "A1F0A0BE8A1F68B2FAF6B53435663735", false, false,
						"Config_1", "button_add_to_cart.gif",	"/JPetStoreDev/images/button_add_to_cart.gif", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3513A4FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/viewCategory.shtml;jsessionid=C106E0BBF28106198737C82C68F00E5A?categoryId=BIRDS", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[5], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[6], "\\?itemId=(.*?)\"", 1, 1, 0, 0, false, "itemId_2", null, 0, false);
	IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_69 = new SubRule("req_uri", 47, 8, true, (IDCCoreVar)dcVars[4], false, "productId", null, 0, false);
	subContainer_24.addSubInstruction(sub_69);
		ISubRule sub_70 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_28", null, 0, false);
	subContainer_24.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_hdr_Referer_1", 0, 123, false, (IDCCoreVar)dcVars[3], false, "Referer_14", null, 0, false);
	subContainer_24.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_27", null, 0, false);
	subContainer_24.addSubInstruction(sub_72);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3513A7FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3561C8FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/viewProduct.shtml?productId=AV-CB-01", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_73 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_26", null, 0, false);
	subContainer_25.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_hdr_Referer_1", 0, 80, false, (IDCCoreVar)dcVars[5], false, "Referer_13", null, 0, false);
	subContainer_25.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_25", null, 0, false);
	subContainer_25.addSubInstruction(sub_75);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A3513A4FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A3513A4FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3561CBFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(3525, 1, parent, parent, "A1F0A0BE8A35D6ECFAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {4}", "A1F0A0BE8A35D6ECFAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_26(this, true, "A1F0A0BE8A1F68B2FAF6B53435663735", false, true,
						"Config_1", "viewItem.shtml",	"/JPetStoreDev/shop/viewItem.shtml?itemId=EST-18", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_27(this, false, "A1F0A0BE8A1F68B2FAF6B53435663735", false, false,
						"Config_1", "bird4.gif",	"/JPetStoreDev/images/bird4.gif", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A35D6F0FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/viewProduct.shtml?productId=AV-CB-01", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[7], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_5", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[8], "\\?workingItemId=(.*?)\"", 1, 1, 0, 0, false, "workingItemId_2", null, 0, false);
	IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_76 = new SubRule("req_uri", 41, 6, true, (IDCCoreVar)dcVars[6], false, "itemId", null, 0, false);
	subContainer_26.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_24", null, 0, false);
	subContainer_26.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_hdr_Referer_1", 0, 80, false, (IDCCoreVar)dcVars[5], false, "Referer_12", null, 0, false);
	subContainer_26.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_23", null, 0, false);
	subContainer_26.addSubInstruction(sub_79);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A35D6F3FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A364C10FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/viewItem.shtml?itemId=EST-18", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_80 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_22", null, 0, false);
	subContainer_27.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_11", null, 0, false);
	subContainer_27.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_21", null, 0, false);
	subContainer_27.addSubInstruction(sub_82);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A35D6F0FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A35D6F0FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A364C13FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_6(final IContainer parent) {
			HTTPThink think = new HTTPThink(2983, 1, parent, parent, "A1F0A0BE8A37D2B0FAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {5}", "A1F0A0BE8A37D2B0FAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_28(this, true, "A1F0A0BE8A1F68B2FAF6B53435663735", false, true,
						"Config_1", "addItemToCart.shtml",	"/JPetStoreDev/shop/addItemToCart.shtml?workingItemId=EST-18", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_29(this, false, "A1F0A0BE8A1F68B2FAF6B53435663735", false, false,
						"Config_1", "button_remove.gif",	"/JPetStoreDev/images/button_remove.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_30(this, false, "A1F0A0BE8A1D45D0FAF6B53435663735", false, false,
						"Config_1", "button_update_cart.gif",	"/JPetStoreDev/images/button_update_cart.gif", true, false), 7, 100, "A1F0A0BE8A37D2B4FAF6B53435663735", 2);
				httpParallel.addRequest(2, request_31(this, false, "A1F0A0BE8A0A0BF0FAF6B53435663735", true, false,
						"Config_1", "button_checkout.gif",	"/JPetStoreDev/images/button_checkout.gif", true, false), 8, 100, "A1F0A0BE8A37D2B4FAF6B53435663735", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A37D2B4FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/viewItem.shtml?itemId=EST-18", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[9], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_6", null, 0, false);
	IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_83 = new SubRule("req_uri", 53, 6, true, (IDCCoreVar)dcVars[8], false, "workingItemId", null, 0, false);
	subContainer_28.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_20", null, 0, false);
	subContainer_28.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_hdr_Referer_1", 0, 72, false, (IDCCoreVar)dcVars[7], false, "Referer_10", null, 0, false);
	subContainer_28.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_19", null, 0, false);
	subContainer_28.addSubInstruction(sub_86);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A37D2B7FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3C3F80FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/addItemToCart.shtml?workingItemId=EST-18", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_18", null, 0, false);
	subContainer_29.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[9], false, "Referer_9", null, 0, false);
	subContainer_29.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_17", null, 0, false);
	subContainer_29.addSubInstruction(sub_89);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A37D2B4FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A37D2B4FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3C3F83FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3D50F0FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/addItemToCart.shtml?workingItemId=EST-18", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_90 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_16", null, 0, false);
	subContainer_30.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[9], false, "Referer_8", null, 0, false);
	subContainer_30.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_30.addSubInstruction(sub_92);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A37D2B4FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3D50F3FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3E1443FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/addItemToCart.shtml?workingItemId=EST-18", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_93 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_14", null, 0, false);
	subContainer_31.addSubInstruction(sub_93);
		ISubRule sub_94 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[9], false, "Referer_7", null, 0, false);
	subContainer_31.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_31.addSubInstruction(sub_95);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A37D2B4FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3E1446FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_7(final IContainer parent) {
			HTTPThink think = new HTTPThink(6250, 1, parent, parent, "A1F0A0BE8A3E899EFAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {6}", "A1F0A0BE8A3E899EFAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_32(this, true, "A1F0A0BE8A1F68B2FAF6B53435663735", false, true,
						"Config_1", "updateCartQuantities.shtml",	"/JPetStoreDev/shop/updateCartQuantities.shtml", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3EB081FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Length", "32", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Origin", "http://10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/addItemToCart.shtml?workingItemId=EST-18", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[10], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_7", null, 0, false);
	IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_96 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_12", null, 0, false);
	subContainer_32.addSubInstruction(sub_96);
		ISubRule sub_97 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[9], false, "Referer_6", null, 0, false);
	subContainer_32.addSubInstruction(sub_97);
		ISubRule sub_98 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_32.addSubInstruction(sub_98);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3EB084FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("EST-18=25&update.x=62&update.y=8");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1F0A0BE8A3F25B0FAF6B53435663735", postData, requestData_1, "ISO-8859-1", 0, 0);
	postData.addDataChunk(pdc_0);

	}
private HTTPPage page_8(final IContainer parent) {
			HTTPThink think = new HTTPThink(3698, 1, parent, parent, "A1F0A0BE8A3F73D3FAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {7}", "A1F0A0BE8A3F73D3FAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_33(this, true, "A1F0A0BE8A1F68B2FAF6B53435663735", false, true,
						"Config_1", "checkout.shtml",	"/JPetStoreDev/shop/checkout.shtml", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_34(this, false, "A1F0A0BE8A1F68B2FAF6B53435663735", false, false,
						"Config_1", "button_continue.gif",	"/JPetStoreDev/images/button_continue.gif", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3F73D7FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/updateCartQuantities.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[11], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_8", null, 0, false);
	IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_99 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_10", null, 0, false);
	subContainer_33.addSubInstruction(sub_99);
		ISubRule sub_100 = new SubRule("req_hdr_Referer_1", 0, 70, false, (IDCCoreVar)dcVars[10], false, "Referer_5", null, 0, false);
	subContainer_33.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_33.addSubInstruction(sub_101);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3F73DAFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A3FC1FBFAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/checkout.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_102 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_8", null, 0, false);
	subContainer_34.addSubInstruction(sub_102);
		ISubRule sub_103 = new SubRule("req_hdr_Referer_1", 0, 58, false, (IDCCoreVar)dcVars[11], false, "Referer_4", null, 0, false);
	subContainer_34.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_34.addSubInstruction(sub_104);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A3F73D7FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A3F73D7FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A3FC1FEFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_9(final IContainer parent) {
			HTTPThink think = new HTTPThink(3371, 1, parent, parent, "A1F0A0BE8A403720FAF6B53435663735");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "JPetStore Demo {8}", "A1F0A0BE8A403720FAF6B53435663735") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_35(this, true, "A1F0A0BE8A1F68B2FAF6B53435663735", false, true,
						"Config_1", "newOrderForm.shtml",	"/JPetStoreDev/shop/newOrderForm.shtml", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_36(this, false, "A1F0A0BE8A1F68B2FAF6B53435663735", true, false,
						"Config_1", "button_submit.gif",	"/JPetStoreDev/images/button_submit.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_37(this, false, "A1F0A0BE8A1D45D0FAF6B53435663735", true, false,
						"Config_1", "button_register_now.gif",	"/JPetStoreDev/images/button_register_now.gif", true, false), 7, 100, "A1F0A0BE8A403724FAF6B53435663735", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A403724FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/checkout.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[12], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_9", null, 0, false);
	IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_105 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_6", null, 0, false);
	subContainer_35.addSubInstruction(sub_105);
		ISubRule sub_106 = new SubRule("req_hdr_Referer_1", 0, 58, false, (IDCCoreVar)dcVars[11], false, "Referer_3", null, 0, false);
	subContainer_35.addSubInstruction(sub_106);
		ISubRule sub_107 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_35.addSubInstruction(sub_107);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A403727FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A40855CFAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/newOrderForm.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_108 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_4", null, 0, false);
	subContainer_36.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_hdr_Referer_1", 0, 62, false, (IDCCoreVar)dcVars[12], false, "Referer_2", null, 0, false);
	subContainer_36.addSubInstruction(sub_109);
		ISubRule sub_110 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_36.addSubInstruction(sub_110);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A403724FAF6B53435663735"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A403724FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A40855FFAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0A0BE8A40FA70FAF6B53435663735", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "10.115.154.35:8081", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Referer", "http://10.115.154.35:8081/JPetStoreDev/shop/newOrderForm.shtml", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "ISO-8859-1", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "ISO-8859-1", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_111 = new SubRule("req_hdr_Host_1", 14, 4, false, (IDCCoreVar)vars[1], false, "Host_2", null, 0, false);
	subContainer_37.addSubInstruction(sub_111);
		ISubRule sub_112 = new SubRule("req_hdr_Referer_1", 0, 62, false, (IDCCoreVar)dcVars[12], false, "Referer", null, 0, false);
	subContainer_37.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_37.addSubInstruction(sub_113);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0A0BE8A403724FAF6B53435663735"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"ISO-8859-1",
			"ISO-8859-1",
			"A1F0A0BE8A40FA73FAF6B53435663735",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
