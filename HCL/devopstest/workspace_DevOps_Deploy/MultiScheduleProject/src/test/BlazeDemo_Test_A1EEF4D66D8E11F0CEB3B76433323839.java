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
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
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
public class BlazeDemo_Test_A1EEF4D66D8E11F0CEB3B76433323839 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(9);
	private DataVar[] vars = new DataVar[6];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public BlazeDemo_Test_A1EEF4D66D8E11F0CEB3B76433323839(IContainer container, String invocationId) {
		super(container, "BlazeDemo", invocationId, "A1EEF4D66D8E11F0CEB3B76433323839", "/MultiScheduleProject/BlazeDemo.testsuite", "C:/Users/rajesh-a/HCL/devopstest/workspace_DevOps_Deploy/MultiScheduleProject/BlazeDemo.testsuite");
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
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));
	this.add(page_4(this));
	this.add(page_5(this));
	this.add(page_6(this));
	this.add(page_7(this));
	this.add(page_8(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: BlazeDemo_Test_A1EEF4D66D8E11F0CEB3B76433323839 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1EEF4D66D8E120ECEB3B76433323839");	
			vars[0] = new DataVar("BlazeDemo_Host", "blazemeter.datapipe.prodperfect.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("BlazeDemo_Host_1", "blazedemo.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("BlazeDemo_Host_2", "blazemeter.trackinglibrary.prodperfect.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("BlazeDemo_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("BlazeDemo_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("BlazeDemo_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[1].getValue()== null?"blazedemo.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[5].getValue()== null?"443": (String)vars[5].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"blazedemo.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_2(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[2].getValue()== null?"blazemeter.trackinglibrary.prodperfect.com": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[4].getValue()== null?"443": (String)vars[4].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"blazemeter.trackinglibrary.prodperfect.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_3(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)(vars[0].getValue()== null?"blazemeter.datapipe.prodperfect.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[3].getValue()== null?"443": (String)vars[3].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"blazemeter.datapipe.prodperfect.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1EEF4D66DA14BDECEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "BlazeHomepage", "A1EEF4D66DA14BDECEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1EEF4D66DA14BD0CEB3B76433323839", false, true,
						"Config_1", "/",	"/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1EEF4D66DA14BD0CEB3B76433323839", false, false,
						"Config_1", "bootstrap.min.js",	"/assets/bootstrap.min.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_3(this, false, "A1EEF4D66DBFD08BCEB3B76433323839", true, false,
						"Config_1", "bootstrap-table.js",	"/assets/bootstrap-table.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_4(this, false, "A1EEF4D66DC1570FCEB3B76433323839", true, false,
						"Config_1", "bootstrap.min.css",	"/assets/bootstrap.min.css", true, false), 22, 100, "A1EEF4D66DA14BECCEB3B76433323839", 2);
				httpParallel.addRequest(0, request_5(this, false, "A1EEF4D66DA14BD0CEB3B76433323839", false, false,
						"Config_1", "bootstrap-table.css",	"/assets/bootstrap-table.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_6(this, false, "A1EEF4D66DC43DE2CEB3B76433323839", true, false,
						"Config_2", "keen-tracking.min.js",	"/keen-tracking.min.js", true, false), 571, 100, "A1EEF4D66DA14BECCEB3B76433323839", 2);
				httpParallel.addRequest(0, request_7(this, false, "A1EEF4D66DA14BD0CEB3B76433323839", false, false,
						"Config_1", "favicon.ico",	"/favicon.ico", true, false), 13, 100, "A1EEF4D66DC43DF0CEB3B76433323839", 3);
				httpParallel.addRequest(4, request_8(this, false, "A1EEF4D66DC77236CEB3B76433323839", true, false,
						"Config_3", "pageviews",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/pageviews?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 1073, 100, "A1EEF4D66DA14BECCEB3B76433323839", 2);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DA14BECCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[0], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_44", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
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
			"A1EEF4D66DA14BEFCEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DBEE5F0CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_43", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_43", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
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
			"A1EEF4D66DBEE5F3CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DBFD099CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_42", null, 0, false);
	subContainer_3.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_42", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
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
			"A1EEF4D66DBFD09CCEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC1571DCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_5 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_41", null, 0, false);
	subContainer_4.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_41", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
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
			"A1EEF4D66DC15720CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC43D5BCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_7 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_40", null, 0, false);
	subContainer_5.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_40", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
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
			"A1EEF4D66DC43D5ECEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC43DF0CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.trackinglibrary.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_9 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_39", null, 0, false);
	subContainer_6.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 42, false, (IDCCoreVar)vars[2], false, "Host_39", null, 0, false);
	subContainer_6.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
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
			"A1EEF4D66DC43DF3CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC771BFCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_11 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_38", null, 0, false);
	subContainer_7.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_38", null, 0, false);
	subContainer_7.addSubInstruction(sub_12);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
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
			"A1EEF4D66DC771C2CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/vnd.microsoft.icon");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC77244CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2077", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_37", null, 0, false);
	subContainer_8.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_37", null, 0, false);
	subContainer_8.addSubInstruction(sub_14);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DA14BECCEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DC77247CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"394e071a-0bce-4586");
