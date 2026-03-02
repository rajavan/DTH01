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
import com.ibm.rational.test.lt.datatransform.adapters.DataTransformAction;
import com.ibm.rational.test.lt.datatransform.adapters.IDataTransform;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.core.impl.MetaString;
import com.ibm.rational.test.lt.execution.core.impl.ZipEntryProxy;
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
public class Demo2_Test_A1F0AF2B6B4D2DC0C10AB56564643036 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(134);
	private DataVar[] vars = new DataVar[14];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Demo2_Test_A1F0AF2B6B4D2DC0C10AB56564643036(IContainer container, String invocationId) {
		super(container, "Demo2", invocationId, "A1F0AF2B6B4D2DC0C10AB56564643036", "/Demo_JPetStore/Demo2.testsuite", "C:/Users/rajesh-a/HCL/devopstest/workspace_DevOpsPerf/Demo_JPetStore/Demo2.testsuite");
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
	
	
	        	this.add(dataTransform(this));
	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(confCon_4(this));
	this.add(confCon_5(this));
	this.add(confCon_6(this));
	this.add(confCon_7(this));
	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));
	this.add(page_4(this));
	this.add(page_5(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Demo2_Test_A1F0AF2B6B4D2DC0C10AB56564643036 ",e);
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
	
	private KAction dataTransform(IContainer parent) {
		DataTransformAction action = 
			new DataTransformAction(parent, "Data Transform Action");

		action.setMapFile("A1F0AF2B6B4D2DC0C10AB56564643036");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.AsciifyAdapterVERSION_1
		// com.ibm.rational.test.lt.datatransform.adapters.impl.XMLAdapterVERSION_0
		// com.ibm.rational.test.lt.datatransform.adapters.impl.JsonAdapterVERSION_0

		return action;
	}
private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F0AF2B6B4D2DDEC10AB56564643036");	
			vars[0] = new DataVar("Demo2_Host", "data-na.nestlenutritionstore.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("Demo2_Host_1", "zn24vled20qahdi2x-nestleglobalmktg.siteintercept.qualtrics.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("Demo2_Host_2", "preprod.nestlenutritionstore.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("Demo2_Host_3", "geolocation.onetrust.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("Demo2_Host_4", "nestle-privacy.my.onetrust.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("Demo2_Host_5", "sc-api.click2cart.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[6] = new DataVar("Demo2_Host_6", "click2cart.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[7] = new DataVar("Demo2_Host_5_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[8] = new DataVar("Demo2_Host_4_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[9] = new DataVar("Demo2_Host_6_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[10] = new DataVar("Demo2_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[11] = new DataVar("Demo2_Host_3_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[12] = new DataVar("Demo2_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[13] = new DataVar("Demo2_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[2].getValue()== null?"preprod.nestlenutritionstore.com": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[13].getValue()== null?"443": (String)vars[13].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"preprod.nestlenutritionstore.com",  // unsubstituted host name
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
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[0].getValue()== null?"data-na.nestlenutritionstore.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[12].getValue()== null?"443": (String)vars[12].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"data-na.nestlenutritionstore.com",  // unsubstituted host name
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
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)(vars[3].getValue()== null?"geolocation.onetrust.com": (String)vars[3].getValue()),  // host name
					Integer.parseInt((String)(vars[11].getValue()== null?"443": (String)vars[11].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"geolocation.onetrust.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_4(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_4",
					(String)(vars[1].getValue()== null?"zn24vled20qahdi2x-nestleglobalmktg.siteintercept.qualtrics.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[10].getValue()== null?"443": (String)vars[10].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"zn24vled20qahdi2x-nestleglobalmktg.siteintercept.qualtrics.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_5(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)(vars[6].getValue()== null?"click2cart.com": (String)vars[6].getValue()),  // host name
					Integer.parseInt((String)(vars[9].getValue()== null?"443": (String)vars[9].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"click2cart.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_6(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_6",
					(String)(vars[4].getValue()== null?"nestle-privacy.my.onetrust.com": (String)vars[4].getValue()),  // host name
					Integer.parseInt((String)(vars[8].getValue()== null?"443": (String)vars[8].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"nestle-privacy.my.onetrust.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_7(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_7",
					(String)(vars[5].getValue()== null?"sc-api.click2cart.com": (String)vars[5].getValue()),  // host name
					Integer.parseInt((String)(vars[7].getValue()== null?"443": (String)vars[7].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"sc-api.click2cart.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1F0AF2B6B6D870EC10AB56564643036");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Shop the Nestl\u00C3\u00A9 Health Science Nutrition Store", "A1F0AF2B6B6D870EC10AB56564643036") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1F0AF2B6B6D8700C10AB56564643036", false, true,
						"Config_1", "/",	"/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1F0AF2B6B6D8700C10AB56564643036", false, false,
						"Config_1", "calendar.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/calendar.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_3(this, false, "A1F0AF2B6B6F0DF7C10AB56564643036", false, false,
						"Config_1", "gallery.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/gallery/gallery.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_4(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "styles-m.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/css/styles-m.min.css", true, false), 108, 100, "A1F0AF2B6B6D871CC10AB56564643036", 2);
				httpParallel.addRequest(3, request_5(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "password.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Nestle_SecurityAndCompliance/css/password.min.css", true, false), 102, 100, "A1F0AF2B6B6D871CC10AB56564643036", 2);
				httpParallel.addRequest(4, request_6(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "ec.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Anowave_Ec/css/ec.min.css", true, false), 109, 100, "A1F0AF2B6B6D871CC10AB56564643036", 2);
				httpParallel.addRequest(5, request_7(this, false, "A1F0AF2B6B855537C10AB56564643036", false, false,
						"Config_1", "styles-l.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/css/styles-l.min.css", true, false), 107, 100, "A1F0AF2B6B6D871CC10AB56564643036", 2);
				httpParallel.addRequest(3, request_8(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "bootstrap.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/bootstrap.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_9(this, false, "A1F0AF2B6B6D8700C10AB56564643036", false, false,
						"Config_1", "font-awesome.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/font-awesome.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_10(this, false, "A1F0AF2B6B6F0DF7C10AB56564643036", false, false,
						"Config_1", "animate.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/animate.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_11(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "require.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/requirejs/require.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_12(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "bundle0.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle0.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_13(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "bundle1.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle1.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_14(this, false, "A1F0AF2B6B6D8700C10AB56564643036", false, false,
						"Config_1", "bundle10.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle10.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_15(this, false, "A1F0AF2B6B6F0DF7C10AB56564643036", false, false,
						"Config_1", "bundle11.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle11.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_16(this, false, "A1F0AF2B6B855537C10AB56564643036", false, false,
						"Config_1", "bundle12.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle12.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_17(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "bundle2.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle2.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_18(this, false, "A1F0AF2B6B855537C10AB56564643036", false, false,
						"Config_1", "bundle3.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle3.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_19(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "bundle4.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle4.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_20(this, false, "A1F0AF2B6B6F0DF7C10AB56564643036", false, false,
						"Config_1", "bundle5.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle5.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_21(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "bundle6.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle6.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_22(this, false, "A1F0AF2B6B6D8700C10AB56564643036", false, false,
						"Config_1", "bundle7.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle7.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_23(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "bundle8.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle8.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_24(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "bundle9.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle9.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_25(this, false, "A1F0AF2B6B855537C10AB56564643036", false, false,
						"Config_1", "static.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/requirejs/static.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_26(this, false, "A1F0AF2B6B855537C10AB56564643036", false, false,
						"Config_1", "mixins.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/requirejs/mixins.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_27(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "requirejs-config.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/requirejs-config.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_28(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "ec.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/NHSUS_GTMTracking/js/ec.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_29(this, false, "A1F0AF2B6B6F0DF7C10AB56564643036", false, false,
						"Config_1", "sticky-header.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/sticky-header.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_30(this, false, "A1F0AF2B6B855537C10AB56564643036", false, false,
						"Config_1", "opensans-300.woff2",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/light/opensans-300.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_31(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "opensans-400.woff2",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/regular/opensans-400.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_32(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "opensans-600.woff2",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/semibold/opensans-600.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_33(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", false, false,
						"Config_1", "opensans-700.woff2",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/bold/opensans-700.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_34(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "Luma-Icons.woff2",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/Luma-Icons.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_35(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "js-translation.json",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js-translation.json", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_36(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "24392571",	"/akam/13/24392571", true, false), 245, 100, "A1F0AF2B6BCBFAB0C10AB56564643036", 3);
				httpParallel.addRequest(0, request_37(this, false, "A1F0AF2B6B6D8700C10AB56564643036", false, false,
						"Config_1", "snippet",	"/rest/V1/swell/session/snippet/?_=1761125983314", true, false), 1426, 100, "A1F0AF2B6C0E81F0C10AB56564643036", 3);
				httpParallel.addRequest(0, request_38(this, false, "A1F0AF2B6B6D8700C10AB56564643036", true, false,
						"Config_1", "load",	"/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1761125983315", true, false), 1240, 100, "A1F0AF2B6C1D2804C10AB56564643036", 3);
				httpParallel.addRequest(5, request_39(this, false, "A1F0AF2B6B855537C10AB56564643036", false, false,
						"Config_1", "pixel_24392571",	"/akam/13/pixel_24392571", true, false), 1302, 100, "A1F0AF2B6C1D2804C10AB56564643036", 3);
				httpParallel.addRequest(4, request_40(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "carnation_breakfast_essentials_cinnabon_nns_family_1_flavor_900x900-min.png",	"/media/catalog/product/cache/ce7e4c9d65fef1b4870ff61bb029a46d/c/a/carnation_breakfast_essentials_cinnabon_nns_family_1_flavor_900x900-min.png", true, false), 65, 100, "A1F0AF2B6C44FBBFC10AB56564643036", 3);
				httpParallel.addRequest(2, request_41(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "remfresh-family-2.png",	"/media/catalog/product/cache/ce7e4c9d65fef1b4870ff61bb029a46d/r/e/remfresh-family-2.png", true, false), 16, 100, "A1F0AF2B6C4570DFC10AB56564643036", 3);
				httpParallel.addRequest(4, request_42(this, false, "A1F0AF2B6B852DB0C10AB56564643036", false, false,
						"Config_1", "novasource-renal-family.png",	"/media/catalog/product/cache/ce7e4c9d65fef1b4870ff61bb029a46d/n/o/novasource-renal-family.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_43(this, false, "A1F0AF2B6B855537C10AB56564643036", true, false,
						"Config_1", "slick.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_PageBuilder/js/resource/slick/slick.js", true, false), 193, 100, "A1F0AF2B6C45BEFFC10AB56564643036", 3);
				httpParallel.addRequest(3, request_44(this, false, "A1F0AF2B6B7E4FE0C10AB56564643036", true, false,
						"Config_1", "loader-1.gif",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/images/loader-1.gif", true, false), 231, 100, "A1F0AF2B6C45BEFFC10AB56564643036", 3);
				httpParallel.addRequest(2, request_45(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "player.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/vimeo/player.js", true, false), 276, 100, "A1F0AF2B6C45BEFFC10AB56564643036", 3);
				httpParallel.addRequest(2, request_46(this, false, "A1F0AF2B6B70E260C10AB56564643036", false, false,
						"Config_1", "pagebuilder-icons.woff",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_PageBuilder/fonts/pagebuilder-icons/pagebuilder-icons.woff", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_47(this, false, "A1F0AF2B6B852DB0C10AB56564643036", true, false,
						"Config_1", "print.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/css/print.min.css", true, false), 59, 100, "A1F0AF2B6C4D390FC10AB56564643036", 3);
				httpParallel.addRequest(2, request_48(this, false, "A1F0AF2B6B70E260C10AB56564643036", true, false,
						"Config_1", "fontawesome-webfont.woff2",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/fonts/fontawesome-webfont.woff2?v=4.7.0", true, false), 79, 100, "A1F0AF2B6C4D390FC10AB56564643036", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B6D871CC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
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
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[1], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 2, 2, 0, 0, false, "preprod.nestlenutritionstore.com_41", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[2], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 3, 1, 0, 0, false, "preprod.nestlenutritionstore.com_40", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[3], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 4, 1, 0, 0, false, "preprod.nestlenutritionstore.com_39", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[4], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 5, 1, 0, 0, false, "preprod.nestlenutritionstore.com_38", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[5], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 6, 1, 0, 0, false, "preprod.nestlenutritionstore.com_37", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[6], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 7, 1, 0, 0, false, "preprod.nestlenutritionstore.com_36", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[7], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 8, 1, 0, 0, false, "preprod.nestlenutritionstore.com", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[8], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 9, 1, 0, 0, false, "preprod.nestlenutritionstore.com_35", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[9], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 10, 1, 0, 0, false, "preprod.nestlenutritionstore.com_34", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[10], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 11, 1, 0, 0, false, "preprod.nestlenutritionstore.com_33", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[11], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 12, 1, 0, 0, false, "preprod.nestlenutritionstore.com_32", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[12], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 13, 1, 0, 0, false, "preprod.nestlenutritionstore.com_31", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[13], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 14, 1, 0, 0, false, "preprod.nestlenutritionstore.com_30", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[14], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 15, 1, 0, 0, false, "preprod.nestlenutritionstore.com_29", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[15], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 16, 1, 0, 0, false, "preprod.nestlenutritionstore.com_28", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[16], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 17, 1, 0, 0, false, "preprod.nestlenutritionstore.com_27", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[17], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 18, 1, 0, 0, false, "preprod.nestlenutritionstore.com_26", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[18], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 19, 1, 0, 0, false, "preprod.nestlenutritionstore.com_25", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[19], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 20, 1, 0, 0, false, "preprod.nestlenutritionstore.com_24", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[20], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 21, 1, 0, 0, false, "preprod.nestlenutritionstore.com_23", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[21], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 22, 1, 0, 0, false, "preprod.nestlenutritionstore.com_22", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[22], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 23, 1, 0, 0, false, "preprod.nestlenutritionstore.com_21", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[23], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 24, 1, 0, 0, false, "preprod.nestlenutritionstore.com_20", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[24], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 25, 1, 0, 0, false, "preprod.nestlenutritionstore.com_19", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[25], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 26, 1, 0, 0, false, "preprod.nestlenutritionstore.com_18", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[26], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 27, 1, 0, 0, false, "preprod.nestlenutritionstore.com_17", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[27], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 28, 1, 0, 0, false, "preprod.nestlenutritionstore.com_16", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[28], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 29, 1, 0, 0, false, "preprod.nestlenutritionstore.com_15", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[29], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 30, 1, 0, 0, false, "preprod.nestlenutritionstore.com_14", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[30], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 31, 1, 0, 0, false, "preprod.nestlenutritionstore.com_13", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[31], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 32, 1, 0, 0, false, "preprod.nestlenutritionstore.com_12", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[32], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 33, 1, 0, 0, false, "preprod.nestlenutritionstore.com_11", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[33], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 34, 1, 0, 0, false, "preprod.nestlenutritionstore.com_10", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[34], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 35, 1, 0, 0, false, "preprod.nestlenutritionstore.com_9", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[35], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 39, 4, 0, 0, false, "preprod.nestlenutritionstore.com_7", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[36], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 132, 93, 0, 0, false, "preprod.nestlenutritionstore.com_2", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[37], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 200, 68, 0, 0, false, "preprod.nestlenutritionstore.com_5", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[38], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 204, 4, 0, 0, false, "preprod.nestlenutritionstore.com_4", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[39], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 208, 4, 0, 0, false, "preprod.nestlenutritionstore.com_3", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[40], "/preprod\\.nestlenutritionstore\\.com(.*?)\\?", 5, 1, 0, 0, false, "preprod.nestlenutritionstore.com_6", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_186", null, 0, false);
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
			"A1F0AF2B6B6D871FC10AB56564643036",
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

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B6EE690C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_183", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[1], false, "Shop the Nestl. Hea_url_41", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_185", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B6EE693C10AB56564643036",
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

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B6F0E05C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_4 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_182", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_uri", 0, 100, false, (IDCCoreVar)dcVars[2], false, "Shop the Nestl. Hea_url_40", null, 0, false);
	subContainer_3.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_184", null, 0, false);
	subContainer_3.addSubInstruction(sub_6);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B6F0E08C10AB56564643036",
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

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B710970C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[41], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_7 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_181", null, 0, false);
	subContainer_4.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[3], false, "Shop the Nestl. Hea_url_39", null, 0, false);
	subContainer_4.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_183", null, 0, false);
	subContainer_4.addSubInstruction(sub_9);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B710973C10AB56564643036",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B7E4FEEC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_10 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_180", null, 0, false);
	subContainer_5.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_uri", 0, 121, false, (IDCCoreVar)dcVars[4], false, "Shop the Nestl. Hea_url_38", null, 0, false);
	subContainer_5.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_182", null, 0, false);
	subContainer_5.addSubInstruction(sub_12);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B7E4FF1C10AB56564643036",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B852DBEC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_179", null, 0, false);
	subContainer_6.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_uri", 0, 97, false, (IDCCoreVar)dcVars[5], false, "Shop the Nestl. Hea_url_37", null, 0, false);
	subContainer_6.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_181", null, 0, false);
	subContainer_6.addSubInstruction(sub_15);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B852DC1C10AB56564643036",
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

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B855545C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_16 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_178", null, 0, false);
	subContainer_7.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[6], false, "Shop the Nestl. Hea_url_36", null, 0, false);
	subContainer_7.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_180", null, 0, false);
	subContainer_7.addSubInstruction(sub_18);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B855548C10AB56564643036",
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

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B868D47C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_177", null, 0, false);
	subContainer_8.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_uri", 0, 107, false, (IDCCoreVar)dcVars[8], false, "Shop the Nestl. Hea_url_35", null, 0, false);
	subContainer_8.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_179", null, 0, false);
	subContainer_8.addSubInstruction(sub_21);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B868D4AC10AB56564643036",
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

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B870277C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[42], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[43], "\\?v=(.*?)'", 1, 1, 0, 0, false, "v_9", null, 0, false);
	IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_22 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_176", null, 0, false);
	subContainer_9.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_uri", 0, 110, false, (IDCCoreVar)dcVars[9], false, "Shop the Nestl. Hea_url_34", null, 0, false);
	subContainer_9.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_178", null, 0, false);
	subContainer_9.addSubInstruction(sub_24);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B87027AC10AB56564643036",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B8729F7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_175", null, 0, false);
	subContainer_10.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_uri", 0, 105, false, (IDCCoreVar)dcVars[10], false, "Shop the Nestl. Hea_url_33", null, 0, false);
	subContainer_10.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_177", null, 0, false);
	subContainer_10.addSubInstruction(sub_27);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B8729FAC10AB56564643036",
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

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B888910C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_28 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_174", null, 0, false);
	subContainer_11.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[11], false, "Shop the Nestl. Hea_url_32", null, 0, false);
	subContainer_11.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_176", null, 0, false);
	subContainer_11.addSubInstruction(sub_30);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B888913C10AB56564643036",
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

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B8D6B10C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_31 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_173", null, 0, false);
	subContainer_12.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[12], false, "Shop the Nestl. Hea_url_31", null, 0, false);
	subContainer_12.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_175", null, 0, false);
	subContainer_12.addSubInstruction(sub_33);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B8D6B13C10AB56564643036",
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

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B922600C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_34 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_172", null, 0, false);
	subContainer_13.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[13], false, "Shop the Nestl. Hea_url_30", null, 0, false);
	subContainer_13.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_174", null, 0, false);
	subContainer_13.addSubInstruction(sub_36);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B922603C10AB56564643036",
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

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B9421D7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[44], " e\\.prev=(.*?),", 17, 17, 0, 0, false, "e.prev", null, 0, false);
	IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_37 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_171", null, 0, false);
	subContainer_14.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[14], false, "Shop the Nestl. Hea_url_29", null, 0, false);
	subContainer_14.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_173", null, 0, false);
	subContainer_14.addSubInstruction(sub_39);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B9421DAC10AB56564643036",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B9692D7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_40 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_170", null, 0, false);
	subContainer_15.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[15], false, "Shop the Nestl. Hea_url_28", null, 0, false);
	subContainer_15.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_172", null, 0, false);
	subContainer_15.addSubInstruction(sub_42);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B9692DAC10AB56564643036",
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

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B99EE30C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_43 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_169", null, 0, false);
	subContainer_16.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[16], false, "Shop the Nestl. Hea_url_27", null, 0, false);
	subContainer_16.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_171", null, 0, false);
	subContainer_16.addSubInstruction(sub_45);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B99EE33C10AB56564643036",
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

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6B9F1E50C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_46 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_168", null, 0, false);
	subContainer_17.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[17], false, "Shop the Nestl. Hea_url_26", null, 0, false);
	subContainer_17.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_170", null, 0, false);
	subContainer_17.addSubInstruction(sub_48);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6B9F1E53C10AB56564643036",
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

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BA11A27C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_49 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_167", null, 0, false);
	subContainer_18.addSubInstruction(sub_49);
		ISubRule sub_50 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[18], false, "Shop the Nestl. Hea_url_25", null, 0, false);
	subContainer_18.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_169", null, 0, false);
	subContainer_18.addSubInstruction(sub_51);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BA11A2AC10AB56564643036",
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

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BA89430C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_52 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_166", null, 0, false);
	subContainer_19.addSubInstruction(sub_52);
		ISubRule sub_53 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[19], false, "Shop the Nestl. Hea_url_24", null, 0, false);
	subContainer_19.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_168", null, 0, false);
	subContainer_19.addSubInstruction(sub_54);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BA89433C10AB56564643036",
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

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BAB5357C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_55 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_165", null, 0, false);
	subContainer_20.addSubInstruction(sub_55);
		ISubRule sub_56 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[20], false, "Shop the Nestl. Hea_url_23", null, 0, false);
	subContainer_20.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_167", null, 0, false);
	subContainer_20.addSubInstruction(sub_57);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BAB535AC10AB56564643036",
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

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BBBA700C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[45], " e\\.returnValue = (.*?);", 1, 1, 0, 0, false, "e.returnValue", null, 0, false);
	IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_58 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_164", null, 0, false);
	subContainer_21.addSubInstruction(sub_58);
		ISubRule sub_59 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[21], false, "Shop the Nestl. Hea_url_22", null, 0, false);
	subContainer_21.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_166", null, 0, false);
	subContainer_21.addSubInstruction(sub_60);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BBBA703C10AB56564643036",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BBD7BC7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_61 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_163", null, 0, false);
	subContainer_22.addSubInstruction(sub_61);
		ISubRule sub_62 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[22], false, "Shop the Nestl. Hea_url_21", null, 0, false);
	subContainer_22.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_165", null, 0, false);
	subContainer_22.addSubInstruction(sub_63);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BBD7BCAC10AB56564643036",
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

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BBF7797C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_64 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_162", null, 0, false);
	subContainer_23.addSubInstruction(sub_64);
		ISubRule sub_65 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[23], false, "Shop the Nestl. Hea_url_20", null, 0, false);
	subContainer_23.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_164", null, 0, false);
	subContainer_23.addSubInstruction(sub_66);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BBF779AC10AB56564643036",
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

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BC718B7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_67 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_161", null, 0, false);
	subContainer_24.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[24], false, "Shop the Nestl. Hea_url_19", null, 0, false);
	subContainer_24.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_163", null, 0, false);
	subContainer_24.addSubInstruction(sub_69);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BC718BAC10AB56564643036",
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

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BC7DC07C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_70 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_160", null, 0, false);
	subContainer_25.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_uri", 0, 96, false, (IDCCoreVar)dcVars[25], false, "Shop the Nestl. Hea_url_18", null, 0, false);
	subContainer_25.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_162", null, 0, false);
	subContainer_25.addSubInstruction(sub_72);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BC7DC0AC10AB56564643036",
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

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BC82A73C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_73 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_159", null, 0, false);
	subContainer_26.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_uri", 0, 96, false, (IDCCoreVar)dcVars[26], false, "Shop the Nestl. Hea_url_17", null, 0, false);
	subContainer_26.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_161", null, 0, false);
	subContainer_26.addSubInstruction(sub_75);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BC82A76C10AB56564643036",
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

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BC878AFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_76 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_158", null, 0, false);
	subContainer_27.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_uri", 0, 91, false, (IDCCoreVar)dcVars[27], false, "Shop the Nestl. Hea_url_16", null, 0, false);
	subContainer_27.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_160", null, 0, false);
	subContainer_27.addSubInstruction(sub_78);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BC878B2C10AB56564643036",
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

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BC8C6B1C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_79 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_157", null, 0, false);
	subContainer_28.addSubInstruction(sub_79);
		ISubRule sub_80 = new SubRule("req_uri", 0, 98, false, (IDCCoreVar)dcVars[28], false, "Shop the Nestl. Hea_url_15", null, 0, false);
	subContainer_28.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_159", null, 0, false);
	subContainer_28.addSubInstruction(sub_81);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BC8C6B4C10AB56564643036",
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

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BCA7410C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_82 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_156", null, 0, false);
	subContainer_29.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_uri", 0, 91, false, (IDCCoreVar)dcVars[29], false, "Shop the Nestl. Hea_url_14", null, 0, false);
	subContainer_29.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_158", null, 0, false);
	subContainer_29.addSubInstruction(sub_84);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BCA7413C10AB56564643036",
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

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BCAC293C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_85 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_155", null, 0, false);
	subContainer_30.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_uri", 0, 111, false, (IDCCoreVar)dcVars[30], false, "Shop the Nestl. Hea_url_13", null, 0, false);
	subContainer_30.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_157", null, 0, false);
	subContainer_30.addSubInstruction(sub_87);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BCAC296C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("font/woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BCB1050C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_88 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_154", null, 0, false);
	subContainer_31.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_uri", 0, 113, false, (IDCCoreVar)dcVars[31], false, "Shop the Nestl. Hea_url_12", null, 0, false);
	subContainer_31.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_156", null, 0, false);
	subContainer_31.addSubInstruction(sub_90);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BCB1053C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("font/woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BCB37CFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_91 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_153", null, 0, false);
	subContainer_32.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_uri", 0, 114, false, (IDCCoreVar)dcVars[32], false, "Shop the Nestl. Hea_url_11", null, 0, false);
	subContainer_32.addSubInstruction(sub_92);
		ISubRule sub_93 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_155", null, 0, false);
	subContainer_32.addSubInstruction(sub_93);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BCB37D2C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("font/woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BCB859FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_94 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_152", null, 0, false);
	subContainer_33.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_uri", 0, 110, false, (IDCCoreVar)dcVars[33], false, "Shop the Nestl. Hea_url_10", null, 0, false);
	subContainer_33.addSubInstruction(sub_95);
		ISubRule sub_96 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_154", null, 0, false);
	subContainer_33.addSubInstruction(sub_96);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BCB85A2C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("font/woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BCBACFFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_97 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_151", null, 0, false);
	subContainer_34.addSubInstruction(sub_97);
		ISubRule sub_98 = new SubRule("req_uri", 0, 94, false, (IDCCoreVar)dcVars[34], false, "Shop the Nestl. Hea_url_9", null, 0, false);
	subContainer_34.addSubInstruction(sub_98);
		ISubRule sub_99 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_153", null, 0, false);
	subContainer_34.addSubInstruction(sub_99);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BCBAD02C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("font/woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6BCBFAB0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_100 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_150", null, 0, false);
	subContainer_35.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_152", null, 0, false);
	subContainer_35.addSubInstruction(sub_101);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);		
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
			"A1F0AF2B6BCBFAB3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C0E81F0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_102 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_144", null, 0, false);
	subContainer_36.addSubInstruction(sub_102);
		ISubRule sub_103 = new SubRule("req_uri", 0, 17, false, (IDCCoreVar)dcVars[35], false, "Shop the Nestl. Hea_url_7", null, 0, false);
	subContainer_36.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_146", null, 0, false);
	subContainer_36.addSubInstruction(sub_104);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6BCBFAB0C10AB56564643036"), 3);		
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
			"A1F0AF2B6C0E81F3C10AB56564643036",
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

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C1D2804C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_105 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_130", null, 0, false);
	subContainer_37.addSubInstruction(sub_105);
		ISubRule sub_106 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_132", null, 0, false);
	subContainer_37.addSubInstruction(sub_106);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C0E81F0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6BCBFAB0C10AB56564643036"), 3);		
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
			"A1F0AF2B6C1D2807C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C44AD43C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/javascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "form_key=7mGXID8mCTAY4SKP;mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-cache-sessid=true;mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_107 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_115", null, 0, false);
	subContainer_38.addSubInstruction(sub_107);
		ISubRule sub_108 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_117", null, 0, false);
	subContainer_38.addSubInstruction(sub_108);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C0E81F0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6BCBFAB0C10AB56564643036"), 3);		
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
			"A1F0AF2B6C44AD46C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C44FBBFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3706", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-cache-sessid=true;mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={}", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_110 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_114", null, 0, false);
	subContainer_40.addSubInstruction(sub_110);
		ISubRule sub_111 = new SubRule("req_uri", 0, 23, false, (IDCCoreVar)dcVars[40], false, "Shop the Nestl. Hea_url_6", null, 0, false);
	subContainer_40.addSubInstruction(sub_111);
		ISubRule sub_112 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_116", null, 0, false);
	subContainer_40.addSubInstruction(sub_112);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C0E81F0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6BBBA700C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6BCBFAB0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C44FBC2C10AB56564643036",
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
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("ap=true&bt=%7B%22charging%22%3Atrue%2C%22chargingTime%22%3A0");
strBuf_1.append("%2C%22dischargingTime%22%3A%22Infinity%22%2C%22level%22%3A1%");
strBuf_1.append("2C%22onchargingchange%22%3Anull%2C%22onchargingtimechange%22");
strBuf_1.append("%3Anull%2C%22ondischargingtimechange%22%3Anull%2C%22onlevelc");
strBuf_1.append("hange%22%3Anull%7D&fonts=null&fh=null&timing=%7B%221%22%3A49");
strBuf_1.append("%2C%222%22%3A167%2C%223%22%3A285%2C%224%22%3A390%2C%225%22%3");
strBuf_1.append("A491%2C%226%22%3A594%2C%22profile%22%3A%7B%22bp%22%3A1%2C%22");
strBuf_1.append("sr%22%3A0%2C%22dp%22%3A1%2C%22lt%22%3A0%2C%22ps%22%3A0%2C%22");
strBuf_1.append("cv%22%3A40%2C%22fp%22%3A0%2C%22sp%22%3A1%2C%22br%22%3A0%2C%2");
strBuf_1.append("2ieps%22%3A0%2C%22av%22%3A0%2C%22z1%22%3A4%2C%22jsv%22%3A0%2");
strBuf_1.append("C%22nav%22%3A1%2C%22nap%22%3A0%2C%22crc%22%3A0%2C%22z2%22%3A");
strBuf_1.append("0%2C%22z3%22%3A0%2C%22z4%22%3A0%2C%22z5%22%3A0%2C%22z6%22%3A");
strBuf_1.append("1%7D%2C%22main%22%3A4693%2C%22compute%22%3A49%2C%22send%22%3");
strBuf_1.append("A594%7D&bp=2087755996%2C1953464915%2C591862434%2C325835597%2");
strBuf_1.append("C1068473606%2C-1382186647%2C-365096851%2C-1979186206%2C-1080");
strBuf_1.append("39040%2C-1906852049&sr=%7B%22inner%22%3A%5B1488%2C738%5D%2C%");
strBuf_1.append("22outer%22%3A%5B1536%2C816%5D%2C%22screen%22%3A%5B0%2C0%5D%2");
strBuf_1.append("C%22pageOffset%22%3A%5B0%2C0%5D%2C%22avail%22%3A%5B1536%2C81");
strBuf_1.append("6%5D%2C%22size%22%3A%5B1536%2C864%5D%2C%22client%22%3A%5B147");
strBuf_1.append("3%2C738%5D%2C%22colorDepth%22%3A24%2C%22pixelDepth%22%3A24%7");
strBuf_1.append("D&dp=%7B%22XDomainRequest%22%3A0%2C%22createPopup%22%3A0%2C%");
strBuf_1.append("22removeEventListener%22%3A1%2C%22globalStorage%22%3A0%2C%22");
strBuf_1.append("openDatabase%22%3A0%2C%22indexedDB%22%3A1%2C%22attachEvent%2");
strBuf_1.append("2%3A0%2C%22ActiveXObject%22%3A0%2C%22dispatchEvent%22%3A1%2C");
strBuf_1.append("%22addBehavior%22%3A0%2C%22addEventListener%22%3A1%2C%22deta");
strBuf_1.append("chEvent%22%3A0%2C%22fireEvent%22%3A0%2C%22MutationObserver%2");
strBuf_1.append("2%3A1%2C%22HTMLMenuItemElement%22%3A0%2C%22Int8Array%22%3A1%");
strBuf_1.append("2C%22postMessage%22%3A1%2C%22querySelector%22%3A1%2C%22getEl");
strBuf_1.append("ementsByClassName%22%3A1%2C%22images%22%3A1%2C%22compatMode%");
strBuf_1.append("22%3A%22CSS1Compat%22%2C%22documentMode%22%3A0%2C%22all%22%3");
strBuf_1.append("A1%2C%22now%22%3A1%2C%22contextMenu%22%3A0%7D&lt=17611259840");
strBuf_1.append("23%2B5.5&ps=true%2Ctrue&cv=9795d1af81607e1cb1d97ee2ac624c611");
strBuf_1.append("205f86b&fp=false&sp=false&br=Chrome&ieps=false&av=false&z=%7");
strBuf_1.append("B%22a%22%3A607724697%2C%22b%22%3A1%2C%22c%22%3A1%7D&zh=&jsv=");
strBuf_1.append("1.5&nav=%7B%22userAgent%22%3A%22Mozilla%2F5.0%20(Windows%20N");
strBuf_1.append("T%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTM");
strBuf_1.append("L%2C%20like%20Gecko)%20Chrome%2F141.0.0.0%20Safari%2F537.36%");
strBuf_1.append("20Edg%2F141.0.0.0%22%2C%22appName%22%3A%22Netscape%22%2C%22a");
strBuf_1.append("ppCodeName%22%3A%22Mozilla%22%2C%22appVersion%22%3A%225.0%20");
strBuf_1.append("(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F53");
strBuf_1.append("7.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F141.0.0.0%20Safa");
strBuf_1.append("ri%2F537.36%20Edg%2F141.0.0.0%22%2C%22appMinorVersion%22%3A0");
strBuf_1.append("%2C%22product%22%3A%22Gecko%22%2C%22productSub%22%3A%2220030");
strBuf_1.append("107%22%2C%22vendor%22%3A%22Google%20Inc.%22%2C%22vendorSub%2");
strBuf_1.append("2%3A%22%22%2C%22buildID%22%3A0%2C%22platform%22%3A%22Win32%2");
strBuf_1.append("2%2C%22oscpu%22%3A0%2C%22hardwareConcurrency%22%3A12%2C%22la");
strBuf_1.append("nguage%22%3A%22en-US%22%2C%22languages%22%3A%5B%22en-US%22%2");
strBuf_1.append("C%22en%22%5D%2C%22systemLanguage%22%3A0%2C%22userLanguage%22");
strBuf_1.append("%3A0%2C%22doNotTrack%22%3Anull%2C%22msDoNotTrack%22%3A0%2C%2");
strBuf_1.append("2cookieEnabled%22%3Atrue%2C%22geolocation%22%3A1%2C%22vibrat");
strBuf_1.append("e%22%3A1%2C%22maxTouchPoints%22%3A0%2C%22webdriver%22%3Afals");
strBuf_1.append("e%2C%22plugins%22%3A%5B%22PDF%20Viewer%22%2C%22Chrome%20PDF%");
strBuf_1.append("20Viewer%22%2C%22Chromium%20PDF%20Viewer%22%2C%22Microsoft%2");
strBuf_1.append("0Edge%20PDF%20Viewer%22%2C%22WebKit%20built-in%20PDF%22%5D%7");
strBuf_1.append("D&crc=%7B%22window.chrome%22%3A%7B%22app%22%3A%7B%22isInstal");
strBuf_1.append("led%22%3Afalse%2C%22InstallState%22%3A%7B%22DISABLED%22%3A%2");
strBuf_1.append("2disabled%22%2C%22INSTALLED%22%3A%22installed%22%2C%22NOT_IN");
strBuf_1.append("STALLED%22%3A%22not_installed%22%7D%2C%22RunningState%22%3A%");
strBuf_1.append("7B%22CANNOT_RUN%22%3A%22cannot_run%22%2C%22READY_TO_RUN%22%3");
strBuf_1.append("A%22ready_to_run%22%2C%22RUNNING%22%3A%22running%22%7D%7D%7D");
strBuf_1.append("%7D&t=a1c3eea3d6719cd9ba655b8e04e70aa01f71e4bf&u=a246d7d0893");
strBuf_1.append("e5df3890d7d38077b83af&nap=21311144241322244122");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1F0AF2B6C452264C10AB56564643036", postData, requestData_1, "UTF-8", 5, 1945);
	postData.addDataChunk(pdc_0);

	IDataSub subContainer_39 = new DataSub();
	pdc_0.addDataSub(subContainer_39);

		ISubRule sub_109 = new SubRule("req_content", 1940, 5, true, (IDCCoreVar)dcVars[45], false, "sp", null, 0, false);
	subContainer_39.addSubInstruction(sub_109);
	



	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C4570DFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-cache-sessid=true;mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_113 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_112", null, 0, false);
	subContainer_41.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_uri", 0, 141, false, (IDCCoreVar)dcVars[37], false, "Shop the Nestl. Hea_url_5", null, 0, false);
	subContainer_41.addSubInstruction(sub_114);
		ISubRule sub_115 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_114", null, 0, false);
	subContainer_41.addSubInstruction(sub_115);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44FBBFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C1D2804C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C4570E2C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C4597EFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-cache-sessid=true;mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_116 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_111", null, 0, false);
	subContainer_42.addSubInstruction(sub_116);
		ISubRule sub_117 = new SubRule("req_uri", 0, 87, false, (IDCCoreVar)dcVars[38], false, "Shop the Nestl. Hea_url_4", null, 0, false);
	subContainer_42.addSubInstruction(sub_117);
		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_113", null, 0, false);
	subContainer_42.addSubInstruction(sub_118);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44FBBFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C1D2804C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C4597F2C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C45BEFFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-cache-sessid=true;mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_119 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_110", null, 0, false);
	subContainer_43.addSubInstruction(sub_119);
		ISubRule sub_120 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[39], false, "Shop the Nestl. Hea_url_3", null, 0, false);
	subContainer_43.addSubInstruction(sub_120);
		ISubRule sub_121 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_112", null, 0, false);
	subContainer_43.addSubInstruction(sub_121);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44FBBFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C1D2804C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C45E5A1C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C4B8B5FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-cache-sessid=true;mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_122 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_101", null, 0, false);
	subContainer_44.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_103", null, 0, false);
	subContainer_44.addSubInstruction(sub_123);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44FBBFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C1D2804C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C4B8B62C10AB56564643036",
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

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C4C7557C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-cache-sessid=true;mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_124 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_99", null, 0, false);
	subContainer_45.addSubInstruction(sub_124);
		ISubRule sub_125 = new SubRule("req_uri", 0, 91, false, (IDCCoreVar)dcVars[36], false, "Shop the Nestl. Hea_url_2", null, 0, false);
	subContainer_45.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_101", null, 0, false);
	subContainer_45.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44FBBFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C1D2804C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C4C755AC10AB56564643036",
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

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C4CC3DFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_127 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_98", null, 0, false);
	subContainer_46.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_100", null, 0, false);
	subContainer_46.addSubInstruction(sub_128);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C4CC3E2C10AB56564643036",
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

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C4D390FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/css/styles-m.min.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988}", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_129 = new SubRule("req_hdr_Referer_1", 0, 132, false, (IDCCoreVar)dcVars[41], false, "Referer_97", null, 0, false);
	subContainer_47.addSubInstruction(sub_129);
		ISubRule sub_130 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_99", null, 0, false);
	subContainer_47.addSubInstruction(sub_130);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B710970C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C4D3912C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("font/woff");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C554EF0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_131 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_96", null, 0, false);
	subContainer_48.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_uri", 0, 89, false, (IDCCoreVar)dcVars[7], false, "Shop the Nestl. Hea_url", null, 0, false);
	subContainer_48.addSubInstruction(sub_132);
		ISubRule sub_133 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_98", null, 0, false);
	subContainer_48.addSubInstruction(sub_133);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B6D871CC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C554EF3C10AB56564643036",
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

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C559D7BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/font-awesome.min.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_134 = new SubRule("req_uri", 120, 5, true, (IDCCoreVar)dcVars[43], false, "v", null, 0, false);
	subContainer_49.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_hdr_Referer_1", 0, 150, false, (IDCCoreVar)dcVars[42], false, "Referer_95", null, 0, false);
	subContainer_49.addSubInstruction(sub_135);
		ISubRule sub_136 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_97", null, 0, false);
	subContainer_49.addSubInstruction(sub_136);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B870277C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6B870277C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C44AD43C10AB56564643036"), 3);		
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
			"A1F0AF2B6C559D7EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("font/woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(579, 1, parent, parent, "A1F0AF2B6C65548EC10AB56564643036");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "5a20_sw_iframe", "A1F0AF2B6C65548EC10AB56564643036") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_49(this, true, "A1F0AF2B6C655480C10AB56564643036", false, true,
						"Config_2", "sw_iframe.html",	"/_/service_worker/5a20/sw_iframe.html?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com&1p=1", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_50(this, false, "A1F0AF2B6C65A2E9C10AB56564643036", false, false,
						"Config_2", "collect",	"/g/collect?v=2&tid=G-0QWBDMKBMH&gtm=45je5ak1v9190503679z89191671902za200zb9191671902zd810788975&_p=1761125983678&gcs=G111&gcd=13t3t3t3t5l1&npa=0&dma=0&cid=2125953291.1761125990&ecid=292607285&ul=en-us&sr=1536x864&_fplc=0&ur=IN-TG&uaa=x86&uab=64&uafvl=Microsoft%2520Edge%3B141.0.3537.92%7CNot%253FA_Brand%3B8.0.0.0%7CChromium%3B141.0.7390.108&uamb=0&uam=&uap=Windows&uapv=19.0.0&uaw=0&are=1&frm=0&pscdl=noapi&sst.rnd=1963646615.1761125990&sst.etld=google.co.in&sst.tft=1761125983678&sst.lpc=186273384&sst.navt=n&sst.ude=0&sst.sw_exp=1&_s=1&tag_exp=101509157~103116026~103200004~103233427~104527907~104528500~104684208~104684211~104948813~115480710~115734856~115734858~115938465~115938468~116110425~116110427&sid=1761125990&sct=1&seg=0&dl=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&dt=Shop%20the%20Nestl%C3%A9%20Health%20Science%20Nutrition%20Store&_tu=DA&en=page_view&_fv=1&_nsi=1&_ss=1&ep.asset_brand=MULTI%20BRAND&ep.asset_business=NESTL%C3%89%20HEALTH%20SCIENCE&ep.asset_country=United%20States&ep.asset_digipi=DIG0023685&ep.asset_zone=North%20America&ep.asset_url=nestlenutritionstore.com&ep.floodlight_data=%7B%22local_floodlight_id%22%3A%229927885%22%2C%22u68%22%3A%22https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F%22%2C%22u69%22%3A%22%22%7D&ep.custom_properties=%7B%22meta_pixel_ID%22%3A%221301781777916570%22%2C%22content_type%22%3A%22product%22%7D&ep.country=United%20States&ep.cmp_mode=advanced&ep.event_id=1761126873273_176112647661258&ep.floodlight_event=en_01%7Cen_07&ep.meta_event=true&tfd=12273&richsstsse", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_51(this, false, "A1F0AF2B6C655480C10AB56564643036", true, false,
						"Config_2", "2439240c",	"/akam/13/2439240c", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_52(this, false, "A1F0AF2B6C65A2E9C10AB56564643036", true, false,
						"Config_2", "sw.js",	"/_/service_worker/5a20/sw.js?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_53(this, false, "A1F0AF2B6C6AFA13C10AB56564643036", true, false,
						"Config_3", "location",	"/cookieconsentpub/v1/geo/location", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C655492C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "iframe", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h292607285;_ga=GA1.1.2125953291.1761125990", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[46], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[47], "/data-na\\.nestlenutritionstore\\.com(.*?)\\?", 1, 1, 0, 0, false, "data-na.nestlenutritionstore.com", null, 0, false);
	IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_137 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_96", null, 0, false);
	subContainer_50.addSubInstruction(sub_137);
	


		
				
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
			"A1F0AF2B6C655495C10AB56564643036",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C65A2F7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h292607285;_ga=GA1.1.2125953291.1761125990", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_138 = new SubRule("req_uri", 13, 1, true, (IDCCoreVar)dcVars[44], false, "v", null, 0, false);
	subContainer_51.addSubInstruction(sub_138);
		ISubRule sub_139 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_94", null, 0, false);
	subContainer_51.addSubInstruction(sub_139);
		ISubRule sub_140 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_95", null, 0, false);
	subContainer_51.addSubInstruction(sub_140);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C655492C10AB56564643036"), 3);		
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
			"A1F0AF2B6C65A2FAC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C6A5D90C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://data-na.nestlenutritionstore.com/_/service_worker/5a20/sw_iframe.html?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com&1p=1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h292607285;_ga=GA1.1.2125953291.1761125990;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_141 = new SubRule("req_hdr_Referer_1", 0, 136, false, (IDCCoreVar)dcVars[46], false, "Referer_93", null, 0, false);
	subContainer_52.addSubInstruction(sub_141);
		ISubRule sub_142 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_94", null, 0, false);
	subContainer_52.addSubInstruction(sub_142);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C655492C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C655492C10AB56564643036"), 3);		
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
			"A1F0AF2B6C6A5D93C10AB56564643036",
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

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C6AABF9C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Service-Worker", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "serviceworker", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://data-na.nestlenutritionstore.com/_/service_worker/5a20/sw_iframe.html?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com&1p=1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h292607285;_ga=GA1.1.2125953291.1761125990;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[48], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_5", null, 0, false);
	IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_143 = new SubRule("req_hdr_Referer_1", 0, 136, false, (IDCCoreVar)dcVars[46], false, "Referer_92", null, 0, false);
	subContainer_53.addSubInstruction(sub_143);
		ISubRule sub_144 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_93", null, 0, false);
	subContainer_53.addSubInstruction(sub_144);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C655492C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C655492C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C65A2F7C10AB56564643036"), 3);		
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
			"A1F0AF2B6C6AABFCC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C6AFA21C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "geolocation.onetrust.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[49], "JSON:$.country", 1, 0, 0, 0, false, "country_2", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[50], "JSON:$.state", 1, 0, 0, 0, false, "state_2", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[51], "JSON:$.stateName", 1, 0, 0, 0, false, "stateName_2", null, 0, false);
	IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_145 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_91", null, 0, false);
	subContainer_54.addSubInstruction(sub_145);
		ISubRule sub_146 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[3], false, "Host_92", null, 0, false);
	subContainer_54.addSubInstruction(sub_146);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C655492C10AB56564643036"), 3);		
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
			"A1F0AF2B6C6AFA24C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(906, 1, parent, parent, "A1F0AF2B6C7B4D8EC10AB56564643036");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "13_pixel_2439240c", "A1F0AF2B6C7B4D8EC10AB56564643036") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_54(this, true, "A1F0AF2B6C7B4D80C10AB56564643036", false, true,
						"Config_2", "pixel_2439240c",	"/akam/13/pixel_2439240c", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_55(this, false, "A1F0AF2B6C8119E0C10AB56564643036", false, false,
						"Config_1", "favicon.ico",	"/media/favicon/stores/1/favicon.ico", true, false), 329, 100, "A1F0AF2B6C7B4D92C10AB56564643036", 3);
				httpParallel.addRequest(1, request_56(this, false, "A1F0AF2B6C8119E0C10AB56564643036", true, false,
						"Config_1", "favicon.ico{1}",	"/media/favicon/stores/1/favicon.ico", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_57(this, false, "A1F0AF2B6C7B4D80C10AB56564643036", true, false,
						"Config_2", "collect{1}",	"/g/collect?v=2&tid=G-0QWBDMKBMH&gtm=45je5ak1v9190503679z89191671902za200zb9191671902zd810788975&_p=1761125983678&gcs=G111&gcd=13v3v3v3v5l1&npa=0&dma=0&gdid=dYWJhMj&cid=2125953291.1761125990&ecid=292607285&ul=en-us&sr=1536x864&ur=IN-TG&uaa=x86&uab=64&uafvl=Microsoft%2520Edge%3B141.0.3537.92%7CNot%253FA_Brand%3B8.0.0.0%7CChromium%3B141.0.7390.108&uamb=0&uam=&uap=Windows&uapv=19.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AAAAAAQ&sst.rnd=1963646615.1761125990&sst.etld=google.co.in&sst.tft=1761125983678&sst.lpc=186273384&sst.navt=n&sst.ude=0&sst.sw_exp=1&_s=2&tag_exp=101509157~103116026~103200004~103233427~104527907~104528500~104684208~104684211~104948813~115480710~115734856~115734858~115938465~115938468~116110425~116110427&sid=1761125990&sct=1&seg=1&dl=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&dt=Shop%20the%20Nestl%C3%A9%20Health%20Science%20Nutrition%20Store&_tu=DA&en=page_view&ep.asset_brand=MULTI%20BRAND&ep.asset_business=NESTL%C3%89%20HEALTH%20SCIENCE&ep.asset_country=United%20States&ep.asset_digipi=DIG0023685&ep.asset_zone=North%20America&ep.asset_url=nestlenutritionstore.com&ep.floodlight_data=%7B%22local_floodlight_id%22%3A%229927885%22%2C%22u68%22%3A%22https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F%22%2C%22u69%22%3A%22%22%7D&ep.custom_properties=%7B%22meta_pixel_ID%22%3A%221301781777916570%22%2C%22content_type%22%3A%22product%22%7D&ep.country=United%20States&ep.cmp_mode=advanced&ep.event_id=1761126873273_1761126476612494&ep.onetrust_cookie=isGpcEnabled%3D0%26datestamp%3DWed%2BOct%2B22%2B2025%2B15%3A09%3A56%2BGMT%2B0530%2B(India%2BStandard%2BTime)%26version%3D202411.1.0%26browserGpcFlag%3D0%26isIABGlobal%3Dfalse%26hosts%3D%26consentId%3D7b171024-8e14-48ce-80a3-0ae342502714%26interactionCount%3D1%26isAnonUser%3D1%26landingPath%3DNotLandingPage%26groups%3DC0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1%26intType%3D1&ep.floodlight_event=en_01%7Cen_07&ep.meta_event=true&ep.no_ga4=true&_et=6433&tfd=18709&richsstsse", true, false), 3166, 100, "A1F0AF2B6C81B620C10AB56564643036", 3);
				httpParallel.addRequest(2, request_58(this, false, "A1F0AF2B6D3E9D80C10AB56564643036", false, false,
						"Config_4", "SIE",	"/SIE/?Q_ZID=ZN_24vlED20qahDI2x", true, false), 3248, 100, "A1F0AF2B6C81B620C10AB56564643036", 3);
				httpParallel.addRequest(3, request_59(this, false, "A1F0AF2B6D47772CC10AB56564643036", true, false,
						"Config_5", "gtm_common.js",	"/d2c/js/gtm_common.js", true, false), 164, 100, "A1F0AF2B6D3E9D8EC10AB56564643036", 3);
				httpParallel.addRequest(4, request_60(this, false, "A1F0AF2B6D47C584C10AB56564643036", false, false,
						"Config_6", "consentreceipts",	"/request/v1/consentreceipts", true, false), 3173, 100, "A1F0AF2B6C81B620C10AB56564643036", 3);
				httpParallel.addRequest(5, request_61(this, false, "A1F0AF2B6D47ECA3C10AB56564643036", true, false,
						"Config_7", "getRetailerConfig",	"/api/v1/gtm/getRetailerConfig?accessToken=d0deb39c-32f4-11ee-a4da-02192b61d3cb&_=1761125983316", true, false), 230, 100, "A1F0AF2B6D479E3BC10AB56564643036", 3);
				httpParallel.addRequest(4, request_62(this, false, "A1F0AF2B6D47C584C10AB56564643036", true, false,
						"Config_6", "consentreceipts{1}",	"/request/v1/consentreceipts", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C7B4D92C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "3571", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://data-na.nestlenutritionstore.com/_/service_worker/5a20/sw_iframe.html?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com&1p=1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h292607285;_ga=GA1.1.2125953291.1761125990;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h0;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_148 = new SubRule("req_hdr_Referer_1", 0, 136, false, (IDCCoreVar)dcVars[46], false, "Referer_90", null, 0, false);
	subContainer_56.addSubInstruction(sub_148);
		ISubRule sub_149 = new SubRule("req_uri", 0, 23, false, (IDCCoreVar)dcVars[47], false, "13_pixel_2439240c_url", null, 0, false);
	subContainer_56.addSubInstruction(sub_149);
		ISubRule sub_150 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_91", null, 0, false);
	subContainer_56.addSubInstruction(sub_150);
	


		
				
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
			"A1F0AF2B6C7B4D95C10AB56564643036",
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
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("ap=true&bt=%7B%22charging%22%3Atrue%2C%22chargingTime%22%3A0");
strBuf_2.append("%2C%22dischargingTime%22%3A%22Infinity%22%2C%22level%22%3A1%");
strBuf_2.append("2C%22onchargingchange%22%3Anull%2C%22onchargingtimechange%22");
strBuf_2.append("%3Anull%2C%22ondischargingtimechange%22%3Anull%2C%22onlevelc");
strBuf_2.append("hange%22%3Anull%7D&fonts=null&fh=null&timing=%7B%221%22%3A25");
strBuf_2.append("%2C%222%22%3A863%2C%22profile%22%3A%7B%22bp%22%3A0%2C%22sr%2");
strBuf_2.append("2%3A1%2C%22dp%22%3A0%2C%22lt%22%3A0%2C%22ps%22%3A2%2C%22cv%2");
strBuf_2.append("2%3A14%2C%22fp%22%3A0%2C%22sp%22%3A1%2C%22br%22%3A0%2C%22iep");
strBuf_2.append("s%22%3A0%2C%22av%22%3A0%2C%22z1%22%3A5%2C%22jsv%22%3A0%2C%22");
strBuf_2.append("nav%22%3A1%2C%22nap%22%3A1%2C%22crc%22%3A0%2C%22z2%22%3A0%7D");
strBuf_2.append("%2C%22main%22%3A872%2C%22compute%22%3A25%2C%22send%22%3A864%");
strBuf_2.append("7D&bp=2087755996%2C1953464915%2C591862434%2C325835597%2C1068");
strBuf_2.append("473606%2C-1382186647%2C-365096851%2C-1979186206%2C-108039040");
strBuf_2.append("%2C-1906852049&sr=%7B%22inner%22%3A%5B0%2C0%5D%2C%22outer%22");
strBuf_2.append("%3A%5B1536%2C816%5D%2C%22screen%22%3A%5B0%2C0%5D%2C%22pageOf");
strBuf_2.append("fset%22%3A%5B0%2C0%5D%2C%22avail%22%3A%5B1536%2C816%5D%2C%22");
strBuf_2.append("size%22%3A%5B1536%2C864%5D%2C%22client%22%3A%5B0%2C0%5D%2C%2");
strBuf_2.append("2colorDepth%22%3A24%2C%22pixelDepth%22%3A24%7D&dp=%7B%22XDom");
strBuf_2.append("ainRequest%22%3A0%2C%22createPopup%22%3A0%2C%22removeEventLi");
strBuf_2.append("stener%22%3A1%2C%22globalStorage%22%3A0%2C%22openDatabase%22");
strBuf_2.append("%3A0%2C%22indexedDB%22%3A1%2C%22attachEvent%22%3A0%2C%22Acti");
strBuf_2.append("veXObject%22%3A0%2C%22dispatchEvent%22%3A1%2C%22addBehavior%");
strBuf_2.append("22%3A0%2C%22addEventListener%22%3A1%2C%22detachEvent%22%3A0%");
strBuf_2.append("2C%22fireEvent%22%3A0%2C%22MutationObserver%22%3A1%2C%22HTML");
strBuf_2.append("MenuItemElement%22%3A0%2C%22Int8Array%22%3A1%2C%22postMessag");
strBuf_2.append("e%22%3A1%2C%22querySelector%22%3A1%2C%22getElementsByClassNa");
strBuf_2.append("me%22%3A1%2C%22images%22%3A1%2C%22compatMode%22%3A%22CSS1Com");
strBuf_2.append("pat%22%2C%22documentMode%22%3A0%2C%22all%22%3A1%2C%22now%22%");
strBuf_2.append("3A1%2C%22contextMenu%22%3A0%7D&lt=1761125991666%2B5.5&ps=tru");
strBuf_2.append("e%2Ctrue&cv=9795d1af81607e1cb1d97ee2ac624c611205f86b&fp=fals");
strBuf_2.append("e&sp=false&br=Chrome&ieps=false&av=false&z=%7B%22a%22%3A6077");
strBuf_2.append("24699%2C%22b%22%3A1%2C%22c%22%3A1%7D&zh=&jsv=1.5&nav=%7B%22u");
strBuf_2.append("serAgent%22%3A%22Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20W");
strBuf_2.append("in64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20G");
strBuf_2.append("ecko)%20Chrome%2F141.0.0.0%20Safari%2F537.36%20Edg%2F141.0.0");
strBuf_2.append(".0%22%2C%22appName%22%3A%22Netscape%22%2C%22appCodeName%22%3");
strBuf_2.append("A%22Mozilla%22%2C%22appVersion%22%3A%225.0%20(Windows%20NT%2");
strBuf_2.append("010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2");
strBuf_2.append("C%20like%20Gecko)%20Chrome%2F141.0.0.0%20Safari%2F537.36%20E");
strBuf_2.append("dg%2F141.0.0.0%22%2C%22appMinorVersion%22%3A0%2C%22product%2");
strBuf_2.append("2%3A%22Gecko%22%2C%22productSub%22%3A%2220030107%22%2C%22ven");
strBuf_2.append("dor%22%3A%22Google%20Inc.%22%2C%22vendorSub%22%3A%22%22%2C%2");
strBuf_2.append("2buildID%22%3A0%2C%22platform%22%3A%22Win32%22%2C%22oscpu%22");
strBuf_2.append("%3A0%2C%22hardwareConcurrency%22%3A12%2C%22language%22%3A%22");
strBuf_2.append("en-US%22%2C%22languages%22%3A%5B%22en-US%22%2C%22en%22%5D%2C");
strBuf_2.append("%22systemLanguage%22%3A0%2C%22userLanguage%22%3A0%2C%22doNot");
strBuf_2.append("Track%22%3Anull%2C%22msDoNotTrack%22%3A0%2C%22cookieEnabled%");
strBuf_2.append("22%3Atrue%2C%22geolocation%22%3A1%2C%22vibrate%22%3A1%2C%22m");
strBuf_2.append("axTouchPoints%22%3A0%2C%22webdriver%22%3Afalse%2C%22plugins%");
strBuf_2.append("22%3A%5B%22PDF%20Viewer%22%2C%22Chrome%20PDF%20Viewer%22%2C%");
strBuf_2.append("22Chromium%20PDF%20Viewer%22%2C%22Microsoft%20Edge%20PDF%20V");
strBuf_2.append("iewer%22%2C%22WebKit%20built-in%20PDF%22%5D%7D&crc=%7B%22win");
strBuf_2.append("dow.chrome%22%3A%7B%22app%22%3A%7B%22isInstalled%22%3Afalse%");
strBuf_2.append("2C%22InstallState%22%3A%7B%22DISABLED%22%3A%22disabled%22%2C");
strBuf_2.append("%22INSTALLED%22%3A%22installed%22%2C%22NOT_INSTALLED%22%3A%2");
strBuf_2.append("2not_installed%22%7D%2C%22RunningState%22%3A%7B%22CANNOT_RUN");
strBuf_2.append("%22%3A%22cannot_run%22%2C%22READY_TO_RUN%22%3A%22ready_to_ru");
strBuf_2.append("n%22%2C%22RUNNING%22%3A%22running%22%7D%7D%7D%7D&t=6c8b36cd8");
strBuf_2.append("0d57225d94860d06cbc0209a299bfef&u=2f0eda0e8ee255059247bc260e");
strBuf_2.append("3dd379&nap=00300044241322244002");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1F0AF2B6C7B7490C10AB56564643036", postData, requestData_2, "UTF-8", 5, 1810);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_55 = new DataSub();
	pdc_1.addDataSub(subContainer_55);

		ISubRule sub_147 = new SubRule("req_content", 1805, 5, true, (IDCCoreVar)dcVars[45], false, "sp", null, 0, false);
	subContainer_55.addSubInstruction(sub_147);
	



	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C8119EEC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h292607285;_ga=GA1.1.2125953291.1761125990;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h0;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A52+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=0&isAnonUser=1&landingPath=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&groups=BG182%3A0%2CC0002%3A0%2CC0001%3A1%2CC0003%3A0%2CC0004%3A0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_151 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_89", null, 0, false);
	subContainer_57.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_90", null, 0, false);
	subContainer_57.addSubInstruction(sub_152);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C7B4D92C10AB56564643036"), 3);		
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
			"A1F0AF2B6C8119F1C10AB56564643036",
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

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C81B620C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h292607285;_ga=GA1.1.2125953291.1761125990;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h0;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A52+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=0&isAnonUser=1&landingPath=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&groups=BG182%3A0%2CC0002%3A0%2CC0001%3A1%2CC0003%3A0%2CC0004%3A0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"6170cbda-47e\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Thu, 21 Oct 2021 02:09:30 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_153 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_88", null, 0, false);
	subContainer_58.addSubInstruction(sub_153);
		ISubRule sub_154 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_89", null, 0, false);
	subContainer_58.addSubInstruction(sub_154);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C7B4D92C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C7B4D92C10AB56564643036"), 3);		
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
			"A1F0AF2B6C81B623C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6C820442C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Effective-Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Effective-Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Attribution-Reporting-Eligible", "trigger, not-event-source=navigation-source", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://data-na.nestlenutritionstore.com/_/service_worker/5a20/sw.js?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h0;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;_gcl_au=1.1.932615327.1761125997;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761125996$j54$l0$h292607285", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[52], ";gdid=(.*?);", 1, 1, 0, 0, false, "gdid_4", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[53], ";dma=(.*?);", 1, 1, 0, 0, false, "dma_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[54], ";npa=(.*?);", 1, 1, 0, 0, false, "npa_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[55], ";gcs=(.*?);", 1, 1, 0, 0, false, "gcs_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[56], ";gcd=(.*?);", 1, 1, 0, 0, false, "gcd_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[57], ";uaa=(.*?);", 1, 1, 0, 0, false, "uaa_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[58], ";uab=(.*?);", 1, 1, 0, 0, false, "uab_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[59], ";uafvl=(.*?);", 1, 1, 0, 0, false, "uafvl_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[60], ";uamb=(.*?);", 1, 1, 0, 0, false, "uamb_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[61], ";uap=(.*?);", 1, 1, 0, 0, false, "uap_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[62], ";uapv=(.*?);", 1, 1, 0, 0, false, "uapv_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[63], ";uaw=(.*?);", 1, 1, 0, 0, false, "uaw_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[64], ";pscdl=(.*?);", 1, 1, 0, 0, false, "pscdl_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[65], ";tag_exp=(.*?);", 1, 1, 0, 0, false, "tag_exp_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[66], ";_tu=(.*?);", 1, 1, 0, 0, false, "_tu_7", null, 0, false);
	IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_155 = new SubRule("req_uri", 13, 1, true, (IDCCoreVar)dcVars[44], false, "v", null, 0, false);
	subContainer_59.addSubInstruction(sub_155);
		ISubRule sub_156 = new SubRule("req_hdr_Referer_1", 0, 122, false, (IDCCoreVar)dcVars[48], false, "Referer_87", null, 0, false);
	subContainer_59.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_88", null, 0, false);
	subContainer_59.addSubInstruction(sub_157);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C7B4D92C10AB56564643036"), 3);		
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
			"A1F0AF2B6C820445C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D3E9D8EC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "zn24vled20qahdi2x-nestleglobalmktg.siteintercept.qualtrics.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_158 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_86", null, 0, false);
	subContainer_60.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Host_1", 0, 62, false, (IDCCoreVar)vars[1], false, "Host_87", null, 0, false);
	subContainer_60.addSubInstruction(sub_159);
	


		
				
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
			"A1F0AF2B6D3E9D91C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D479E3BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "click2cart.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_160 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_85", null, 0, false);
	subContainer_61.addSubInstruction(sub_160);
		ISubRule sub_161 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[6], false, "Host_86", null, 0, false);
	subContainer_61.addSubInstruction(sub_161);
	


		
				
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
			"A1F0AF2B6D479E3EC10AB56564643036",
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

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D47C592C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "nestle-privacy.my.onetrust.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Access-Control-Request-Method", "POST", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Access-Control-Request-Headers", "content-type", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_162 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_84", null, 0, false);
	subContainer_62.addSubInstruction(sub_162);
		ISubRule sub_163 = new SubRule("req_hdr_Host_1", 0, 30, false, (IDCCoreVar)vars[4], false, "Host_85", null, 0, false);
	subContainer_62.addSubInstruction(sub_163);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"OPTIONS",	// method
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
			"A1F0AF2B6D47C595C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D47ECB1C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "sc-api.click2cart.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_164 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_83", null, 0, false);
	subContainer_63.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_hdr_Host_1", 0, 21, false, (IDCCoreVar)vars[5], false, "Host_84", null, 0, false);
	subContainer_63.addSubInstruction(sub_165);
	


		
				
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
			"A1F0AF2B6D47ECB4C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D48139BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "nestle-privacy.my.onetrust.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "11918", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_169 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_82", null, 0, false);
	subContainer_65.addSubInstruction(sub_169);
		ISubRule sub_170 = new SubRule("req_hdr_Host_1", 0, 30, false, (IDCCoreVar)vars[4], false, "Host_83", null, 0, false);
	subContainer_65.addSubInstruction(sub_170);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6C7B4D92C10AB56564643036"), 3);		
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
			"A1F0AF2B6D48139EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

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
					String requestData_3 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1F0AF2B6B4D2DC0C10AB56564643036.testdata",
	                                   "A1F0AF2B6D4813F3C10AB56564643036",
	                                   12180));
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1F0AF2B6D4813F3C10AB56564643036", postData, requestData_3, "UTF-8", 14, 12101);
	postData.addDataChunk(pdc_2);

	IDataSub subContainer_64 = new DataSub();
	pdc_2.addDataSub(subContainer_64);

		ISubRule sub_166 = new SubRule("req_content", 12091, 10, false, (IDCCoreVar)dcVars[51], false, "stateName", null, 0, false);
	subContainer_64.addSubInstruction(sub_166);
		ISubRule sub_167 = new SubRule("req_content", 12068, 2, true, (IDCCoreVar)dcVars[50], false, "state", null, 0, false);
	subContainer_64.addSubInstruction(sub_167);
		ISubRule sub_168 = new SubRule("req_content", 12049, 2, true, (IDCCoreVar)dcVars[49], false, "country", null, 0, false);
	subContainer_64.addSubInstruction(sub_168);
	



	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(1451, 1, parent, parent, "A1F0AF2B6D483AE1C10AB56564643036");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Nestl\u00C3\u00A9 Health Science - Gerber\u00C2\u00AE Good Start\u00C2\u00AE", "A1F0AF2B6D483AE1C10AB56564643036") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(16, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_63(this, true, "A1F0AF2B6D483AD3C10AB56564643036", true, true,
						"Config_1", "gerber-good-start.html",	"/shop-by-brands/gerber-good-start.html", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_64(this, false, "A1F0AF2B6D48FDC0C10AB56564643036", true, false,
						"Config_2", "collect{2}",	"/g/collect?v=2&tid=G-0QWBDMKBMH&gtm=45je5ak1v9190503679za200zb9191671902zd810788975&_p=1761125983678&gcs=G111&gcd=13v3v3v3v5l1&npa=0&dma=0&gdid=dYWJhMj&cid=2125953291.1761125990&ecid=292607285&ul=en-us&sr=1536x864&ur=IN-TG&uaa=x86&uab=64&uafvl=Microsoft%2520Edge%3B141.0.3537.92%7CNot%253FA_Brand%3B8.0.0.0%7CChromium%3B141.0.7390.108&uamb=0&uam=&uap=Windows&uapv=19.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AAAAAAQ&sst.rnd=1963646615.1761125990&sst.etld=google.co.in&sst.tft=1761125983678&sst.lpc=186273384&sst.navt=n&sst.ude=0&sst.sw_exp=1&_s=3&tag_exp=101509157~103116026~103200004~103233427~104527907~104528500~104684208~104684211~104948813~115480710~115734856~115734858~115938465~115938468~116110425~116110427&sid=1761125990&sct=1&seg=1&dl=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&dt=Shop%20the%20Nestl%C3%A9%20Health%20Science%20Nutrition%20Store&_tu=DA&en=user_engagement&ep.asset_brand=MULTI%20BRAND&ep.asset_business=NESTL%C3%89%20HEALTH%20SCIENCE&ep.asset_country=United%20States&ep.asset_digipi=DIG0023685&ep.asset_zone=North%20America&ep.asset_url=nestlenutritionstore.com&ep.floodlight_data=%7B%22local_floodlight_id%22%3A%229927885%22%2C%22u68%22%3A%22https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F%22%2C%22u69%22%3A%22%22%7D&ep.custom_properties=%7B%22meta_pixel_ID%22%3A%221301781777916570%22%2C%22content_type%22%3A%22product%22%7D&ep.country=United%20States&ep.cmp_mode=advanced&ep.event_id=1761126873273_176112647661258&_et=7323&tfd=26038", true, false), 12, 100, "A1F0AF2B6D483AE5C10AB56564643036", 3);
				httpParallel.addRequest(2, request_65(this, false, "A1F0AF2B6D494BE2C10AB56564643036", false, false,
						"Config_1", "layerednavigation.min.css",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/MageWorx_LayeredNavigation/layerednavigation.min.css", true, false), 119, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(3, request_66(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "calendar.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/calendar.min.css", true, false), 135, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(4, request_67(this, false, "A1F0AF2B6D49E86CC10AB56564643036", false, false,
						"Config_1", "gallery.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/gallery/gallery.min.css", true, false), 122, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(5, request_68(this, false, "A1F0AF2B6D4A3687C10AB56564643036", false, false,
						"Config_1", "styles-m.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/css/styles-m.min.css", true, false), 136, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(6, request_69(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "password.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Nestle_SecurityAndCompliance/css/password.min.css", true, false), 137, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(7, request_70(this, false, "A1F0AF2B6D4AABD3C10AB56564643036", false, false,
						"Config_1", "ec.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Anowave_Ec/css/ec.min.css", true, false), 122, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(2, request_71(this, false, "A1F0AF2B6D494BE2C10AB56564643036", false, false,
						"Config_1", "styles-l.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/css/styles-l.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_72(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "bootstrap.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/bootstrap.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_73(this, false, "A1F0AF2B6D49E86CC10AB56564643036", false, false,
						"Config_1", "font-awesome.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/font-awesome.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_74(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "animate.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/animate.min.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_75(this, false, "A1F0AF2B6D4AABD3C10AB56564643036", false, false,
						"Config_1", "require.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/requirejs/require.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_76(this, false, "A1F0AF2B6D494BE2C10AB56564643036", false, false,
						"Config_1", "bundle0.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle0.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_77(this, false, "A1F0AF2B6D49E86CC10AB56564643036", false, false,
						"Config_1", "bundle1.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle1.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_78(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "bundle10.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle10.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_79(this, false, "A1F0AF2B6D4AABD3C10AB56564643036", false, false,
						"Config_1", "bundle11.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle11.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_80(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "bundle12.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle12.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_81(this, false, "A1F0AF2B6D4A3687C10AB56564643036", false, false,
						"Config_1", "bundle2.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle2.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_82(this, false, "A1F0AF2B6D494BE2C10AB56564643036", false, false,
						"Config_1", "bundle3.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle3.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_83(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "bundle4.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle4.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_84(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "bundle5.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle5.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_85(this, false, "A1F0AF2B6D4AABD3C10AB56564643036", false, false,
						"Config_1", "bundle6.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle6.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_86(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "bundle7.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle7.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_87(this, false, "A1F0AF2B6D49E86CC10AB56564643036", false, false,
						"Config_1", "bundle8.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle8.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_88(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "bundle9.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/bundle/bundle9.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_89(this, false, "A1F0AF2B6D4AABD3C10AB56564643036", false, false,
						"Config_1", "static.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/requirejs/static.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_90(this, false, "A1F0AF2B6D494BE2C10AB56564643036", false, false,
						"Config_1", "mixins.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/requirejs/mixins.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_91(this, false, "A1F0AF2B6D49E86CC10AB56564643036", false, false,
						"Config_1", "requirejs-config.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/requirejs-config.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_92(this, false, "A1F0AF2B6D4A3687C10AB56564643036", false, false,
						"Config_1", "ec.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/NHSUS_GTMTracking/js/ec.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_93(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "sticky-header.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js/sticky-header.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_94(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "opensans-300.woff2{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/light/opensans-300.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_95(this, false, "A1F0AF2B6D4AABD3C10AB56564643036", false, false,
						"Config_1", "opensans-400.woff2{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/regular/opensans-400.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_96(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "opensans-600.woff2{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/semibold/opensans-600.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_97(this, false, "A1F0AF2B6D4AABD3C10AB56564643036", false, false,
						"Config_1", "opensans-700.woff2{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/opensans/bold/opensans-700.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_98(this, false, "A1F0AF2B6D494BE2C10AB56564643036", false, false,
						"Config_1", "Luma-Icons.woff2{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/fonts/Luma-Icons.woff2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_99(this, false, "A1F0AF2B6D499A87C10AB56564643036", false, false,
						"Config_1", "logo.png{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/images/logo.png", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_100(this, false, "A1F0AF2B6D49E86CC10AB56564643036", false, false,
						"Config_1", "fontawesome-webfont.woff2{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/fonts/fontawesome-webfont.woff2?v=4.7.0", true, false), 164, 100, "A1F0AF2B6D51899BC10AB56564643036", 3);
				httpParallel.addRequest(2, request_101(this, false, "A1F0AF2B6D494BE2C10AB56564643036", false, false,
						"Config_1", "js-translation.json{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/js-translation.json", true, false), 479, 100, "A1F0AF2B6D53AC77C10AB56564643036", 3);
				httpParallel.addRequest(6, request_102(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "gerber-good-start-extensive-ha-front-min.png",	"/media/catalog/product/cache/c60d6c67e931fd9791b19a3fdf739f3a/g/e/gerber-good-start-extensive-ha-front-min.png", true, false), 479, 100, "A1F0AF2B6D53AC77C10AB56564643036", 3);
				httpParallel.addRequest(4, request_103(this, false, "A1F0AF2B6D49E86CC10AB56564643036", false, false,
						"Config_1", "snippet{1}",	"/rest/V1/swell/session/snippet/", true, false), 141, 100, "A1F0AF2B6D56B961C10AB56564643036", 3);
				httpParallel.addRequest(3, request_104(this, false, "A1F0AF2B6D499A87C10AB56564643036", true, false,
						"Config_1", "loader.svg",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Amasty_Scroll/images/loader.svg", true, false), 132, 100, "A1F0AF2B6D5707C9C10AB56564643036", 3);
				httpParallel.addRequest(5, request_105(this, false, "A1F0AF2B6D4A3687C10AB56564643036", false, false,
						"Config_1", "slick.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_PageBuilder/js/resource/slick/slick.js", true, false), 148, 100, "A1F0AF2B6D5707C9C10AB56564643036", 3);
				httpParallel.addRequest(6, request_106(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", false, false,
						"Config_1", "print.min.css{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/css/print.min.css", true, false), 161, 100, "A1F0AF2B6D5707C9C10AB56564643036", 3);
				httpParallel.addRequest(8, request_107(this, false, "A1F0AF2B6D65D4EBC10AB56564643036", true, false,
						"Config_2", "sw_iframe.html{1}",	"/_/service_worker/5a20/sw_iframe.html?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com&1p=1", true, false), 70, 100, "A1F0AF2B6D5707C9C10AB56564643036", 3);
				httpParallel.addRequest(9, request_108(this, false, "A1F0AF2B6D6649C2C10AB56564643036", true, false,
						"Config_2", "collect{3}",	"/g/collect?v=2&tid=G-0QWBDMKBMH&gtm=45je5ak1v9190503679z89191671902za200zb9191671902zd810788975&_p=1761126007097&gcs=G111&gcd=13t3t3t3t5l1&npa=0&dma=0&cid=2125953291.1761125990&ecid=292607285&ul=en-us&sr=1536x864&ur=IN-TG&uaa=x86&uab=64&uafvl=Microsoft%2520Edge%3B141.0.3537.92%7CNot%253FA_Brand%3B8.0.0.0%7CChromium%3B141.0.7390.108&uamb=0&uam=&uap=Windows&uapv=19.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AAAAAAQ&sst.rnd=1711513878.1761126007&sst.etld=google.co.in&sst.tft=1761126007097&sst.lpc=212476757&sst.navt=n&sst.ude=0&sst.sw_exp=1&_s=1&tag_exp=101509157~103116026~103200004~103233427~104527906~104528501~104684208~104684211~104948813~105322302~115480710~115734856~115734858~115938465~115938469~116110425~116110427&sid=1761125990&sct=1&seg=1&dl=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2Fshop-by-brands%2Fgerber-good-start.html&dr=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&dt=Nestl%C3%A9%20Health%20Science%20-%20Gerber%C2%AE%20Good%20Start%C2%AE&_tu=DA&tfd=5882&richsstsse", true, false), 111, 100, "A1F0AF2B6D5707C9C10AB56564643036", 3);
				httpParallel.addRequest(10, request_109(this, false, "A1F0AF2B6D669837C10AB56564643036", true, false,
						"Config_2", "collect{4}",	"/g/collect?v=2&tid=G-0QWBDMKBMH&gtm=45je5ak1v9190503679z89191671902za200zb9191671902zd810788975&_p=1761126007097&gcs=G111&gcd=13t3t3t3t5l1&npa=0&dma=0&cid=2125953291.1761125990&ecid=292607285&ul=en-us&sr=1536x864&ur=IN-TG&uaa=x86&uab=64&uafvl=Microsoft%2520Edge%3B141.0.3537.92%7CNot%253FA_Brand%3B8.0.0.0%7CChromium%3B141.0.7390.108&uamb=0&uam=&uap=Windows&uapv=19.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AAAAAAQ&sst.rnd=1711513878.1761126007&sst.etld=google.co.in&sst.tft=1761126007097&sst.lpc=212476757&sst.navt=n&sst.ude=0&sst.sw_exp=1&_s=2&tag_exp=101509157~103116026~103200004~103233427~104527906~104528501~104684208~104684211~104948813~105322302~115480710~115734856~115734858~115938465~115938469~116110425~116110427&sid=1761125990&sct=1&seg=1&dl=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2Fshop-by-brands%2Fgerber-good-start.html&dr=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&dt=Nestl%C3%A9%20Health%20Science%20-%20Gerber%C2%AE%20Good%20Start%C2%AE&_tu=DA&tfd=5923&richsstsse", true, false), 146, 100, "A1F0AF2B6D5707C9C10AB56564643036", 3);
				httpParallel.addRequest(4, request_110(this, false, "A1F0AF2B6D49E86CC10AB56564643036", true, false,
						"Config_1", "accordion.js",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/mage/accordion.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(11, request_111(this, false, "A1F0AF2B6D670D86C10AB56564643036", true, false,
						"Config_3", "location{1}",	"/cookieconsentpub/v1/geo/location", true, false), 220, 100, "A1F0AF2B6D5707C9C10AB56564643036", 3);
				httpParallel.addRequest(12, request_112(this, false, "A1F0AF2B6D675B30C10AB56564643036", true, false,
						"Config_1", "load{1}",	"/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1761126007171", true, false), 3983, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(5, request_113(this, false, "A1F0AF2B6D4A3687C10AB56564643036", true, false,
						"Config_1", "load{2}",	"/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1761126007172", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_114(this, false, "A1F0AF2B6D4A5DB3C10AB56564643036", true, false,
						"Config_1", "loader-1.gif{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/images/loader-1.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(13, request_115(this, false, "A1F0AF2B6D681EFFC10AB56564643036", true, false,
						"Config_1", "player.js{1}",	"/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/vimeo/player.js", true, false), 4082, 100, "A1F0AF2B6D483AE5C10AB56564643036", 2);
				httpParallel.addRequest(14, request_116(this, false, "A1F0AF2B6D3E9D80C10AB56564643036", true, false,
						"Config_4", "SIE{1}",	"/SIE/?Q_ZID=ZN_24vlED20qahDI2x", true, false), 12, 100, "A1F0AF2B6D681F0DC10AB56564643036", 3);
				httpParallel.addRequest(15, request_117(this, false, "A1F0AF2B6D68E1FBC10AB56564643036", false, false,
						"Config_2", "sw.js{1}",	"/_/service_worker/5a20/sw.js?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com", true, false), 838, 100, "A1F0AF2B6D6893B0C10AB56564643036", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D483AE5C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g0$t1761125990$j60$l0$h0;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761125996$j54$l0$h292607285;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[67], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_6", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[68], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 2, 2, 0, 0, false, "preprod.nestlenutritionstore.com_78", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[69], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 3, 1, 0, 0, false, "preprod.nestlenutritionstore.com_77", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[70], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 4, 1, 0, 0, false, "preprod.nestlenutritionstore.com_76", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[71], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 5, 1, 0, 0, false, "preprod.nestlenutritionstore.com_75", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[72], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 6, 1, 0, 0, false, "preprod.nestlenutritionstore.com_79", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[73], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 7, 1, 0, 0, false, "preprod.nestlenutritionstore.com_74", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[74], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 8, 1, 0, 0, false, "preprod.nestlenutritionstore.com_73", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[75], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 9, 1, 0, 0, false, "preprod.nestlenutritionstore.com_43", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[76], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 10, 1, 0, 0, false, "preprod.nestlenutritionstore.com_72", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[77], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 11, 1, 0, 0, false, "preprod.nestlenutritionstore.com_71", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[78], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 12, 1, 0, 0, false, "preprod.nestlenutritionstore.com_70", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[79], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 13, 1, 0, 0, false, "preprod.nestlenutritionstore.com_69", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[80], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 14, 1, 0, 0, false, "preprod.nestlenutritionstore.com_68", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[81], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 15, 1, 0, 0, false, "preprod.nestlenutritionstore.com_67", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[82], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 16, 1, 0, 0, false, "preprod.nestlenutritionstore.com_66", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[83], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 17, 1, 0, 0, false, "preprod.nestlenutritionstore.com_65", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[84], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 18, 1, 0, 0, false, "preprod.nestlenutritionstore.com_64", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[85], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 19, 1, 0, 0, false, "preprod.nestlenutritionstore.com_63", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[86], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 20, 1, 0, 0, false, "preprod.nestlenutritionstore.com_62", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[87], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 21, 1, 0, 0, false, "preprod.nestlenutritionstore.com_61", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[88], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 22, 1, 0, 0, false, "preprod.nestlenutritionstore.com_60", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[89], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 23, 1, 0, 0, false, "preprod.nestlenutritionstore.com_59", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[90], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 24, 1, 0, 0, false, "preprod.nestlenutritionstore.com_58", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[91], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 25, 1, 0, 0, false, "preprod.nestlenutritionstore.com_57", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[92], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 26, 1, 0, 0, false, "preprod.nestlenutritionstore.com_56", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[93], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 27, 1, 0, 0, false, "preprod.nestlenutritionstore.com_55", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[94], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 28, 1, 0, 0, false, "preprod.nestlenutritionstore.com_54", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[95], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 29, 1, 0, 0, false, "preprod.nestlenutritionstore.com_53", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[96], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 30, 1, 0, 0, false, "preprod.nestlenutritionstore.com_52", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[97], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 31, 1, 0, 0, false, "preprod.nestlenutritionstore.com_51", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[98], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 32, 1, 0, 0, false, "preprod.nestlenutritionstore.com_50", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[99], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 33, 1, 0, 0, false, "preprod.nestlenutritionstore.com_49", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[100], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 34, 1, 0, 0, false, "preprod.nestlenutritionstore.com_48", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[101], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 35, 1, 0, 0, false, "preprod.nestlenutritionstore.com_47", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[102], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 36, 1, 0, 0, false, "preprod.nestlenutritionstore.com_46", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[103], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 46, 10, 0, 0, false, "preprod.nestlenutritionstore.com_45", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[104], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 133, 87, 0, 0, false, "preprod.nestlenutritionstore.com_42", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[105], "/preprod\\.nestlenutritionstore\\.com(.*?)\"", 161, 28, 0, 0, false, "preprod.nestlenutritionstore.com_44", null, 0, false);
	IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_171 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_81", null, 0, false);
	subContainer_66.addSubInstruction(sub_171);
		ISubRule sub_172 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_82", null, 0, false);
	subContainer_66.addSubInstruction(sub_172);
	


		
				
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
			"A1F0AF2B6D483AE8C10AB56564643036",
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

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D48FDCEC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=deleted", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_173 = new SubRule("req_uri", 863, 2, true, (IDCCoreVar)dcVars[66], false, "_tu", null, 0, false);
	subContainer_67.addSubInstruction(sub_173);
		ISubRule sub_174 = new SubRule("req_uri", 552, 159, false, (IDCCoreVar)dcVars[65], false, "tag_exp", null, 0, false);
	subContainer_67.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_uri", 395, 5, true, (IDCCoreVar)dcVars[64], false, "pscdl", null, 0, false);
	subContainer_67.addSubInstruction(sub_175);
		ISubRule sub_176 = new SubRule("req_uri", 375, 1, true, (IDCCoreVar)dcVars[63], false, "uaw", null, 0, false);
	subContainer_67.addSubInstruction(sub_176);
		ISubRule sub_177 = new SubRule("req_uri", 364, 6, true, (IDCCoreVar)dcVars[62], false, "uapv", null, 0, false);
	subContainer_67.addSubInstruction(sub_177);
		ISubRule sub_178 = new SubRule("req_uri", 351, 7, true, (IDCCoreVar)dcVars[61], false, "uap", null, 0, false);
	subContainer_67.addSubInstruction(sub_178);
		ISubRule sub_179 = new SubRule("req_uri", 340, 1, true, (IDCCoreVar)dcVars[60], false, "uamb", null, 0, false);
	subContainer_67.addSubInstruction(sub_179);
		ISubRule sub_180 = new SubRule("req_uri", 244, 90, false, (IDCCoreVar)dcVars[59], false, "uafvl", null, 0, false);
	subContainer_67.addSubInstruction(sub_180);
		ISubRule sub_181 = new SubRule("req_uri", 235, 2, true, (IDCCoreVar)dcVars[58], false, "uab", null, 0, false);
	subContainer_67.addSubInstruction(sub_181);
		ISubRule sub_182 = new SubRule("req_uri", 227, 3, true, (IDCCoreVar)dcVars[57], false, "uaa", null, 0, false);
	subContainer_67.addSubInstruction(sub_182);
		ISubRule sub_183 = new SubRule("req_uri", 144, 7, true, (IDCCoreVar)dcVars[52], false, "gdid", null, 0, false);
	subContainer_67.addSubInstruction(sub_183);
		ISubRule sub_184 = new SubRule("req_uri", 137, 1, true, (IDCCoreVar)dcVars[53], false, "dma", null, 0, false);
	subContainer_67.addSubInstruction(sub_184);
		ISubRule sub_185 = new SubRule("req_uri", 131, 1, true, (IDCCoreVar)dcVars[54], false, "npa", null, 0, false);
	subContainer_67.addSubInstruction(sub_185);
		ISubRule sub_186 = new SubRule("req_uri", 114, 12, true, (IDCCoreVar)dcVars[56], false, "gcd", null, 0, false);
	subContainer_67.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_uri", 105, 4, true, (IDCCoreVar)dcVars[55], false, "gcs", null, 0, false);
	subContainer_67.addSubInstruction(sub_187);
		ISubRule sub_188 = new SubRule("req_uri", 13, 1, true, (IDCCoreVar)dcVars[44], false, "v", null, 0, false);
	subContainer_67.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_80", null, 0, false);
	subContainer_67.addSubInstruction(sub_189);
		ISubRule sub_190 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_81", null, 0, false);
	subContainer_67.addSubInstruction(sub_190);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);		
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
			"A1F0AF2B6D48FDD1C10AB56564643036",
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
	private void postDataClass_4(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1F0AF2B6D4924E4C10AB56564643036", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D494BF0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_191 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_79", null, 0, false);
	subContainer_68.addSubInstruction(sub_191);
		ISubRule sub_192 = new SubRule("req_uri", 0, 124, false, (IDCCoreVar)dcVars[72], false, "Nestl. Health Scien_url_38", null, 0, false);
	subContainer_68.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_80", null, 0, false);
	subContainer_68.addSubInstruction(sub_193);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D494BF3C10AB56564643036",
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

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D499A95C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7857e-1342\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:10 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_194 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_78", null, 0, false);
	subContainer_69.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[68], false, "Nestl. Health Scien_url_37", null, 0, false);
	subContainer_69.addSubInstruction(sub_195);
		ISubRule sub_196 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_79", null, 0, false);
	subContainer_69.addSubInstruction(sub_196);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D499A98C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D49E87AC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7857f-6de8\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:11 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_197 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_77", null, 0, false);
	subContainer_70.addSubInstruction(sub_197);
		ISubRule sub_198 = new SubRule("req_uri", 0, 100, false, (IDCCoreVar)dcVars[69], false, "Nestl. Health Scien_url_36", null, 0, false);
	subContainer_70.addSubInstruction(sub_198);
		ISubRule sub_199 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_78", null, 0, false);
	subContainer_70.addSubInstruction(sub_199);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D49E87DC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4A3695C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7859b-d395d\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:39 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_200 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_76", null, 0, false);
	subContainer_71.addSubInstruction(sub_200);
		ISubRule sub_201 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[70], false, "Nestl. Health Scien_url_35", null, 0, false);
	subContainer_71.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_77", null, 0, false);
	subContainer_71.addSubInstruction(sub_202);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4A3698C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4A5DC1C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f78589-7f3\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:21 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_203 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_75", null, 0, false);
	subContainer_72.addSubInstruction(sub_203);
		ISubRule sub_204 = new SubRule("req_uri", 0, 121, false, (IDCCoreVar)dcVars[71], false, "Nestl. Health Scien_url_34", null, 0, false);
	subContainer_72.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_76", null, 0, false);
	subContainer_72.addSubInstruction(sub_205);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4A8460C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4AABE1C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f78588-b2c\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:20 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_206 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_74", null, 0, false);
	subContainer_73.addSubInstruction(sub_206);
		ISubRule sub_207 = new SubRule("req_uri", 0, 97, false, (IDCCoreVar)dcVars[73], false, "Nestl. Health Scien_url_33", null, 0, false);
	subContainer_73.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_75", null, 0, false);
	subContainer_73.addSubInstruction(sub_208);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4AABE4C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4AF9D7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f78590-37861\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:28 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_209 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_73", null, 0, false);
	subContainer_74.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[74], false, "Nestl. Health Scien_url_32", null, 0, false);
	subContainer_74.addSubInstruction(sub_210);
		ISubRule sub_211 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_74", null, 0, false);
	subContainer_74.addSubInstruction(sub_211);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4AF9DAC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4B2103C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7859c-26ccd\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:40 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_212 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_72", null, 0, false);
	subContainer_75.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_uri", 0, 107, false, (IDCCoreVar)dcVars[76], false, "Nestl. Health Scien_url_31", null, 0, false);
	subContainer_75.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_73", null, 0, false);
	subContainer_75.addSubInstruction(sub_214);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4B2106C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4B6F07C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7859c-7918\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:40 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[106], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_7", null, 0, false);
	IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_215 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_71", null, 0, false);
	subContainer_76.addSubInstruction(sub_215);
		ISubRule sub_216 = new SubRule("req_uri", 0, 110, false, (IDCCoreVar)dcVars[77], false, "Nestl. Health Scien_url_30", null, 0, false);
	subContainer_76.addSubInstruction(sub_216);
		ISubRule sub_217 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_72", null, 0, false);
	subContainer_76.addSubInstruction(sub_217);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4B6F0AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4BBD43C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7859c-4239\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:40 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_218 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_70", null, 0, false);
	subContainer_77.addSubInstruction(sub_218);
		ISubRule sub_219 = new SubRule("req_uri", 0, 105, false, (IDCCoreVar)dcVars[78], false, "Nestl. Health Scien_url_29", null, 0, false);
	subContainer_77.addSubInstruction(sub_219);
		ISubRule sub_220 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_71", null, 0, false);
	subContainer_77.addSubInstruction(sub_220);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4BBD46C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4C0B47C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7857f-1534e\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:11 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_221 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_69", null, 0, false);
	subContainer_78.addSubInstruction(sub_221);
		ISubRule sub_222 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[79], false, "Nestl. Health Scien_url_28", null, 0, false);
	subContainer_78.addSubInstruction(sub_222);
		ISubRule sub_223 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_70", null, 0, false);
	subContainer_78.addSubInstruction(sub_223);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4C0B4AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4C5920C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-10a10e\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_224 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_68", null, 0, false);
	subContainer_79.addSubInstruction(sub_224);
		ISubRule sub_225 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[80], false, "Nestl. Health Scien_url_27", null, 0, false);
	subContainer_79.addSubInstruction(sub_225);
		ISubRule sub_226 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_69", null, 0, false);
	subContainer_79.addSubInstruction(sub_226);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4C5923C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4C808BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-f37a8\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_227 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_67", null, 0, false);
	subContainer_80.addSubInstruction(sub_227);
		ISubRule sub_228 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[81], false, "Nestl. Health Scien_url_26", null, 0, false);
	subContainer_80.addSubInstruction(sub_228);
		ISubRule sub_229 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_68", null, 0, false);
	subContainer_80.addSubInstruction(sub_229);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4C808EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4CCE97C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-148ff4\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_230 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_66", null, 0, false);
	subContainer_81.addSubInstruction(sub_230);
		ISubRule sub_231 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[82], false, "Nestl. Health Scien_url_25", null, 0, false);
	subContainer_81.addSubInstruction(sub_231);
		ISubRule sub_232 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_67", null, 0, false);
	subContainer_81.addSubInstruction(sub_232);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4CCE9AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4D1CCBC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-a0eda\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_233 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_65", null, 0, false);
	subContainer_82.addSubInstruction(sub_233);
		ISubRule sub_234 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[83], false, "Nestl. Health Scien_url_24", null, 0, false);
	subContainer_82.addSubInstruction(sub_234);
		ISubRule sub_235 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_66", null, 0, false);
	subContainer_82.addSubInstruction(sub_235);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4D1CCEC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4D6A97C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-61e20\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_236 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_64", null, 0, false);
	subContainer_83.addSubInstruction(sub_236);
		ISubRule sub_237 = new SubRule("req_uri", 0, 93, false, (IDCCoreVar)dcVars[84], false, "Nestl. Health Scien_url_23", null, 0, false);
	subContainer_83.addSubInstruction(sub_237);
		ISubRule sub_238 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_65", null, 0, false);
	subContainer_83.addSubInstruction(sub_238);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4D6A9AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4D91FBC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-cbf44\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_239 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_63", null, 0, false);
	subContainer_84.addSubInstruction(sub_239);
		ISubRule sub_240 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[85], false, "Nestl. Health Scien_url_22", null, 0, false);
	subContainer_84.addSubInstruction(sub_240);
		ISubRule sub_241 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_64", null, 0, false);
	subContainer_84.addSubInstruction(sub_241);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4D91FEC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4DDFC6C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-121c55\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_242 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_62", null, 0, false);
	subContainer_85.addSubInstruction(sub_242);
		ISubRule sub_243 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[86], false, "Nestl. Health Scien_url_21", null, 0, false);
	subContainer_85.addSubInstruction(sub_243);
		ISubRule sub_244 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_63", null, 0, false);
	subContainer_85.addSubInstruction(sub_244);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4DDFC9C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4E072BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-102a03\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_245 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_61", null, 0, false);
	subContainer_86.addSubInstruction(sub_245);
		ISubRule sub_246 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[87], false, "Nestl. Health Scien_url_20", null, 0, false);
	subContainer_86.addSubInstruction(sub_246);
		ISubRule sub_247 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_62", null, 0, false);
	subContainer_86.addSubInstruction(sub_247);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4E072EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4E7C47C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-10f720\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_248 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_60", null, 0, false);
	subContainer_87.addSubInstruction(sub_248);
		ISubRule sub_249 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[88], false, "Nestl. Health Scien_url_19", null, 0, false);
	subContainer_87.addSubInstruction(sub_249);
		ISubRule sub_250 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_61", null, 0, false);
	subContainer_87.addSubInstruction(sub_250);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4E7C4AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_85(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4ECA20C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-11086d\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_88 = new DataSub();
	reqAction.addDataSub(subContainer_88);

		ISubRule sub_251 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_59", null, 0, false);
	subContainer_88.addSubInstruction(sub_251);
		ISubRule sub_252 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[89], false, "Nestl. Health Scien_url_18", null, 0, false);
	subContainer_88.addSubInstruction(sub_252);
		ISubRule sub_253 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_60", null, 0, false);
	subContainer_88.addSubInstruction(sub_253);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4ECA23C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_86(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4EF18BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-1075b2\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_89 = new DataSub();
	reqAction.addDataSub(subContainer_89);

		ISubRule sub_254 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_58", null, 0, false);
	subContainer_89.addSubInstruction(sub_254);
		ISubRule sub_255 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[90], false, "Nestl. Health Scien_url_17", null, 0, false);
	subContainer_89.addSubInstruction(sub_255);
		ISubRule sub_256 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_59", null, 0, false);
	subContainer_89.addSubInstruction(sub_256);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4EF18EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_87(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4F3F52C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-103796\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_90 = new DataSub();
	reqAction.addDataSub(subContainer_90);

		ISubRule sub_257 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_57", null, 0, false);
	subContainer_90.addSubInstruction(sub_257);
		ISubRule sub_258 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[91], false, "Nestl. Health Scien_url_16", null, 0, false);
	subContainer_90.addSubInstruction(sub_258);
		ISubRule sub_259 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_58", null, 0, false);
	subContainer_90.addSubInstruction(sub_259);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4F3F55C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_88(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4F66BBC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c3-1c1a0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:19 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_91 = new DataSub();
	reqAction.addDataSub(subContainer_91);

		ISubRule sub_260 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_56", null, 0, false);
	subContainer_91.addSubInstruction(sub_260);
		ISubRule sub_261 = new SubRule("req_uri", 0, 92, false, (IDCCoreVar)dcVars[92], false, "Nestl. Health Scien_url_15", null, 0, false);
	subContainer_91.addSubInstruction(sub_261);
		ISubRule sub_262 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_57", null, 0, false);
	subContainer_91.addSubInstruction(sub_262);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4F66BEC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_89(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D4F8DD9C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7857f-249a\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:11 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_92 = new DataSub();
	reqAction.addDataSub(subContainer_92);

		ISubRule sub_263 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_55", null, 0, false);
	subContainer_92.addSubInstruction(sub_263);
		ISubRule sub_264 = new SubRule("req_uri", 0, 96, false, (IDCCoreVar)dcVars[93], false, "Nestl. Health Scien_url_14", null, 0, false);
	subContainer_92.addSubInstruction(sub_264);
		ISubRule sub_265 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_56", null, 0, false);
	subContainer_92.addSubInstruction(sub_265);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D4F8DDCC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_90(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D51625BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7857f-1ccf\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:11 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_93 = new DataSub();
	reqAction.addDataSub(subContainer_93);

		ISubRule sub_266 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_54", null, 0, false);
	subContainer_93.addSubInstruction(sub_266);
		ISubRule sub_267 = new SubRule("req_uri", 0, 96, false, (IDCCoreVar)dcVars[94], false, "Nestl. Health Scien_url_13", null, 0, false);
	subContainer_93.addSubInstruction(sub_267);
		ISubRule sub_268 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_55", null, 0, false);
	subContainer_93.addSubInstruction(sub_268);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D51625EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_91(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D51899BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c0-bada\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:16 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_94 = new DataSub();
	reqAction.addDataSub(subContainer_94);

		ISubRule sub_269 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_53", null, 0, false);
	subContainer_94.addSubInstruction(sub_269);
		ISubRule sub_270 = new SubRule("req_uri", 0, 91, false, (IDCCoreVar)dcVars[95], false, "Nestl. Health Scien_url_12", null, 0, false);
	subContainer_94.addSubInstruction(sub_270);
		ISubRule sub_271 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_54", null, 0, false);
	subContainer_94.addSubInstruction(sub_271);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D51899EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_92(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D51D7B3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7858a-e140\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:22 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_95 = new DataSub();
	reqAction.addDataSub(subContainer_95);

		ISubRule sub_272 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_52", null, 0, false);
	subContainer_95.addSubInstruction(sub_272);
		ISubRule sub_273 = new SubRule("req_uri", 0, 98, false, (IDCCoreVar)dcVars[96], false, "Nestl. Health Scien_url_11", null, 0, false);
	subContainer_95.addSubInstruction(sub_273);
		ISubRule sub_274 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_53", null, 0, false);
	subContainer_95.addSubInstruction(sub_274);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D51D7B6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_93(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D5225B7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7859c-2b6\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:40 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_96 = new DataSub();
	reqAction.addDataSub(subContainer_96);

		ISubRule sub_275 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_51", null, 0, false);
	subContainer_96.addSubInstruction(sub_275);
		ISubRule sub_276 = new SubRule("req_uri", 0, 91, false, (IDCCoreVar)dcVars[97], false, "Nestl. Health Scien_url_10", null, 0, false);
	subContainer_96.addSubInstruction(sub_276);
		ISubRule sub_277 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_52", null, 0, false);
	subContainer_96.addSubInstruction(sub_277);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D5225BAC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_94(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D5273E5C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7857b-441c\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:07 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_97 = new DataSub();
	reqAction.addDataSub(subContainer_97);

		ISubRule sub_278 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_50", null, 0, false);
	subContainer_97.addSubInstruction(sub_278);
		ISubRule sub_279 = new SubRule("req_uri", 0, 111, false, (IDCCoreVar)dcVars[98], false, "Nestl. Health Scien_url_9", null, 0, false);
	subContainer_97.addSubInstruction(sub_279);
		ISubRule sub_280 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_51", null, 0, false);
	subContainer_97.addSubInstruction(sub_280);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D5273E8C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_95(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D529B0FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7857b-45b8\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:07 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_98 = new DataSub();
	reqAction.addDataSub(subContainer_98);

		ISubRule sub_281 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_49", null, 0, false);
	subContainer_98.addSubInstruction(sub_281);
		ISubRule sub_282 = new SubRule("req_uri", 0, 113, false, (IDCCoreVar)dcVars[99], false, "Nestl. Health Scien_url_8", null, 0, false);
	subContainer_98.addSubInstruction(sub_282);
		ISubRule sub_283 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_50", null, 0, false);
	subContainer_98.addSubInstruction(sub_283);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D529B12C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_96(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D52E913C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7857c-463c\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:08 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_99 = new DataSub();
	reqAction.addDataSub(subContainer_99);

		ISubRule sub_284 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_48", null, 0, false);
	subContainer_99.addSubInstruction(sub_284);
		ISubRule sub_285 = new SubRule("req_uri", 0, 114, false, (IDCCoreVar)dcVars[100], false, "Nestl. Health Scien_url_7", null, 0, false);
	subContainer_99.addSubInstruction(sub_285);
		ISubRule sub_286 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_49", null, 0, false);
	subContainer_99.addSubInstruction(sub_286);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D52E916C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_97(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D53374FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7857b-4504\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:07 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_100 = new DataSub();
	reqAction.addDataSub(subContainer_100);

		ISubRule sub_287 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_47", null, 0, false);
	subContainer_100.addSubInstruction(sub_287);
		ISubRule sub_288 = new SubRule("req_uri", 0, 110, false, (IDCCoreVar)dcVars[101], false, "Nestl. Health Scien_url_6", null, 0, false);
	subContainer_100.addSubInstruction(sub_288);
		ISubRule sub_289 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_48", null, 0, false);
	subContainer_100.addSubInstruction(sub_289);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D533752C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_98(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D538553C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7859b-cc8\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:39 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_101 = new DataSub();
	reqAction.addDataSub(subContainer_101);

		ISubRule sub_290 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_46", null, 0, false);
	subContainer_101.addSubInstruction(sub_290);
		ISubRule sub_291 = new SubRule("req_uri", 0, 94, false, (IDCCoreVar)dcVars[102], false, "Nestl. Health Scien_url_5", null, 0, false);
	subContainer_101.addSubInstruction(sub_291);
		ISubRule sub_292 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_47", null, 0, false);
	subContainer_101.addSubInstruction(sub_292);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D538556C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_99(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D53AC77C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7859c-1e79\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:40 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_102 = new DataSub();
	reqAction.addDataSub(subContainer_102);

		ISubRule sub_293 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_45", null, 0, false);
	subContainer_102.addSubInstruction(sub_293);
		ISubRule sub_294 = new SubRule("req_uri", 0, 87, false, (IDCCoreVar)dcVars[103], false, "Nestl. Health Scien_url_4", null, 0, false);
	subContainer_102.addSubInstruction(sub_294);
		ISubRule sub_295 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_46", null, 0, false);
	subContainer_102.addSubInstruction(sub_295);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D53AC7AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_100(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D56B961C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7859c-12d68\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:40 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/static/version1761052000/frontend/Isobar/nhs-us-nestle-bootstrap/en_US/Magento_Theme/css/font-awesome.min.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_103 = new DataSub();
	reqAction.addDataSub(subContainer_103);

		ISubRule sub_296 = new SubRule("req_uri", 120, 5, true, (IDCCoreVar)dcVars[43], false, "v", null, 0, false);
	subContainer_103.addSubInstruction(sub_296);
		ISubRule sub_297 = new SubRule("req_hdr_Referer_1", 0, 150, false, (IDCCoreVar)dcVars[106], false, "Referer_34", null, 0, false);
	subContainer_103.addSubInstruction(sub_297);
		ISubRule sub_298 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_35", null, 0, false);
	subContainer_103.addSubInstruction(sub_298);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D4B6F07C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D56B964C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_101(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D56E070C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f785c0-1e6\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:08:16 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_104 = new DataSub();
	reqAction.addDataSub(subContainer_104);

		ISubRule sub_299 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_33", null, 0, false);
	subContainer_104.addSubInstruction(sub_299);
		ISubRule sub_300 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_34", null, 0, false);
	subContainer_104.addSubInstruction(sub_300);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D56E073C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_102(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D5707C9C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_105 = new DataSub();
	reqAction.addDataSub(subContainer_105);

		ISubRule sub_301 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_32", null, 0, false);
	subContainer_105.addSubInstruction(sub_301);
		ISubRule sub_302 = new SubRule("req_uri", 0, 110, false, (IDCCoreVar)dcVars[105], false, "Nestl. Health Scien_url_3", null, 0, false);
	subContainer_105.addSubInstruction(sub_302);
		ISubRule sub_303 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_33", null, 0, false);
	subContainer_105.addSubInstruction(sub_303);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D5707CCC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_103(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D5A3C60C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h292607285;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_106 = new DataSub();
	reqAction.addDataSub(subContainer_106);

		ISubRule sub_304 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_23", null, 0, false);
	subContainer_106.addSubInstruction(sub_304);
		ISubRule sub_305 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_24", null, 0, false);
	subContainer_106.addSubInstruction(sub_305);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D5A3C63C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_104(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D653850C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_107 = new DataSub();
	reqAction.addDataSub(subContainer_107);

		ISubRule sub_306 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_14", null, 0, false);
	subContainer_107.addSubInstruction(sub_306);
		ISubRule sub_307 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_15", null, 0, false);
	subContainer_107.addSubInstruction(sub_307);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D5A3C60C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D653853C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_105(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D658697C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f78581-15f7d\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:13 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_108 = new DataSub();
	reqAction.addDataSub(subContainer_108);

		ISubRule sub_308 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_13", null, 0, false);
	subContainer_108.addSubInstruction(sub_308);
		ISubRule sub_309 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_14", null, 0, false);
	subContainer_108.addSubInstruction(sub_309);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D5A3C60C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D65869AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_106(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D65ADDCC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f7858c-17fc\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:24 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_109 = new DataSub();
	reqAction.addDataSub(subContainer_109);

		ISubRule sub_310 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_12", null, 0, false);
	subContainer_109.addSubInstruction(sub_310);
		ISubRule sub_311 = new SubRule("req_uri", 0, 89, false, (IDCCoreVar)dcVars[75], false, "Nestl. Health Scien_url_2", null, 0, false);
	subContainer_109.addSubInstruction(sub_311);
		ISubRule sub_312 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_13", null, 0, false);
	subContainer_109.addSubInstruction(sub_312);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D5A3C60C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D65ADDFC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_107(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D65D4F9C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "iframe", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_110 = new DataSub();
	reqAction.addDataSub(subContainer_110);

		ISubRule sub_313 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_12", null, 0, false);
	subContainer_110.addSubInstruction(sub_313);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D65D4FCC10AB56564643036",
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

	public HTTPAction request_108(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D6649D0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1132", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_12 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_12);

	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[107], ";dma=(.*?);", 1, 1, 0, 0, false, "dma_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[108], ";npa=(.*?);", 1, 1, 0, 0, false, "npa_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[109], ";gcs=(.*?);", 1, 1, 0, 0, false, "gcs_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[110], ";gcd=(.*?);", 1, 1, 0, 0, false, "gcd_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[111], ";uaa=(.*?);", 1, 1, 0, 0, false, "uaa_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[112], ";uab=(.*?);", 1, 1, 0, 0, false, "uab_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[113], ";uafvl=(.*?);", 1, 1, 0, 0, false, "uafvl_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[114], ";uamb=(.*?);", 1, 1, 0, 0, false, "uamb_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[115], ";uap=(.*?);", 1, 1, 0, 0, false, "uap_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[116], ";uapv=(.*?);", 1, 1, 0, 0, false, "uapv_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[117], ";uaw=(.*?);", 1, 1, 0, 0, false, "uaw_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[118], ";pscdl=(.*?);", 1, 1, 0, 0, false, "pscdl_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[119], ";tag_exp=(.*?);", 1, 1, 0, 0, false, "tag_exp_8", null, 0, false);
	harvestContainer_12.addHarvestInstruction ("resp_content", dcVars[120], ";_tu=(.*?);", 1, 1, 0, 0, false, "_tu_8", null, 0, false);
	IDataSub subContainer_111 = new DataSub();
	reqAction.addDataSub(subContainer_111);

		ISubRule sub_314 = new SubRule("req_uri", 971, 2, true, (IDCCoreVar)dcVars[66], false, "_tu", null, 0, false);
	subContainer_111.addSubInstruction(sub_314);
		ISubRule sub_315 = new SubRule("req_uri", 394, 5, true, (IDCCoreVar)dcVars[64], false, "pscdl", null, 0, false);
	subContainer_111.addSubInstruction(sub_315);
		ISubRule sub_316 = new SubRule("req_uri", 374, 1, true, (IDCCoreVar)dcVars[63], false, "uaw", null, 0, false);
	subContainer_111.addSubInstruction(sub_316);
		ISubRule sub_317 = new SubRule("req_uri", 363, 6, true, (IDCCoreVar)dcVars[62], false, "uapv", null, 0, false);
	subContainer_111.addSubInstruction(sub_317);
		ISubRule sub_318 = new SubRule("req_uri", 350, 7, true, (IDCCoreVar)dcVars[61], false, "uap", null, 0, false);
	subContainer_111.addSubInstruction(sub_318);
		ISubRule sub_319 = new SubRule("req_uri", 339, 1, true, (IDCCoreVar)dcVars[60], false, "uamb", null, 0, false);
	subContainer_111.addSubInstruction(sub_319);
		ISubRule sub_320 = new SubRule("req_uri", 243, 90, false, (IDCCoreVar)dcVars[59], false, "uafvl", null, 0, false);
	subContainer_111.addSubInstruction(sub_320);
		ISubRule sub_321 = new SubRule("req_uri", 234, 2, true, (IDCCoreVar)dcVars[58], false, "uab", null, 0, false);
	subContainer_111.addSubInstruction(sub_321);
		ISubRule sub_322 = new SubRule("req_uri", 226, 3, true, (IDCCoreVar)dcVars[57], false, "uaa", null, 0, false);
	subContainer_111.addSubInstruction(sub_322);
		ISubRule sub_323 = new SubRule("req_uri", 149, 1, true, (IDCCoreVar)dcVars[53], false, "dma", null, 0, false);
	subContainer_111.addSubInstruction(sub_323);
		ISubRule sub_324 = new SubRule("req_uri", 143, 1, true, (IDCCoreVar)dcVars[54], false, "npa", null, 0, false);
	subContainer_111.addSubInstruction(sub_324);
		ISubRule sub_325 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[55], false, "gcs", null, 0, false);
	subContainer_111.addSubInstruction(sub_325);
		ISubRule sub_326 = new SubRule("req_uri", 13, 1, true, (IDCCoreVar)dcVars[44], false, "v", null, 0, false);
	subContainer_111.addSubInstruction(sub_326);
		ISubRule sub_327 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_11", null, 0, false);
	subContainer_111.addSubInstruction(sub_327);
		ISubRule sub_328 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_111.addSubInstruction(sub_328);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D6649D3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_5(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("en=page_view&ep.asset_brand=MULTI%20BRAND&ep.asset_business=");
strBuf_3.append("NESTL%C3%89%20HEALTH%20SCIENCE&ep.asset_country=United%20Sta");
strBuf_3.append("tes&ep.asset_digipi=DIG0023685&ep.asset_zone=North%20America");
strBuf_3.append("&ep.asset_url=nestlenutritionstore.com&ep.floodlight_data=%7");
strBuf_3.append("B%22local_floodlight_id%22%3A%229927885%22%2C%22u68%22%3A%22");
strBuf_3.append("https%3A%2F%2Fpreprod.nestlenutritionstore.com%2Fshop-by-bra");
strBuf_3.append("nds%2Fgerber-good-start.html%22%2C%22u69%22%3A%22https%3A%2F");
strBuf_3.append("%2Fpreprod.nestlenutritionstore.com%2F%22%7D&ep.custom_prope");
strBuf_3.append("rties=%7B%22meta_pixel_ID%22%3A%221301781777916570%22%2C%22c");
strBuf_3.append("ontent_type%22%3A%22product%22%7D&ep.onetrust_cookie=isGpcEn");
strBuf_3.append("abled%3D0%26datestamp%3DWed%2BOct%2B22%2B2025%2B15%3A09%3A56");
strBuf_3.append("%2BGMT%2B0530%2B(India%2BStandard%2BTime)%26version%3D202411");
strBuf_3.append(".1.0%26browserGpcFlag%3D0%26isIABGlobal%3Dfalse%26hosts%3D%2");
strBuf_3.append("6consentId%3D7b171024-8e14-48ce-80a3-0ae342502714%26interact");
strBuf_3.append("ionCount%3D1%26isAnonUser%3D1%26landingPath%3DNotLandingPage");
strBuf_3.append("%26groups%3DC0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2C");
strBuf_3.append("BG182%3A1%26intType%3D1&ep.country=United%20States&ep.cmp_mo");
strBuf_3.append("de=advanced&ep.event_id=1761126873273_176112614383458&ep.flo");
strBuf_3.append("odlight_event=en_01%7Cen_07&ep.meta_event=true&_et=8");
String requestData_4 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1F0AF2B6D6670E4C10AB56564643036", postData, requestData_4, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_4);

	}

	public HTTPAction request_109(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D669845C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1149", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_13 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_13);

	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[121], ";dma=(.*?);", 1, 1, 0, 0, false, "dma_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[122], ";npa=(.*?);", 1, 1, 0, 0, false, "npa_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[123], ";gcs=(.*?);", 1, 1, 0, 0, false, "gcs_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[124], ";uaa=(.*?);", 1, 1, 0, 0, false, "uaa_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[125], ";uab=(.*?);", 1, 1, 0, 0, false, "uab_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[126], ";uafvl=(.*?);", 1, 1, 0, 0, false, "uafvl_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[127], ";uamb=(.*?);", 1, 1, 0, 0, false, "uamb_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[128], ";uap=(.*?);", 1, 1, 0, 0, false, "uap_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[129], ";uapv=(.*?);", 1, 1, 0, 0, false, "uapv_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[130], ";uaw=(.*?);", 1, 1, 0, 0, false, "uaw_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[131], ";pscdl=(.*?);", 1, 1, 0, 0, false, "pscdl_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[132], ";tag_exp=(.*?);", 1, 1, 0, 0, false, "tag_exp_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[133], ";_tu=(.*?);", 1, 1, 0, 0, false, "_tu_9", null, 0, false);
	IDataSub subContainer_112 = new DataSub();
	reqAction.addDataSub(subContainer_112);

		ISubRule sub_329 = new SubRule("req_uri", 971, 2, true, (IDCCoreVar)dcVars[120], false, "_tu", null, 0, false);
	subContainer_112.addSubInstruction(sub_329);
		ISubRule sub_330 = new SubRule("req_uri", 551, 169, false, (IDCCoreVar)dcVars[119], false, "tag_exp", null, 0, false);
	subContainer_112.addSubInstruction(sub_330);
		ISubRule sub_331 = new SubRule("req_uri", 394, 5, true, (IDCCoreVar)dcVars[118], false, "pscdl", null, 0, false);
	subContainer_112.addSubInstruction(sub_331);
		ISubRule sub_332 = new SubRule("req_uri", 374, 1, true, (IDCCoreVar)dcVars[117], false, "uaw", null, 0, false);
	subContainer_112.addSubInstruction(sub_332);
		ISubRule sub_333 = new SubRule("req_uri", 363, 6, true, (IDCCoreVar)dcVars[116], false, "uapv", null, 0, false);
	subContainer_112.addSubInstruction(sub_333);
		ISubRule sub_334 = new SubRule("req_uri", 350, 7, true, (IDCCoreVar)dcVars[115], false, "uap", null, 0, false);
	subContainer_112.addSubInstruction(sub_334);
		ISubRule sub_335 = new SubRule("req_uri", 339, 1, true, (IDCCoreVar)dcVars[114], false, "uamb", null, 0, false);
	subContainer_112.addSubInstruction(sub_335);
		ISubRule sub_336 = new SubRule("req_uri", 243, 90, false, (IDCCoreVar)dcVars[113], false, "uafvl", null, 0, false);
	subContainer_112.addSubInstruction(sub_336);
		ISubRule sub_337 = new SubRule("req_uri", 234, 2, true, (IDCCoreVar)dcVars[112], false, "uab", null, 0, false);
	subContainer_112.addSubInstruction(sub_337);
		ISubRule sub_338 = new SubRule("req_uri", 226, 3, true, (IDCCoreVar)dcVars[111], false, "uaa", null, 0, false);
	subContainer_112.addSubInstruction(sub_338);
		ISubRule sub_339 = new SubRule("req_uri", 149, 1, true, (IDCCoreVar)dcVars[107], false, "dma", null, 0, false);
	subContainer_112.addSubInstruction(sub_339);
		ISubRule sub_340 = new SubRule("req_uri", 143, 1, true, (IDCCoreVar)dcVars[108], false, "npa", null, 0, false);
	subContainer_112.addSubInstruction(sub_340);
		ISubRule sub_341 = new SubRule("req_uri", 126, 12, true, (IDCCoreVar)dcVars[110], false, "gcd", null, 0, false);
	subContainer_112.addSubInstruction(sub_341);
		ISubRule sub_342 = new SubRule("req_uri", 117, 4, true, (IDCCoreVar)dcVars[109], false, "gcs", null, 0, false);
	subContainer_112.addSubInstruction(sub_342);
		ISubRule sub_343 = new SubRule("req_uri", 13, 1, true, (IDCCoreVar)dcVars[44], false, "v", null, 0, false);
	subContainer_112.addSubInstruction(sub_343);
		ISubRule sub_344 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_10", null, 0, false);
	subContainer_112.addSubInstruction(sub_344);
		ISubRule sub_345 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_10", null, 0, false);
	subContainer_112.addSubInstruction(sub_345);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D6649D0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D6649D0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D669848C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_6(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("en=page_view&ep.asset_brand=MULTI%20BRAND&ep.asset_business=");
strBuf_4.append("NESTL%C3%89%20HEALTH%20SCIENCE&ep.asset_country=United%20Sta");
strBuf_4.append("tes&ep.asset_digipi=DIG0023685&ep.asset_zone=North%20America");
strBuf_4.append("&ep.asset_url=nestlenutritionstore.com&ep.floodlight_data=%7");
strBuf_4.append("B%22local_floodlight_id%22%3A%229927885%22%2C%22u68%22%3A%22");
strBuf_4.append("https%3A%2F%2Fpreprod.nestlenutritionstore.com%2Fshop-by-bra");
strBuf_4.append("nds%2Fgerber-good-start.html%22%2C%22u69%22%3A%22https%3A%2F");
strBuf_4.append("%2Fpreprod.nestlenutritionstore.com%2F%22%7D&ep.custom_prope");
strBuf_4.append("rties=%7B%22meta_pixel_ID%22%3A%221301781777916570%22%2C%22c");
strBuf_4.append("ontent_type%22%3A%22product%22%7D&ep.onetrust_cookie=isGpcEn");
strBuf_4.append("abled%3D0%26datestamp%3DWed%2BOct%2B22%2B2025%2B15%3A09%3A56");
strBuf_4.append("%2BGMT%2B0530%2B(India%2BStandard%2BTime)%26version%3D202411");
strBuf_4.append(".1.0%26browserGpcFlag%3D0%26isIABGlobal%3Dfalse%26hosts%3D%2");
strBuf_4.append("6consentId%3D7b171024-8e14-48ce-80a3-0ae342502714%26interact");
strBuf_4.append("ionCount%3D1%26isAnonUser%3D1%26landingPath%3DNotLandingPage");
strBuf_4.append("%26groups%3DC0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2C");
strBuf_4.append("BG182%3A1%26intType%3D1&ep.country=United%20States&ep.cmp_mo");
strBuf_4.append("de=advanced&ep.event_id=1761126873273_1761126143834399&ep.fl");
strBuf_4.append("oodlight_event=en_01%7Cen_07&ep.meta_event=true&ep.no_ga4=tr");
strBuf_4.append("ue&_et=35");
String requestData_5 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1F0AF2B6D66BEF3C10AB56564643036", postData, requestData_5, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}

	public HTTPAction request_110(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D66E600C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126004$j46$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_113 = new DataSub();
	reqAction.addDataSub(subContainer_113);

		ISubRule sub_346 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_9", null, 0, false);
	subContainer_113.addSubInstruction(sub_346);
		ISubRule sub_347 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_9", null, 0, false);
	subContainer_113.addSubInstruction(sub_347);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D5A3C60C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D669845C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D48FDCEC10AB56564643036"), 3);		
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
			"A1F0AF2B6D66E603C10AB56564643036",
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

	public HTTPAction request_111(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D670D94C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "geolocation.onetrust.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_114 = new DataSub();
	reqAction.addDataSub(subContainer_114);

		ISubRule sub_348 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_8", null, 0, false);
	subContainer_114.addSubInstruction(sub_348);
		ISubRule sub_349 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[3], false, "Host_8", null, 0, false);
	subContainer_114.addSubInstruction(sub_349);
	


		
				
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
			"A1F0AF2B6D670D97C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_112(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D675B3EC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/javascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126008$j42$l0$h0;mage-cache-sessid=true", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_115 = new DataSub();
	reqAction.addDataSub(subContainer_115);

		ISubRule sub_350 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_7", null, 0, false);
	subContainer_115.addSubInstruction(sub_350);
		ISubRule sub_351 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_7", null, 0, false);
	subContainer_115.addSubInstruction(sub_351);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D5A3C60C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D669845C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);		
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
			"A1F0AF2B6D675B41C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_113(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D6782CFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/javascript, */*; q=0.01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126008$j42$l0$h0;mage-cache-sessid=true", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_116 = new DataSub();
	reqAction.addDataSub(subContainer_116);

		ISubRule sub_352 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_6", null, 0, false);
	subContainer_116.addSubInstruction(sub_352);
		ISubRule sub_353 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_6", null, 0, false);
	subContainer_116.addSubInstruction(sub_353);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D5A3C60C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D669845C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D675B3EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);		
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
			"A1F0AF2B6D67A950C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_114(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D67F778C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"68f7857d-4367\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:09 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126008$j42$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_117 = new DataSub();
	reqAction.addDataSub(subContainer_117);

		ISubRule sub_354 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_5", null, 0, false);
	subContainer_117.addSubInstruction(sub_354);
		ISubRule sub_355 = new SubRule("req_uri", 0, 91, false, (IDCCoreVar)dcVars[104], false, "Nestl. Health Scien_url", null, 0, false);
	subContainer_117.addSubInstruction(sub_355);
		ISubRule sub_356 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_5", null, 0, false);
	subContainer_117.addSubInstruction(sub_356);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D6782CFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D5A3C60C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D669845C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D675B3EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);		
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
			"A1F0AF2B6D67F77BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_115(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D681F0DC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/shop-by-brands/gerber-good-start.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "mage-cache-storage={};mage-cache-storage-section-invalidation={};mage-messages=;recently_viewed_product={};recently_viewed_product_previous={};recently_compared_product={};recently_compared_product_previous={};product_data_storage={};section_data_ids={%22cart%22:1761125988};__ssid=ed1cc20abfb101207012dd4336c314f;__kla_id=eyJjaWQiOiJObU5rTXpnMk1UWXRORE00TkMwMFpHSXhMV0UyTURFdE1XVXhOVFpqTnprNE9UZG0ifQ==;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;OptanonAlertBoxClosed=2025-10-22T09:39:56.628Z;OptanonConsent=isGpcEnabled=0&datestamp=Wed+Oct+22+2025+15%3A09%3A56+GMT%2B0530+(India+Standard+Time)&version=202411.1.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=7b171024-8e14-48ce-80a3-0ae342502714&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%3A1%2CBG182%3A1&intType=1;_gcl_au=1.1.932615327.1761125997;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126008$j42$l0$h0;mage-cache-sessid=true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"68f78580-121b1\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 21 Oct 2025 13:07:12 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_118 = new DataSub();
	reqAction.addDataSub(subContainer_118);

		ISubRule sub_357 = new SubRule("req_hdr_Referer_1", 0, 78, false, (IDCCoreVar)dcVars[67], false, "Referer_4", null, 0, false);
	subContainer_118.addSubInstruction(sub_357);
		ISubRule sub_358 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[2], false, "Host_4", null, 0, false);
	subContainer_118.addSubInstruction(sub_358);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D6782CFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D669845C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D483AE5C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D675B3EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D65D4F9C10AB56564643036"), 3);		
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
			"A1F0AF2B6D681F10C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_116(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D6893B0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "zn24vled20qahdi2x-nestleglobalmktg.siteintercept.qualtrics.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"2279-1iDhUc+X6Q91MmNakmd5GmARrPo\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_119 = new DataSub();
	reqAction.addDataSub(subContainer_119);

		ISubRule sub_359 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_3", null, 0, false);
	subContainer_119.addSubInstruction(sub_359);
		ISubRule sub_360 = new SubRule("req_hdr_Host_1", 0, 62, false, (IDCCoreVar)vars[1], false, "Host_3", null, 0, false);
	subContainer_119.addSubInstruction(sub_360);
	


		
				
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
			"A1F0AF2B6D6893B3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_117(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D68E209C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Service-Worker", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "serviceworker", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://data-na.nestlenutritionstore.com/_/service_worker/5a20/sw.js?origin=https%3A%2F%2Fpreprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;_gcl_au=1.1.932615327.1761125997;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126007$j43$l0$h292607285;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126008$j42$l0$h0", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_120 = new DataSub();
	reqAction.addDataSub(subContainer_120);

		ISubRule sub_361 = new SubRule("req_hdr_Referer_1", 0, 122, false, (IDCCoreVar)dcVars[48], false, "Referer_2", null, 0, false);
	subContainer_120.addSubInstruction(sub_361);
		ISubRule sub_362 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_120.addSubInstruction(sub_362);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D6782CFC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF2B6D669845C10AB56564643036"), 3);		
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
			"A1F0AF2B6D68E20CC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(4086, 1, parent, parent, "A1F0AF2B6D690937C10AB56564643036");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "g_collect", "A1F0AF2B6D690937C10AB56564643036") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_118(this, true, "A1F0AF2B6D68E1FBC10AB56564643036", true, true,
						"Config_2", "collect{5}",	"/g/collect?v=2&tid=G-0QWBDMKBMH&gtm=45je5ak1v9190503679za200zb9191671902zd810788975&_p=1761126007097&gcs=G111&gcd=13v3v3v3v5l1&npa=0&dma=0&gdid=dYWJhMj&cid=2125953291.1761125990&ecid=292607285&ul=en-us&sr=1536x864&ur=IN-TG&uaa=x86&uab=64&uafvl=Microsoft%2520Edge%3B141.0.3537.92%7CNot%253FA_Brand%3B8.0.0.0%7CChromium%3B141.0.7390.108&uamb=0&uam=&uap=Windows&uapv=19.0.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AAAAAAQ&sst.rnd=1711513878.1761126007&sst.etld=google.co.in&sst.tft=1761126007097&sst.lpc=212476757&sst.navt=n&sst.ude=0&sst.sw_exp=1&_s=3&tag_exp=101509157~103116026~103200004~103233427~104527906~104528501~104684208~104684211~104948813~105322302~115480710~115734856~115734858~115938465~115938469~116110425~116110427&sid=1761125990&sct=1&seg=1&dl=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2Fshop-by-brands%2Fgerber-good-start.html&dr=https%3A%2F%2Fpreprod.nestlenutritionstore.com%2F&dt=Nestl%C3%A9%20Health%20Science%20-%20Gerber%C2%AE%20Good%20Start%C2%AE&_tu=DA&tfd=12751", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_118(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF2B6D692FF0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "data-na.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1088", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://preprod.nestlenutritionstore.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://preprod.nestlenutritionstore.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__ssid=ed1cc20abfb101207012dd4336c314f;BVBRANDID=b6ab2600-11dd-44af-a315-f88aab41c25f;BVBRANDSID=742c3032-33da-4de3-9ab0-c08b8fb300e7;_ga=GA1.1.2125953291.1761125990;ajs_anonymous_id=2a2e0581-5f5c-4621-8251-95da7bfaeb0f;_gcl_au=1.1.932615327.1761125997;_uetsid=12b05160af2b11f09ac341a2b1558854;_uetvid=12b06c20af2b11f09713ab40ff1491bc;_ga_KY62DMY42P=GS2.1.s1761125990$o1$g1$t1761126008$j42$l0$h0;_ga_0QWBDMKBMH=GS2.1.s1761125990$o1$g1$t1761126014$j36$l0$h292607285", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_121 = new DataSub();
	reqAction.addDataSub(subContainer_121);

		ISubRule sub_363 = new SubRule("req_uri", 972, 2, true, (IDCCoreVar)dcVars[133], false, "_tu", null, 0, false);
	subContainer_121.addSubInstruction(sub_363);
		ISubRule sub_364 = new SubRule("req_uri", 552, 169, false, (IDCCoreVar)dcVars[132], false, "tag_exp", null, 0, false);
	subContainer_121.addSubInstruction(sub_364);
		ISubRule sub_365 = new SubRule("req_uri", 395, 5, true, (IDCCoreVar)dcVars[131], false, "pscdl", null, 0, false);
	subContainer_121.addSubInstruction(sub_365);
		ISubRule sub_366 = new SubRule("req_uri", 375, 1, true, (IDCCoreVar)dcVars[130], false, "uaw", null, 0, false);
	subContainer_121.addSubInstruction(sub_366);
		ISubRule sub_367 = new SubRule("req_uri", 364, 6, true, (IDCCoreVar)dcVars[129], false, "uapv", null, 0, false);
	subContainer_121.addSubInstruction(sub_367);
		ISubRule sub_368 = new SubRule("req_uri", 351, 7, true, (IDCCoreVar)dcVars[128], false, "uap", null, 0, false);
	subContainer_121.addSubInstruction(sub_368);
		ISubRule sub_369 = new SubRule("req_uri", 340, 1, true, (IDCCoreVar)dcVars[127], false, "uamb", null, 0, false);
	subContainer_121.addSubInstruction(sub_369);
		ISubRule sub_370 = new SubRule("req_uri", 244, 90, false, (IDCCoreVar)dcVars[126], false, "uafvl", null, 0, false);
	subContainer_121.addSubInstruction(sub_370);
		ISubRule sub_371 = new SubRule("req_uri", 235, 2, true, (IDCCoreVar)dcVars[125], false, "uab", null, 0, false);
	subContainer_121.addSubInstruction(sub_371);
		ISubRule sub_372 = new SubRule("req_uri", 227, 3, true, (IDCCoreVar)dcVars[124], false, "uaa", null, 0, false);
	subContainer_121.addSubInstruction(sub_372);
		ISubRule sub_373 = new SubRule("req_uri", 144, 7, true, (IDCCoreVar)dcVars[52], false, "gdid", null, 0, false);
	subContainer_121.addSubInstruction(sub_373);
		ISubRule sub_374 = new SubRule("req_uri", 137, 1, true, (IDCCoreVar)dcVars[121], false, "dma", null, 0, false);
	subContainer_121.addSubInstruction(sub_374);
		ISubRule sub_375 = new SubRule("req_uri", 131, 1, true, (IDCCoreVar)dcVars[122], false, "npa", null, 0, false);
	subContainer_121.addSubInstruction(sub_375);
		ISubRule sub_376 = new SubRule("req_uri", 114, 12, true, (IDCCoreVar)dcVars[56], false, "gcd", null, 0, false);
	subContainer_121.addSubInstruction(sub_376);
		ISubRule sub_377 = new SubRule("req_uri", 105, 4, true, (IDCCoreVar)dcVars[123], false, "gcs", null, 0, false);
	subContainer_121.addSubInstruction(sub_377);
		ISubRule sub_378 = new SubRule("req_uri", 13, 1, true, (IDCCoreVar)dcVars[44], false, "v", null, 0, false);
	subContainer_121.addSubInstruction(sub_378);
		ISubRule sub_379 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer", null, 0, false);
	subContainer_121.addSubInstruction(sub_379);
		ISubRule sub_380 = new SubRule("req_hdr_Host_1", 0, 32, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_121.addSubInstruction(sub_380);
	


		
				
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
			"A1F0AF2B6D692FF3C10AB56564643036",
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
	private void postDataClass_7(HTTPPostData postData) {
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("en=user_engagement&ep.asset_brand=MULTI%20BRAND&ep.asset_bus");
strBuf_5.append("iness=NESTL%C3%89%20HEALTH%20SCIENCE&ep.asset_country=United");
strBuf_5.append("%20States&ep.asset_digipi=DIG0023685&ep.asset_zone=North%20A");
strBuf_5.append("merica&ep.asset_url=nestlenutritionstore.com&ep.floodlight_d");
strBuf_5.append("ata=%7B%22local_floodlight_id%22%3A%229927885%22%2C%22u68%22");
strBuf_5.append("%3A%22https%3A%2F%2Fpreprod.nestlenutritionstore.com%2Fshop-");
strBuf_5.append("by-brands%2Fgerber-good-start.html%22%2C%22u69%22%3A%22https");
strBuf_5.append("%3A%2F%2Fpreprod.nestlenutritionstore.com%2F%22%7D&ep.custom");
strBuf_5.append("_properties=%7B%22meta_pixel_ID%22%3A%221301781777916570%22%");
strBuf_5.append("2C%22content_type%22%3A%22product%22%7D&ep.onetrust_cookie=i");
strBuf_5.append("sGpcEnabled%3D0%26datestamp%3DWed%2BOct%2B22%2B2025%2B15%3A0");
strBuf_5.append("9%3A56%2BGMT%2B0530%2B(India%2BStandard%2BTime)%26version%3D");
strBuf_5.append("202411.1.0%26browserGpcFlag%3D0%26isIABGlobal%3Dfalse%26host");
strBuf_5.append("s%3D%26consentId%3D7b171024-8e14-48ce-80a3-0ae342502714%26in");
strBuf_5.append("teractionCount%3D1%26isAnonUser%3D1%26landingPath%3DNotLandi");
strBuf_5.append("ngPage%26groups%3DC0002%3A1%2CC0001%3A1%2CC0003%3A1%2CC0004%");
strBuf_5.append("3A1%2CBG182%3A1%26intType%3D1&ep.country=United%20States&ep.");
strBuf_5.append("cmp_mode=advanced&ep.event_id=1761126873273_176112614383458&");
strBuf_5.append("_et=6822");
String requestData_6 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1F0AF2B6D695700C10AB56564643036", postData, requestData_6, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_6);

	}
}