strBuf_1.append("-a8ed-978ec0f27081\",\"iso_time_full\":\"2024-04-07T11:57:42.143");
strBuf_1.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:27:42 GMT+0530 (Ind");
strBuf_1.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_1.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_1.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_1.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_1.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_1.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_1.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_1.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":0,\"time_o");
strBuf_1.append("n_page_ms\":2},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_agent");
strBuf_1.append("\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":true,\"co");
strBuf_1.append("deName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"langu");
strBuf_1.append("age\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\":\"Win");
strBuf_1.append("32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) A");
strBuf_1.append("ppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safar");
strBuf_1.append("i/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) Apple");
strBuf_1.append("WebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/53");
strBuf_1.append("7.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":24,\"p");
strBuf_1.append("ixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orientati");
strBuf_1.append("on\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":703,\"");
strBuf_1.append("width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"width");
strBuf_1.append("\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{}},\"r");
strBuf_1.append("eferrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},");
strBuf_1.append("\"keen\":{\"timestamp\":\"2024-04-07T11:57:42.143Z\",\"addons\":[{\"n");
strBuf_1.append("ame\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"},\"ou");
strBuf_1.append("tput\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"url.");
strBuf_1.append("full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"input");
strBuf_1.append("\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"name\":");
strBuf_1.append("\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.timestamp");
strBuf_1.append("\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\",\"inp");
strBuf_1.append("ut\":{\"date_time\":\"local_time_full\"},\"output\":\"time.local\"},{");
strBuf_1.append("\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"remove_i");
strBuf_1.append("p_property\":false},\"output\":\"geo\"}]}}");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1EEF4D66DC772A1CEB3B76433323839", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(10679, 1, parent, parent, "A1EEF4D66DC772F7CEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "events_clicks", "A1EEF4D66DC772F7CEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_9(this, true, "A1EEF4D66DC772E9CEB3B76433323839", true, true,
						"Config_3", "clicks",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_10(this, false, "A1EEF4D66DC8AA32CEB3B76433323839", true, false,
						"Config_3", "changes",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 871, 100, "A1EEF4D66DC772FBCEB3B76433323839", 3);
				httpParallel.addRequest(2, request_11(this, false, "A1EEF4D66DC8F858CEB3B76433323839", true, false,
						"Config_3", "clicks{1}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 173, 100, "A1EEF4D66DC8AA40CEB3B76433323839", 3);
				httpParallel.addRequest(3, request_12(this, false, "A1EEF4D66DC8F905CEB3B76433323839", true, false,
						"Config_3", "clicks{2}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 872, 100, "A1EEF4D66DC772FBCEB3B76433323839", 3);
				httpParallel.addRequest(4, request_13(this, false, "A1EEF4D66DC8F9B4CEB3B76433323839", true, false,
						"Config_3", "changes{1}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 2540, 100, "A1EEF4D66DC8F913CEB3B76433323839", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC772FBCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3420", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_15 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_36", null, 0, false);
	subContainer_9.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_36", null, 0, false);
	subContainer_9.addSubInstruction(sub_16);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DC772FECEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"7cf81bc5-2503-4601");
strBuf_2.append("-9f21-c18cd7c808be\",\"iso_time_full\":\"2024-04-07T11:57:54.797");
strBuf_2.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:27:54 GMT+0530 (Ind");
strBuf_2.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_2.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_2.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_2.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_2.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_2.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_2.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_2.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":13,\"time_");
strBuf_2.append("on_page_ms\":12656},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_2.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_2.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_2.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_2.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_2.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_2.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_2.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_2.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_2.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_2.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_2.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_2.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_2.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_2.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:57:54.797Z\",\"addons\"");
strBuf_2.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_2.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_2.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_2.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_2.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_2.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_2.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_2.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_2.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"class\"");
strBuf_2.append(":\"form-inline\",\"href\":null,\"id\":null,\"name\":\"fromPort\",\"all_");
strBuf_2.append("attrs\":{\"name\":\"fromPort\",\"class\":\"form-inline\",\"unique_sele");
strBuf_2.append("ctor\":\"form > :nth-child(1)\"},\"node_name\":\"SELECT\",\"tag_name");
strBuf_2.append("\":\"SELECT\",\"text\":null,\"title\":null,\"type\":null,\"n_parents\":");
strBuf_2.append("[{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\"");
strBuf_2.append(":{\"action\":\"reserve.php\",\"method\":\"post\",\"unique_selector\":\"");
strBuf_2.append("form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"tit");
strBuf_2.append("le\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"container\",\"h");
strBuf_2.append("ref\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"contai");
strBuf_2.append("ner\",\"unique_selector\":\"body > :nth-child(3)\"},\"node_name\":\"");
strBuf_2.append("DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"");
strBuf_2.append("nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":nu");
strBuf_2.append("ll,\"all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\"");
strBuf_2.append(",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth");
strBuf_2.append("_parent\":3},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,");
strBuf_2.append("\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_nam");
strBuf_2.append("e\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":");
strBuf_2.append("null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"na");
strBuf_2.append("me\":null,\"all_attrs\":{},\"node_name\":\"#document\",\"text\":null,");
strBuf_2.append("\"title\":null,\"type\":null,\"nth_parent\":5}],\"selector\":\"body >");
strBuf_2.append(" div:eq(2) > form > select:eq(0)\",\"text_content\":\"---REDACTE");
strBuf_2.append("D---\",\"cursor\":\"pointer\",\"x_position\":183,\"y_position\":242}}");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1EEF4D66DC77353CEB3B76433323839", postData, requestData_2, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_1);

	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC8AA40CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3420", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_17 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_35", null, 0, false);
	subContainer_10.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_35", null, 0, false);
	subContainer_10.addSubInstruction(sub_18);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DC8AA43CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"db5df94c-0fc1-4aed");
strBuf_3.append("-95d9-5d5f8b72ea02\",\"iso_time_full\":\"2024-04-07T11:57:56.421");
strBuf_3.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:27:56 GMT+0530 (Ind");
strBuf_3.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_3.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_3.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_3.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_3.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_3.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_3.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_3.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":14,\"time_");
strBuf_3.append("on_page_ms\":14280},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_3.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_3.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_3.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_3.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_3.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_3.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_3.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_3.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_3.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_3.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_3.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_3.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_3.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_3.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:57:56.421Z\",\"addons\"");
strBuf_3.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_3.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_3.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_3.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_3.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_3.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_3.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_3.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_3.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"class\"");
strBuf_3.append(":\"form-inline\",\"href\":null,\"id\":null,\"name\":\"fromPort\",\"all_");
strBuf_3.append("attrs\":{\"name\":\"fromPort\",\"class\":\"form-inline\",\"unique_sele");
strBuf_3.append("ctor\":\"form > :nth-child(1)\"},\"node_name\":\"SELECT\",\"tag_name");
strBuf_3.append("\":\"SELECT\",\"text\":null,\"title\":null,\"type\":null,\"n_parents\":");
strBuf_3.append("[{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\"");
strBuf_3.append(":{\"action\":\"reserve.php\",\"method\":\"post\",\"unique_selector\":\"");
strBuf_3.append("form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"tit");
strBuf_3.append("le\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"container\",\"h");
strBuf_3.append("ref\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"contai");
strBuf_3.append("ner\",\"unique_selector\":\"body > :nth-child(3)\"},\"node_name\":\"");
strBuf_3.append("DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"");
strBuf_3.append("nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":nu");
strBuf_3.append("ll,\"all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\"");
strBuf_3.append(",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth");
strBuf_3.append("_parent\":3},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,");
strBuf_3.append("\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_nam");
strBuf_3.append("e\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":");
strBuf_3.append("null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"na");
strBuf_3.append("me\":null,\"all_attrs\":{},\"node_name\":\"#document\",\"text\":null,");
strBuf_3.append("\"title\":null,\"type\":null,\"nth_parent\":5}],\"selector\":\"body >");
strBuf_3.append(" div:eq(2) > form > select:eq(0)\",\"text_content\":\"---REDACTE");
strBuf_3.append("D---\",\"cursor\":\"pointer\",\"x_position\":183,\"y_position\":242}}");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1EEF4D66DC8F810CEB3B76433323839", postData, requestData_3, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_2);

	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC8F866CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3420", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_34", null, 0, false);
	subContainer_11.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_34", null, 0, false);
	subContainer_11.addSubInstruction(sub_20);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DC8F869CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_4(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"464a54cc-c018-4e26");
strBuf_4.append("-bb92-6ba7e70925bc\",\"iso_time_full\":\"2024-04-07T11:57:56.423");
strBuf_4.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:27:56 GMT+0530 (Ind");
strBuf_4.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_4.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_4.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_4.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_4.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_4.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_4.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_4.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":14,\"time_");
strBuf_4.append("on_page_ms\":14282},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_4.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_4.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_4.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_4.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_4.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_4.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_4.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_4.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_4.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_4.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_4.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_4.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_4.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_4.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:57:56.423Z\",\"addons\"");
strBuf_4.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_4.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_4.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_4.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_4.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_4.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_4.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_4.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_4.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"class\"");
strBuf_4.append(":\"form-inline\",\"href\":null,\"id\":null,\"name\":\"fromPort\",\"all_");
strBuf_4.append("attrs\":{\"name\":\"fromPort\",\"class\":\"form-inline\",\"unique_sele");
strBuf_4.append("ctor\":\"form > :nth-child(1)\"},\"node_name\":\"SELECT\",\"tag_name");
strBuf_4.append("\":\"SELECT\",\"text\":null,\"title\":null,\"type\":null,\"n_parents\":");
strBuf_4.append("[{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\"");
strBuf_4.append(":{\"action\":\"reserve.php\",\"method\":\"post\",\"unique_selector\":\"");
strBuf_4.append("form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"tit");
strBuf_4.append("le\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"container\",\"h");
strBuf_4.append("ref\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"contai");
strBuf_4.append("ner\",\"unique_selector\":\"body > :nth-child(3)\"},\"node_name\":\"");
strBuf_4.append("DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"");
strBuf_4.append("nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":nu");
strBuf_4.append("ll,\"all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\"");
strBuf_4.append(",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth");
strBuf_4.append("_parent\":3},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,");
strBuf_4.append("\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_nam");
strBuf_4.append("e\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":");
strBuf_4.append("null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"na");
strBuf_4.append("me\":null,\"all_attrs\":{},\"node_name\":\"#document\",\"text\":null,");
strBuf_4.append("\"title\":null,\"type\":null,\"nth_parent\":5}],\"selector\":\"body >");
strBuf_4.append(" div:eq(2) > form > select:eq(0)\",\"text_content\":\"---REDACTE");
strBuf_4.append("D---\",\"cursor\":\"pointer\",\"x_position\":183,\"y_position\":242}}");
String requestData_4 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1EEF4D66DC8F8BECEB3B76433323839", postData, requestData_4, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC8F913CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3416", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_21 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_33", null, 0, false);
	subContainer_12.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_33", null, 0, false);
	subContainer_12.addSubInstruction(sub_22);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DC8F916CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_5(HTTPPostData postData) {
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"f0be823e-8a1c-42d6");
strBuf_5.append("-b683-6a6a2a65c1da\",\"iso_time_full\":\"2024-04-07T11:57:57.389");
strBuf_5.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:27:57 GMT+0530 (Ind");
strBuf_5.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_5.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_5.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_5.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_5.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_5.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_5.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_5.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":15,\"time_");
strBuf_5.append("on_page_ms\":15248},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_5.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_5.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_5.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_5.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_5.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_5.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_5.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_5.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_5.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_5.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_5.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_5.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_5.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_5.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:57:57.389Z\",\"addons\"");
strBuf_5.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_5.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_5.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_5.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_5.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_5.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_5.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_5.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_5.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"class\"");
strBuf_5.append(":\"form-inline\",\"href\":null,\"id\":null,\"name\":\"toPort\",\"all_at");
strBuf_5.append("trs\":{\"name\":\"toPort\",\"class\":\"form-inline\",\"unique_selector");
strBuf_5.append("\":\"form > :nth-child(4)\"},\"node_name\":\"SELECT\",\"tag_name\":\"S");
strBuf_5.append("ELECT\",\"text\":null,\"title\":null,\"type\":null,\"n_parents\":[{\"c");
strBuf_5.append("lass\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"a");
strBuf_5.append("ction\":\"reserve.php\",\"method\":\"post\",\"unique_selector\":\"form");
strBuf_5.append("\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":");
strBuf_5.append("null,\"type\":null,\"nth_parent\":1},{\"class\":\"container\",\"href\"");
strBuf_5.append(":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"container\"");
strBuf_5.append(",\"unique_selector\":\"body > :nth-child(3)\"},\"node_name\":\"DIV\"");
strBuf_5.append(",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_");
strBuf_5.append("parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"");
strBuf_5.append("all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"ta");
strBuf_5.append("g_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_par");
strBuf_5.append("ent\":3},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_5.append("_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"");
strBuf_5.append("HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":null");
strBuf_5.append(",\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"name\":");
strBuf_5.append("null,\"all_attrs\":{},\"node_name\":\"#document\",\"text\":null,\"tit");
strBuf_5.append("le\":null,\"type\":null,\"nth_parent\":5}],\"selector\":\"body > div");
strBuf_5.append(":eq(2) > form > select:eq(1)\",\"text_content\":\"---REDACTED---");
strBuf_5.append("\",\"cursor\":\"pointer\",\"x_position\":183,\"y_position\":342}}");
String requestData_5 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1EEF4D66DC8F96BCEB3B76433323839", postData, requestData_5, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_4);

	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC8F9C2CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3416", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_23 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_32", null, 0, false);
	subContainer_13.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_32", null, 0, false);
	subContainer_13.addSubInstruction(sub_24);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DC8F9C5CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_6(HTTPPostData postData) {
				StringBuffer strBuf_6 = new StringBuffer();
strBuf_6.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"caef6038-c82b-47bd");
strBuf_6.append("-8056-9c55d578d549\",\"iso_time_full\":\"2024-04-07T11:58:00.725");
strBuf_6.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:00 GMT+0530 (Ind");
strBuf_6.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_6.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_6.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_6.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_6.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_6.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_6.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_6.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":19,\"time_");
strBuf_6.append("on_page_ms\":18585},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_6.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_6.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_6.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_6.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_6.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_6.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_6.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_6.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_6.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_6.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_6.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_6.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_6.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_6.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58:00.726Z\",\"addons\"");
strBuf_6.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_6.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_6.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_6.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_6.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_6.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_6.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_6.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_6.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"class\"");
strBuf_6.append(":\"form-inline\",\"href\":null,\"id\":null,\"name\":\"toPort\",\"all_at");
strBuf_6.append("trs\":{\"name\":\"toPort\",\"class\":\"form-inline\",\"unique_selector");
strBuf_6.append("\":\"form > :nth-child(4)\"},\"node_name\":\"SELECT\",\"tag_name\":\"S");
strBuf_6.append("ELECT\",\"text\":null,\"title\":null,\"type\":null,\"n_parents\":[{\"c");
strBuf_6.append("lass\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"a");
strBuf_6.append("ction\":\"reserve.php\",\"method\":\"post\",\"unique_selector\":\"form");
strBuf_6.append("\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":");
strBuf_6.append("null,\"type\":null,\"nth_parent\":1},{\"class\":\"container\",\"href\"");
strBuf_6.append(":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"container\"");
strBuf_6.append(",\"unique_selector\":\"body > :nth-child(3)\"},\"node_name\":\"DIV\"");
strBuf_6.append(",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_");
strBuf_6.append("parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"");
strBuf_6.append("all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"ta");
strBuf_6.append("g_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_par");
strBuf_6.append("ent\":3},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_6.append("_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"");
strBuf_6.append("HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":null");
strBuf_6.append(",\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"name\":");
strBuf_6.append("null,\"all_attrs\":{},\"node_name\":\"#document\",\"text\":null,\"tit");
strBuf_6.append("le\":null,\"type\":null,\"nth_parent\":5}],\"selector\":\"body > div");
strBuf_6.append(":eq(2) > form > select:eq(1)\",\"text_content\":\"---REDACTED---");
strBuf_6.append("\",\"cursor\":\"pointer\",\"x_position\":183,\"y_position\":342}}");
String requestData_6 = strBuf_6.toString();
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1EEF4D66DC8FA1ACEB3B76433323839", postData, requestData_6, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(620, 1, parent, parent, "A1EEF4D66DC8FA65CEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Boston_NeYorkFlights", "A1EEF4D66DC8FA65CEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_14(this, true, "A1EEF4D66DA14BD0CEB3B76433323839", false, true,
						"Config_1", "reserve.php",	"/reserve.php", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_15(this, false, "A1EEF4D66DCA7EE1CEB3B76433323839", true, false,
						"Config_3", "clicks{3}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_16(this, false, "A1EEF4D66DCA7F8ECEB3B76433323839", true, false,
						"Config_3", "clicks{4}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_17(this, false, "A1EEF4D66DCA803BCEB3B76433323839", true, false,
						"Config_3", "form_submissions",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/form_submissions?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_18(this, false, "A1EEF4D66DCA80E8CEB3B76433323839", true, false,
						"Config_3", "pageunloads",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/pageunloads?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_19(this, false, "A1EEF4D66DCA8195CEB3B76433323839", true, false,
						"Config_3", "pageviews{1}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/pageviews?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 32, 100, "A1EEF4D66DC8FA69CEB3B76433323839", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DC8FA69CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "31", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "prodperfect_session={%22session_uuid%22:%229d64bd20-bbf7-4c35-b291-f8f242c919b4%22};keen={%22uuid%22:%227b49d1dd-3798-46be-9708-c236de238972%22%2C%22initialReferrer%22:null}", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[1], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[2], "<[[^>].]*?name=\"fromPort\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_4", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[3], "<[[^>].]*?name=\"toPort\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_5", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[4], "<(([^>]*value=\"([^>]*?)\"[^>]*)|(?:[^>]*?))name=\"flight\"[^>]*>", 5, 4, 0, 0, false, "value", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[5], "<(([^>]*value=\"([^>]*?)\"[^>]*)|(?:[^>]*?))name=\"price\"[^>]*>", 5, 1, 0, 0, false, "value_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[6], "<(([^>]*value=\"([^>]*?)\"[^>]*)|(?:[^>]*?))name=\"airline\"[^>]*>", 5, 1, 0, 0, false, "value_3", null, 0, false);
	IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_31", null, 0, false);
	subContainer_14.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_31", null, 0, false);
	subContainer_14.addSubInstruction(sub_26);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DC8FA6CCEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_7(HTTPPostData postData) {
				StringBuffer strBuf_7 = new StringBuffer();
strBuf_7.append("fromPort=Boston&toPort=New+York");
String requestData_7 = strBuf_7.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1EEF4D66DCA30EECEB3B76433323839", postData, requestData_7, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_6);

	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCA7EEFCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3416", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_8(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_27 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_30", null, 0, false);
	subContainer_15.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_30", null, 0, false);
	subContainer_15.addSubInstruction(sub_28);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DC8FA69CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCA7EF2CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_8(HTTPPostData postData) {
				StringBuffer strBuf_8 = new StringBuffer();
strBuf_8.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"95b75114-f641-4fe6");
strBuf_8.append("-9b9a-91cfcd8e3cf2\",\"iso_time_full\":\"2024-04-07T11:58:00.727");
strBuf_8.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:00 GMT+0530 (Ind");
strBuf_8.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_8.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_8.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_8.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_8.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_8.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_8.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_8.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":19,\"time_");
strBuf_8.append("on_page_ms\":18586},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_8.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_8.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_8.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_8.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_8.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_8.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_8.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_8.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_8.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_8.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_8.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_8.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_8.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_8.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58:00.727Z\",\"addons\"");
strBuf_8.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_8.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_8.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_8.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_8.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_8.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_8.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_8.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_8.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"class\"");
strBuf_8.append(":\"form-inline\",\"href\":null,\"id\":null,\"name\":\"toPort\",\"all_at");
strBuf_8.append("trs\":{\"name\":\"toPort\",\"class\":\"form-inline\",\"unique_selector");
strBuf_8.append("\":\"form > :nth-child(4)\"},\"node_name\":\"SELECT\",\"tag_name\":\"S");
strBuf_8.append("ELECT\",\"text\":null,\"title\":null,\"type\":null,\"n_parents\":[{\"c");
strBuf_8.append("lass\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"a");
strBuf_8.append("ction\":\"reserve.php\",\"method\":\"post\",\"unique_selector\":\"form");
strBuf_8.append("\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":");
strBuf_8.append("null,\"type\":null,\"nth_parent\":1},{\"class\":\"container\",\"href\"");
strBuf_8.append(":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"container\"");
strBuf_8.append(",\"unique_selector\":\"body > :nth-child(3)\"},\"node_name\":\"DIV\"");
strBuf_8.append(",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_");
strBuf_8.append("parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"");
strBuf_8.append("all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"ta");
strBuf_8.append("g_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_par");
strBuf_8.append("ent\":3},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_8.append("_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"");
strBuf_8.append("HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":null");
strBuf_8.append(",\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"name\":");
strBuf_8.append("null,\"all_attrs\":{},\"node_name\":\"#document\",\"text\":null,\"tit");
strBuf_8.append("le\":null,\"type\":null,\"nth_parent\":5}],\"selector\":\"body > div");
strBuf_8.append(":eq(2) > form > select:eq(1)\",\"text_content\":\"---REDACTED---");
strBuf_8.append("\",\"cursor\":\"pointer\",\"x_position\":183,\"y_position\":342}}");
String requestData_8 = strBuf_8.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1EEF4D66DCA7F47CEB3B76433323839", postData, requestData_8, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_7);

	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCA7F9CCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3628", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_9(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_29 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_29", null, 0, false);
	subContainer_16.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_29", null, 0, false);
	subContainer_16.addSubInstruction(sub_30);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DC8FA69CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCA7F9FCEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_9(HTTPPostData postData) {
				StringBuffer strBuf_9 = new StringBuffer();
strBuf_9.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"96e4f042-c693-41d0");
strBuf_9.append("-92a9-d44eded21c2b\",\"iso_time_full\":\"2024-04-07T11:58:01.685");
strBuf_9.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:01 GMT+0530 (Ind");
strBuf_9.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_9.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_9.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_9.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_9.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_9.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_9.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_9.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":20,\"time_");
strBuf_9.append("on_page_ms\":19544},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_9.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_9.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_9.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_9.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_9.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_9.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_9.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_9.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_9.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_9.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_9.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_9.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_9.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_9.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58:01.685Z\",\"addons\"");
strBuf_9.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_9.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_9.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_9.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_9.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_9.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_9.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_9.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_9.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"class\"");
strBuf_9.append(":\"btn btn-primary\",\"href\":null,\"id\":null,\"name\":null,\"all_at");
strBuf_9.append("trs\":{\"type\":\"submit\",\"class\":\"btn btn-primary\",\"unique_sele");
strBuf_9.append("ctor\":\"form > .container > .btn\"},\"node_name\":\"INPUT\",\"tag_n");
strBuf_9.append("ame\":\"INPUT\",\"text\":null,\"title\":null,\"type\":\"submit\",\"n_par");
strBuf_9.append("ents\":[{\"class\":\"container\",\"href\":null,\"id\":null,\"name\":nul");
strBuf_9.append("l,\"all_attrs\":{\"class\":\"container\",\"unique_selector\":\"form >");
strBuf_9.append(" .container\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null");
strBuf_9.append(",\"title\":null,\"type\":null,\"nth_parent\":1},{\"class\":null,\"hre");
strBuf_9.append("f\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"action\":\"reserve");
strBuf_9.append(".php\",\"method\":\"post\",\"unique_selector\":\"form\"},\"node_name\":");
strBuf_9.append("\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":null,\"type\":nul");
strBuf_9.append("l,\"nth_parent\":2},{\"class\":\"container\",\"href\":null,\"id\":null");
strBuf_9.append(",\"name\":null,\"all_attrs\":{\"class\":\"container\",\"unique_select");
strBuf_9.append("or\":\"body > :nth-child(3)\"},\"node_name\":\"DIV\",\"tag_name\":\"DI");
strBuf_9.append("V\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"cl");
strBuf_9.append("ass\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"un");
strBuf_9.append("ique_selector\":\"body\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",");
strBuf_9.append("\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":4},{\"class");
strBuf_9.append("\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"lang\"");
strBuf_9.append(":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"HTML\",\"tag_name");
strBuf_9.append("\":\"HTML\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":5");
strBuf_9.append("},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs");
strBuf_9.append("\":{},\"node_name\":\"#document\",\"text\":null,\"title\":null,\"type\"");
strBuf_9.append(":null,\"nth_parent\":6}],\"selector\":\"body > div:eq(2) > form >");
strBuf_9.append(" div > input\",\"text_content\":null,\"cursor\":\"pointer\",\"x_posi");
strBuf_9.append("tion\":183,\"y_position\":392}}");
String requestData_9 = strBuf_9.toString();
			
	HTTPPostDataChunk pdc_8 = new HTTPPostDataChunk("A1EEF4D66DCA7FF4CEB3B76433323839", postData, requestData_9, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_8);

	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCA8049CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3346", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_10(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_31 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_28", null, 0, false);
	subContainer_17.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_28", null, 0, false);
	subContainer_17.addSubInstruction(sub_32);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DC8FA69CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCA804CCEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_10(HTTPPostData postData) {
				StringBuffer strBuf_10 = new StringBuffer();
strBuf_10.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"2b33ec2b-7b8d-482e");
strBuf_10.append("-8d97-aac0fb39389a\",\"iso_time_full\":\"2024-04-07T11:58:01.687");
strBuf_10.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:01 GMT+0530 (Ind");
strBuf_10.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_10.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_10.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_10.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_10.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_10.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_10.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_10.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":20,\"time_");
strBuf_10.append("on_page_ms\":19546},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_10.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_10.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_10.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_10.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_10.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_10.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_10.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_10.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_10.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_10.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_10.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_10.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_10.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_10.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58:01.687Z\",\"addons\"");
strBuf_10.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_10.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_10.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_10.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_10.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_10.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_10.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_10.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_10.append("ove_ip_property\":false},\"output\":\"geo\"}]},\"form\":{\"action\":\"");
strBuf_10.append("https://blazedemo.com/reserve.php\",\"fields\":{\"fromPort\":\"---");
strBuf_10.append("REDACTED---\",\"toPort\":\"---REDACTED---\"},\"method\":\"post\"},\"el");
strBuf_10.append("ement\":{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_");
strBuf_10.append("attrs\":{\"action\":\"reserve.php\",\"method\":\"post\",\"unique_selec");
strBuf_10.append("tor\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":nul");
strBuf_10.append("l,\"title\":null,\"type\":null,\"action\":\"https://blazedemo.com/r");
strBuf_10.append("eserve.php\",\"method\":\"post\",\"n_parents\":[{\"class\":\"container");
strBuf_10.append("\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"co");
strBuf_10.append("ntainer\",\"unique_selector\":\"body > :nth-child(3)\"},\"node_nam");
strBuf_10.append("e\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":nu");
strBuf_10.append("ll,\"nth_parent\":1},{\"class\":null,\"href\":null,\"id\":null,\"name");
strBuf_10.append("\":null,\"all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"B");
strBuf_10.append("ODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,");
strBuf_10.append("\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":n");
strBuf_10.append("ull,\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node");
strBuf_10.append("_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"ty");
strBuf_10.append("pe\":null,\"nth_parent\":3},{\"class\":null,\"href\":null,\"id\":null");
strBuf_10.append(",\"name\":null,\"all_attrs\":{},\"node_name\":\"#document\",\"text\":n");
strBuf_10.append("ull,\"title\":null,\"type\":null,\"nth_parent\":4}],\"selector\":\"bo");
strBuf_10.append("dy > div:eq(2) > form\",\"text_content\":\"---REDACTED---\",\"curs");
strBuf_10.append("or\":\"auto\",\"x_position\":183,\"y_position\":242}}");
String requestData_10 = strBuf_10.toString();
			
	HTTPPostDataChunk pdc_9 = new HTTPPostDataChunk("A1EEF4D66DCA80A1CEB3B76433323839", postData, requestData_10, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_9);

	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCA80F6CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2082", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_11(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_33 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_27", null, 0, false);
	subContainer_18.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_27", null, 0, false);
	subContainer_18.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DC8FA69CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCA80F9CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_11(HTTPPostData postData) {
				StringBuffer strBuf_11 = new StringBuffer();
strBuf_11.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"0f285618-dbbf-4439");
strBuf_11.append("-a84d-12739acdc7f6\",\"iso_time_full\":\"2024-04-07T11:58:01.689");
strBuf_11.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:01 GMT+0530 (Ind");
strBuf_11.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_11.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_11.append("king-2.0.23\",\"tracker_load_uuid\":\"c8131076-65dd-42c8-a85a-86");
strBuf_11.append("7ca25301c8\",\"tracker_loaded_at\":\"2024-04-07T11:57:42.141Z\",\"");
strBuf_11.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_11.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo\",\"descript");
strBuf_11.append("ion\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":703,\"pixe");
strBuf_11.append("l_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\":20,\"time_");
strBuf_11.append("on_page_ms\":19548},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_");
strBuf_11.append("agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies\":tru");
strBuf_11.append("e,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo app\",\"");
strBuf_11.append("language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"platform\"");
strBuf_11.append(":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x");
strBuf_11.append("64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 ");
strBuf_11.append("Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; x64) ");
strBuf_11.append("AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safa");
strBuf_11.append("ri/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDepth\":");
strBuf_11.append("24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,\"orie");
strBuf_11.append("ntation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"height\":");
strBuf_11.append("703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0.85,\"");
strBuf_11.append("width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/\",\"info\":{");
strBuf_11.append("}},\"referrer\":{\"full\":\"\",\"info\":{}},\"time\":{\"local\":{},\"utc\"");
strBuf_11.append(":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58:01.689Z\",\"addons\"");
strBuf_11.append(":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_agent\"");
strBuf_11.append("},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":");
strBuf_11.append("\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_parser\",\"");
strBuf_11.append("input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info\"},{\"n");
strBuf_11.append("ame\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"keen.time");
strBuf_11.append("stamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_parser\"");
strBuf_11.append(",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"time.loca");
strBuf_11.append("l\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address\",\"rem");
strBuf_11.append("ove_ip_property\":false},\"output\":\"geo\"}]}}");
String requestData_11 = strBuf_11.toString();
			
	HTTPPostDataChunk pdc_10 = new HTTPPostDataChunk("A1EEF4D66DCA814ECEB3B76433323839", postData, requestData_11, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_10);

	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCA81A3CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2155", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_12(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_35 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_26", null, 0, false);
	subContainer_19.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_26", null, 0, false);
	subContainer_19.addSubInstruction(sub_36);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCA81A6CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_12(HTTPPostData postData) {
				StringBuffer strBuf_12 = new StringBuffer();
strBuf_12.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"75c036ad-e95e-4bc8");
strBuf_12.append("-8086-a5dd1ee8f953\",\"iso_time_full\":\"2024-04-07T11:58:02.155");
strBuf_12.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:02 GMT+0530 (Ind");
strBuf_12.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_12.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_12.append("king-2.0.23\",\"tracker_load_uuid\":\"97115e38-ba65-476d-b3e3-9b");
strBuf_12.append("ab561b3c65\",\"tracker_loaded_at\":\"2024-04-07T11:58:02.154Z\",\"");
strBuf_12.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_12.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo - reserve\"");
strBuf_12.append(",\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\"");
strBuf_12.append(":703,\"pixel_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\"");
strBuf_12.append(":0,\"time_on_page_ms\":1},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"");
strBuf_12.append("user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"cookies");
strBuf_12.append("\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter demo a");
strBuf_12.append("pp\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,\"plat");
strBuf_12.append("form\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0; Win");
strBuf_12.append("64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0");
strBuf_12.append(".0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Win64; ");
strBuf_12.append("x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0");
strBuf_12.append(" Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"colorDe");
strBuf_12.append("pth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":1536,");
strBuf_12.append("\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":{\"hei");
strBuf_12.append("ght\":703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"height\":0");
strBuf_12.append(".85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/reser");
strBuf_12.append("ve.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://blazedemo.");
strBuf_12.append("com/\",\"full\":\"https://blazedemo.com/\",\"info\":{}},\"time\":{\"lo");
strBuf_12.append("cal\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58:02.1");
strBuf_12.append("55Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\"");
strBuf_12.append(":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"i");
strBuf_12.append("nput\":{\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:");
strBuf_12.append("url_parser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"referr");
strBuf_12.append("er.info\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_tim");
strBuf_12.append("e\":\"keen.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date");
strBuf_12.append("_time_parser\",\"input\":{\"date_time\":\"local_time_full\"},\"outpu");
strBuf_12.append("t\":\"time.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_");
strBuf_12.append("address\",\"remove_ip_property\":false},\"output\":\"geo\"}]}}");
String requestData_12 = strBuf_12.toString();
			
	HTTPPostDataChunk pdc_11 = new HTTPPostDataChunk("A1EEF4D66DCBB760CEB3B76433323839", postData, requestData_12, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_11);

	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(19072, 1, parent, parent, "A1EEF4D66DCC055CCEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "FormBookFlight", "A1EEF4D66DCC055CCEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_20(this, true, "A1EEF4D66DA14BD0CEB3B76433323839", true, true,
						"Config_1", "purchase.php",	"/purchase.php", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_21(this, false, "A1EEF4D66DCC0609CEB3B76433323839", true, false,
						"Config_3", "clicks{5}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_22(this, false, "A1EEF4D66DCC06B6CEB3B76433323839", true, false,
						"Config_3", "form_submissions{1}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/form_submissions?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 34, 100, "A1EEF4D66DCC0560CEB3B76433323839", 3);
				httpParallel.addRequest(3, request_23(this, false, "A1EEF4D66DCC0764CEB3B76433323839", true, false,
						"Config_3", "pageunloads{1}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/pageunloads?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_24(this, false, "A1EEF4D66DCD3E0FCEB3B76433323839", true, false,
						"Config_3", "pageviews{2}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/pageviews?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCC0560CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "74", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/reserve.php", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "prodperfect_session={%22session_uuid%22:%229d64bd20-bbf7-4c35-b291-f8f242c919b4%22};keen={%22uuid%22:%227b49d1dd-3798-46be-9708-c236de238972%22%2C%22initialReferrer%22:%22https://blazedemo.com/%22}", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_13(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[7], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[8], "<[[^>].]*?name=\"creditCardMonth\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_6", null, 0, false);
	IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_42 = new SubRule("req_hdr_Referer_1", 0, 33, false, (IDCCoreVar)dcVars[1], false, "Referer_25", null, 0, false);
	subContainer_21.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_25", null, 0, false);
	subContainer_21.addSubInstruction(sub_43);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCC0563CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_13(HTTPPostData postData) {
				StringBuffer strBuf_13 = new StringBuffer();
strBuf_13.append("flight=4346&price=233.98&airline=Lufthansa&fromPort=Boston&t");
strBuf_13.append("oPort=New+York");
String requestData_13 = strBuf_13.toString();
			
	HTTPPostDataChunk pdc_12 = new HTTPPostDataChunk("A1EEF4D66DCC05C8CEB3B76433323839", postData, requestData_13, "UTF-8", 33, 74);
	postData.addDataChunk(pdc_12);

	IDataSub subContainer_20 = new DataSub();
	pdc_12.addDataSub(subContainer_20);

		ISubRule sub_37 = new SubRule("req_content", 66, 8, true, (IDCCoreVar)dcVars[3], false, "toPort", null, 0, false);
	subContainer_20.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_content", 52, 6, true, (IDCCoreVar)dcVars[2], false, "fromPort", null, 0, false);
	subContainer_20.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_content", 33, 9, true, (IDCCoreVar)dcVars[6], false, "airline", null, 0, false);
	subContainer_20.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_content", 18, 6, true, (IDCCoreVar)dcVars[5], false, "price", null, 0, false);
	subContainer_20.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_content", 7, 4, true, (IDCCoreVar)dcVars[4], false, "flight", null, 0, false);
	subContainer_20.addSubInstruction(sub_41);
	



	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCC0617CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3743", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_14(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_44 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_24", null, 0, false);
	subContainer_22.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_24", null, 0, false);
	subContainer_22.addSubInstruction(sub_45);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DCC0560CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCC061ACEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_14(HTTPPostData postData) {
				StringBuffer strBuf_14 = new StringBuffer();
strBuf_14.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"c6a8e30e-0591-4ab7");
strBuf_14.append("-923a-615c519a0e0e\",\"iso_time_full\":\"2024-04-07T11:58:24.385");
strBuf_14.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:24 GMT+0530 (Ind");
strBuf_14.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_14.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_14.append("king-2.0.23\",\"tracker_load_uuid\":\"97115e38-ba65-476d-b3e3-9b");
strBuf_14.append("ab561b3c65\",\"tracker_loaded_at\":\"2024-04-07T11:58:02.154Z\",\"");
strBuf_14.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_14.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo - reserve\"");
strBuf_14.append(",\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\"");
strBuf_14.append(":703,\"pixel_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\"");
strBuf_14.append(":22,\"time_on_page_ms\":22231},\"ip_address\":\"${keen.ip}\",\"geo\"");
strBuf_14.append(":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"co");
strBuf_14.append("okies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter d");
strBuf_14.append("emo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,");
strBuf_14.append("\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0");
strBuf_14.append("; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/");
strBuf_14.append("123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Wi");
strBuf_14.append("n64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.");
strBuf_14.append("0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"co");
strBuf_14.append("lorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":");
strBuf_14.append("1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":");
strBuf_14.append("{\"height\":703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"heig");
strBuf_14.append("ht\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/");
strBuf_14.append("reserve.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://blaze");
strBuf_14.append("demo.com/\",\"full\":\"https://blazedemo.com/\",\"info\":{}},\"time\"");
strBuf_14.append(":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58");
strBuf_14.append(":24.385Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_st");
strBuf_14.append("ring\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parse");
strBuf_14.append("r\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"");
strBuf_14.append("keen:url_parser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"r");
strBuf_14.append("eferrer.info\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"dat");
strBuf_14.append("e_time\":\"keen.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen");
strBuf_14.append(":date_time_parser\",\"input\":{\"date_time\":\"local_time_full\"},\"");
strBuf_14.append("output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\"");
strBuf_14.append(":\"ip_address\",\"remove_ip_property\":false},\"output\":\"geo\"}]},");
strBuf_14.append("\"element\":{\"class\":\"btn btn-small\",\"href\":null,\"id\":null,\"na");
strBuf_14.append("me\":null,\"all_attrs\":{\"type\":\"submit\",\"class\":\"btn btn-small");
strBuf_14.append("\",\"unique_selector\":\":nth-child(5) > :nth-child(2) > .btn\"},");
strBuf_14.append("\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",\"text\":null,\"title\":n");
strBuf_14.append("ull,\"type\":\"submit\",\"n_parents\":[{\"class\":null,\"href\":null,\"");
strBuf_14.append("id\":null,\"name\":null,\"all_attrs\":{\"unique_selector\":\":nth-ch");
strBuf_14.append("ild(5) > :nth-child(2)\"},\"node_name\":\"TD\",\"tag_name\":\"TD\",\"t");
strBuf_14.append("ext\":null,\"title\":null,\"type\":null,\"nth_parent\":1},{\"class\":");
strBuf_14.append("null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"unique_");
strBuf_14.append("selector\":\"tbody > :nth-child(5)\"},\"node_name\":\"TR\",\"tag_nam");
strBuf_14.append("e\":\"TR\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":2}");
strBuf_14.append(",{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\"");
strBuf_14.append(":{\"unique_selector\":\"tbody\"},\"node_name\":\"TBODY\",\"tag_name\":");
strBuf_14.append("\"TBODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":3}");
strBuf_14.append(",{\"class\":\"table\",\"href\":null,\"id\":null,\"name\":null,\"all_att");
strBuf_14.append("rs\":{\"class\":\"table\",\"unique_selector\":\".table\"},\"node_name\"");
strBuf_14.append(":\"TABLE\",\"tag_name\":\"TABLE\",\"text\":null,\"title\":null,\"type\":");
strBuf_14.append("null,\"nth_parent\":4},{\"class\":\"container\",\"href\":null,\"id\":n");
strBuf_14.append("ull,\"name\":null,\"all_attrs\":{\"class\":\"container\",\"unique_sel");
strBuf_14.append("ector\":\"body > :nth-child(2)\"},\"node_name\":\"DIV\",\"tag_name\":");
strBuf_14.append("\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":5},{");
strBuf_14.append("\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{");
strBuf_14.append("\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"tag_name\":\"BOD");
strBuf_14.append("Y\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":6}],\"se");
strBuf_14.append("lector\":\"body > div:eq(1) > table > tbody > tr:eq(4) > td:eq");
strBuf_14.append("(0) > input\",\"text_content\":null,\"cursor\":\"pointer\",\"x_posit");
strBuf_14.append("ion\":8,\"y_position\":8}}");
String requestData_14 = strBuf_14.toString();
			
	HTTPPostDataChunk pdc_13 = new HTTPPostDataChunk("A1EEF4D66DCC066FCEB3B76433323839", postData, requestData_14, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_13);

	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCC06C4CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3797", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_15(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_46 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_23", null, 0, false);
	subContainer_23.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_23", null, 0, false);
	subContainer_23.addSubInstruction(sub_47);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCC06C7CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_15(HTTPPostData postData) {
				StringBuffer strBuf_15 = new StringBuffer();
strBuf_15.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"46d48b54-f429-461d");
strBuf_15.append("-ac7c-fb32f0bb5fa2\",\"iso_time_full\":\"2024-04-07T11:58:24.386");
strBuf_15.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:24 GMT+0530 (Ind");
strBuf_15.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_15.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_15.append("king-2.0.23\",\"tracker_load_uuid\":\"97115e38-ba65-476d-b3e3-9b");
strBuf_15.append("ab561b3c65\",\"tracker_loaded_at\":\"2024-04-07T11:58:02.154Z\",\"");
strBuf_15.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_15.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo - reserve\"");
strBuf_15.append(",\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\"");
strBuf_15.append(":703,\"pixel_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\"");
strBuf_15.append(":22,\"time_on_page_ms\":22232},\"ip_address\":\"${keen.ip}\",\"geo\"");
strBuf_15.append(":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"co");
strBuf_15.append("okies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter d");
strBuf_15.append("emo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,");
strBuf_15.append("\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0");
strBuf_15.append("; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/");
strBuf_15.append("123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Wi");
strBuf_15.append("n64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.");
strBuf_15.append("0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"co");
strBuf_15.append("lorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":");
strBuf_15.append("1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":");
strBuf_15.append("{\"height\":703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"heig");
strBuf_15.append("ht\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/");
strBuf_15.append("reserve.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://blaze");
strBuf_15.append("demo.com/\",\"full\":\"https://blazedemo.com/\",\"info\":{}},\"time\"");
strBuf_15.append(":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58");
strBuf_15.append(":24.386Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_st");
strBuf_15.append("ring\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parse");
strBuf_15.append("r\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"");
strBuf_15.append("keen:url_parser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"r");
strBuf_15.append("eferrer.info\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"dat");
strBuf_15.append("e_time\":\"keen.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen");
strBuf_15.append(":date_time_parser\",\"input\":{\"date_time\":\"local_time_full\"},\"");
strBuf_15.append("output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\"");
strBuf_15.append(":\"ip_address\",\"remove_ip_property\":false},\"output\":\"geo\"}]},");
strBuf_15.append("\"form\":{\"action\":\"https://blazedemo.com/purchase.php\",\"field");
strBuf_15.append("s\":{\"flight\":\"---REDACTED---\",\"price\":\"---REDACTED---\",\"airl");
strBuf_15.append("ine\":\"---REDACTED---\",\"fromPort\":\"---REDACTED---\",\"toPort\":\"");
strBuf_15.append("---REDACTED---\"},\"method\":\"post\"},\"element\":{\"class\":null,\"h");
strBuf_15.append("ref\":null,\"id\":null,\"name\":\"L4346\",\"all_attrs\":{\"name\":\"L434");
strBuf_15.append("6\",\"method\":\"post\",\"action\":\"purchase.php\",\"unique_selector\"");
strBuf_15.append(":\":nth-child(5) > form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM");
strBuf_15.append("\",\"text\":null,\"title\":null,\"type\":null,\"action\":\"https://bla");
strBuf_15.append("zedemo.com/purchase.php\",\"method\":\"post\",\"n_parents\":[{\"clas");
strBuf_15.append("s\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"uniq");
strBuf_15.append("ue_selector\":\"tbody > :nth-child(5)\"},\"node_name\":\"TR\",\"tag_");
strBuf_15.append("name\":\"TR\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\"");
strBuf_15.append(":1},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_att");
strBuf_15.append("rs\":{\"unique_selector\":\"tbody\"},\"node_name\":\"TBODY\",\"tag_nam");
strBuf_15.append("e\":\"TBODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\"");
strBuf_15.append(":2},{\"class\":\"table\",\"href\":null,\"id\":null,\"name\":null,\"all_");
strBuf_15.append("attrs\":{\"class\":\"table\",\"unique_selector\":\".table\"},\"node_na");
strBuf_15.append("me\":\"TABLE\",\"tag_name\":\"TABLE\",\"text\":null,\"title\":null,\"typ");
strBuf_15.append("e\":null,\"nth_parent\":3},{\"class\":\"container\",\"href\":null,\"id");
strBuf_15.append("\":null,\"name\":null,\"all_attrs\":{\"class\":\"container\",\"unique_");
strBuf_15.append("selector\":\"body > :nth-child(2)\"},\"node_name\":\"DIV\",\"tag_nam");
strBuf_15.append("e\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":4");
strBuf_15.append("},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs");
strBuf_15.append("\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"tag_name\":\"");
strBuf_15.append("BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":5}],");
strBuf_15.append("\"selector\":\"body > div:eq(1) > table > tbody > tr:eq(4) > fo");
strBuf_15.append("rm\",\"text_content\":null,\"cursor\":\"auto\",\"x_position\":null,\"y");
strBuf_15.append("_position\":null}}");
String requestData_15 = strBuf_15.toString();
			
	HTTPPostDataChunk pdc_14 = new HTTPPostDataChunk("A1EEF4D66DCC071CCEB3B76433323839", postData, requestData_15, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_14);

	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCC0772CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2160", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_16(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_48 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_22", null, 0, false);
	subContainer_24.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_22", null, 0, false);
	subContainer_24.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DCC0560CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCC0775CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_16(HTTPPostData postData) {
				StringBuffer strBuf_16 = new StringBuffer();
strBuf_16.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"09d1c14d-9adb-46ea");
strBuf_16.append("-a1e2-ddba194c1bd5\",\"iso_time_full\":\"2024-04-07T11:58:24.388");
strBuf_16.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:24 GMT+0530 (Ind");
strBuf_16.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_16.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_16.append("king-2.0.23\",\"tracker_load_uuid\":\"97115e38-ba65-476d-b3e3-9b");
strBuf_16.append("ab561b3c65\",\"tracker_loaded_at\":\"2024-04-07T11:58:02.154Z\",\"");
strBuf_16.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_16.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo - reserve\"");
strBuf_16.append(",\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\"");
strBuf_16.append(":703,\"pixel_max\":703,\"ratio\":1,\"ratio_max\":1},\"time_on_page\"");
strBuf_16.append(":22,\"time_on_page_ms\":22234},\"ip_address\":\"${keen.ip}\",\"geo\"");
strBuf_16.append(":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"co");
strBuf_16.append("okies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter d");
strBuf_16.append("emo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,");
strBuf_16.append("\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0");
strBuf_16.append("; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/");
strBuf_16.append("123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Wi");
strBuf_16.append("n64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.");
strBuf_16.append("0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"co");
strBuf_16.append("lorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":");
strBuf_16.append("1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":");
strBuf_16.append("{\"height\":703,\"width\":1536,\"scrollHeight\":703,\"ratio\":{\"heig");
strBuf_16.append("ht\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com/");
strBuf_16.append("reserve.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://blaze");
strBuf_16.append("demo.com/\",\"full\":\"https://blazedemo.com/\",\"info\":{}},\"time\"");
strBuf_16.append(":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:58");
strBuf_16.append(":24.388Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_st");
strBuf_16.append("ring\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parse");
strBuf_16.append("r\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"");
strBuf_16.append("keen:url_parser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"r");
strBuf_16.append("eferrer.info\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"dat");
strBuf_16.append("e_time\":\"keen.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen");
strBuf_16.append(":date_time_parser\",\"input\":{\"date_time\":\"local_time_full\"},\"");
strBuf_16.append("output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\"");
strBuf_16.append(":\"ip_address\",\"remove_ip_property\":false},\"output\":\"geo\"}]}}");
String requestData_16 = strBuf_16.toString();
			
	HTTPPostDataChunk pdc_15 = new HTTPPostDataChunk("A1EEF4D66DCC07CACEB3B76433323839", postData, requestData_16, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_15);

	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DCD3E1DCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2173", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_17(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_50 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_21", null, 0, false);
	subContainer_25.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_21", null, 0, false);
	subContainer_25.addSubInstruction(sub_51);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DCC0560CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DCD3E20CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_17(HTTPPostData postData) {
				StringBuffer strBuf_17 = new StringBuffer();
strBuf_17.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"cb2e6490-87d6-4ef1");
strBuf_17.append("-b981-f442c080727d\",\"iso_time_full\":\"2024-04-07T11:58:24.979");
strBuf_17.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:24 GMT+0530 (Ind");
strBuf_17.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_17.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_17.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_17.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_17.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_17.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_17.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_17.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_17.append("page\":0,\"time_on_page_ms\":1},\"ip_address\":\"${keen.ip}\",\"geo\"");
strBuf_17.append(":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"co");
strBuf_17.append("okies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter d");
strBuf_17.append("emo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true,");
strBuf_17.append("\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.0");
strBuf_17.append("; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/");
strBuf_17.append("123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; Wi");
strBuf_17.append("n64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.");
strBuf_17.append("0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"co");
strBuf_17.append("lorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\":");
strBuf_17.append("1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\":");
strBuf_17.append("{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":{\"hei");
strBuf_17.append("ght\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.com");
strBuf_17.append("/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://bla");
strBuf_17.append("zedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\",\"inf");
strBuf_17.append("o\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"202");
strBuf_17.append("4-04-07T11:58:24.979Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"i");
strBuf_17.append("nput\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"k");
strBuf_17.append("een:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.inf");
strBuf_17.append("o\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.full\"");
strBuf_17.append("},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_parser\",");
strBuf_17.append("\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.utc\"},");
strBuf_17.append("{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"local_");
strBuf_17.append("time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\",");
strBuf_17.append("\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},\"outp");
strBuf_17.append("ut\":\"geo\"}]}}");
String requestData_17 = strBuf_17.toString();
			
	HTTPPostDataChunk pdc_16 = new HTTPPostDataChunk("A1EEF4D66DCD64E0CEB3B76433323839", postData, requestData_17, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_16);

	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(26845, 1, parent, parent, "A1EEF4D66DD15C8ECEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "events_clicks {1}", "A1EEF4D66DD15C8ECEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(4, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_25(this, true, "A1EEF4D66DD15C80CEB3B76433323839", true, true,
						"Config_3", "clicks{6}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_26(this, false, "A1EEF4D66DD3CD80CEB3B76433323839", true, false,
						"Config_3", "changes{2}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 1873, 100, "A1EEF4D66DD15C92CEB3B76433323839", 3);
				httpParallel.addRequest(2, request_27(this, false, "A1EEF4D66DD52D10CEB3B76433323839", true, false,
						"Config_3", "clicks{7}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 1329, 100, "A1EEF4D66DD3CD8ECEB3B76433323839", 3);
				httpParallel.addRequest(3, request_28(this, false, "A1EEF4D66DD6DAC0CEB3B76433323839", true, false,
						"Config_3", "clicks{8}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 785, 100, "A1EEF4D66DD52D1ECEB3B76433323839", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DD15C92CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3907", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_18(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_52 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_20", null, 0, false);
	subContainer_26.addSubInstruction(sub_52);
		ISubRule sub_53 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_20", null, 0, false);
	subContainer_26.addSubInstruction(sub_53);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DD15C95CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_18(HTTPPostData postData) {
				StringBuffer strBuf_18 = new StringBuffer();
strBuf_18.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"57f0fde4-5e5a-4ca2");
strBuf_18.append("-9556-155a395ee594\",\"iso_time_full\":\"2024-04-07T11:58:58.376");
strBuf_18.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:28:58 GMT+0530 (Ind");
strBuf_18.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_18.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_18.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_18.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_18.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_18.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_18.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_18.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_18.append("page\":33,\"time_on_page_ms\":33398},\"ip_address\":\"${keen.ip}\",");
strBuf_18.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_18.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_18.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_18.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_18.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_18.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_18.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_18.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_18.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_18.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_18.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_18.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_18.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_18.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_18.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_18.append(":\"2024-04-07T11:58:58.376Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_18.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_18.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_18.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_18.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_18.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_18.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_18.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_18.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_18.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_18.append("inputName\",\"name\":\"inputName\",\"all_attrs\":{\"id\":\"inputName\",");
strBuf_18.append("\"placeholder\":\"First Last\",\"name\":\"inputName\",\"type\":\"text\",");
strBuf_18.append("\"unique_selector\":\"#inputName\"},\"node_name\":\"INPUT\",\"tag_nam");
strBuf_18.append("e\":\"INPUT\",\"text\":null,\"title\":null,\"type\":\"text\",\"n_parents");
strBuf_18.append("\":[{\"class\":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"al");
strBuf_18.append("l_attrs\":{\"class\":\"controls\",\"unique_selector\":\":nth-child(2");
strBuf_18.append(") > .controls\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":nu");
strBuf_18.append("ll,\"title\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"contro");
strBuf_18.append("l-group\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"cla");
strBuf_18.append("ss\":\"control-group\",\"unique_selector\":\"form > :nth-child(2)\"");
strBuf_18.append("},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":nul");
strBuf_18.append("l,\"type\":null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\"");
strBuf_18.append(":null,\"name\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"htt");
strBuf_18.append("ps://blazedemo.com/confirmation.php\",\"accept-charset\":\"UTF-8");
strBuf_18.append("\",\"unique_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"F");
strBuf_18.append("ORM\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"");
strBuf_18.append("class\":\"container\",\"href\":null,\"id\":null,\"name\":null,\"all_at");
strBuf_18.append("trs\":{\"class\":\"container\",\"unique_selector\":\"body > :nth-chi");
strBuf_18.append("ld(2)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"titl");
strBuf_18.append("e\":null,\"type\":null,\"nth_parent\":4},{\"class\":null,\"href\":nul");
strBuf_18.append("l,\"id\":null,\"name\":null,\"all_attrs\":{\"unique_selector\":\"body");
strBuf_18.append("\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":");
strBuf_18.append("null,\"type\":null,\"nth_parent\":5},{\"class\":null,\"href\":null,\"");
strBuf_18.append("id\":null,\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_select");
strBuf_18.append("or\":\"html\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null");
strBuf_18.append(",\"title\":null,\"type\":null,\"nth_parent\":6}],\"selector\":\"body ");
strBuf_18.append("> div:eq(1) > form > div:eq(0) > div > input#inputName\",\"tex");
strBuf_18.append("t_content\":null,\"cursor\":\"text\",\"x_position\":175,\"y_position");
strBuf_18.append("\":358}}");
String requestData_18 = strBuf_18.toString();
			
	HTTPPostDataChunk pdc_17 = new HTTPPostDataChunk("A1EEF4D66DD15CEACEB3B76433323839", postData, requestData_18, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_17);

	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DD3CD8ECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3907", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_19(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_54 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_19", null, 0, false);
	subContainer_27.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_19", null, 0, false);
	subContainer_27.addSubInstruction(sub_55);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DD3CD91CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_19(HTTPPostData postData) {
				StringBuffer strBuf_19 = new StringBuffer();
strBuf_19.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"b171c8e2-d7ab-4f20");
strBuf_19.append("-81f5-e33486fb06ed\",\"iso_time_full\":\"2024-04-07T11:59:01.013");
strBuf_19.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:01 GMT+0530 (Ind");
strBuf_19.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_19.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_19.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_19.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_19.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_19.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_19.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_19.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_19.append("page\":36,\"time_on_page_ms\":36035},\"ip_address\":\"${keen.ip}\",");
strBuf_19.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_19.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_19.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_19.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_19.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_19.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_19.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_19.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_19.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_19.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_19.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_19.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_19.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_19.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_19.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_19.append(":\"2024-04-07T11:59:01.013Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_19.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_19.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_19.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_19.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_19.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_19.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_19.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_19.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_19.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_19.append("inputName\",\"name\":\"inputName\",\"all_attrs\":{\"id\":\"inputName\",");
strBuf_19.append("\"placeholder\":\"First Last\",\"name\":\"inputName\",\"type\":\"text\",");
strBuf_19.append("\"unique_selector\":\"#inputName\"},\"node_name\":\"INPUT\",\"tag_nam");
strBuf_19.append("e\":\"INPUT\",\"text\":null,\"title\":null,\"type\":\"text\",\"n_parents");
strBuf_19.append("\":[{\"class\":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"al");
strBuf_19.append("l_attrs\":{\"class\":\"controls\",\"unique_selector\":\":nth-child(2");
strBuf_19.append(") > .controls\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":nu");
strBuf_19.append("ll,\"title\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"contro");
strBuf_19.append("l-group\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"cla");
strBuf_19.append("ss\":\"control-group\",\"unique_selector\":\"form > :nth-child(2)\"");
strBuf_19.append("},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":nul");
strBuf_19.append("l,\"type\":null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\"");
strBuf_19.append(":null,\"name\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"htt");
strBuf_19.append("ps://blazedemo.com/confirmation.php\",\"accept-charset\":\"UTF-8");
strBuf_19.append("\",\"unique_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"F");
strBuf_19.append("ORM\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"");
strBuf_19.append("class\":\"container\",\"href\":null,\"id\":null,\"name\":null,\"all_at");
strBuf_19.append("trs\":{\"class\":\"container\",\"unique_selector\":\"body > :nth-chi");
strBuf_19.append("ld(2)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"titl");
strBuf_19.append("e\":null,\"type\":null,\"nth_parent\":4},{\"class\":null,\"href\":nul");
strBuf_19.append("l,\"id\":null,\"name\":null,\"all_attrs\":{\"unique_selector\":\"body");
strBuf_19.append("\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":");
strBuf_19.append("null,\"type\":null,\"nth_parent\":5},{\"class\":null,\"href\":null,\"");
strBuf_19.append("id\":null,\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_select");
strBuf_19.append("or\":\"html\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null");
strBuf_19.append(",\"title\":null,\"type\":null,\"nth_parent\":6}],\"selector\":\"body ");
strBuf_19.append("> div:eq(1) > form > div:eq(0) > div > input#inputName\",\"tex");
strBuf_19.append("t_content\":null,\"cursor\":\"text\",\"x_position\":175,\"y_position");
strBuf_19.append("\":358}}");
String requestData_19 = strBuf_19.toString();
			
	HTTPPostDataChunk pdc_18 = new HTTPPostDataChunk("A1EEF4D66DD3CDE6CEB3B76433323839", postData, requestData_19, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_18);

	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DD52D1ECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3907", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_20(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_56 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_18", null, 0, false);
	subContainer_28.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_18", null, 0, false);
	subContainer_28.addSubInstruction(sub_57);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DD52D21CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_20(HTTPPostData postData) {
				StringBuffer strBuf_20 = new StringBuffer();
strBuf_20.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"f0e4bf66-9bfe-4093");
strBuf_20.append("-bb80-72cebac71659\",\"iso_time_full\":\"2024-04-07T11:59:03.105");
strBuf_20.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:03 GMT+0530 (Ind");
strBuf_20.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_20.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_20.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_20.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_20.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_20.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_20.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_20.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_20.append("page\":38,\"time_on_page_ms\":38128},\"ip_address\":\"${keen.ip}\",");
strBuf_20.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_20.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_20.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_20.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_20.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_20.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_20.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_20.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_20.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_20.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_20.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_20.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_20.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_20.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_20.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_20.append(":\"2024-04-07T11:59:03.106Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_20.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_20.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_20.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_20.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_20.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_20.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_20.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_20.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_20.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_20.append("inputName\",\"name\":\"inputName\",\"all_attrs\":{\"id\":\"inputName\",");
strBuf_20.append("\"placeholder\":\"First Last\",\"name\":\"inputName\",\"type\":\"text\",");
strBuf_20.append("\"unique_selector\":\"#inputName\"},\"node_name\":\"INPUT\",\"tag_nam");
strBuf_20.append("e\":\"INPUT\",\"text\":null,\"title\":null,\"type\":\"text\",\"n_parents");
strBuf_20.append("\":[{\"class\":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"al");
strBuf_20.append("l_attrs\":{\"class\":\"controls\",\"unique_selector\":\":nth-child(2");
strBuf_20.append(") > .controls\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":nu");
strBuf_20.append("ll,\"title\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"contro");
strBuf_20.append("l-group\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"cla");
strBuf_20.append("ss\":\"control-group\",\"unique_selector\":\"form > :nth-child(2)\"");
strBuf_20.append("},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":nul");
strBuf_20.append("l,\"type\":null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\"");
strBuf_20.append(":null,\"name\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"htt");
strBuf_20.append("ps://blazedemo.com/confirmation.php\",\"accept-charset\":\"UTF-8");
strBuf_20.append("\",\"unique_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"F");
strBuf_20.append("ORM\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"");
strBuf_20.append("class\":\"container\",\"href\":null,\"id\":null,\"name\":null,\"all_at");
strBuf_20.append("trs\":{\"class\":\"container\",\"unique_selector\":\"body > :nth-chi");
strBuf_20.append("ld(2)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"titl");
strBuf_20.append("e\":null,\"type\":null,\"nth_parent\":4},{\"class\":null,\"href\":nul");
strBuf_20.append("l,\"id\":null,\"name\":null,\"all_attrs\":{\"unique_selector\":\"body");
strBuf_20.append("\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":");
strBuf_20.append("null,\"type\":null,\"nth_parent\":5},{\"class\":null,\"href\":null,\"");
strBuf_20.append("id\":null,\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_select");
strBuf_20.append("or\":\"html\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null");
strBuf_20.append(",\"title\":null,\"type\":null,\"nth_parent\":6}],\"selector\":\"body ");
strBuf_20.append("> div:eq(1) > form > div:eq(0) > div > input#inputName\",\"tex");
strBuf_20.append("t_content\":null,\"cursor\":\"text\",\"x_position\":175,\"y_position");
strBuf_20.append("\":358}}");
String requestData_20 = strBuf_20.toString();
			
	HTTPPostDataChunk pdc_19 = new HTTPPostDataChunk("A1EEF4D66DD52D76CEB3B76433323839", postData, requestData_20, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_19);

	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DD6DACECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3897", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_21(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_58 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_17", null, 0, false);
	subContainer_29.addSubInstruction(sub_58);
		ISubRule sub_59 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_17", null, 0, false);
	subContainer_29.addSubInstruction(sub_59);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DD6DAD1CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_21(HTTPPostData postData) {
				StringBuffer strBuf_21 = new StringBuffer();
strBuf_21.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"c45a763f-beaa-4fc7");
strBuf_21.append("-afb5-1b8887eb4c1f\",\"iso_time_full\":\"2024-04-07T11:59:04.637");
strBuf_21.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:04 GMT+0530 (Ind");
strBuf_21.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_21.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_21.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_21.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_21.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_21.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_21.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_21.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_21.append("page\":40,\"time_on_page_ms\":39659},\"ip_address\":\"${keen.ip}\",");
strBuf_21.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_21.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_21.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_21.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_21.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_21.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_21.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_21.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_21.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_21.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_21.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_21.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_21.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_21.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_21.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_21.append(":\"2024-04-07T11:59:04.637Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_21.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_21.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_21.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_21.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_21.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_21.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_21.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_21.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_21.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_21.append("address\",\"name\":\"address\",\"all_attrs\":{\"type\":\"text\",\"name\":");
strBuf_21.append("\"address\",\"id\":\"address\",\"placeholder\":\"123 Main St.\",\"uniqu");
strBuf_21.append("e_selector\":\"#address\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPU");
strBuf_21.append("T\",\"text\":null,\"title\":null,\"type\":\"text\",\"n_parents\":[{\"cla");
strBuf_21.append("ss\":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\"");
strBuf_21.append(":{\"class\":\"controls\",\"unique_selector\":\":nth-child(3) > .con");
strBuf_21.append("trols\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"titl");
strBuf_21.append("e\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"control-group\"");
strBuf_21.append(",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"con");
strBuf_21.append("trol-group\",\"unique_selector\":\"form > :nth-child(3)\"},\"node_");
strBuf_21.append("name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\"");
strBuf_21.append(":null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"n");
strBuf_21.append("ame\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"https://bla");
strBuf_21.append("zedemo.com/confirmation.php\",\"accept-charset\":\"UTF-8\",\"uniqu");
strBuf_21.append("e_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"te");
strBuf_21.append("xt\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"class\":\"");
strBuf_21.append("container\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"c");
strBuf_21.append("lass\":\"container\",\"unique_selector\":\"body > :nth-child(2)\"},");
strBuf_21.append("\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,");
strBuf_21.append("\"type\":null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":n");
strBuf_21.append("ull,\"name\":null,\"all_attrs\":{\"unique_selector\":\"body\"},\"node");
strBuf_21.append("_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"ty");
strBuf_21.append("pe\":null,\"nth_parent\":5},{\"class\":null,\"href\":null,\"id\":null");
strBuf_21.append(",\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"htm");
strBuf_21.append("l\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\"");
strBuf_21.append(":null,\"type\":null,\"nth_parent\":6}],\"selector\":\"body > div:eq");
strBuf_21.append("(1) > form > div:eq(1) > div > input#address\",\"text_content\"");
strBuf_21.append(":null,\"cursor\":\"text\",\"x_position\":175,\"y_position\":433}}");
String requestData_21 = strBuf_21.toString();
			
	HTTPPostDataChunk pdc_20 = new HTTPPostDataChunk("A1EEF4D66DD6DB26CEB3B76433323839", postData, requestData_21, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_20);

	}
private HTTPPage page_6(final IContainer parent) {
			HTTPThink think = new HTTPThink(5726, 1, parent, parent, "A1EEF4D66DDA0F21CEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "events_changes", "A1EEF4D66DDA0F21CEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_29(this, true, "A1EEF4D66DDA0F10CEB3B76433323839", true, true,
						"Config_3", "changes{3}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_30(this, false, "A1EEF4D66DDB95B0CEB3B76433323839", true, false,
						"Config_3", "clicks{9}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_31(this, false, "A1EEF4D66DDD1C50CEB3B76433323839", true, false,
						"Config_3", "changes{4}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 2454, 100, "A1EEF4D66DDB95BECEB3B76433323839", 3);
				httpParallel.addRequest(3, request_32(this, false, "A1EEF4D66DDEA2F0CEB3B76433323839", true, false,
						"Config_3", "changes{5}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 1596, 100, "A1EEF4D66DDD1C5ECEB3B76433323839", 3);
				httpParallel.addRequest(4, request_33(this, false, "A1EEF4D66DE09EC0CEB3B76433323839", true, false,
						"Config_3", "changes{6}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 1449, 100, "A1EEF4D66DDEA2FECEB3B76433323839", 3);
				httpParallel.addRequest(5, request_34(this, false, "A1EEF4D66DE336D0CEB3B76433323839", true, false,
						"Config_3", "clicks{10}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 2884, 100, "A1EEF4D66DE09ECECEB3B76433323839", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DDA0F25CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3897", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_22(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_60 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_16", null, 0, false);
	subContainer_30.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_16", null, 0, false);
	subContainer_30.addSubInstruction(sub_61);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DDA0F28CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_22(HTTPPostData postData) {
				StringBuffer strBuf_22 = new StringBuffer();
strBuf_22.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"a6e77bab-18fd-44c9");
strBuf_22.append("-8174-41cc3096fbb2\",\"iso_time_full\":\"2024-04-07T11:59:11.109");
strBuf_22.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:11 GMT+0530 (Ind");
strBuf_22.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_22.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_22.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_22.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_22.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_22.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_22.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_22.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_22.append("page\":46,\"time_on_page_ms\":46131},\"ip_address\":\"${keen.ip}\",");
strBuf_22.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_22.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_22.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_22.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_22.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_22.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_22.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_22.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_22.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_22.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_22.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_22.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_22.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_22.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_22.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_22.append(":\"2024-04-07T11:59:11.109Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_22.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_22.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_22.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_22.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_22.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_22.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_22.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_22.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_22.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_22.append("address\",\"name\":\"address\",\"all_attrs\":{\"type\":\"text\",\"name\":");
strBuf_22.append("\"address\",\"id\":\"address\",\"placeholder\":\"123 Main St.\",\"uniqu");
strBuf_22.append("e_selector\":\"#address\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPU");
strBuf_22.append("T\",\"text\":null,\"title\":null,\"type\":\"text\",\"n_parents\":[{\"cla");
strBuf_22.append("ss\":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\"");
strBuf_22.append(":{\"class\":\"controls\",\"unique_selector\":\":nth-child(3) > .con");
strBuf_22.append("trols\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"titl");
strBuf_22.append("e\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"control-group\"");
strBuf_22.append(",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"con");
strBuf_22.append("trol-group\",\"unique_selector\":\"form > :nth-child(3)\"},\"node_");
strBuf_22.append("name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\"");
strBuf_22.append(":null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"n");
strBuf_22.append("ame\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"https://bla");
strBuf_22.append("zedemo.com/confirmation.php\",\"accept-charset\":\"UTF-8\",\"uniqu");
strBuf_22.append("e_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"te");
strBuf_22.append("xt\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"class\":\"");
strBuf_22.append("container\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"c");
strBuf_22.append("lass\":\"container\",\"unique_selector\":\"body > :nth-child(2)\"},");
strBuf_22.append("\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,");
strBuf_22.append("\"type\":null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":n");
strBuf_22.append("ull,\"name\":null,\"all_attrs\":{\"unique_selector\":\"body\"},\"node");
strBuf_22.append("_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"ty");
strBuf_22.append("pe\":null,\"nth_parent\":5},{\"class\":null,\"href\":null,\"id\":null");
strBuf_22.append(",\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"htm");
strBuf_22.append("l\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\"");
strBuf_22.append(":null,\"type\":null,\"nth_parent\":6}],\"selector\":\"body > div:eq");
strBuf_22.append("(1) > form > div:eq(1) > div > input#address\",\"text_content\"");
strBuf_22.append(":null,\"cursor\":\"text\",\"x_position\":175,\"y_position\":433}}");
String requestData_22 = strBuf_22.toString();
			
	HTTPPostDataChunk pdc_21 = new HTTPPostDataChunk("A1EEF4D66DDA0F7DCEB3B76433323839", postData, requestData_22, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_21);

	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DDB95BECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3874", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_23(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_62 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_15", null, 0, false);
	subContainer_31.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_31.addSubInstruction(sub_63);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DDA0F25CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DDB95C1CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_23(HTTPPostData postData) {
				StringBuffer strBuf_23 = new StringBuffer();
strBuf_23.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"53a14e6f-f4a2-4683");
strBuf_23.append("-994d-1557404b97f6\",\"iso_time_full\":\"2024-04-07T11:59:11.335");
strBuf_23.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:11 GMT+0530 (Ind");
strBuf_23.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_23.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_23.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_23.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_23.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_23.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_23.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_23.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_23.append("page\":46,\"time_on_page_ms\":46357},\"ip_address\":\"${keen.ip}\",");
strBuf_23.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_23.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_23.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_23.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_23.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_23.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_23.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_23.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_23.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_23.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_23.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_23.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_23.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_23.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_23.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_23.append(":\"2024-04-07T11:59:11.335Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_23.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_23.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_23.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_23.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_23.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_23.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_23.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_23.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_23.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_23.append("city\",\"name\":\"city\",\"all_attrs\":{\"type\":\"text\",\"name\":\"city\"");
strBuf_23.append(",\"id\":\"city\",\"placeholder\":\"Anytown\",\"unique_selector\":\"#cit");
strBuf_23.append("y\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",\"text\":null,\"titl");
strBuf_23.append("e\":null,\"type\":\"text\",\"n_parents\":[{\"class\":\"controls\",\"href");
strBuf_23.append("\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"controls\"");
strBuf_23.append(",\"unique_selector\":\":nth-child(4) > .controls\"},\"node_name\":");
strBuf_23.append("\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,");
strBuf_23.append("\"nth_parent\":1},{\"class\":\"control-group\",\"href\":null,\"id\":nu");
strBuf_23.append("ll,\"name\":null,\"all_attrs\":{\"class\":\"control-group\",\"unique_");
strBuf_23.append("selector\":\"form > :nth-child(4)\"},\"node_name\":\"DIV\",\"tag_nam");
strBuf_23.append("e\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":2");
strBuf_23.append("},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs");
strBuf_23.append("\":{\"method\":\"POST\",\"action\":\"https://blazedemo.com/confirmat");
strBuf_23.append("ion.php\",\"accept-charset\":\"UTF-8\",\"unique_selector\":\"form\"},");
strBuf_23.append("\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":nul");
strBuf_23.append("l,\"type\":null,\"nth_parent\":3},{\"class\":\"container\",\"href\":nu");
strBuf_23.append("ll,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"container\",\"u");
strBuf_23.append("nique_selector\":\"body > :nth-child(2)\"},\"node_name\":\"DIV\",\"t");
strBuf_23.append("ag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_par");
strBuf_23.append("ent\":4},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_23.append("_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"tag_n");
strBuf_23.append("ame\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent");
strBuf_23.append("\":5},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_at");
strBuf_23.append("trs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"HTM");
strBuf_23.append("L\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":null,\"n");
strBuf_23.append("th_parent\":6}],\"selector\":\"body > div:eq(1) > form > div:eq(");
strBuf_23.append("2) > div > input#city\",\"text_content\":null,\"cursor\":\"text\",\"");
strBuf_23.append("x_position\":175,\"y_position\":507}}");
String requestData_23 = strBuf_23.toString();
			
	HTTPPostDataChunk pdc_22 = new HTTPPostDataChunk("A1EEF4D66DDB9616CEB3B76433323839", postData, requestData_23, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_22);

	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DDD1C5ECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3874", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_24(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_64 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_14", null, 0, false);
	subContainer_32.addSubInstruction(sub_64);
		ISubRule sub_65 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_14", null, 0, false);
	subContainer_32.addSubInstruction(sub_65);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DDD1C61CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_24(HTTPPostData postData) {
				StringBuffer strBuf_24 = new StringBuffer();
strBuf_24.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"1cbd5cda-1d1d-4320");
strBuf_24.append("-adba-d1a3b2b25bfd\",\"iso_time_full\":\"2024-04-07T11:59:14.559");
strBuf_24.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:14 GMT+0530 (Ind");
strBuf_24.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_24.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_24.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_24.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_24.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_24.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_24.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_24.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_24.append("page\":50,\"time_on_page_ms\":49581},\"ip_address\":\"${keen.ip}\",");
strBuf_24.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_24.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_24.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_24.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_24.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_24.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_24.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_24.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_24.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_24.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_24.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_24.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_24.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_24.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_24.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_24.append(":\"2024-04-07T11:59:14.559Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_24.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_24.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_24.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_24.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_24.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_24.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_24.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_24.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_24.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_24.append("city\",\"name\":\"city\",\"all_attrs\":{\"type\":\"text\",\"name\":\"city\"");
strBuf_24.append(",\"id\":\"city\",\"placeholder\":\"Anytown\",\"unique_selector\":\"#cit");
strBuf_24.append("y\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",\"text\":null,\"titl");
strBuf_24.append("e\":null,\"type\":\"text\",\"n_parents\":[{\"class\":\"controls\",\"href");
strBuf_24.append("\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"controls\"");
strBuf_24.append(",\"unique_selector\":\":nth-child(4) > .controls\"},\"node_name\":");
strBuf_24.append("\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,");
strBuf_24.append("\"nth_parent\":1},{\"class\":\"control-group\",\"href\":null,\"id\":nu");
strBuf_24.append("ll,\"name\":null,\"all_attrs\":{\"class\":\"control-group\",\"unique_");
strBuf_24.append("selector\":\"form > :nth-child(4)\"},\"node_name\":\"DIV\",\"tag_nam");
strBuf_24.append("e\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":2");
strBuf_24.append("},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs");
strBuf_24.append("\":{\"method\":\"POST\",\"action\":\"https://blazedemo.com/confirmat");
strBuf_24.append("ion.php\",\"accept-charset\":\"UTF-8\",\"unique_selector\":\"form\"},");
strBuf_24.append("\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":nul");
strBuf_24.append("l,\"type\":null,\"nth_parent\":3},{\"class\":\"container\",\"href\":nu");
strBuf_24.append("ll,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"container\",\"u");
strBuf_24.append("nique_selector\":\"body > :nth-child(2)\"},\"node_name\":\"DIV\",\"t");
strBuf_24.append("ag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_par");
strBuf_24.append("ent\":4},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_24.append("_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"tag_n");
strBuf_24.append("ame\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent");
strBuf_24.append("\":5},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_at");
strBuf_24.append("trs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"HTM");
strBuf_24.append("L\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":null,\"n");
strBuf_24.append("th_parent\":6}],\"selector\":\"body > div:eq(1) > form > div:eq(");
strBuf_24.append("2) > div > input#city\",\"text_content\":null,\"cursor\":\"text\",\"");
strBuf_24.append("x_position\":175,\"y_position\":507}}");
String requestData_24 = strBuf_24.toString();
			
	HTTPPostDataChunk pdc_23 = new HTTPPostDataChunk("A1EEF4D66DDD1CB6CEB3B76433323839", postData, requestData_24, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_23);

	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DDEA2FECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_25(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_66 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_13", null, 0, false);
	subContainer_33.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_33.addSubInstruction(sub_67);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DDEA301CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_25(HTTPPostData postData) {
				StringBuffer strBuf_25 = new StringBuffer();
strBuf_25.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"bc0c7b27-9d99-4f0b");
strBuf_25.append("-bc9e-0900703aff9c\",\"iso_time_full\":\"2024-04-07T11:59:16.899");
strBuf_25.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:16 GMT+0530 (Ind");
strBuf_25.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_25.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_25.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_25.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_25.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_25.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_25.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_25.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_25.append("page\":52,\"time_on_page_ms\":51921},\"ip_address\":\"${keen.ip}\",");
strBuf_25.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_25.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_25.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_25.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_25.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_25.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_25.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_25.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_25.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_25.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_25.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_25.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_25.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_25.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_25.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_25.append(":\"2024-04-07T11:59:16.899Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_25.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_25.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_25.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_25.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_25.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_25.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_25.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_25.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_25.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_25.append("state\",\"name\":\"state\",\"all_attrs\":{\"type\":\"text\",\"name\":\"sta");
strBuf_25.append("te\",\"id\":\"state\",\"placeholder\":\"State\",\"unique_selector\":\"#s");
strBuf_25.append("tate\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",\"text\":null,\"t");
strBuf_25.append("itle\":null,\"type\":\"text\",\"n_parents\":[{\"class\":\"controls\",\"h");
strBuf_25.append("ref\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"contro");
strBuf_25.append("ls\",\"unique_selector\":\":nth-child(5) > .controls\"},\"node_nam");
strBuf_25.append("e\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":nu");
strBuf_25.append("ll,\"nth_parent\":1},{\"class\":\"control-group\",\"href\":null,\"id\"");
strBuf_25.append(":null,\"name\":null,\"all_attrs\":{\"class\":\"control-group\",\"uniq");
strBuf_25.append("ue_selector\":\"form > :nth-child(5)\"},\"node_name\":\"DIV\",\"tag_");
strBuf_25.append("name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent");
strBuf_25.append("\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_at");
strBuf_25.append("trs\":{\"method\":\"POST\",\"action\":\"https://blazedemo.com/confir");
strBuf_25.append("mation.php\",\"accept-charset\":\"UTF-8\",\"unique_selector\":\"form");
strBuf_25.append("\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":");
strBuf_25.append("null,\"type\":null,\"nth_parent\":3},{\"class\":\"container\",\"href\"");
strBuf_25.append(":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"container\"");
strBuf_25.append(",\"unique_selector\":\"body > :nth-child(2)\"},\"node_name\":\"DIV\"");
strBuf_25.append(",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_");
strBuf_25.append("parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"");
strBuf_25.append("all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"ta");
strBuf_25.append("g_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_par");
strBuf_25.append("ent\":5},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_25.append("_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"");
strBuf_25.append("HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":null");
strBuf_25.append(",\"nth_parent\":6}],\"selector\":\"body > div:eq(1) > form > div:");
strBuf_25.append("eq(3) > div > input#state\",\"text_content\":null,\"cursor\":\"tex");
strBuf_25.append("t\",\"x_position\":175,\"y_position\":582}}");
String requestData_25 = strBuf_25.toString();
			
	HTTPPostDataChunk pdc_24 = new HTTPPostDataChunk("A1EEF4D66DDEA356CEB3B76433323839", postData, requestData_25, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_24);

	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DE09ECECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3890", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_26(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_68 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_12", null, 0, false);
	subContainer_34.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_12", null, 0, false);
	subContainer_34.addSubInstruction(sub_69);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DE09ED1CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_26(HTTPPostData postData) {
				StringBuffer strBuf_26 = new StringBuffer();
strBuf_26.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"bd6b3220-34e2-4354");
strBuf_26.append("-9ef3-ea3f381da34c\",\"iso_time_full\":\"2024-04-07T11:59:19.114");
strBuf_26.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:19 GMT+0530 (Ind");
strBuf_26.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_26.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_26.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_26.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_26.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_26.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_26.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_26.append("703,\"pixel_max\":703,\"ratio\":0.61,\"ratio_max\":0.61},\"time_on_");
strBuf_26.append("page\":54,\"time_on_page_ms\":54136},\"ip_address\":\"${keen.ip}\",");
strBuf_26.append("\"geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\"");
strBuf_26.append(":{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMe");
strBuf_26.append("ter demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":");
strBuf_26.append("true,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT");
strBuf_26.append(" 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Ch");
strBuf_26.append("rome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.");
strBuf_26.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_26.append("/123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":153");
strBuf_26.append("6,\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWi");
strBuf_26.append("dth\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"win");
strBuf_26.append("dow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":");
strBuf_26.append("{\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedem");
strBuf_26.append("o.com/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https:");
strBuf_26.append("//blazedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\"");
strBuf_26.append(",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\"");
strBuf_26.append(":\"2024-04-07T11:59:19.114Z\",\"addons\":[{\"name\":\"keen:ua_parse");
strBuf_26.append("r\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"nam");
strBuf_26.append("e\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"ur");
strBuf_26.append("l.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.");
strBuf_26.append("full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_par");
strBuf_26.append("ser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.u");
strBuf_26.append("tc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"l");
strBuf_26.append("ocal_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_");
strBuf_26.append("geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},");
strBuf_26.append("\"output\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"");
strBuf_26.append("zipCode\",\"name\":\"zipCode\",\"all_attrs\":{\"type\":\"text\",\"name\":");
strBuf_26.append("\"zipCode\",\"id\":\"zipCode\",\"placeholder\":\"12345\",\"unique_selec");
strBuf_26.append("tor\":\"#zipCode\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",\"tex");
strBuf_26.append("t\":null,\"title\":null,\"type\":\"text\",\"n_parents\":[{\"class\":\"co");
strBuf_26.append("ntrols\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"clas");
strBuf_26.append("s\":\"controls\",\"unique_selector\":\":nth-child(6) > .controls\"}");
strBuf_26.append(",\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null");
strBuf_26.append(",\"type\":null,\"nth_parent\":1},{\"class\":\"control-group\",\"href\"");
strBuf_26.append(":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"control-gr");
strBuf_26.append("oup\",\"unique_selector\":\"form > :nth-child(6)\"},\"node_name\":\"");
strBuf_26.append("DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"");
strBuf_26.append("nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":nu");
strBuf_26.append("ll,\"all_attrs\":{\"method\":\"POST\",\"action\":\"https://blazedemo.");
strBuf_26.append("com/confirmation.php\",\"accept-charset\":\"UTF-8\",\"unique_selec");
strBuf_26.append("tor\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":nul");
strBuf_26.append("l,\"title\":null,\"type\":null,\"nth_parent\":3},{\"class\":\"contain");
strBuf_26.append("er\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"");
strBuf_26.append("container\",\"unique_selector\":\"body > :nth-child(2)\"},\"node_n");
strBuf_26.append("ame\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":");
strBuf_26.append("null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"na");
strBuf_26.append("me\":null,\"all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":");
strBuf_26.append("\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":nul");
strBuf_26.append("l,\"nth_parent\":5},{\"class\":null,\"href\":null,\"id\":null,\"name\"");
strBuf_26.append(":null,\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"no");
strBuf_26.append("de_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"");
strBuf_26.append("type\":null,\"nth_parent\":6}],\"selector\":\"body > div:eq(1) > f");
strBuf_26.append("orm > div:eq(4) > div > input#zipCode\",\"text_content\":null,\"");
strBuf_26.append("cursor\":\"text\",\"x_position\":175,\"y_position\":657}}");
String requestData_26 = strBuf_26.toString();
			
	HTTPPostDataChunk pdc_25 = new HTTPPostDataChunk("A1EEF4D66DE09F26CEB3B76433323839", postData, requestData_26, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_25);

	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DE336DECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3987", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_27(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_70 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_11", null, 0, false);
	subContainer_35.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_35.addSubInstruction(sub_71);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DE336E1CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_27(HTTPPostData postData) {
				StringBuffer strBuf_27 = new StringBuffer();
strBuf_27.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"ea0ced2d-fa9f-4ccd");
strBuf_27.append("-b734-91291b8b8450\",\"iso_time_full\":\"2024-04-07T11:59:22.763");
strBuf_27.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:22 GMT+0530 (Ind");
strBuf_27.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_27.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_27.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_27.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_27.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_27.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_27.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_27.append("1097.3999938964844,\"pixel_max\":1097.3999938964844,\"ratio\":0.");
strBuf_27.append("95,\"ratio_max\":0.95},\"time_on_page\":58,\"time_on_page_ms\":577");
strBuf_27.append("85},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_agent\":\"${keen.");
strBuf_27.append("user_agent}\",\"tech\":{\"profile\":{\"cookies\":true,\"codeName\":\"M");
strBuf_27.append("ozilla\",\"description\":\"BlazeMeter demo app\",\"language\":\"en-U");
strBuf_27.append("S\",\"name\":\"Netscape\",\"online\":true,\"platform\":\"Win32\",\"usera");
strBuf_27.append("gent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit");
strBuf_27.append("/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",");
strBuf_27.append("\"version\":\"5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537");
strBuf_27.append(".36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",\"scr");
strBuf_27.append("een\":{\"height\":864,\"width\":1536,\"colorDepth\":24,\"pixelDepth\"");
strBuf_27.append(":24,\"availHeight\":824,\"availWidth\":1536,\"orientation\":{\"angl");
strBuf_27.append("e\":0,\"type\":\"landscape\"}},\"window\":{\"height\":703,\"width\":153");
strBuf_27.append("6,\"scrollHeight\":1159,\"ratio\":{\"height\":0.85,\"width\":1}}}},\"");
strBuf_27.append("url\":{\"full\":\"https://blazedemo.com/purchase.php\",\"info\":{}}");
strBuf_27.append(",\"referrer\":{\"initial\":\"https://blazedemo.com/\",\"full\":\"http");
strBuf_27.append("s://blazedemo.com/reserve.php\",\"info\":{}},\"time\":{\"local\":{}");
strBuf_27.append(",\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:59:22.763Z\",\"a");
strBuf_27.append("ddons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_");
strBuf_27.append("agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{");
strBuf_27.append("\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_par");
strBuf_27.append("ser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info");
strBuf_27.append("\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"kee");
strBuf_27.append("n.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_p");
strBuf_27.append("arser\",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"tim");
strBuf_27.append("e.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address");
strBuf_27.append("\",\"remove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"");
strBuf_27.append("class\":null,\"href\":null,\"id\":\"creditCardNumber\",\"name\":\"cred");
strBuf_27.append("itCardNumber\",\"all_attrs\":{\"type\":\"text\",\"id\":\"creditCardNum");
strBuf_27.append("ber\",\"name\":\"creditCardNumber\",\"placeholder\":\"Credit Card Nu");
strBuf_27.append("mber\",\"unique_selector\":\"#creditCardNumber\"},\"node_name\":\"IN");
strBuf_27.append("PUT\",\"tag_name\":\"INPUT\",\"text\":null,\"title\":null,\"type\":\"tex");
strBuf_27.append("t\",\"n_parents\":[{\"class\":\"controls\",\"href\":null,\"id\":null,\"n");
strBuf_27.append("ame\":null,\"all_attrs\":{\"class\":\"controls\",\"unique_selector\":");
strBuf_27.append("\":nth-child(8) > .controls\"},\"node_name\":\"DIV\",\"tag_name\":\"D");
strBuf_27.append("IV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":1},{\"c");
strBuf_27.append("lass\":\"control-group\",\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_27.append("_attrs\":{\"class\":\"control-group\",\"unique_selector\":\"form > :");
strBuf_27.append("nth-child(8)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":nul");
strBuf_27.append("l,\"title\":null,\"type\":null,\"nth_parent\":2},{\"class\":null,\"hr");
strBuf_27.append("ef\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"method\":\"POST\",");
strBuf_27.append("\"action\":\"https://blazedemo.com/confirmation.php\",\"accept-ch");
strBuf_27.append("arset\":\"UTF-8\",\"unique_selector\":\"form\"},\"node_name\":\"FORM\",");
strBuf_27.append("\"tag_name\":\"FORM\",\"text\":null,\"title\":null,\"type\":null,\"nth_");
strBuf_27.append("parent\":3},{\"class\":\"container\",\"href\":null,\"id\":null,\"name\"");
strBuf_27.append(":null,\"all_attrs\":{\"class\":\"container\",\"unique_selector\":\"bo");
strBuf_27.append("dy > :nth-child(2)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"tex");
strBuf_27.append("t\":null,\"title\":null,\"type\":null,\"nth_parent\":4},{\"class\":nu");
strBuf_27.append("ll,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"unique_se");
strBuf_27.append("lector\":\"body\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":");
strBuf_27.append("null,\"title\":null,\"type\":null,\"nth_parent\":5},{\"class\":null,");
strBuf_27.append("\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"");
strBuf_27.append("unique_selector\":\"html\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML");
strBuf_27.append("\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":6}],\"sel");
strBuf_27.append("ector\":\"body > div:eq(1) > form > div:eq(6) > div > input#cr");
strBuf_27.append("editCardNumber\",\"text_content\":null,\"cursor\":\"text\",\"x_posit");
strBuf_27.append("ion\":175,\"y_position\":806}}");
String requestData_27 = strBuf_27.toString();
			
	HTTPPostDataChunk pdc_26 = new HTTPPostDataChunk("A1EEF4D66DE33736CEB3B76433323839", postData, requestData_27, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_26);

	}
private HTTPPage page_7(final IContainer parent) {
			HTTPThink think = new HTTPThink(5537, 1, parent, parent, "A1EEF4D66DE64421CEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "events_changes {1}", "A1EEF4D66DE64421CEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(4, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_35(this, true, "A1EEF4D66DE64410CEB3B76433323839", true, true,
						"Config_3", "changes{7}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_36(this, false, "A1EEF4D66DE7A3A0CEB3B76433323839", true, false,
						"Config_3", "clicks{11}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_37(this, false, "A1EEF4D66DE97860CEB3B76433323839", true, false,
						"Config_3", "changes{8}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 2675, 100, "A1EEF4D66DE7A3AECEB3B76433323839", 3);
				httpParallel.addRequest(3, request_38(this, false, "A1EEF4D66DEAB0E0CEB3B76433323839", true, false,
						"Config_3", "clicks{12}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 2894, 100, "A1EEF4D66DE7A3AECEB3B76433323839", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DE64425CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3987", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_28(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_72 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_10", null, 0, false);
	subContainer_36.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_10", null, 0, false);
	subContainer_36.addSubInstruction(sub_73);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DE64428CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_28(HTTPPostData postData) {
				StringBuffer strBuf_28 = new StringBuffer();
strBuf_28.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"ea050ef9-a479-4d97");
strBuf_28.append("-be48-d0db0390200a\",\"iso_time_full\":\"2024-04-07T11:59:29.042");
strBuf_28.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:29 GMT+0530 (Ind");
strBuf_28.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_28.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_28.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_28.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_28.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_28.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_28.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_28.append("1097.3999938964844,\"pixel_max\":1097.3999938964844,\"ratio\":0.");
strBuf_28.append("95,\"ratio_max\":0.95},\"time_on_page\":64,\"time_on_page_ms\":640");
strBuf_28.append("64},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_agent\":\"${keen.");
strBuf_28.append("user_agent}\",\"tech\":{\"profile\":{\"cookies\":true,\"codeName\":\"M");
strBuf_28.append("ozilla\",\"description\":\"BlazeMeter demo app\",\"language\":\"en-U");
strBuf_28.append("S\",\"name\":\"Netscape\",\"online\":true,\"platform\":\"Win32\",\"usera");
strBuf_28.append("gent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit");
strBuf_28.append("/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",");
strBuf_28.append("\"version\":\"5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537");
strBuf_28.append(".36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",\"scr");
strBuf_28.append("een\":{\"height\":864,\"width\":1536,\"colorDepth\":24,\"pixelDepth\"");
strBuf_28.append(":24,\"availHeight\":824,\"availWidth\":1536,\"orientation\":{\"angl");
strBuf_28.append("e\":0,\"type\":\"landscape\"}},\"window\":{\"height\":703,\"width\":153");
strBuf_28.append("6,\"scrollHeight\":1159,\"ratio\":{\"height\":0.85,\"width\":1}}}},\"");
strBuf_28.append("url\":{\"full\":\"https://blazedemo.com/purchase.php\",\"info\":{}}");
strBuf_28.append(",\"referrer\":{\"initial\":\"https://blazedemo.com/\",\"full\":\"http");
strBuf_28.append("s://blazedemo.com/reserve.php\",\"info\":{}},\"time\":{\"local\":{}");
strBuf_28.append(",\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:59:29.042Z\",\"a");
strBuf_28.append("ddons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_");
strBuf_28.append("agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{");
strBuf_28.append("\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_par");
strBuf_28.append("ser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info");
strBuf_28.append("\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"kee");
strBuf_28.append("n.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_p");
strBuf_28.append("arser\",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"tim");
strBuf_28.append("e.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address");
strBuf_28.append("\",\"remove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"");
strBuf_28.append("class\":null,\"href\":null,\"id\":\"creditCardNumber\",\"name\":\"cred");
strBuf_28.append("itCardNumber\",\"all_attrs\":{\"type\":\"text\",\"id\":\"creditCardNum");
strBuf_28.append("ber\",\"name\":\"creditCardNumber\",\"placeholder\":\"Credit Card Nu");
strBuf_28.append("mber\",\"unique_selector\":\"#creditCardNumber\"},\"node_name\":\"IN");
strBuf_28.append("PUT\",\"tag_name\":\"INPUT\",\"text\":null,\"title\":null,\"type\":\"tex");
strBuf_28.append("t\",\"n_parents\":[{\"class\":\"controls\",\"href\":null,\"id\":null,\"n");
strBuf_28.append("ame\":null,\"all_attrs\":{\"class\":\"controls\",\"unique_selector\":");
strBuf_28.append("\":nth-child(8) > .controls\"},\"node_name\":\"DIV\",\"tag_name\":\"D");
strBuf_28.append("IV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":1},{\"c");
strBuf_28.append("lass\":\"control-group\",\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_28.append("_attrs\":{\"class\":\"control-group\",\"unique_selector\":\"form > :");
strBuf_28.append("nth-child(8)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":nul");
strBuf_28.append("l,\"title\":null,\"type\":null,\"nth_parent\":2},{\"class\":null,\"hr");
strBuf_28.append("ef\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"method\":\"POST\",");
strBuf_28.append("\"action\":\"https://blazedemo.com/confirmation.php\",\"accept-ch");
strBuf_28.append("arset\":\"UTF-8\",\"unique_selector\":\"form\"},\"node_name\":\"FORM\",");
strBuf_28.append("\"tag_name\":\"FORM\",\"text\":null,\"title\":null,\"type\":null,\"nth_");
strBuf_28.append("parent\":3},{\"class\":\"container\",\"href\":null,\"id\":null,\"name\"");
strBuf_28.append(":null,\"all_attrs\":{\"class\":\"container\",\"unique_selector\":\"bo");
strBuf_28.append("dy > :nth-child(2)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"tex");
strBuf_28.append("t\":null,\"title\":null,\"type\":null,\"nth_parent\":4},{\"class\":nu");
strBuf_28.append("ll,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"unique_se");
strBuf_28.append("lector\":\"body\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":");
strBuf_28.append("null,\"title\":null,\"type\":null,\"nth_parent\":5},{\"class\":null,");
strBuf_28.append("\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"");
strBuf_28.append("unique_selector\":\"html\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML");
strBuf_28.append("\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":6}],\"sel");
strBuf_28.append("ector\":\"body > div:eq(1) > form > div:eq(6) > div > input#cr");
strBuf_28.append("editCardNumber\",\"text_content\":null,\"cursor\":\"text\",\"x_posit");
strBuf_28.append("ion\":175,\"y_position\":806}}");
String requestData_28 = strBuf_28.toString();
			
	HTTPPostDataChunk pdc_27 = new HTTPPostDataChunk("A1EEF4D66DE6447DCEB3B76433323839", postData, requestData_28, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_27);

	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DE7A3AECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3963", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_29(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_74 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_9", null, 0, false);
	subContainer_37.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_37.addSubInstruction(sub_75);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EEF4D66DE64425CEB3B76433323839"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DE7A3B1CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_29(HTTPPostData postData) {
				StringBuffer strBuf_29 = new StringBuffer();
strBuf_29.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"d72711bf-bdfd-4f5a");
strBuf_29.append("-83a2-1a2fdcff11ae\",\"iso_time_full\":\"2024-04-07T11:59:29.259");
strBuf_29.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:29 GMT+0530 (Ind");
strBuf_29.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_29.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_29.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_29.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_29.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_29.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_29.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_29.append("1097.3999938964844,\"pixel_max\":1097.3999938964844,\"ratio\":0.");
strBuf_29.append("95,\"ratio_max\":0.95},\"time_on_page\":64,\"time_on_page_ms\":642");
strBuf_29.append("81},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_agent\":\"${keen.");
strBuf_29.append("user_agent}\",\"tech\":{\"profile\":{\"cookies\":true,\"codeName\":\"M");
strBuf_29.append("ozilla\",\"description\":\"BlazeMeter demo app\",\"language\":\"en-U");
strBuf_29.append("S\",\"name\":\"Netscape\",\"online\":true,\"platform\":\"Win32\",\"usera");
strBuf_29.append("gent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit");
strBuf_29.append("/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",");
strBuf_29.append("\"version\":\"5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537");
strBuf_29.append(".36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",\"scr");
strBuf_29.append("een\":{\"height\":864,\"width\":1536,\"colorDepth\":24,\"pixelDepth\"");
strBuf_29.append(":24,\"availHeight\":824,\"availWidth\":1536,\"orientation\":{\"angl");
strBuf_29.append("e\":0,\"type\":\"landscape\"}},\"window\":{\"height\":703,\"width\":153");
strBuf_29.append("6,\"scrollHeight\":1159,\"ratio\":{\"height\":0.85,\"width\":1}}}},\"");
strBuf_29.append("url\":{\"full\":\"https://blazedemo.com/purchase.php\",\"info\":{}}");
strBuf_29.append(",\"referrer\":{\"initial\":\"https://blazedemo.com/\",\"full\":\"http");
strBuf_29.append("s://blazedemo.com/reserve.php\",\"info\":{}},\"time\":{\"local\":{}");
strBuf_29.append(",\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:59:29.259Z\",\"a");
strBuf_29.append("ddons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_");
strBuf_29.append("agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{");
strBuf_29.append("\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_par");
strBuf_29.append("ser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info");
strBuf_29.append("\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"kee");
strBuf_29.append("n.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_p");
strBuf_29.append("arser\",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"tim");
strBuf_29.append("e.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address");
strBuf_29.append("\",\"remove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"");
strBuf_29.append("class\":null,\"href\":null,\"id\":\"creditCardYear\",\"name\":\"credit");
strBuf_29.append("CardYear\",\"all_attrs\":{\"type\":\"text\",\"id\":\"creditCardYear\",\"");
strBuf_29.append("name\":\"creditCardYear\",\"placeholder\":\"Year\",\"unique_selector");
strBuf_29.append("\":\"#creditCardYear\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",");
strBuf_29.append("\"text\":null,\"title\":null,\"type\":\"text\",\"n_parents\":[{\"class\"");
strBuf_29.append(":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"");
strBuf_29.append("class\":\"controls\",\"unique_selector\":\":nth-child(10) > .contr");
strBuf_29.append("ols\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\"");
strBuf_29.append(":null,\"type\":null,\"nth_parent\":1},{\"class\":\"control-group\",\"");
strBuf_29.append("href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"contr");
strBuf_29.append("ol-group\",\"unique_selector\":\"form > :nth-child(10)\"},\"node_n");
strBuf_29.append("ame\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":");
strBuf_29.append("null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"na");
strBuf_29.append("me\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"https://blaz");
strBuf_29.append("edemo.com/confirmation.php\",\"accept-charset\":\"UTF-8\",\"unique");
strBuf_29.append("_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"tex");
strBuf_29.append("t\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"class\":\"c");
strBuf_29.append("ontainer\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"cl");
strBuf_29.append("ass\":\"container\",\"unique_selector\":\"body > :nth-child(2)\"},\"");
strBuf_29.append("node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"");
strBuf_29.append("type\":null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":nu");
strBuf_29.append("ll,\"name\":null,\"all_attrs\":{\"unique_selector\":\"body\"},\"node_");
strBuf_29.append("name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"typ");
strBuf_29.append("e\":null,\"nth_parent\":5},{\"class\":null,\"href\":null,\"id\":null,");
strBuf_29.append("\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html");
strBuf_29.append("\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":");
strBuf_29.append("null,\"type\":null,\"nth_parent\":6}],\"selector\":\"body > div:eq(");
strBuf_29.append("1) > form > div:eq(8) > div > input#creditCardYear\",\"text_co");
strBuf_29.append("ntent\":null,\"cursor\":\"text\",\"x_position\":175,\"y_position\":95");
strBuf_29.append("5}}");
String requestData_29 = strBuf_29.toString();
			
	HTTPPostDataChunk pdc_28 = new HTTPPostDataChunk("A1EEF4D66DE7A406CEB3B76433323839", postData, requestData_29, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_28);

	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DE9786ECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3963", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_30(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_76 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_8", null, 0, false);
	subContainer_38.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_8", null, 0, false);
	subContainer_38.addSubInstruction(sub_77);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DE97871CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_30(HTTPPostData postData) {
				StringBuffer strBuf_30 = new StringBuffer();
strBuf_30.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"7e32824c-0144-422b");
strBuf_30.append("-8211-46430912e347\",\"iso_time_full\":\"2024-04-07T11:59:32.688");
strBuf_30.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:32 GMT+0530 (Ind");
strBuf_30.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_30.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_30.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_30.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_30.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_30.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_30.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_30.append("1097.3999938964844,\"pixel_max\":1097.3999938964844,\"ratio\":0.");
strBuf_30.append("95,\"ratio_max\":0.95},\"time_on_page\":68,\"time_on_page_ms\":677");
strBuf_30.append("10},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_agent\":\"${keen.");
strBuf_30.append("user_agent}\",\"tech\":{\"profile\":{\"cookies\":true,\"codeName\":\"M");
strBuf_30.append("ozilla\",\"description\":\"BlazeMeter demo app\",\"language\":\"en-U");
strBuf_30.append("S\",\"name\":\"Netscape\",\"online\":true,\"platform\":\"Win32\",\"usera");
strBuf_30.append("gent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit");
strBuf_30.append("/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",");
strBuf_30.append("\"version\":\"5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537");
strBuf_30.append(".36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",\"scr");
strBuf_30.append("een\":{\"height\":864,\"width\":1536,\"colorDepth\":24,\"pixelDepth\"");
strBuf_30.append(":24,\"availHeight\":824,\"availWidth\":1536,\"orientation\":{\"angl");
strBuf_30.append("e\":0,\"type\":\"landscape\"}},\"window\":{\"height\":703,\"width\":153");
strBuf_30.append("6,\"scrollHeight\":1159,\"ratio\":{\"height\":0.85,\"width\":1}}}},\"");
strBuf_30.append("url\":{\"full\":\"https://blazedemo.com/purchase.php\",\"info\":{}}");
strBuf_30.append(",\"referrer\":{\"initial\":\"https://blazedemo.com/\",\"full\":\"http");
strBuf_30.append("s://blazedemo.com/reserve.php\",\"info\":{}},\"time\":{\"local\":{}");
strBuf_30.append(",\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:59:32.688Z\",\"a");
strBuf_30.append("ddons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_");
strBuf_30.append("agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{");
strBuf_30.append("\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_par");
strBuf_30.append("ser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info");
strBuf_30.append("\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"kee");
strBuf_30.append("n.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_p");
strBuf_30.append("arser\",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"tim");
strBuf_30.append("e.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address");
strBuf_30.append("\",\"remove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"");
strBuf_30.append("class\":null,\"href\":null,\"id\":\"creditCardYear\",\"name\":\"credit");
strBuf_30.append("CardYear\",\"all_attrs\":{\"type\":\"text\",\"id\":\"creditCardYear\",\"");
strBuf_30.append("name\":\"creditCardYear\",\"placeholder\":\"Year\",\"unique_selector");
strBuf_30.append("\":\"#creditCardYear\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",");
strBuf_30.append("\"text\":null,\"title\":null,\"type\":\"text\",\"n_parents\":[{\"class\"");
strBuf_30.append(":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"");
strBuf_30.append("class\":\"controls\",\"unique_selector\":\":nth-child(10) > .contr");
strBuf_30.append("ols\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\"");
strBuf_30.append(":null,\"type\":null,\"nth_parent\":1},{\"class\":\"control-group\",\"");
strBuf_30.append("href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"contr");
strBuf_30.append("ol-group\",\"unique_selector\":\"form > :nth-child(10)\"},\"node_n");
strBuf_30.append("ame\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":");
strBuf_30.append("null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"id\":null,\"na");
strBuf_30.append("me\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"https://blaz");
strBuf_30.append("edemo.com/confirmation.php\",\"accept-charset\":\"UTF-8\",\"unique");
strBuf_30.append("_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"tex");
strBuf_30.append("t\":null,\"title\":null,\"type\":null,\"nth_parent\":3},{\"class\":\"c");
strBuf_30.append("ontainer\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"cl");
strBuf_30.append("ass\":\"container\",\"unique_selector\":\"body > :nth-child(2)\"},\"");
strBuf_30.append("node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"");
strBuf_30.append("type\":null,\"nth_parent\":4},{\"class\":null,\"href\":null,\"id\":nu");
strBuf_30.append("ll,\"name\":null,\"all_attrs\":{\"unique_selector\":\"body\"},\"node_");
strBuf_30.append("name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"title\":null,\"typ");
strBuf_30.append("e\":null,\"nth_parent\":5},{\"class\":null,\"href\":null,\"id\":null,");
strBuf_30.append("\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html");
strBuf_30.append("\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":");
strBuf_30.append("null,\"type\":null,\"nth_parent\":6}],\"selector\":\"body > div:eq(");
strBuf_30.append("1) > form > div:eq(8) > div > input#creditCardYear\",\"text_co");
strBuf_30.append("ntent\":null,\"cursor\":\"text\",\"x_position\":175,\"y_position\":95");
strBuf_30.append("5}}");
String requestData_30 = strBuf_30.toString();
			
	HTTPPostDataChunk pdc_29 = new HTTPPostDataChunk("A1EEF4D66DE978C6CEB3B76433323839", postData, requestData_30, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_29);

	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DEAB0EECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3946", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_31(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_78 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_7", null, 0, false);
	subContainer_39.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_39.addSubInstruction(sub_79);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DEAB0F1CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_31(HTTPPostData postData) {
				StringBuffer strBuf_31 = new StringBuffer();
strBuf_31.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"c1f2fc2d-88fd-4970");
strBuf_31.append("-ae8a-0e582dc499e7\",\"iso_time_full\":\"2024-04-07T11:59:32.907");
strBuf_31.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:32 GMT+0530 (Ind");
strBuf_31.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_31.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_31.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_31.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_31.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_31.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_31.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_31.append("1097.3999938964844,\"pixel_max\":1097.3999938964844,\"ratio\":0.");
strBuf_31.append("95,\"ratio_max\":0.95},\"time_on_page\":68,\"time_on_page_ms\":679");
strBuf_31.append("29},\"ip_address\":\"${keen.ip}\",\"geo\":{},\"user_agent\":\"${keen.");
strBuf_31.append("user_agent}\",\"tech\":{\"profile\":{\"cookies\":true,\"codeName\":\"M");
strBuf_31.append("ozilla\",\"description\":\"BlazeMeter demo app\",\"language\":\"en-U");
strBuf_31.append("S\",\"name\":\"Netscape\",\"online\":true,\"platform\":\"Win32\",\"usera");
strBuf_31.append("gent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit");
strBuf_31.append("/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",");
strBuf_31.append("\"version\":\"5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537");
strBuf_31.append(".36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36\",\"scr");
strBuf_31.append("een\":{\"height\":864,\"width\":1536,\"colorDepth\":24,\"pixelDepth\"");
strBuf_31.append(":24,\"availHeight\":824,\"availWidth\":1536,\"orientation\":{\"angl");
strBuf_31.append("e\":0,\"type\":\"landscape\"}},\"window\":{\"height\":703,\"width\":153");
strBuf_31.append("6,\"scrollHeight\":1159,\"ratio\":{\"height\":0.85,\"width\":1}}}},\"");
strBuf_31.append("url\":{\"full\":\"https://blazedemo.com/purchase.php\",\"info\":{}}");
strBuf_31.append(",\"referrer\":{\"initial\":\"https://blazedemo.com/\",\"full\":\"http");
strBuf_31.append("s://blazedemo.com/reserve.php\",\"info\":{}},\"time\":{\"local\":{}");
strBuf_31.append(",\"utc\":{}},\"keen\":{\"timestamp\":\"2024-04-07T11:59:32.907Z\",\"a");
strBuf_31.append("ddons\":[{\"name\":\"keen:ua_parser\",\"input\":{\"ua_string\":\"user_");
strBuf_31.append("agent\"},\"output\":\"tech\"},{\"name\":\"keen:url_parser\",\"input\":{");
strBuf_31.append("\"url\":\"url.full\"},\"output\":\"url.info\"},{\"name\":\"keen:url_par");
strBuf_31.append("ser\",\"input\":{\"url\":\"referrer.full\"},\"output\":\"referrer.info");
strBuf_31.append("\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"kee");
strBuf_31.append("n.timestamp\"},\"output\":\"time.utc\"},{\"name\":\"keen:date_time_p");
strBuf_31.append("arser\",\"input\":{\"date_time\":\"local_time_full\"},\"output\":\"tim");
strBuf_31.append("e.local\"},{\"name\":\"keen:ip_to_geo\",\"input\":{\"ip\":\"ip_address");
strBuf_31.append("\",\"remove_ip_property\":false},\"output\":\"geo\"}]},\"element\":{\"");
strBuf_31.append("class\":null,\"href\":null,\"id\":\"nameOnCard\",\"name\":\"nameOnCard");
strBuf_31.append("\",\"all_attrs\":{\"type\":\"text\",\"id\":\"nameOnCard\",\"placeholder\"");
strBuf_31.append(":\"John Smith\",\"name\":\"nameOnCard\",\"unique_selector\":\"#nameOn");
strBuf_31.append("Card\"},\"node_name\":\"INPUT\",\"tag_name\":\"INPUT\",\"text\":null,\"t");
strBuf_31.append("itle\":null,\"type\":\"text\",\"n_parents\":[{\"class\":\"controls\",\"h");
strBuf_31.append("ref\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"contro");
strBuf_31.append("ls\",\"unique_selector\":\":nth-child(11) > .controls\"},\"node_na");
strBuf_31.append("me\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":n");
strBuf_31.append("ull,\"nth_parent\":1},{\"class\":\"control-group\",\"href\":null,\"id");
strBuf_31.append("\":null,\"name\":null,\"all_attrs\":{\"class\":\"control-group\",\"uni");
strBuf_31.append("que_selector\":\"form > :nth-child(11)\"},\"node_name\":\"DIV\",\"ta");
strBuf_31.append("g_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_pare");
strBuf_31.append("nt\":2},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_");
strBuf_31.append("attrs\":{\"method\":\"POST\",\"action\":\"https://blazedemo.com/conf");
strBuf_31.append("irmation.php\",\"accept-charset\":\"UTF-8\",\"unique_selector\":\"fo");
strBuf_31.append("rm\"},\"node_name\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title");
strBuf_31.append("\":null,\"type\":null,\"nth_parent\":3},{\"class\":\"container\",\"hre");
strBuf_31.append("f\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"containe");
strBuf_31.append("r\",\"unique_selector\":\"body > :nth-child(2)\"},\"node_name\":\"DI");
strBuf_31.append("V\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nt");
strBuf_31.append("h_parent\":4},{\"class\":null,\"href\":null,\"id\":null,\"name\":null");
strBuf_31.append(",\"all_attrs\":{\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"");
strBuf_31.append("tag_name\":\"BODY\",\"text\":null,\"title\":null,\"type\":null,\"nth_p");
strBuf_31.append("arent\":5},{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"a");
strBuf_31.append("ll_attrs\":{\"lang\":\"en\",\"unique_selector\":\"html\"},\"node_name\"");
strBuf_31.append(":\"HTML\",\"tag_name\":\"HTML\",\"text\":null,\"title\":null,\"type\":nu");
strBuf_31.append("ll,\"nth_parent\":6}],\"selector\":\"body > div:eq(1) > form > di");
strBuf_31.append("v:eq(9) > div > input#nameOnCard\",\"text_content\":null,\"curso");
strBuf_31.append("r\":\"text\",\"x_position\":175,\"y_position\":1030}}");
String requestData_31 = strBuf_31.toString();
			
	HTTPPostDataChunk pdc_30 = new HTTPPostDataChunk("A1EEF4D66DEAB146CEB3B76433323839", postData, requestData_31, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_30);

	}
private HTTPPage page_8(final IContainer parent) {
			HTTPThink think = new HTTPThink(7023, 1, parent, parent, "A1EEF4D66DF25211CEB3B76433323839");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "PurchaseFlight", "A1EEF4D66DF25211CEB3B76433323839") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_39(this, true, "A1EEF4D66DF25200CEB3B76433323839", true, false,
						"Config_3", "changes{9}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/changes?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_40(this, false, "A1EEF4D66DF2A060CEB3B76433323839", true, false,
						"Config_3", "clicks{13}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/clicks?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_41(this, false, "A1EEF4D66DF2A10DCEB3B76433323839", true, false,
						"Config_3", "form_submissions{2}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/form_submissions?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_42(this, false, "A1EEF4D66DF5D470CEB3B76433323839", true, false,
						"Config_3", "pageunloads{2}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/pageunloads?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_43(this, false, "A1EEF4D66DF6BED0CEB3B76433323839", true, true,
						"Config_1", "confirmation.php",	"/confirmation.php", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_44(this, false, "A1EEF4D66DF70CF4CEB3B76433323839", true, false,
						"Config_3", "pageviews{3}",	"/v1/3.0/projects/lXviifSA1NskA4wsG9N6WoWg/events/pageviews?api_key=8RWMCGFX4X0IRY1GHWDM3HM5WDSJF9LP62BSDULOL3XK7WAIFGDB7EU526O1A0UPLH1S8SJP320LUXJKCHLJX1822GU1KFE80CNW6PXVZ83IOO6LJ731EN164IFVUFMC8DOGYP2MXHN47WGVB192F2PTQRQXCF95OJWAKGOH9S69DZAI5OPJW8QSPDE6LQQ9", true, false), 643, 100, "A1EEF4D66DF6BEDECEB3B76433323839", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DF25215CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3912", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_32(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_80 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_6", null, 0, false);
	subContainer_40.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_6", null, 0, false);
	subContainer_40.addSubInstruction(sub_81);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DF25218CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_32(HTTPPostData postData) {
				StringBuffer strBuf_32 = new StringBuffer();
strBuf_32.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"6a723fe9-2a34-4f25");
strBuf_32.append("-b533-303c96eaf770\",\"iso_time_full\":\"2024-04-07T11:59:40.696");
strBuf_32.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:40 GMT+0530 (Ind");
strBuf_32.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_32.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_32.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_32.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_32.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_32.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_32.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_32.append("1159,\"pixel_max\":1159,\"ratio\":1,\"ratio_max\":1},\"time_on_page");
strBuf_32.append("\":76,\"time_on_page_ms\":75718},\"ip_address\":\"${keen.ip}\",\"geo");
strBuf_32.append("\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"c");
strBuf_32.append("ookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter ");
strBuf_32.append("demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true");
strBuf_32.append(",\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.");
strBuf_32.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_32.append("/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; W");
strBuf_32.append("in64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123");
strBuf_32.append(".0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"c");
strBuf_32.append("olorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\"");
strBuf_32.append(":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\"");
strBuf_32.append(":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":{\"he");
strBuf_32.append("ight\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.co");
strBuf_32.append("m/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://bl");
strBuf_32.append("azedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\",\"in");
strBuf_32.append("fo\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"20");
strBuf_32.append("24-04-07T11:59:40.696Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"");
strBuf_32.append("input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"");
strBuf_32.append("keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.in");
strBuf_32.append("fo\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.full");
strBuf_32.append("\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_parser\"");
strBuf_32.append(",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.utc\"}");
strBuf_32.append(",{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"local");
strBuf_32.append("_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\"");
strBuf_32.append(",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},\"out");
strBuf_32.append("put\":\"geo\"}]},\"element\":{\"class\":null,\"href\":null,\"id\":\"name");
strBuf_32.append("OnCard\",\"name\":\"nameOnCard\",\"all_attrs\":{\"type\":\"text\",\"id\":");
strBuf_32.append("\"nameOnCard\",\"placeholder\":\"John Smith\",\"name\":\"nameOnCard\",");
strBuf_32.append("\"unique_selector\":\"#nameOnCard\"},\"node_name\":\"INPUT\",\"tag_na");
strBuf_32.append("me\":\"INPUT\",\"text\":null,\"title\":null,\"type\":\"text\",\"n_parent");
strBuf_32.append("s\":[{\"class\":\"controls\",\"href\":null,\"id\":null,\"name\":null,\"a");
strBuf_32.append("ll_attrs\":{\"class\":\"controls\",\"unique_selector\":\":nth-child(");
strBuf_32.append("11) > .controls\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":");
strBuf_32.append("null,\"title\":null,\"type\":null,\"nth_parent\":1},{\"class\":\"cont");
strBuf_32.append("rol-group\",\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"c");
strBuf_32.append("lass\":\"control-group\",\"unique_selector\":\"form > :nth-child(1");
strBuf_32.append("1)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"title\":");
strBuf_32.append("null,\"type\":null,\"nth_parent\":2},{\"class\":null,\"href\":null,\"");
strBuf_32.append("id\":null,\"name\":null,\"all_attrs\":{\"method\":\"POST\",\"action\":\"");
strBuf_32.append("https://blazedemo.com/confirmation.php\",\"accept-charset\":\"UT");
strBuf_32.append("F-8\",\"unique_selector\":\"form\"},\"node_name\":\"FORM\",\"tag_name\"");
strBuf_32.append(":\"FORM\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":3}");
strBuf_32.append(",{\"class\":\"container\",\"href\":null,\"id\":null,\"name\":null,\"all");
strBuf_32.append("_attrs\":{\"class\":\"container\",\"unique_selector\":\"body > :nth-");
strBuf_32.append("child(2)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",\"text\":null,\"t");
strBuf_32.append("itle\":null,\"type\":null,\"nth_parent\":4},{\"class\":null,\"href\":");
strBuf_32.append("null,\"id\":null,\"name\":null,\"all_attrs\":{\"unique_selector\":\"b");
strBuf_32.append("ody\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",\"text\":null,\"titl");
strBuf_32.append("e\":null,\"type\":null,\"nth_parent\":5},{\"class\":null,\"href\":nul");
strBuf_32.append("l,\"id\":null,\"name\":null,\"all_attrs\":{\"lang\":\"en\",\"unique_sel");
strBuf_32.append("ector\":\"html\"},\"node_name\":\"HTML\",\"tag_name\":\"HTML\",\"text\":n");
strBuf_32.append("ull,\"title\":null,\"type\":null,\"nth_parent\":6}],\"selector\":\"bo");
strBuf_32.append("dy > div:eq(1) > form > div:eq(9) > div > input#nameOnCard\",");
strBuf_32.append("\"text_content\":null,\"cursor\":\"text\",\"x_position\":175,\"y_posi");
strBuf_32.append("tion\":1030}}");
String requestData_32 = strBuf_32.toString();
			
	HTTPPostDataChunk pdc_31 = new HTTPPostDataChunk("A1EEF4D66DF2526DCEB3B76433323839", postData, requestData_32, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_31);

	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DF2A06ECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3865", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_33(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_82 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_5", null, 0, false);
	subContainer_41.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_41.addSubInstruction(sub_83);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DF2A071CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_33(HTTPPostData postData) {
				StringBuffer strBuf_33 = new StringBuffer();
strBuf_33.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"8ddceb99-769a-4fe1");
strBuf_33.append("-9c96-aac73468a739\",\"iso_time_full\":\"2024-04-07T11:59:40.919");
strBuf_33.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:40 GMT+0530 (Ind");
strBuf_33.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_33.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_33.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_33.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_33.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_33.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_33.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_33.append("1159,\"pixel_max\":1159,\"ratio\":1,\"ratio_max\":1},\"time_on_page");
strBuf_33.append("\":76,\"time_on_page_ms\":75941},\"ip_address\":\"${keen.ip}\",\"geo");
strBuf_33.append("\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"c");
strBuf_33.append("ookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter ");
strBuf_33.append("demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true");
strBuf_33.append(",\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.");
strBuf_33.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_33.append("/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; W");
strBuf_33.append("in64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123");
strBuf_33.append(".0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"c");
strBuf_33.append("olorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\"");
strBuf_33.append(":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\"");
strBuf_33.append(":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":{\"he");
strBuf_33.append("ight\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.co");
strBuf_33.append("m/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://bl");
strBuf_33.append("azedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\",\"in");
strBuf_33.append("fo\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"20");
strBuf_33.append("24-04-07T11:59:40.919Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"");
strBuf_33.append("input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"");
strBuf_33.append("keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.in");
strBuf_33.append("fo\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.full");
strBuf_33.append("\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_parser\"");
strBuf_33.append(",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.utc\"}");
strBuf_33.append(",{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"local");
strBuf_33.append("_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\"");
strBuf_33.append(",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},\"out");
strBuf_33.append("put\":\"geo\"}]},\"element\":{\"class\":\"btn btn-primary\",\"href\":nu");
strBuf_33.append("ll,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"btn btn-prima");
strBuf_33.append("ry\",\"type\":\"submit\",\"unique_selector\":\".controls > .btn\"},\"n");
strBuf_33.append("ode_name\":\"INPUT\",\"tag_name\":\"INPUT\",\"text\":null,\"title\":nul");
strBuf_33.append("l,\"type\":\"submit\",\"n_parents\":[{\"class\":\"controls\",\"href\":nu");
strBuf_33.append("ll,\"id\":null,\"name\":null,\"all_attrs\":{\"class\":\"controls\",\"un");
strBuf_33.append("ique_selector\":\":nth-child(12) > .controls\"},\"node_name\":\"DI");
strBuf_33.append("V\",\"tag_name\":\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nt");
strBuf_33.append("h_parent\":1},{\"class\":\"control-group\",\"href\":null,\"id\":null,");
strBuf_33.append("\"name\":null,\"all_attrs\":{\"class\":\"control-group\",\"unique_sel");
strBuf_33.append("ector\":\":nth-child(12)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\",");
strBuf_33.append("\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":2},{\"class");
strBuf_33.append("\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"metho");
strBuf_33.append("d\":\"POST\",\"action\":\"https://blazedemo.com/confirmation.php\",");
strBuf_33.append("\"accept-charset\":\"UTF-8\",\"unique_selector\":\"form\"},\"node_nam");
strBuf_33.append("e\":\"FORM\",\"tag_name\":\"FORM\",\"text\":null,\"title\":null,\"type\":");
strBuf_33.append("null,\"nth_parent\":3},{\"class\":\"container\",\"href\":null,\"id\":n");
strBuf_33.append("ull,\"name\":null,\"all_attrs\":{\"class\":\"container\",\"unique_sel");
strBuf_33.append("ector\":\"body > :nth-child(2)\"},\"node_name\":\"DIV\",\"tag_name\":");
strBuf_33.append("\"DIV\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":4},{");
strBuf_33.append("\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{");
strBuf_33.append("\"unique_selector\":\"body\"},\"node_name\":\"BODY\",\"tag_name\":\"BOD");
strBuf_33.append("Y\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":5},{\"cl");
strBuf_33.append("ass\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"la");
strBuf_33.append("ng\":\"en\",\"unique_selector\":\"html\"},\"node_name\":\"HTML\",\"tag_n");
strBuf_33.append("ame\":\"HTML\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent");
strBuf_33.append("\":6}],\"selector\":\"body > div:eq(1) > form > div:eq(10) > div");
strBuf_33.append(" > input\",\"text_content\":null,\"cursor\":\"pointer\",\"x_position");
strBuf_33.append("\":175,\"y_position\":1110}}");
String requestData_33 = strBuf_33.toString();
			
	HTTPPostDataChunk pdc_32 = new HTTPPostDataChunk("A1EEF4D66DF2A0C6CEB3B76433323839", postData, requestData_33, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_32);

	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DF2A11BCEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3741", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_34(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_84 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_4", null, 0, false);
	subContainer_42.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_42.addSubInstruction(sub_85);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DF2A11ECEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_34(HTTPPostData postData) {
				StringBuffer strBuf_34 = new StringBuffer();
strBuf_34.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"57672ac5-ba5f-4b20");
strBuf_34.append("-a9db-d4ab72151957\",\"iso_time_full\":\"2024-04-07T11:59:40.921");
strBuf_34.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:40 GMT+0530 (Ind");
strBuf_34.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_34.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_34.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_34.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_34.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_34.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_34.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_34.append("1159,\"pixel_max\":1159,\"ratio\":1,\"ratio_max\":1},\"time_on_page");
strBuf_34.append("\":76,\"time_on_page_ms\":75943},\"ip_address\":\"${keen.ip}\",\"geo");
strBuf_34.append("\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"c");
strBuf_34.append("ookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter ");
strBuf_34.append("demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true");
strBuf_34.append(",\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.");
strBuf_34.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_34.append("/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; W");
strBuf_34.append("in64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123");
strBuf_34.append(".0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"c");
strBuf_34.append("olorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\"");
strBuf_34.append(":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\"");
strBuf_34.append(":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":{\"he");
strBuf_34.append("ight\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.co");
strBuf_34.append("m/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://bl");
strBuf_34.append("azedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\",\"in");
strBuf_34.append("fo\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"20");
strBuf_34.append("24-04-07T11:59:40.921Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"");
strBuf_34.append("input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"");
strBuf_34.append("keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.in");
strBuf_34.append("fo\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.full");
strBuf_34.append("\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_parser\"");
strBuf_34.append(",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.utc\"}");
strBuf_34.append(",{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"local");
strBuf_34.append("_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\"");
strBuf_34.append(",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},\"out");
strBuf_34.append("put\":\"geo\"}]},\"form\":{\"action\":\"https://blazedemo.com/confir");
strBuf_34.append("mation.php\",\"fields\":{\"inputName\":\"---REDACTED---\",\"address\"");
strBuf_34.append(":\"---REDACTED---\",\"city\":\"---REDACTED---\",\"state\":\"---REDACT");
strBuf_34.append("ED---\",\"zipCode\":\"---REDACTED---\",\"cardType\":\"---REDACTED---");
strBuf_34.append("\",\"creditCardNumber\":\"---REDACTED---\",\"creditCardMonth\":\"---");
strBuf_34.append("REDACTED---\",\"creditCardYear\":\"---REDACTED---\",\"nameOnCard\":");
strBuf_34.append("\"---REDACTED---\"},\"method\":\"post\"},\"element\":{\"class\":null,\"");
strBuf_34.append("href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"method\":\"POST");
strBuf_34.append("\",\"action\":\"https://blazedemo.com/confirmation.php\",\"accept-");
strBuf_34.append("charset\":\"UTF-8\",\"unique_selector\":\"form\"},\"node_name\":\"FORM");
strBuf_34.append("\",\"tag_name\":\"FORM\",\"text\":null,\"title\":null,\"type\":null,\"ac");
strBuf_34.append("tion\":\"https://blazedemo.com/confirmation.php\",\"method\":\"pos");
strBuf_34.append("t\",\"n_parents\":[{\"class\":\"container\",\"href\":null,\"id\":null,\"");
strBuf_34.append("name\":null,\"all_attrs\":{\"class\":\"container\",\"unique_selector");
strBuf_34.append("\":\"body > :nth-child(2)\"},\"node_name\":\"DIV\",\"tag_name\":\"DIV\"");
strBuf_34.append(",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":1},{\"clas");
strBuf_34.append("s\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"uniq");
strBuf_34.append("ue_selector\":\"body\"},\"node_name\":\"BODY\",\"tag_name\":\"BODY\",\"t");
strBuf_34.append("ext\":null,\"title\":null,\"type\":null,\"nth_parent\":2},{\"class\":");
strBuf_34.append("null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":{\"lang\":\"");
strBuf_34.append("en\",\"unique_selector\":\"html\"},\"node_name\":\"HTML\",\"tag_name\":");
strBuf_34.append("\"HTML\",\"text\":null,\"title\":null,\"type\":null,\"nth_parent\":3},");
strBuf_34.append("{\"class\":null,\"href\":null,\"id\":null,\"name\":null,\"all_attrs\":");
strBuf_34.append("{},\"node_name\":\"#document\",\"text\":null,\"title\":null,\"type\":n");
strBuf_34.append("ull,\"nth_parent\":4}],\"selector\":\"body > div:eq(1) > form\",\"t");
strBuf_34.append("ext_content\":\"---REDACTED---\",\"cursor\":\"auto\",\"x_position\":1");
strBuf_34.append("75,\"y_position\":333}}");
String requestData_34 = strBuf_34.toString();
			
	HTTPPostDataChunk pdc_33 = new HTTPPostDataChunk("A1EEF4D66DF38AB4CEB3B76433323839", postData, requestData_34, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_33);

	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DF5D47ECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2174", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_35(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_86 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer_3", null, 0, false);
	subContainer_43.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_43.addSubInstruction(sub_87);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DF5D481CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_35(HTTPPostData postData) {
				StringBuffer strBuf_35 = new StringBuffer();
strBuf_35.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"6beeb628-892a-4476");
strBuf_35.append("-a75a-e02c9dda391d\",\"iso_time_full\":\"2024-04-07T11:59:40.923");
strBuf_35.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:40 GMT+0530 (Ind");
strBuf_35.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_35.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_35.append("king-2.0.23\",\"tracker_load_uuid\":\"155ec831-d22b-4413-a1e3-f8");
strBuf_35.append("63ca26687e\",\"tracker_loaded_at\":\"2024-04-07T11:58:24.978Z\",\"");
strBuf_35.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_35.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Purchase\",");
strBuf_35.append("\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pixel\":");
strBuf_35.append("1159,\"pixel_max\":1159,\"ratio\":1,\"ratio_max\":1},\"time_on_page");
strBuf_35.append("\":76,\"time_on_page_ms\":75945},\"ip_address\":\"${keen.ip}\",\"geo");
strBuf_35.append("\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":{\"c");
strBuf_35.append("ookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMeter ");
strBuf_35.append("demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":true");
strBuf_35.append(",\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT 10.");
strBuf_35.append("0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome");
strBuf_35.append("/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0; W");
strBuf_35.append("in64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123");
strBuf_35.append(".0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536,\"c");
strBuf_35.append("olorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWidth\"");
strBuf_35.append(":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"window\"");
strBuf_35.append(":{\"height\":703,\"width\":1536,\"scrollHeight\":1159,\"ratio\":{\"he");
strBuf_35.append("ight\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo.co");
strBuf_35.append("m/purchase.php\",\"info\":{}},\"referrer\":{\"initial\":\"https://bl");
strBuf_35.append("azedemo.com/\",\"full\":\"https://blazedemo.com/reserve.php\",\"in");
strBuf_35.append("fo\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timestamp\":\"20");
strBuf_35.append("24-04-07T11:59:40.923Z\",\"addons\":[{\"name\":\"keen:ua_parser\",\"");
strBuf_35.append("input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{\"name\":\"");
strBuf_35.append("keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\":\"url.in");
strBuf_35.append("fo\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"referrer.full");
strBuf_35.append("\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time_parser\"");
strBuf_35.append(",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"time.utc\"}");
strBuf_35.append(",{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time\":\"local");
strBuf_35.append("_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip_to_geo\"");
strBuf_35.append(",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":false},\"out");
strBuf_35.append("put\":\"geo\"}]}}");
String requestData_35 = strBuf_35.toString();
			
	HTTPPostDataChunk pdc_34 = new HTTPPostDataChunk("A1EEF4D66DF5D4D6CEB3B76433323839", postData, requestData_35, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_34);

	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DF6BEDECEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "180", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/purchase.php", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "prodperfect_session={%22session_uuid%22:%229d64bd20-bbf7-4c35-b291-f8f242c919b4%22};keen={%22uuid%22:%227b49d1dd-3798-46be-9708-c236de238972%22%2C%22initialReferrer%22:%22https://blazedemo.com/%22}", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_36(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_89 = new SubRule("req_hdr_Referer_1", 0, 34, false, (IDCCoreVar)dcVars[7], false, "Referer_2", null, 0, false);
	subContainer_45.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[1], false, "Host_2", null, 0, false);
	subContainer_45.addSubInstruction(sub_90);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DF6BEE1CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_36(HTTPPostData postData) {
				StringBuffer strBuf_36 = new StringBuffer();
strBuf_36.append("_token=&inputName=Raj&address=KVR&city=Bangalore&state=karna");
strBuf_36.append("taka&zipCode=560061&cardType=visa&creditCardNumber=123412341");
strBuf_36.append("2341234&creditCardMonth=11&creditCardYear=2026&nameOnCard=RA");
String requestData_36 = strBuf_36.toString();
			
	HTTPPostDataChunk pdc_35 = new HTTPPostDataChunk("A1EEF4D66DF6BF46CEB3B76433323839", postData, requestData_36, "UTF-8", 2, 146);
	postData.addDataChunk(pdc_35);

	IDataSub subContainer_44 = new DataSub();
	pdc_35.addDataSub(subContainer_44);

		ISubRule sub_88 = new SubRule("req_content", 144, 2, true, (IDCCoreVar)dcVars[8], false, "creditCardMonth", null, 0, false);
	subContainer_44.addSubInstruction(sub_88);
	



	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EEF4D66DF70D02CEB3B76433323839", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "blazemeter.datapipe.prodperfect.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2182", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Google Chrome\";v=\"123\", \"Not:A-Brand\";v=\"8\", \"Chromium\";v=\"123\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://blazedemo.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://blazedemo.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_37(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_91 = new SubRule("req_hdr_Referer_1", 0, 22, false, (IDCCoreVar)dcVars[0], false, "Referer", null, 0, false);
	subContainer_46.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_hdr_Host_1", 0, 35, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_46.addSubInstruction(sub_92);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
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
			"UTF-8",
			"UTF-8",
			"A1EEF4D66DF70D05CEB3B76433323839",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_37(HTTPPostData postData) {
				StringBuffer strBuf_37 = new StringBuffer();
strBuf_37.append("{\"visitor\":{\"user_id\":null},\"event_uuid\":\"fb1d56ae-aed3-4551");
strBuf_37.append("-be88-c2b09c1155eb\",\"iso_time_full\":\"2024-04-07T11:59:42.180");
strBuf_37.append("Z\",\"local_time_full\":\"Sun Apr 07 2024 17:29:42 GMT+0530 (Ind");
strBuf_37.append("ia Standard Time)\",\"session\":{\"session_uuid\":\"9d64bd20-bbf7-");
strBuf_37.append("4c35-b291-f8f242c919b4\"},\"tracked_by\":\"prodperfect-keen-trac");
strBuf_37.append("king-2.0.23\",\"tracker_load_uuid\":\"7aa666f9-6cef-421a-814b-31");
strBuf_37.append("3df4012a04\",\"tracker_loaded_at\":\"2024-04-07T11:59:42.179Z\",\"");
strBuf_37.append("prodperfect_test_data\":null,\"user\":{\"uuid\":\"7b49d1dd-3798-46");
strBuf_37.append("be-9708-c236de238972\"},\"page\":{\"title\":\"BlazeDemo Confirmati");
strBuf_37.append("on\",\"description\":\"BlazeMeter demo app\",\"scroll_state\":{\"pix");
strBuf_37.append("el\":703,\"pixel_max\":703,\"ratio\":0.55,\"ratio_max\":0.55},\"time");
strBuf_37.append("_on_page\":0,\"time_on_page_ms\":1},\"ip_address\":\"${keen.ip}\",\"");
strBuf_37.append("geo\":{},\"user_agent\":\"${keen.user_agent}\",\"tech\":{\"profile\":");
strBuf_37.append("{\"cookies\":true,\"codeName\":\"Mozilla\",\"description\":\"BlazeMet");
strBuf_37.append("er demo app\",\"language\":\"en-US\",\"name\":\"Netscape\",\"online\":t");
strBuf_37.append("rue,\"platform\":\"Win32\",\"useragent\":\"Mozilla/5.0 (Windows NT ");
strBuf_37.append("10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chr");
strBuf_37.append("ome/123.0.0.0 Safari/537.36\",\"version\":\"5.0 (Windows NT 10.0");
strBuf_37.append("; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/");
strBuf_37.append("123.0.0.0 Safari/537.36\",\"screen\":{\"height\":864,\"width\":1536");
strBuf_37.append(",\"colorDepth\":24,\"pixelDepth\":24,\"availHeight\":824,\"availWid");
strBuf_37.append("th\":1536,\"orientation\":{\"angle\":0,\"type\":\"landscape\"}},\"wind");
strBuf_37.append("ow\":{\"height\":703,\"width\":1536,\"scrollHeight\":1267,\"ratio\":{");
strBuf_37.append("\"height\":0.85,\"width\":1}}}},\"url\":{\"full\":\"https://blazedemo");
strBuf_37.append(".com/confirmation.php\",\"info\":{}},\"referrer\":{\"initial\":\"htt");
strBuf_37.append("ps://blazedemo.com/\",\"full\":\"https://blazedemo.com/purchase.");
strBuf_37.append("php\",\"info\":{}},\"time\":{\"local\":{},\"utc\":{}},\"keen\":{\"timest");
strBuf_37.append("amp\":\"2024-04-07T11:59:42.180Z\",\"addons\":[{\"name\":\"keen:ua_p");
strBuf_37.append("arser\",\"input\":{\"ua_string\":\"user_agent\"},\"output\":\"tech\"},{");
strBuf_37.append("\"name\":\"keen:url_parser\",\"input\":{\"url\":\"url.full\"},\"output\"");
strBuf_37.append(":\"url.info\"},{\"name\":\"keen:url_parser\",\"input\":{\"url\":\"refer");
strBuf_37.append("rer.full\"},\"output\":\"referrer.info\"},{\"name\":\"keen:date_time");
strBuf_37.append("_parser\",\"input\":{\"date_time\":\"keen.timestamp\"},\"output\":\"ti");
strBuf_37.append("me.utc\"},{\"name\":\"keen:date_time_parser\",\"input\":{\"date_time");
strBuf_37.append("\":\"local_time_full\"},\"output\":\"time.local\"},{\"name\":\"keen:ip");
strBuf_37.append("_to_geo\",\"input\":{\"ip\":\"ip_address\",\"remove_ip_property\":fal");
strBuf_37.append("se},\"output\":\"geo\"}]}}");
String requestData_37 = strBuf_37.toString();
			
	HTTPPostDataChunk pdc_36 = new HTTPPostDataChunk("A1EEF4D66DF70D5ACEB3B76433323839", postData, requestData_37, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_36);

	}
}
