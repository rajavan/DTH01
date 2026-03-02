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
public class JPetStoreDemo_Day1_Test_A1F0AF28C737A230C10AB56564643036 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(82);
	private DataVar[] vars = new DataVar[9];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public JPetStoreDemo_Day1_Test_A1F0AF28C737A230C10AB56564643036(IContainer container, String invocationId) {
		super(container, "JPetStoreDemo_Day1", invocationId, "A1F0AF28C737A230C10AB56564643036", "/Demo_JPetStore/JPetStoreDemo_Day1.testsuite", "C:/Users/rajesh-a/HCL/devopstest/workspace_DevOpsPerf/Demo_JPetStore/JPetStoreDemo_Day1.testsuite");
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
	this.add(page_1(this));
	this.add(page_2(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: JPetStoreDemo_Day1_Test_A1F0AF28C737A230C10AB56564643036 ",e);
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

		action.setMapFile("A1F0AF28C737A230C10AB56564643036");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.AsciifyAdapterVERSION_1
		// com.ibm.rational.test.lt.datatransform.adapters.impl.XMLAdapterVERSION_0

		return action;
	}
private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F0AF28C737A24EC10AB56564643036");	
			vars[0] = new DataVar("JPetStoreDemo_Day1_Host", "127.0.0.1", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("JPetStoreDemo_Day1_Host_Port", "7878", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("JPetStoreDemo_Day1_Host_1", "jpetstore.aspectran.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("JPetStoreDemo_Day1_Host_Port_1", "55296", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("JPetStoreDemo_Day1_Host_2", "assets.aspectran.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("JPetStoreDemo_Day1_Host_3", "petclinic.aspectran.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[6] = new DataVar("JPetStoreDemo_Day1_Host_3_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[7] = new DataVar("JPetStoreDemo_Day1_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[8] = new DataVar("JPetStoreDemo_Day1_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
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
					(String)(vars[0].getValue()== null?"127.0.0.1": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[3].getValue()== null?"55296": (String)vars[3].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"127.0.0.1",  // unsubstituted host name
					Integer.parseInt((String)("55296")) 
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
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[0].getValue()== null?"127.0.0.1": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[1].getValue()== null?"7878": (String)vars[1].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"127.0.0.1",  // unsubstituted host name
					Integer.parseInt((String)("7878")) 
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
					(String)(vars[2].getValue()== null?"jpetstore.aspectran.com": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[8].getValue()== null?"443": (String)vars[8].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"jpetstore.aspectran.com",  // unsubstituted host name
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
					(String)(vars[4].getValue()== null?"assets.aspectran.com": (String)vars[4].getValue()),  // host name
					Integer.parseInt((String)(vars[7].getValue()== null?"443": (String)vars[7].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"assets.aspectran.com",  // unsubstituted host name
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
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)(vars[5].getValue()== null?"petclinic.aspectran.com": (String)vars[5].getValue()),  // host name
					Integer.parseInt((String)(vars[6].getValue()== null?"443": (String)vars[6].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"petclinic.aspectran.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1F0AF28C75C1A28C10AB56564643036");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "List of Cats", "A1F0AF28C75C1A28C10AB56564643036") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(20, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1F0AF28C75C1A20C10AB56564643036", true, false,
						"Config_1", "fdaccoenpeidencmkohekgeelmhiaoji",	"/EdgeExt/fdaccoenpeidencmkohekgeelmhiaoji", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_2(this, false, "A1F0AF28C768EB60C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 720, 100, "A1F0AF28C75C1A36C10AB56564643036", 3);
				httpParallel.addRequest(2, request_3(this, false, "A1F0AF28C775BCA0C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{1}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 4983, 100, "A1F0AF28C768EB68C10AB56564643036", 3);
				httpParallel.addRequest(3, request_4(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{2}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 989, 100, "A1F0AF28C775BCA8C10AB56564643036", 3);
				httpParallel.addRequest(4, request_5(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{3}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 7, 100, "A1F0AF28C7798D38C10AB56564643036", 3);
				httpParallel.addRequest(3, request_6(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{4}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_7(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{5}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_8(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{6}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 3762, 100, "A1F0AF28C77D0FA0C10AB56564643036", 3);
				httpParallel.addRequest(4, request_9(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{7}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 3766, 100, "A1F0AF28C78C03C0C10AB56564643036", 3);
				httpParallel.addRequest(3, request_10(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{8}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_11(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{9}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_12(this, false, "A1F0AF28C7A0EB58C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{10}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 68, 100, "A1F0AF28C79F8BE6C10AB56564643036", 3);
				httpParallel.addRequest(3, request_13(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{11}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 421, 100, "A1F0AF28C7A0EB60C10AB56564643036", 3);
				httpParallel.addRequest(4, request_14(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{12}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 422, 100, "A1F0AF28C7A0EB60C10AB56564643036", 3);
				httpParallel.addRequest(3, request_15(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{13}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_16(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{14}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_17(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, true,
						"Config_3", "/",	"/", true, false), 45, 100, "A1F0AF28C7A0EB60C10AB56564643036", 3);
				httpParallel.addRequest(6, request_18(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "speculation",	"/cdn-cgi/speculation", true, false), 72, 100, "A1F0AF28C7AD6E7EC10AB56564643036", 3);
				httpParallel.addRequest(3, request_19(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{15}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 164, 100, "A1F0AF28C7AD6E7EC10AB56564643036", 3);
				httpParallel.addRequest(4, request_20(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{16}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 166, 100, "A1F0AF28C7AD6E7EC10AB56564643036", 3);
				httpParallel.addRequest(3, request_21(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{17}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_22(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{18}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_23(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "logo-topbar.gif",	"/images/logo-topbar.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_24(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{19}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425}]}", true, false), 166, 100, "A1F0AF28C7B3B000C10AB56564643036", 3);
				httpParallel.addRequest(4, request_25(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{20}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_26(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{21}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425}]}", true, false), 11, 100, "A1F0AF28C7BC89C3C10AB56564643036", 3);
				httpParallel.addRequest(3, request_27(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{22}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(7, request_28(this, false, "A1F0AF28C7BE3750C10AB56564643036", true, false,
						"Config_4", "aspectran-site-logo.png",	"/img/aspectran-site-logo.png", true, false), 177, 100, "A1F0AF28C7AD6E7EC10AB56564643036", 2);
				httpParallel.addRequest(6, request_29(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "splash.gif",	"/images/splash.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(8, request_30(this, false, "A1F0AF28C84E6960C10AB56564643036", true, false,
						"Config_5", "pets.png",	"/images/pets.png", true, false), 1142, 100, "A1F0AF28C7AD6E7EC10AB56564643036", 2);
				httpParallel.addRequest(4, request_31(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{23}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 131, 100, "A1F0AF28C7F76FC0C10AB56564643036", 3);
				httpParallel.addRequest(3, request_32(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{24}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 131, 100, "A1F0AF28C7F76FC0C10AB56564643036", 3);
				httpParallel.addRequest(4, request_33(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{25}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_34(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{26}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(9, request_35(this, false, "A1F0AF28C85176ABC10AB56564643036", true, false,
						"Config_4", "aspectran-logo-grey-x100.png",	"/img/aspectran-logo-grey-x100.png", true, false), 1331, 100, "A1F0AF28C7AD6E7EC10AB56564643036", 2);
				httpParallel.addRequest(10, request_36(this, false, "A1F0AF28C8519E5DC10AB56564643036", true, false,
						"Config_1", "fdaccoenpeidencmkohekgeelmhiaoji{1}",	"/EdgeExt/fdaccoenpeidencmkohekgeelmhiaoji", true, false), 943, 100, "A1F0AF28C85176B9C10AB56564643036", 3);
				httpParallel.addRequest(11, request_37(this, false, "A1F0AF28C851EBD1C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{27}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 740, 100, "A1F0AF28C851C4C0C10AB56564643036", 3);
				httpParallel.addRequest(4, request_38(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{28}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 1691, 100, "A1F0AF28C851EBD9C10AB56564643036", 3);
				httpParallel.addRequest(4, request_39(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{29}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_40(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{30}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 18, 100, "A1F0AF28C8523A49C10AB56564643036", 3);
				httpParallel.addRequest(3, request_41(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{31}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(12, request_42(this, false, "A1F0AF28C852D632C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{32}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 3281, 100, "A1F0AF28C852AF20C10AB56564643036", 3);
				httpParallel.addRequest(4, request_43(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{33}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 1695, 100, "A1F0AF28C852D63AC10AB56564643036", 3);
				httpParallel.addRequest(4, request_44(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{34}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_45(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{35}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 9, 100, "A1F0AF28C8532473C10AB56564643036", 3);
				httpParallel.addRequest(3, request_46(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{36}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(13, request_47(this, false, "A1F0AF28C853E7A0C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{37}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 3294, 100, "A1F0AF28C85399A3C10AB56564643036", 3);
				httpParallel.addRequest(4, request_48(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{38}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 1685, 100, "A1F0AF28C853E7A8C10AB56564643036", 3);
				httpParallel.addRequest(4, request_49(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{39}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_50(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{40}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 8, 100, "A1F0AF28C85435FCC10AB56564643036", 3);
				httpParallel.addRequest(3, request_51(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{41}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(14, request_52(this, false, "A1F0AF28C854AAF7C10AB56564643036", true, false,
						"Config_1", "fdaccoenpeidencmkohekgeelmhiaoji{2}",	"/EdgeExt/fdaccoenpeidencmkohekgeelmhiaoji", true, false), 2536, 100, "A1F0AF28C85483F9C10AB56564643036", 3);
				httpParallel.addRequest(15, request_53(this, false, "A1F0AF28C854D201C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{42}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 758, 100, "A1F0AF28C854AAFFC10AB56564643036", 3);
				httpParallel.addRequest(6, request_54(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "CATS",	"/categories/CATS", true, false), 839, 100, "A1F0AF28C854D209C10AB56564643036", 3);
				httpParallel.addRequest(6, request_55(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "CATS{1}",	"/categories/CATS", true, false), 101, 100, "A1F0AF28C854F911C10AB56564643036", 3);
				httpParallel.addRequest(6, request_56(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "speculation{1}",	"/cdn-cgi/speculation", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_57(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{43}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 52, 100, "A1F0AF28C855204BC10AB56564643036", 3);
				httpParallel.addRequest(4, request_58(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{44}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 54, 100, "A1F0AF28C855204BC10AB56564643036", 3);
				httpParallel.addRequest(3, request_59(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{45}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_60(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{46}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_61(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{47}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 323, 100, "A1F0AF28C8574306C10AB56564643036", 3);
				httpParallel.addRequest(4, request_62(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{48}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_63(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{49}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 12, 100, "A1F0AF28C858A2B3C10AB56564643036", 3);
				httpParallel.addRequest(3, request_64(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{50}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2F%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(16, request_65(this, false, "A1F0AF28C85917E3C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{51}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 3297, 100, "A1F0AF28C858F0CCC10AB56564643036", 3);
				httpParallel.addRequest(4, request_66(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{52}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 1688, 100, "A1F0AF28C85917EBC10AB56564643036", 3);
				httpParallel.addRequest(4, request_67(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{53}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_68(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{54}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 14, 100, "A1F0AF28C8596603C10AB56564643036", 3);
				httpParallel.addRequest(3, request_69(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{55}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_70(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "FL-DSH-01",	"/products/FL-DSH-01", true, false), 2459, 100, "A1F0AF28C859B429C10AB56564643036", 3);
				httpParallel.addRequest(6, request_71(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "FL-DSH-01{1}",	"/products/FL-DSH-01", true, false), 80, 100, "A1F0AF28C859B48CC10AB56564643036", 3);
				httpParallel.addRequest(3, request_72(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{56}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 65, 100, "A1F0AF28C85A294FC10AB56564643036", 3);
				httpParallel.addRequest(4, request_73(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{57}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 65, 100, "A1F0AF28C85A294FC10AB56564643036", 3);
				httpParallel.addRequest(6, request_74(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "speculation{2}",	"/cdn-cgi/speculation", true, false), 8, 100, "A1F0AF28C85A7773C10AB56564643036", 3);
				httpParallel.addRequest(4, request_75(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{58}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_76(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{59}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(17, request_77(this, false, "A1F0AF28C85D5D80C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{60}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 317, 100, "A1F0AF28C85BAFDBC10AB56564643036", 3);
				httpParallel.addRequest(4, request_78(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{61}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 1691, 100, "A1F0AF28C85D5D88C10AB56564643036", 3);
				httpParallel.addRequest(4, request_79(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{62}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_80(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{63}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 9, 100, "A1F0AF28C85DD2B0C10AB56564643036", 3);
				httpParallel.addRequest(3, request_81(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{64}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcategories%2FCATS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(6, request_82(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "addItemToCart",	"/cart/addItemToCart?itemId=EST-14", true, false), 975, 100, "A1F0AF28C85E20F3C10AB56564643036", 3);
				httpParallel.addRequest(6, request_83(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "addItemToCart{1}",	"/cart/addItemToCart?itemId=EST-14", true, false), 137, 100, "A1F0AF28C85E6EF0C10AB56564643036", 3);
				httpParallel.addRequest(6, request_84(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "viewCart",	"/cart/viewCart", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_85(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{65}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 88, 100, "A1F0AF28C85E963DC10AB56564643036", 3);
				httpParallel.addRequest(4, request_86(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{66}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 89, 100, "A1F0AF28C85E963DC10AB56564643036", 3);
				httpParallel.addRequest(6, request_87(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "speculation{3}",	"/cdn-cgi/speculation", true, false), 2, 100, "A1F0AF28C85EE420C10AB56564643036", 3);
				httpParallel.addRequest(3, request_88(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{67}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_89(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{68}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(18, request_90(this, false, "A1F0AF28C86329EBC10AB56564643036", true, false,
						"Config_1", "fdaccoenpeidencmkohekgeelmhiaoji{3}",	"/EdgeExt/fdaccoenpeidencmkohekgeelmhiaoji", true, false), 778, 100, "A1F0AF28C861CA5FC10AB56564643036", 3);
				httpParallel.addRequest(19, request_91(this, false, "A1F0AF28C8637812C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{69}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 778, 100, "A1F0AF28C86329F3C10AB56564643036", 3);
				httpParallel.addRequest(4, request_92(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{70}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fproducts%2FFL-DSH-01%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 1692, 100, "A1F0AF28C863781AC10AB56564643036", 3);
				httpParallel.addRequest(4, request_93(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{71}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fproducts%2FFL-DSH-01%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_94(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{72}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fproducts%2FFL-DSH-01%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 10, 100, "A1F0AF28C8641440C10AB56564643036", 3);
				httpParallel.addRequest(3, request_95(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{73}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fproducts%2FFL-DSH-01%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C75C1A36C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:55296", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 10, 5, false, (IDCCoreVar)vars[3], false, "Host_198", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_197", null, 0, false);
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
			"A1F0AF28C75C1A39C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C768EB68C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_196", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_195", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
	


		
				
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
			"A1F0AF28C768EB6BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C775BCA8C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_194", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_193", null, 0, false);
	subContainer_3.addSubInstruction(sub_5);
	


		
				
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
			"A1F0AF28C775BCABC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7798D38C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Location_1", dcVars[0], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location", null, 0, false);
	IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_6 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_192", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_191", null, 0, false);
	subContainer_4.addSubInstruction(sub_7);
	


		
				
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
			"A1F0AF28C7798D3BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C77C9A78C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Location_1", dcVars[1], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_3", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_hdr_Location_1", dcVars[2], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_8 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[0], false, "action", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_190", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_189", null, 0, false);
	subContainer_5.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7798D38C10AB56564643036"), 3);		
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
			"A1F0AF28C77C9A7BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C77D0FA0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_11 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_188", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[1], false, "List of Cats_url_33", null, 0, false);
	subContainer_6.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_187", null, 0, false);
	subContainer_6.addSubInstruction(sub_13);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C77C9A78C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C77C9A78C10AB56564643036"), 3);		
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
			"A1F0AF28C77D0FA3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C78C03C0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_14 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_186", null, 0, false);
	subContainer_7.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[1], false, "List of Cats_url_32", null, 0, false);
	subContainer_7.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_185", null, 0, false);
	subContainer_7.addSubInstruction(sub_16);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C77C9A78C10AB56564643036"), 3);		
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
			"A1F0AF28C78C03C3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7921E40C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Location_1", dcVars[3], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_4", null, 0, false);
	IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_17 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[2], false, "action", null, 0, false);
	subContainer_8.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_184", null, 0, false);
	subContainer_8.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_183", null, 0, false);
	subContainer_8.addSubInstruction(sub_19);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C77C9A78C10AB56564643036"), 3);		
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
			"A1F0AF28C7921E43C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C79DB700C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Location_1", dcVars[4], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_6", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_hdr_Location_1", dcVars[5], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_5", null, 0, false);
	IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_20 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[3], false, "action", null, 0, false);
	subContainer_9.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_182", null, 0, false);
	subContainer_9.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_181", null, 0, false);
	subContainer_9.addSubInstruction(sub_22);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7921E40C10AB56564643036"), 3);		
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
			"A1F0AF28C79DB703C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C79EA160C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_23 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_180", null, 0, false);
	subContainer_10.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[4], false, "List of Cats_url_31", null, 0, false);
	subContainer_10.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_179", null, 0, false);
	subContainer_10.addSubInstruction(sub_25);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C79DB700C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C79DB700C10AB56564643036"), 3);		
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
			"A1F0AF28C79EA163C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C79F8BE6C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_26 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_178", null, 0, false);
	subContainer_11.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[4], false, "List of Cats_url_30", null, 0, false);
	subContainer_11.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_177", null, 0, false);
	subContainer_11.addSubInstruction(sub_28);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C79DB700C10AB56564643036"), 3);		
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
			"A1F0AF28C79F8BE9C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7A0EB60C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_29 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_176", null, 0, false);
	subContainer_12.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_175", null, 0, false);
	subContainer_12.addSubInstruction(sub_30);
	


		
				
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
			"A1F0AF28C7A0EB63C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7A33540C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Location_1", dcVars[6], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_7", null, 0, false);
	IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_31 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[5], false, "action", null, 0, false);
	subContainer_13.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_174", null, 0, false);
	subContainer_13.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_173", null, 0, false);
	subContainer_13.addSubInstruction(sub_33);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C79DB700C10AB56564643036"), 3);		
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
			"A1F0AF28C7A35C50C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7A6B7B0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Location_1", dcVars[7], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_9", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_hdr_Location_1", dcVars[8], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_8", null, 0, false);
	IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_34 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[6], false, "action", null, 0, false);
	subContainer_14.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_172", null, 0, false);
	subContainer_14.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_171", null, 0, false);
	subContainer_14.addSubInstruction(sub_36);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7A33540C10AB56564643036"), 3);		
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
			"A1F0AF28C7A6B7B3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7A7A210C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_37 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_170", null, 0, false);
	subContainer_15.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[7], false, "List of Cats_url_29", null, 0, false);
	subContainer_15.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_169", null, 0, false);
	subContainer_15.addSubInstruction(sub_39);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7A6B7B0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7A6B7B0C10AB56564643036"), 3);		
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
			"A1F0AF28C7A7A213C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7A8B3A7C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_40 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_168", null, 0, false);
	subContainer_16.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[7], false, "List of Cats_url_28", null, 0, false);
	subContainer_16.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_167", null, 0, false);
	subContainer_16.addSubInstruction(sub_42);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7A6B7B0C10AB56564643036"), 3);		
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
			"A1F0AF28C7A8B3AAC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7AD6E7EC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.bing.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[9], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_43 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_166", null, 0, false);
	subContainer_17.addSubInstruction(sub_43);
	


		
				
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
			"A1F0AF28C7AD6E81C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7ADBC90C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "speculationrules", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_44 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_21", null, 0, false);
	subContainer_18.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_165", null, 0, false);
	subContainer_18.addSubInstruction(sub_45);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7ADBC93C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/speculationrules+json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7AE0AB0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_hdr_Location_1", dcVars[10], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_10", null, 0, false);
	IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_46 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[8], false, "action", null, 0, false);
	subContainer_19.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_164", null, 0, false);
	subContainer_19.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_163", null, 0, false);
	subContainer_19.addSubInstruction(sub_48);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7A6B7B0C10AB56564643036"), 3);		
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
			"A1F0AF28C7AE0AB3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7B25070C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Location_1", dcVars[11], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_12", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_hdr_Location_1", dcVars[12], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_11", null, 0, false);
	IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_49 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[10], false, "action", null, 0, false);
	subContainer_20.addSubInstruction(sub_49);
		ISubRule sub_50 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_162", null, 0, false);
	subContainer_20.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_161", null, 0, false);
	subContainer_20.addSubInstruction(sub_51);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AE0AB0C10AB56564643036"), 3);		
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
			"A1F0AF28C7B25073C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7B277C3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_160", null, 0, false);
	subContainer_21.addSubInstruction(sub_52);
		ISubRule sub_53 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[11], false, "List of Cats_url_27", null, 0, false);
	subContainer_21.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_159", null, 0, false);
	subContainer_21.addSubInstruction(sub_54);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7B25070C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7B25070C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7B277C6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7B3B000C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_158", null, 0, false);
	subContainer_22.addSubInstruction(sub_55);
		ISubRule sub_56 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[11], false, "List of Cats_url_26", null, 0, false);
	subContainer_22.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_157", null, 0, false);
	subContainer_22.addSubInstruction(sub_57);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7B25070C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7B3B003C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7B6BD40C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_58 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_20", null, 0, false);
	subContainer_23.addSubInstruction(sub_58);
		ISubRule sub_59 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_156", null, 0, false);
	subContainer_23.addSubInstruction(sub_59);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7B6BD43C10AB56564643036",
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

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7BC6290C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_hdr_Location_1", dcVars[13], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_15", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_hdr_Location_1", dcVars[14], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_13", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_hdr_Location_1", dcVars[15], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_14", null, 0, false);
	IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_60 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_155", null, 0, false);
	subContainer_24.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_154", null, 0, false);
	subContainer_24.addSubInstruction(sub_61);
	


		
				
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
			"A1F0AF28C7BC6293C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7BC89C3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_62 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_153", null, 0, false);
	subContainer_25.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_uri", 0, 564, false, (IDCCoreVar)dcVars[13], false, "List of Cats_url_25", null, 0, false);
	subContainer_25.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_152", null, 0, false);
	subContainer_25.addSubInstruction(sub_64);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7BC6290C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7BC89C6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7BDC220C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_hdr_Location_1", dcVars[16], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_17", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_hdr_Location_1", dcVars[17], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_16", null, 0, false);
	IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_65 = new SubRule("req_uri", 114, 449, false, (IDCCoreVar)dcVars[15], false, "client_task", null, 0, false);
	subContainer_26.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[14], false, "action", null, 0, false);
	subContainer_26.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_151", null, 0, false);
	subContainer_26.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_150", null, 0, false);
	subContainer_26.addSubInstruction(sub_68);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7BC6290C10AB56564643036"), 3);		
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
			"A1F0AF28C7BDC223C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7BDE96BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_149", null, 0, false);
	subContainer_27.addSubInstruction(sub_69);
		ISubRule sub_70 = new SubRule("req_uri", 0, 564, false, (IDCCoreVar)dcVars[16], false, "List of Cats_url_24", null, 0, false);
	subContainer_27.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_148", null, 0, false);
	subContainer_27.addSubInstruction(sub_71);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7BDC220C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7BDE96EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7BE375EC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "assets.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_72 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_19", null, 0, false);
	subContainer_28.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[4], false, "Host_147", null, 0, false);
	subContainer_28.addSubInstruction(sub_73);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7BE3761C10AB56564643036",
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

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C7F76FC0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_74 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_18", null, 0, false);
	subContainer_29.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_146", null, 0, false);
	subContainer_29.addSubInstruction(sub_75);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C7F76FC3C10AB56564643036",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C84E696EC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "petclinic.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_76 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_17", null, 0, false);
	subContainer_30.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[5], false, "Host_145", null, 0, false);
	subContainer_30.addSubInstruction(sub_77);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C84E6971C10AB56564643036",
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

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C84F2CB0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_12 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_12);

	harvestContainer_12.addHarvestInstruction ("resp_hdr_Location_1", dcVars[18], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_18", null, 0, false);
	IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_78 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[12], false, "action", null, 0, false);
	subContainer_31.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_144", null, 0, false);
	subContainer_31.addSubInstruction(sub_79);
		ISubRule sub_80 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_143", null, 0, false);
	subContainer_31.addSubInstruction(sub_80);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7B25070C10AB56564643036"), 3);		
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
			"A1F0AF28C84F2CB3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C84F2D13C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_13 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_13);

	harvestContainer_13.addHarvestInstruction ("resp_hdr_Location_1", dcVars[19], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_20", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_hdr_Location_1", dcVars[20], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_19", null, 0, false);
	IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_81 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[18], false, "action", null, 0, false);
	subContainer_32.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_142", null, 0, false);
	subContainer_32.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_141", null, 0, false);
	subContainer_32.addSubInstruction(sub_83);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C84F2CB0C10AB56564643036"), 3);		
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
			"A1F0AF28C84F2D16C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C84F2D76C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_84 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_140", null, 0, false);
	subContainer_33.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[19], false, "List of Cats_url_23", null, 0, false);
	subContainer_33.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_139", null, 0, false);
	subContainer_33.addSubInstruction(sub_86);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C84F2D13C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C84F2D13C10AB56564643036"), 3);		
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
			"A1F0AF28C84F2D79C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8503E2FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_138", null, 0, false);
	subContainer_34.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[19], false, "List of Cats_url_22", null, 0, false);
	subContainer_34.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_137", null, 0, false);
	subContainer_34.addSubInstruction(sub_89);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C84F2D13C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8503E32C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85176B9C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "assets.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_90 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_16", null, 0, false);
	subContainer_35.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[4], false, "Host_136", null, 0, false);
	subContainer_35.addSubInstruction(sub_91);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85176BCC10AB56564643036",
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

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C851C4C0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:55296", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_92 = new SubRule("req_hdr_Host_1", 10, 5, false, (IDCCoreVar)vars[3], false, "Host_135", null, 0, false);
	subContainer_36.addSubInstruction(sub_92);
		ISubRule sub_93 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_134", null, 0, false);
	subContainer_36.addSubInstruction(sub_93);
	


		
				
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
			"A1F0AF28C851C4C3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C851EBD9C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_94 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[17], false, "action", null, 0, false);
	subContainer_37.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_133", null, 0, false);
	subContainer_37.addSubInstruction(sub_95);
		ISubRule sub_96 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_132", null, 0, false);
	subContainer_37.addSubInstruction(sub_96);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7BDC220C10AB56564643036"), 3);		
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
			"A1F0AF28C851EBDCC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85212E1C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_14 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_14);

	harvestContainer_14.addHarvestInstruction ("resp_hdr_Location_1", dcVars[21], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_23", null, 0, false);
	harvestContainer_14.addHarvestInstruction ("resp_hdr_Location_1", dcVars[22], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_21", null, 0, false);
	harvestContainer_14.addHarvestInstruction ("resp_hdr_Location_1", dcVars[23], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_22", null, 0, false);
	IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_97 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[17], false, "action", null, 0, false);
	subContainer_38.addSubInstruction(sub_97);
		ISubRule sub_98 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_131", null, 0, false);
	subContainer_38.addSubInstruction(sub_98);
		ISubRule sub_99 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_130", null, 0, false);
	subContainer_38.addSubInstruction(sub_99);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7BDC220C10AB56564643036"), 3);		
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
			"A1F0AF28C85212E4C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8523A49C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_100 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_129", null, 0, false);
	subContainer_39.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[21], false, "List of Cats_url_21", null, 0, false);
	subContainer_39.addSubInstruction(sub_101);
		ISubRule sub_102 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_128", null, 0, false);
	subContainer_39.addSubInstruction(sub_102);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85212E1C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8526100C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8526160C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_15 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_15);

	harvestContainer_15.addHarvestInstruction ("resp_hdr_Location_1", dcVars[24], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_26", null, 0, false);
	harvestContainer_15.addHarvestInstruction ("resp_hdr_Location_1", dcVars[25], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_24", null, 0, false);
	harvestContainer_15.addHarvestInstruction ("resp_hdr_Location_1", dcVars[26], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_25", null, 0, false);
	IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_103 = new SubRule("req_uri", 114, 569, false, (IDCCoreVar)dcVars[23], false, "client_task", null, 0, false);
	subContainer_40.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[22], false, "action", null, 0, false);
	subContainer_40.addSubInstruction(sub_104);
		ISubRule sub_105 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_127", null, 0, false);
	subContainer_40.addSubInstruction(sub_105);
		ISubRule sub_106 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_126", null, 0, false);
	subContainer_40.addSubInstruction(sub_106);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85212E1C10AB56564643036"), 3);		
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
			"A1F0AF28C8528810C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C852AF20C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_107 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_125", null, 0, false);
	subContainer_41.addSubInstruction(sub_107);
		ISubRule sub_108 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[24], false, "List of Cats_url_20", null, 0, false);
	subContainer_41.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_124", null, 0, false);
	subContainer_41.addSubInstruction(sub_109);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8526160C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C852AF23C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C852D63AC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_110 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[25], false, "action", null, 0, false);
	subContainer_42.addSubInstruction(sub_110);
		ISubRule sub_111 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_123", null, 0, false);
	subContainer_42.addSubInstruction(sub_111);
		ISubRule sub_112 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_122", null, 0, false);
	subContainer_42.addSubInstruction(sub_112);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8526160C10AB56564643036"), 3);		
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
			"A1F0AF28C852D63DC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C852FD48C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_16 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_16);

	harvestContainer_16.addHarvestInstruction ("resp_hdr_Location_1", dcVars[27], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_29", null, 0, false);
	harvestContainer_16.addHarvestInstruction ("resp_hdr_Location_1", dcVars[28], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_27", null, 0, false);
	harvestContainer_16.addHarvestInstruction ("resp_hdr_Location_1", dcVars[29], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_28", null, 0, false);
	IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_113 = new SubRule("req_uri", 114, 569, false, (IDCCoreVar)dcVars[26], false, "client_task", null, 0, false);
	subContainer_43.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[25], false, "action", null, 0, false);
	subContainer_43.addSubInstruction(sub_114);
		ISubRule sub_115 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_121", null, 0, false);
	subContainer_43.addSubInstruction(sub_115);
		ISubRule sub_116 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_120", null, 0, false);
	subContainer_43.addSubInstruction(sub_116);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8526160C10AB56564643036"), 3);		
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
			"A1F0AF28C852FD4BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8532473C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_117 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_119", null, 0, false);
	subContainer_44.addSubInstruction(sub_117);
		ISubRule sub_118 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[27], false, "List of Cats_url_19", null, 0, false);
	subContainer_44.addSubInstruction(sub_118);
		ISubRule sub_119 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_118", null, 0, false);
	subContainer_44.addSubInstruction(sub_119);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C852FD48C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8532476C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8537287C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_17 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_17);

	harvestContainer_17.addHarvestInstruction ("resp_hdr_Location_1", dcVars[30], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_32", null, 0, false);
	harvestContainer_17.addHarvestInstruction ("resp_hdr_Location_1", dcVars[31], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_30", null, 0, false);
	harvestContainer_17.addHarvestInstruction ("resp_hdr_Location_1", dcVars[32], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_31", null, 0, false);
	IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_120 = new SubRule("req_uri", 114, 569, false, (IDCCoreVar)dcVars[29], false, "client_task", null, 0, false);
	subContainer_45.addSubInstruction(sub_120);
		ISubRule sub_121 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[28], false, "action", null, 0, false);
	subContainer_45.addSubInstruction(sub_121);
		ISubRule sub_122 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_117", null, 0, false);
	subContainer_45.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_116", null, 0, false);
	subContainer_45.addSubInstruction(sub_123);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C852FD48C10AB56564643036"), 3);		
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
			"A1F0AF28C853728AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85399A3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_124 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_115", null, 0, false);
	subContainer_46.addSubInstruction(sub_124);
		ISubRule sub_125 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[30], false, "List of Cats_url_18", null, 0, false);
	subContainer_46.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_114", null, 0, false);
	subContainer_46.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8537287C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85399A6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C853E7A8C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_127 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[31], false, "action", null, 0, false);
	subContainer_47.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_113", null, 0, false);
	subContainer_47.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_112", null, 0, false);
	subContainer_47.addSubInstruction(sub_129);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8537287C10AB56564643036"), 3);		
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
			"A1F0AF28C853E7ABC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8540EC0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_18 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_18);

	harvestContainer_18.addHarvestInstruction ("resp_hdr_Location_1", dcVars[33], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_35", null, 0, false);
	harvestContainer_18.addHarvestInstruction ("resp_hdr_Location_1", dcVars[34], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_33", null, 0, false);
	harvestContainer_18.addHarvestInstruction ("resp_hdr_Location_1", dcVars[35], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_34", null, 0, false);
	IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_130 = new SubRule("req_uri", 114, 569, false, (IDCCoreVar)dcVars[32], false, "client_task", null, 0, false);
	subContainer_48.addSubInstruction(sub_130);
		ISubRule sub_131 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[31], false, "action", null, 0, false);
	subContainer_48.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_111", null, 0, false);
	subContainer_48.addSubInstruction(sub_132);
		ISubRule sub_133 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_110", null, 0, false);
	subContainer_48.addSubInstruction(sub_133);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8537287C10AB56564643036"), 3);		
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
			"A1F0AF28C8540EC3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85435FCC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_134 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_109", null, 0, false);
	subContainer_49.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[33], false, "List of Cats_url_17", null, 0, false);
	subContainer_49.addSubInstruction(sub_135);
		ISubRule sub_136 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_108", null, 0, false);
	subContainer_49.addSubInstruction(sub_136);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8540EC0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85435FFC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8545CF3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_19 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_19);

	harvestContainer_19.addHarvestInstruction ("resp_hdr_Location_1", dcVars[36], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_38", null, 0, false);
	harvestContainer_19.addHarvestInstruction ("resp_hdr_Location_1", dcVars[37], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_36", null, 0, false);
	harvestContainer_19.addHarvestInstruction ("resp_hdr_Location_1", dcVars[38], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_37", null, 0, false);
	IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_137 = new SubRule("req_uri", 114, 569, false, (IDCCoreVar)dcVars[35], false, "client_task", null, 0, false);
	subContainer_50.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[34], false, "action", null, 0, false);
	subContainer_50.addSubInstruction(sub_138);
		ISubRule sub_139 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_107", null, 0, false);
	subContainer_50.addSubInstruction(sub_139);
		ISubRule sub_140 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_106", null, 0, false);
	subContainer_50.addSubInstruction(sub_140);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8540EC0C10AB56564643036"), 3);		
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
			"A1F0AF28C8545CF6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85483F9C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_141 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_105", null, 0, false);
	subContainer_51.addSubInstruction(sub_141);
		ISubRule sub_142 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[36], false, "List of Cats_url_16", null, 0, false);
	subContainer_51.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_104", null, 0, false);
	subContainer_51.addSubInstruction(sub_143);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8545CF3C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85483FCC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C854AAFFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:55296", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_144 = new SubRule("req_hdr_Host_1", 10, 5, false, (IDCCoreVar)vars[3], false, "Host_103", null, 0, false);
	subContainer_52.addSubInstruction(sub_144);
		ISubRule sub_145 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_102", null, 0, false);
	subContainer_52.addSubInstruction(sub_145);
	


		
				
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
			"A1F0AF28C854AB02C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C854D209C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_146 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[37], false, "action", null, 0, false);
	subContainer_53.addSubInstruction(sub_146);
		ISubRule sub_147 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_101", null, 0, false);
	subContainer_53.addSubInstruction(sub_147);
		ISubRule sub_148 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_100", null, 0, false);
	subContainer_53.addSubInstruction(sub_148);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8545CF3C10AB56564643036"), 3);		
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
			"A1F0AF28C854D20CC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C854F911C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Purpose", "prefetch", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Speculation-Tags", "null", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_149 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_15", null, 0, false);
	subContainer_54.addSubInstruction(sub_149);
		ISubRule sub_150 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_99", null, 0, false);
	subContainer_54.addSubInstruction(sub_150);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C854F914C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(503);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(503)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C855204BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_20 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_20);

	harvestContainer_20.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[39], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_151 = new SubRule("req_hdr_Referer_1", 0, 32, false, (IDCCoreVar)dcVars[9], false, "Referer_14", null, 0, false);
	subContainer_55.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_98", null, 0, false);
	subContainer_55.addSubInstruction(sub_152);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C855204EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8556E40C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "speculationrules", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/categories/CATS", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_153 = new SubRule("req_hdr_Referer_1", 0, 47, false, (IDCCoreVar)dcVars[39], false, "Referer_13", null, 0, false);
	subContainer_56.addSubInstruction(sub_153);
		ISubRule sub_154 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_97", null, 0, false);
	subContainer_56.addSubInstruction(sub_154);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855204BC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8556E43C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/speculationrules+json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C855958BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_21 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_21);

	harvestContainer_21.addHarvestInstruction ("resp_hdr_Location_1", dcVars[40], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_39", null, 0, false);
	IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_155 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[20], false, "action", null, 0, false);
	subContainer_57.addSubInstruction(sub_155);
		ISubRule sub_156 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_96", null, 0, false);
	subContainer_57.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_95", null, 0, false);
	subContainer_57.addSubInstruction(sub_157);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C84F2D13C10AB56564643036"), 3);		
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
			"A1F0AF28C855958EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C855BCA8C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_22 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_22);

	harvestContainer_22.addHarvestInstruction ("resp_hdr_Location_1", dcVars[41], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_41", null, 0, false);
	harvestContainer_22.addHarvestInstruction ("resp_hdr_Location_1", dcVars[42], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_40", null, 0, false);
	IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_158 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[40], false, "action", null, 0, false);
	subContainer_58.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_94", null, 0, false);
	subContainer_58.addSubInstruction(sub_159);
		ISubRule sub_160 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_93", null, 0, false);
	subContainer_58.addSubInstruction(sub_160);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855958BC10AB56564643036"), 3);		
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
			"A1F0AF28C855BCABC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C855E3AFC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_161 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_92", null, 0, false);
	subContainer_59.addSubInstruction(sub_161);
		ISubRule sub_162 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[41], false, "List of Cats_url_15", null, 0, false);
	subContainer_59.addSubInstruction(sub_162);
		ISubRule sub_163 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_91", null, 0, false);
	subContainer_59.addSubInstruction(sub_163);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855BCA8C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855BCA8C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C855E3B2C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8574306C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_164 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_90", null, 0, false);
	subContainer_60.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[41], false, "List of Cats_url_14", null, 0, false);
	subContainer_60.addSubInstruction(sub_165);
		ISubRule sub_166 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_89", null, 0, false);
	subContainer_60.addSubInstruction(sub_166);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855BCA8C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8574309C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8587B8BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_23 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_23);

	harvestContainer_23.addHarvestInstruction ("resp_hdr_Location_1", dcVars[43], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_44", null, 0, false);
	harvestContainer_23.addHarvestInstruction ("resp_hdr_Location_1", dcVars[44], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_42", null, 0, false);
	harvestContainer_23.addHarvestInstruction ("resp_hdr_Location_1", dcVars[45], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_43", null, 0, false);
	IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_167 = new SubRule("req_uri", 114, 569, false, (IDCCoreVar)dcVars[38], false, "client_task", null, 0, false);
	subContainer_61.addSubInstruction(sub_167);
		ISubRule sub_168 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[37], false, "action", null, 0, false);
	subContainer_61.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_88", null, 0, false);
	subContainer_61.addSubInstruction(sub_169);
		ISubRule sub_170 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_87", null, 0, false);
	subContainer_61.addSubInstruction(sub_170);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8545CF3C10AB56564643036"), 3);		
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
			"A1F0AF28C8587B8EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C858A2B3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_171 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_86", null, 0, false);
	subContainer_62.addSubInstruction(sub_171);
		ISubRule sub_172 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[43], false, "List of Cats_url_13", null, 0, false);
	subContainer_62.addSubInstruction(sub_172);
		ISubRule sub_173 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_85", null, 0, false);
	subContainer_62.addSubInstruction(sub_173);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8587B8BC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C858A2B6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C858C9C2C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_24 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_24);

	harvestContainer_24.addHarvestInstruction ("resp_hdr_Location_1", dcVars[46], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_46", null, 0, false);
	harvestContainer_24.addHarvestInstruction ("resp_hdr_Location_1", dcVars[47], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_45", null, 0, false);
	IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_174 = new SubRule("req_uri", 114, 569, false, (IDCCoreVar)dcVars[45], false, "client_task", null, 0, false);
	subContainer_63.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[44], false, "action", null, 0, false);
	subContainer_63.addSubInstruction(sub_175);
		ISubRule sub_176 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_84", null, 0, false);
	subContainer_63.addSubInstruction(sub_176);
		ISubRule sub_177 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_83", null, 0, false);
	subContainer_63.addSubInstruction(sub_177);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8587B8BC10AB56564643036"), 3);		
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
			"A1F0AF28C858C9C5C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C858F0CCC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_178 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_82", null, 0, false);
	subContainer_64.addSubInstruction(sub_178);
		ISubRule sub_179 = new SubRule("req_uri", 0, 684, false, (IDCCoreVar)dcVars[46], false, "List of Cats_url_12", null, 0, false);
	subContainer_64.addSubInstruction(sub_179);
		ISubRule sub_180 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_81", null, 0, false);
	subContainer_64.addSubInstruction(sub_180);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C858C9C2C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C858F0CFC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85917EBC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_181 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[47], false, "action", null, 0, false);
	subContainer_65.addSubInstruction(sub_181);
		ISubRule sub_182 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_80", null, 0, false);
	subContainer_65.addSubInstruction(sub_182);
		ISubRule sub_183 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_79", null, 0, false);
	subContainer_65.addSubInstruction(sub_183);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C858C9C2C10AB56564643036"), 3);		
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
			"A1F0AF28C85917EEC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8593F08C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_25 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_25);

	harvestContainer_25.addHarvestInstruction ("resp_hdr_Location_1", dcVars[48], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_49", null, 0, false);
	harvestContainer_25.addHarvestInstruction ("resp_hdr_Location_1", dcVars[49], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_47", null, 0, false);
	harvestContainer_25.addHarvestInstruction ("resp_hdr_Location_1", dcVars[50], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_48", null, 0, false);
	IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_184 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[47], false, "action", null, 0, false);
	subContainer_66.addSubInstruction(sub_184);
		ISubRule sub_185 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_78", null, 0, false);
	subContainer_66.addSubInstruction(sub_185);
		ISubRule sub_186 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_77", null, 0, false);
	subContainer_66.addSubInstruction(sub_186);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C858C9C2C10AB56564643036"), 3);		
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
			"A1F0AF28C8593F0BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8596603C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_187 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_76", null, 0, false);
	subContainer_67.addSubInstruction(sub_187);
		ISubRule sub_188 = new SubRule("req_uri", 0, 701, false, (IDCCoreVar)dcVars[48], false, "List of Cats_url_11", null, 0, false);
	subContainer_67.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_75", null, 0, false);
	subContainer_67.addSubInstruction(sub_189);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8593F08C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8596606C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8598D17C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_26 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_26);

	harvestContainer_26.addHarvestInstruction ("resp_hdr_Location_1", dcVars[51], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_52", null, 0, false);
	harvestContainer_26.addHarvestInstruction ("resp_hdr_Location_1", dcVars[52], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_50", null, 0, false);
	harvestContainer_26.addHarvestInstruction ("resp_hdr_Location_1", dcVars[53], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_51", null, 0, false);
	IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_190 = new SubRule("req_uri", 114, 586, false, (IDCCoreVar)dcVars[50], false, "client_task", null, 0, false);
	subContainer_68.addSubInstruction(sub_190);
		ISubRule sub_191 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[49], false, "action", null, 0, false);
	subContainer_68.addSubInstruction(sub_191);
		ISubRule sub_192 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_74", null, 0, false);
	subContainer_68.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_73", null, 0, false);
	subContainer_68.addSubInstruction(sub_193);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8593F08C10AB56564643036"), 3);		
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
			"A1F0AF28C8598D1AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C859B429C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_194 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_72", null, 0, false);
	subContainer_69.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_uri", 0, 701, false, (IDCCoreVar)dcVars[51], false, "List of Cats_url_10", null, 0, false);
	subContainer_69.addSubInstruction(sub_195);
		ISubRule sub_196 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_71", null, 0, false);
	subContainer_69.addSubInstruction(sub_196);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8598D17C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C859B42CC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C859B48CC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Purpose", "prefetch", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Speculation-Tags", "null", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/categories/CATS", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_197 = new SubRule("req_hdr_Referer_1", 0, 47, false, (IDCCoreVar)dcVars[39], false, "Referer_12", null, 0, false);
	subContainer_70.addSubInstruction(sub_197);
		ISubRule sub_198 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_70", null, 0, false);
	subContainer_70.addSubInstruction(sub_198);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855204BC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C859B48FC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(503);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(503)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85A294FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/categories/CATS", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_27 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_27);

	harvestContainer_27.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[54], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_199 = new SubRule("req_hdr_Referer_1", 0, 47, false, (IDCCoreVar)dcVars[39], false, "Referer_11", null, 0, false);
	subContainer_71.addSubInstruction(sub_199);
		ISubRule sub_200 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_69", null, 0, false);
	subContainer_71.addSubInstruction(sub_200);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855204BC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85A2952C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85A5081C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_28 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_28);

	harvestContainer_28.addHarvestInstruction ("resp_hdr_Location_1", dcVars[55], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_53", null, 0, false);
	IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_201 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[42], false, "action", null, 0, false);
	subContainer_72.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_68", null, 0, false);
	subContainer_72.addSubInstruction(sub_202);
		ISubRule sub_203 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_67", null, 0, false);
	subContainer_72.addSubInstruction(sub_203);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C855BCA8C10AB56564643036"), 3);		
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
			"A1F0AF28C85A5084C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85A7773C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_29 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_29);

	harvestContainer_29.addHarvestInstruction ("resp_hdr_Location_1", dcVars[56], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_55", null, 0, false);
	harvestContainer_29.addHarvestInstruction ("resp_hdr_Location_1", dcVars[57], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_54", null, 0, false);
	IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_204 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[55], false, "action", null, 0, false);
	subContainer_73.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_66", null, 0, false);
	subContainer_73.addSubInstruction(sub_205);
		ISubRule sub_206 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_65", null, 0, false);
	subContainer_73.addSubInstruction(sub_206);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A5081C10AB56564643036"), 3);		
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
			"A1F0AF28C85A7776C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85A9E67C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "speculationrules", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/products/FL-DSH-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_207 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[54], false, "Referer_10", null, 0, false);
	subContainer_74.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_64", null, 0, false);
	subContainer_74.addSubInstruction(sub_208);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A294FC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85A9E6AC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/speculationrules+json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85AC59BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_209 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_63", null, 0, false);
	subContainer_75.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[56], false, "List of Cats_url_9", null, 0, false);
	subContainer_75.addSubInstruction(sub_210);
		ISubRule sub_211 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_62", null, 0, false);
	subContainer_75.addSubInstruction(sub_211);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A7773C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85AC59EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85BAFDBC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_212 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_61", null, 0, false);
	subContainer_76.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[56], false, "List of Cats_url_8", null, 0, false);
	subContainer_76.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_60", null, 0, false);
	subContainer_76.addSubInstruction(sub_214);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A7773C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85BAFDEC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85D5D88C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_215 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[52], false, "action", null, 0, false);
	subContainer_77.addSubInstruction(sub_215);
		ISubRule sub_216 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_59", null, 0, false);
	subContainer_77.addSubInstruction(sub_216);
		ISubRule sub_217 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_58", null, 0, false);
	subContainer_77.addSubInstruction(sub_217);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8598D17C10AB56564643036"), 3);		
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
			"A1F0AF28C85D5D8BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85D84A0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_30 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_30);

	harvestContainer_30.addHarvestInstruction ("resp_hdr_Location_1", dcVars[58], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_58", null, 0, false);
	harvestContainer_30.addHarvestInstruction ("resp_hdr_Location_1", dcVars[59], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_56", null, 0, false);
	harvestContainer_30.addHarvestInstruction ("resp_hdr_Location_1", dcVars[60], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_57", null, 0, false);
	IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_218 = new SubRule("req_uri", 114, 586, false, (IDCCoreVar)dcVars[53], false, "client_task", null, 0, false);
	subContainer_78.addSubInstruction(sub_218);
		ISubRule sub_219 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[52], false, "action", null, 0, false);
	subContainer_78.addSubInstruction(sub_219);
		ISubRule sub_220 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_57", null, 0, false);
	subContainer_78.addSubInstruction(sub_220);
		ISubRule sub_221 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_56", null, 0, false);
	subContainer_78.addSubInstruction(sub_221);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8598D17C10AB56564643036"), 3);		
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
			"A1F0AF28C85D84A3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85DD2B0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_222 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_55", null, 0, false);
	subContainer_79.addSubInstruction(sub_222);
		ISubRule sub_223 = new SubRule("req_uri", 0, 701, false, (IDCCoreVar)dcVars[58], false, "List of Cats_url_7", null, 0, false);
	subContainer_79.addSubInstruction(sub_223);
		ISubRule sub_224 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_54", null, 0, false);
	subContainer_79.addSubInstruction(sub_224);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85D84A0C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85DD2B3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85DF9DAC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_31 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_31);

	harvestContainer_31.addHarvestInstruction ("resp_hdr_Location_1", dcVars[61], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_60", null, 0, false);
	harvestContainer_31.addHarvestInstruction ("resp_hdr_Location_1", dcVars[62], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_59", null, 0, false);
	IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_225 = new SubRule("req_uri", 114, 586, false, (IDCCoreVar)dcVars[60], false, "client_task", null, 0, false);
	subContainer_80.addSubInstruction(sub_225);
		ISubRule sub_226 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[59], false, "action", null, 0, false);
	subContainer_80.addSubInstruction(sub_226);
		ISubRule sub_227 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_53", null, 0, false);
	subContainer_80.addSubInstruction(sub_227);
		ISubRule sub_228 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_52", null, 0, false);
	subContainer_80.addSubInstruction(sub_228);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85D84A0C10AB56564643036"), 3);		
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
			"A1F0AF28C85DF9DDC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85E20F3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_229 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_51", null, 0, false);
	subContainer_81.addSubInstruction(sub_229);
		ISubRule sub_230 = new SubRule("req_uri", 0, 701, false, (IDCCoreVar)dcVars[61], false, "List of Cats_url_6", null, 0, false);
	subContainer_81.addSubInstruction(sub_230);
		ISubRule sub_231 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_50", null, 0, false);
	subContainer_81.addSubInstruction(sub_231);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85DF9DAC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85E20F6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85E6EF0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Purpose", "prefetch", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Speculation-Tags", "null", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/products/FL-DSH-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_232 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[54], false, "Referer_9", null, 0, false);
	subContainer_82.addSubInstruction(sub_232);
		ISubRule sub_233 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_49", null, 0, false);
	subContainer_82.addSubInstruction(sub_233);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A294FC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85E6EF3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(503);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(503)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85E6F83C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/products/FL-DSH-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_32 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_32);

	harvestContainer_32.addHarvestInstruction ("resp_hdr_Location_1", dcVars[63], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_61", null, 0, false);
	IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_234 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[54], false, "Referer_8", null, 0, false);
	subContainer_83.addSubInstruction(sub_234);
		ISubRule sub_235 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_48", null, 0, false);
	subContainer_83.addSubInstruction(sub_235);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A294FC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85E6F86C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85E963DC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/products/FL-DSH-01", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_33 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_33);

	harvestContainer_33.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[64], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_236 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[54], false, "Referer_7", null, 0, false);
	subContainer_84.addSubInstruction(sub_236);
		ISubRule sub_237 = new SubRule("req_uri", 0, 14, false, (IDCCoreVar)dcVars[63], false, "List of Cats_url_5", null, 0, false);
	subContainer_84.addSubInstruction(sub_237);
		ISubRule sub_238 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_47", null, 0, false);
	subContainer_84.addSubInstruction(sub_238);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A294FC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85E6F83C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85E9640C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_85(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85EE420C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_34 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_34);

	harvestContainer_34.addHarvestInstruction ("resp_hdr_Location_1", dcVars[65], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_62", null, 0, false);
	IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_239 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[57], false, "action", null, 0, false);
	subContainer_85.addSubInstruction(sub_239);
		ISubRule sub_240 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_46", null, 0, false);
	subContainer_85.addSubInstruction(sub_240);
		ISubRule sub_241 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_45", null, 0, false);
	subContainer_85.addSubInstruction(sub_241);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85A7773C10AB56564643036"), 3);		
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
			"A1F0AF28C85EE423C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_86(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85F0B53C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_35 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_35);

	harvestContainer_35.addHarvestInstruction ("resp_hdr_Location_1", dcVars[66], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_64", null, 0, false);
	harvestContainer_35.addHarvestInstruction ("resp_hdr_Location_1", dcVars[67], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_63", null, 0, false);
	IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_242 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[65], false, "action", null, 0, false);
	subContainer_86.addSubInstruction(sub_242);
		ISubRule sub_243 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_44", null, 0, false);
	subContainer_86.addSubInstruction(sub_243);
		ISubRule sub_244 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_43", null, 0, false);
	subContainer_86.addSubInstruction(sub_244);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85EE420C10AB56564643036"), 3);		
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
			"A1F0AF28C85F0B56C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_87(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85F5958C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "speculationrules", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_245 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[64], false, "Referer_6", null, 0, false);
	subContainer_87.addSubInstruction(sub_245);
		ISubRule sub_246 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_42", null, 0, false);
	subContainer_87.addSubInstruction(sub_246);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85E963DC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C85F595BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/speculationrules+json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_88(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C85FA77FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_88 = new DataSub();
	reqAction.addDataSub(subContainer_88);

		ISubRule sub_247 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_41", null, 0, false);
	subContainer_88.addSubInstruction(sub_247);
		ISubRule sub_248 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[66], false, "List of Cats_url_4", null, 0, false);
	subContainer_88.addSubInstruction(sub_248);
		ISubRule sub_249 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_40", null, 0, false);
	subContainer_88.addSubInstruction(sub_249);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85F0B53C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85F0B53C10AB56564643036"), 3);		
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
			"A1F0AF28C85FA782C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_89(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C861CA5FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_89 = new DataSub();
	reqAction.addDataSub(subContainer_89);

		ISubRule sub_250 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_39", null, 0, false);
	subContainer_89.addSubInstruction(sub_250);
		ISubRule sub_251 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[66], false, "List of Cats_url_3", null, 0, false);
	subContainer_89.addSubInstruction(sub_251);
		ISubRule sub_252 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_38", null, 0, false);
	subContainer_89.addSubInstruction(sub_252);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85F0B53C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C861CA62C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_90(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C86329F3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:55296", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_90 = new DataSub();
	reqAction.addDataSub(subContainer_90);

		ISubRule sub_253 = new SubRule("req_hdr_Host_1", 10, 5, false, (IDCCoreVar)vars[3], false, "Host_37", null, 0, false);
	subContainer_90.addSubInstruction(sub_253);
		ISubRule sub_254 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_36", null, 0, false);
	subContainer_90.addSubInstruction(sub_254);
	


		
				
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
			"A1F0AF28C86329F6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_91(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C863781AC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_91 = new DataSub();
	reqAction.addDataSub(subContainer_91);

		ISubRule sub_255 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[62], false, "action", null, 0, false);
	subContainer_91.addSubInstruction(sub_255);
		ISubRule sub_256 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_35", null, 0, false);
	subContainer_91.addSubInstruction(sub_256);
		ISubRule sub_257 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_34", null, 0, false);
	subContainer_91.addSubInstruction(sub_257);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85DF9DAC10AB56564643036"), 3);		
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
			"A1F0AF28C863781DC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_92(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C863C630C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_36 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_36);

	harvestContainer_36.addHarvestInstruction ("resp_hdr_Location_1", dcVars[68], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_67", null, 0, false);
	harvestContainer_36.addHarvestInstruction ("resp_hdr_Location_1", dcVars[69], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_65", null, 0, false);
	harvestContainer_36.addHarvestInstruction ("resp_hdr_Location_1", dcVars[70], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_66", null, 0, false);
	IDataSub subContainer_92 = new DataSub();
	reqAction.addDataSub(subContainer_92);

		ISubRule sub_258 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[62], false, "action", null, 0, false);
	subContainer_92.addSubInstruction(sub_258);
		ISubRule sub_259 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_33", null, 0, false);
	subContainer_92.addSubInstruction(sub_259);
		ISubRule sub_260 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_32", null, 0, false);
	subContainer_92.addSubInstruction(sub_260);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C85DF9DAC10AB56564643036"), 3);		
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
			"A1F0AF28C863ED31C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_93(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8641440C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_93 = new DataSub();
	reqAction.addDataSub(subContainer_93);

		ISubRule sub_261 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_31", null, 0, false);
	subContainer_93.addSubInstruction(sub_261);
		ISubRule sub_262 = new SubRule("req_uri", 0, 704, false, (IDCCoreVar)dcVars[68], false, "List of Cats_url_2", null, 0, false);
	subContainer_93.addSubInstruction(sub_262);
		ISubRule sub_263 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_30", null, 0, false);
	subContainer_93.addSubInstruction(sub_263);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C863C630C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8641443C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_94(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8643B73C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_37 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_37);

	harvestContainer_37.addHarvestInstruction ("resp_hdr_Location_1", dcVars[71], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_69", null, 0, false);
	harvestContainer_37.addHarvestInstruction ("resp_hdr_Location_1", dcVars[72], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_68", null, 0, false);
	IDataSub subContainer_94 = new DataSub();
	reqAction.addDataSub(subContainer_94);

		ISubRule sub_264 = new SubRule("req_uri", 114, 589, false, (IDCCoreVar)dcVars[70], false, "client_task", null, 0, false);
	subContainer_94.addSubInstruction(sub_264);
		ISubRule sub_265 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[69], false, "action", null, 0, false);
	subContainer_94.addSubInstruction(sub_265);
		ISubRule sub_266 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_29", null, 0, false);
	subContainer_94.addSubInstruction(sub_266);
		ISubRule sub_267 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_28", null, 0, false);
	subContainer_94.addSubInstruction(sub_267);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C863C630C10AB56564643036"), 3);		
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
			"A1F0AF28C8643B76C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_95(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8648970C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_95 = new DataSub();
	reqAction.addDataSub(subContainer_95);

		ISubRule sub_268 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_27", null, 0, false);
	subContainer_95.addSubInstruction(sub_268);
		ISubRule sub_269 = new SubRule("req_uri", 0, 704, false, (IDCCoreVar)dcVars[71], false, "List of Cats_url", null, 0, false);
	subContainer_95.addSubInstruction(sub_269);
		ISubRule sub_270 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_26", null, 0, false);
	subContainer_95.addSubInstruction(sub_270);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8643B73C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C7AD6E7EC10AB56564643036"), 3);		
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
			"A1F0AF28C8648973C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(1232, 1, parent, parent, "A1F0AF28C864D790C10AB56564643036");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "cart_updateCartQuantities", "A1F0AF28C864D790C10AB56564643036") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_96(this, true, "A1F0AF28C7AD6E70C10AB56564643036", false, true,
						"Config_3", "updateCartQuantities",	"/cart/updateCartQuantities", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_97(this, false, "A1F0AF28C8657417C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{74}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 1841, 100, "A1F0AF28C864D794C10AB56564643036", 3);
				httpParallel.addRequest(0, request_98(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "newOrderForm",	"/order/newOrderForm", true, false), 905, 100, "A1F0AF28C865741FC10AB56564643036", 3);
				httpParallel.addRequest(0, request_99(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "newOrderForm{1}",	"/order/newOrderForm", true, false), 130, 100, "A1F0AF28C865C1F4C10AB56564643036", 3);
				httpParallel.addRequest(0, request_100(this, false, "A1F0AF28C7AD6E70C10AB56564643036", false, false,
						"Config_3", "signonForm",	"/account/signonForm?referer=%2Forder%2FnewOrderForm", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_101(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{75}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 84, 100, "A1F0AF28C8665E48C10AB56564643036", 3);
				httpParallel.addRequest(3, request_102(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{76}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=getJavaScriptSources", true, false), 84, 100, "A1F0AF28C8665E48C10AB56564643036", 3);
				httpParallel.addRequest(0, request_103(this, false, "A1F0AF28C7AD6E70C10AB56564643036", true, false,
						"Config_3", "speculation{4}",	"/cdn-cgi/speculation", true, false), 1, 100, "A1F0AF28C866D360C10AB56564643036", 3);
				httpParallel.addRequest(3, request_104(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{77}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_105(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{78}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=getJavaScriptSources", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_106(this, false, "A1F0AF28C77C9A70C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{79}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcart%2FviewCart%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 68, 100, "A1F0AF28C868F64BC10AB56564643036", 3);
				httpParallel.addRequest(3, request_107(this, false, "A1F0AF28C77C9A70C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{80}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcart%2FviewCart%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_108(this, false, "A1F0AF28C7798D30C10AB56564643036", false, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{81}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcart%2FviewCart%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 11, 100, "A1F0AF28C86C03A3C10AB56564643036", 3);
				httpParallel.addRequest(2, request_109(this, false, "A1F0AF28C7798D30C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{82}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService/?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fwww.bing.com%2Fsearch%3Fqs%3DLS%26pq%3DJpet%26sk%3DCSYN1LS1LC1%26sc%3D16-4%26q%3Djpetstore%2Bdemo%26cvid%3D7d8fabd792924d3ca5082fb9961ad5c0%26gs_lcrp%3DEgRlZGdlKgYIAxAAGEAyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEAyCAgJEOkHGPxV0gEIMzI2OWowajSoAgSwAgE%26FORM%3DANAB01%26PC%3DLCTS%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951425},{%22url_kind%22:%22https%3A%2F%2Fjpetstore.aspectran.com%2Fcart%2FviewCart%22,%22browser_type%22:%22Edge%22,%22unique_id%22:802951482}]}", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_110(this, false, "A1F0AF28C86C9FE3C10AB56564643036", true, false,
						"Config_2", "com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService{83}",	"/moeb/service/com.ibm.rational.test.rtw.webgui.service.IWebGuiRecorderService?action=hasAnyClientTask&client_task={%22activeTabsInfo%22:[{%22url_kind%22:%22https%3A%2F%2Fibmsf.lightning.force.com%2Flightning%2Fo%2FCase%2Flist%3FfilterName%3DRational_Test_Tools_Inbound_Cases%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447413},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.4%3Ftopic%3Dvirtualization-troubleshooting-stubs%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447701},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fsupport%2Fpages%2Fnode%2F874528%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447686},{%22url_kind%22:%22https%3A%2F%2Fgit-scm.com%2Fbook%2Fen%2Fv2%2FGit-on-the-Server-The-Protocols%23The-Git-Protocol%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447606},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2Fatlassian%2Fexk1s59u2hiwtERoC1d8%2Fsso%2Fsaml%3FSAMLRequest%3DjZJPj9owEMW%252FSuS748RNIFgERKGrIm1bBNkeeqkcZ1gsHJt6nGX77Rv%252BLNoeinq138zv6b0ZT19bE72AR%252B1sSdI4IRFY5Rptn0vyVD3QgkwnY5St4Qcx68LOruFXBxiiftCiuPyUpPNWOIkahZUtoAhKbGZfHgWPE3HwLjjlDIlmiOBDj5o7i10LfgP%252BRSt4Wj%252BWZBfCAQVjsqfEMhiJqKWNlWuZcc%252FaMiWNqaXaT5WzFtRpT3ni02EuR%252Fl2NKDFNgOaNVugcpQMaJM1csg%252FpFDwnESL3rW28jx2g%252B2Uoei24Sg9xG4f5JknDwd2c8DgdZ9iPur4Th%252FDp7Wbp03BEB07wUm0XJTkp6pr2fQeeD6oIcvyRhWqGNZ50eSQDAdpL0PsYGkxSBtKwhOe0zShnFdJLrKBSIu4yPgPEq2uaX3U9tLCvWjriwjF56pa0dW3TUWi729t9gJy7U6c6f59afcXy7emyOROL6dF7H%252FSH7P3Nm4H9bXnLhcrZ7T6Hc2Mcce5BxmgJMF3QKIH51sZ%252Fu00jdPzi27o9iwV0EptZk3jAZGwyZX79%252BlO%252FgA%253D%26RelayState%3D73382fdd-9204-47df-95eb-eca1c5ab57ce%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447621},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522testhub%252520ports%25252A%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447417},{%22url_kind%22:%22https%3A%2F%2Fsupport.hcl-software.com%2Fnow%2Fnav%2Fui%2Fclassic%2Fparams%2Ftarget%2Fsn_customerservice_case.do%253Fsys_id%253D9c605e9c2bf0b650f032f85ece91bf30%2526sysparm_record_target%253Dsn_customerservice_case%2526sysparm_record_row%253D1%2526sysparm_record_rows%253D1%2526sysparm_record_list%253DstateNOT%252BIN3%25252C7%25255Eassignment_group%25253Da1cd88d31b1fe7009dbcfc038d4bcbfc%25255Eproduct%252521%25253Dc8caf7c71bdbe7009dbcfc038d4bcb43%25255Eu_internal_status_1INcustomer%252Bupdated%25252Ccustomer%252Brequests%252Bcallback%25255EORassigned_toISEMPTY%25255EORu_internal_status_1%25253D%25255Eaccount.u_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORaccount.u_country_specific_supportISEMPTY%25255EentitlementISEMPTY%25255EORentitlement.u_product_country_specific_supportCONTAINS8938b7111b121100763d91eebc0713ec%25255EORentitlement.u_product_country_specific_supportISEMPTY%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EconsumerISEMPTY%25255EORcontributor_usersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%25255EORcontributor_groupsDYNAMICd6435e965f510100a9ad2572f2b47744%25255EORDERBYDESCsys_updated_on%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447420},{%22url_kind%22:%22https%3A%2F%2Fhcl-software.okta.com%2Fapp%2FUserHome%3Fiss%3Dhttps%253A%252F%252Fhcl-software.okta.com%26session_hint%3DAUTHENTICATED%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447615},{%22url_kind%22:%22https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%23inbox%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447426},{%22url_kind%22:%22https%3A%2F%2Fid.hcltechsw.com%2Foauth2%2Fv1%2Fauthorize%3Fclient_id%3Dokta.2b1959c8-bcc0-56eb-a589-cfcfb7422f26%26code_challenge%3DAVuLwIYcdAv3UOZfg_bX2sgfdp7wZ_sFEmSuFAHJcvI%26code_challenge_method%3DS256%26nonce%3DrEGWS6wWBHCExNdFFnQKZxALsPhOSpykXeXaft7D482dZCQliS73ytGLaa0vvspd%26redirect_uri%3Dhttps%253A%252F%252Fid.hcltechsw.com%252Fenduser%252Fcallback%26response_type%3Dcode%26state%3DZnNY4vFA9oe8dy0AC3FMF9RoKT5afr7944u6eCw01ZxrTE5N6aY6sIE1XiH2N1Wl%26scope%3Dopenid%2520profile%2520email%2520okta.users.read.self%2520okta.users.manage.self%2520okta.internal.enduser.read%2520okta.internal.enduser.manage%2520okta.enduser.dashboard.read%2520okta.enduser.dashboard.manage%2520okta.myAccount.sessions.manage%2520okta.internal.navigation.enduser.read%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447651},{%22url_kind%22:%22https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fu%2F0%2Fr%2Fweek%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447637},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Ftestingsupport%2F2025-meetings%3Fauthuser%3D0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447731},{%22url_kind%22:%22https%3A%2F%2Fdocs.google.com%2Fdocument%2Fd%2F1E2eGt1irONCm_9T3gY6erALuQHeEvSJHfwbaU1rTPSQ%2Fedit%3Ftab%3Dt.0%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447734},{%22url_kind%22:%22https%3A%2F%2Fwww.coursera.org%2Flearn%2Fgcp-fundamentals%3Fspecialization%3Dsre-devops-engineer-google-cloud%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447728},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fbrowse%252FCS-2595%253FfocusedCommentId%253D2240762%2526sourceType%253Dmention%2526isEligibleForUserSurvey%253Dtrue%2526isEligibleForUserSurvey%253Dtrue%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447725},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-workbench%2F11.0.3%3Ftopic%3Dbroker-jndi-connection-settings%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447672},{%22url_kind%22:%22https%3A%2F%2Fwww.ibm.com%2Fdocs%2Fen%2Fdevops-test-hub%2F11.0.6%3Ftopic%3Dresults-test-data-in-grafana%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447669},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fpercipio%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447666},{%22url_kind%22:%22https%3A%2F%2Fhclcontent.percipio.com%2Flibrary%2F0bb55c60-dcc2-11e6-b53c-c991ff5fe8a1%2F9048b0f0-dd1a-11e6-a0cd-57e8530c1ff3%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447663},{%22url_kind%22:%22https%3A%2F%2Fsites.google.com%2Fhcl.software%2Fpeoplefunction%2Fhome%2Flearning-and-development%2Fcertified-people-manager-program%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447465},{%22url_kind%22:%22https%3A%2F%2Fdrive.google.com%2Fdrive%2Frecent%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447722},{%22url_kind%22:%22https%3A%2F%2Fid.atlassian.com%2Flogin%3Fapplication%3Djira%26continue%3Dhttps%253A%252F%252Fhclsw-jiracentral.atlassian.net%252Fissues%252F%253Fjql%253Dtextfields%252520~%252520%252522response%252520time%252520n%25252Fd%252522%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447719},{%22url_kind%22:%22https%3A%2F%2Flogin.w3.ibm.com%2Fsaml%2Fsps%2Fauth%3Fstateid%3Def154ec1-f43f-4120-9e13-dcf57c3449f8%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447474},{%22url_kind%22:%22https%3A%2F%2Fdevopsautomationlabs.github.io%2FEnd2End%2Fdemoflow.html%23overview%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447609},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Frajavan%3Ftab%3Drepositories%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447612},{%22url_kind%22:%22https%3A%2F%2F10.190.116.49.nip.io%2Fauth%2Frealms%2Fdevops-automation%2Fprotocol%2Fopenid-connect%2Fauth%3Fclient_id%3Ddevopsautomation%26redirect_uri%3Dhttps%253A%252F%252F10.190.116.49.nip.io%252Fautomation%252F%26response_type%3Dcode%26scope%3Dopenid%2Bprofile%2Bemail%26state%3D648c22695811496aa110d279ab69c54e%26code_challenge%3DLC6l-RWug9t1wXusBged2p30YI7XpHQA12mp5TDZ5Zg%26code_challenge_method%3DS256%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447660},{%22url_kind%22:%22https%3A%2F%2Fgithub.com%2Fapache%2Factivemq%2Fblob%2Fmain%2Factivemq-unit-tests%2Fsrc%2Ftest%2Fresources%2Fjndi.properties%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447705},{%22url_kind%22:%22https%3A%2F%2Fawsmorocco.com%2Fexposing-ports-in-kubernetes-what-you-should-to-know-cd1a80655f6c%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447625},{%22url_kind%22:%22https%3A%2F%2Fwww.youtube.com%2Fresults%3Fsearch_query%3Dstress%2Btesting%2Busing%2Bibm%2Brational%2Bperformance%2Btester%2B%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447709},{%22url_kind%22:%22https%3A%2F%2Fwww.geeksforgeeks.org%2Fsoftware-testing%2Fstress-testing-software-testing%2F%22,%22browser_type%22:%22Chrome%22,%22unique_id%22:1527447716}]}", true, false), 3292, 100, "A1F0AF28C86C78B2C10AB56564643036", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_96(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C864D794C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(19);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "10", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("HX-Target", "jpetstore-content", "UTF-8", 1));			
		headers.add(new RequestHeaderData("HX-Current-URL", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("HX-Request", "true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_96 = new DataSub();
	reqAction.addDataSub(subContainer_96);

		ISubRule sub_271 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[64], false, "Referer_5", null, 0, false);
	subContainer_96.addSubInstruction(sub_271);
		ISubRule sub_272 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_25", null, 0, false);
	subContainer_96.addSubInstruction(sub_272);
	


		
				
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
			"A1F0AF28C864D797C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("EST-14=100");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1F0AF28C8654CC0C10AB56564643036", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_97(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C865741FC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_97 = new DataSub();
	reqAction.addDataSub(subContainer_97);

		ISubRule sub_273 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[72], false, "action", null, 0, false);
	subContainer_97.addSubInstruction(sub_273);
		ISubRule sub_274 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_24", null, 0, false);
	subContainer_97.addSubInstruction(sub_274);
		ISubRule sub_275 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_23", null, 0, false);
	subContainer_97.addSubInstruction(sub_275);
	


		
				
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
			"A1F0AF28C8657422C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_98(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C865C1F4C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Purpose", "prefetch", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Speculation-Tags", "null", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_98 = new DataSub();
	reqAction.addDataSub(subContainer_98);

		ISubRule sub_276 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[64], false, "Referer_4", null, 0, false);
	subContainer_98.addSubInstruction(sub_276);
		ISubRule sub_277 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_22", null, 0, false);
	subContainer_98.addSubInstruction(sub_277);
	


		
				
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
			"A1F0AF28C865C1F7C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(503);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(503)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8661012C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
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
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_38 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_38);

	harvestContainer_38.addHarvestInstruction ("resp_hdr_Location_1", dcVars[73], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_70", null, 0, false);
	IDataSub subContainer_99 = new DataSub();
	reqAction.addDataSub(subContainer_99);

		ISubRule sub_278 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[64], false, "Referer_3", null, 0, false);
	subContainer_99.addSubInstruction(sub_278);
		ISubRule sub_279 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_21", null, 0, false);
	subContainer_99.addSubInstruction(sub_279);
	


		
				
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
			"A1F0AF28C8661015C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8665E48C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(15);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_39 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_39);

	harvestContainer_39.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[74], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_5", null, 0, false);
	IDataSub subContainer_100 = new DataSub();
	reqAction.addDataSub(subContainer_100);

		ISubRule sub_280 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[64], false, "Referer_2", null, 0, false);
	subContainer_100.addSubInstruction(sub_280);
		ISubRule sub_281 = new SubRule("req_uri", 0, 51, false, (IDCCoreVar)dcVars[73], false, "cart_updateCartQuant_url_5", null, 0, false);
	subContainer_100.addSubInstruction(sub_281);
		ISubRule sub_282 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_20", null, 0, false);
	subContainer_100.addSubInstruction(sub_282);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8661012C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C864D794C10AB56564643036"), 3);		
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
			"A1F0AF28C8665E4BC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_101(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C866D360C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_40 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_40);

	harvestContainer_40.addHarvestInstruction ("resp_hdr_Location_1", dcVars[75], "\\?action=(.*?)$", 1, 0, 0, 0, false, "Location_71", null, 0, false);
	IDataSub subContainer_101 = new DataSub();
	reqAction.addDataSub(subContainer_101);

		ISubRule sub_283 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[67], false, "action", null, 0, false);
	subContainer_101.addSubInstruction(sub_283);
		ISubRule sub_284 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_19", null, 0, false);
	subContainer_101.addSubInstruction(sub_284);
		ISubRule sub_285 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_18", null, 0, false);
	subContainer_101.addSubInstruction(sub_285);
	


		
				
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
			"A1F0AF28C866D363C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_102(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C866FA72C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_41 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_41);

	harvestContainer_41.addHarvestInstruction ("resp_hdr_Location_1", dcVars[76], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_72", null, 0, false);
	IDataSub subContainer_102 = new DataSub();
	reqAction.addDataSub(subContainer_102);

		ISubRule sub_286 = new SubRule("req_uri", 85, 20, true, (IDCCoreVar)dcVars[75], false, "action", null, 0, false);
	subContainer_102.addSubInstruction(sub_286);
		ISubRule sub_287 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_17", null, 0, false);
	subContainer_102.addSubInstruction(sub_287);
		ISubRule sub_288 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_16", null, 0, false);
	subContainer_102.addSubInstruction(sub_288);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C866D360C10AB56564643036"), 3);		
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
			"A1F0AF28C866FA75C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_103(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C866FAD5C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Microsoft Edge\";v=\"141\", \"Not?A_Brand\";v=\"8\", \"Chromium\";v=\"141\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "speculationrules", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/account/signonForm?referer=%2Forder%2FnewOrderForm", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_103 = new DataSub();
	reqAction.addDataSub(subContainer_103);

		ISubRule sub_289 = new SubRule("req_hdr_Referer_1", 0, 82, false, (IDCCoreVar)dcVars[74], false, "Referer", null, 0, false);
	subContainer_103.addSubInstruction(sub_289);
		ISubRule sub_290 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[2], false, "Host_15", null, 0, false);
	subContainer_103.addSubInstruction(sub_290);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C8665E48C10AB56564643036"), 3);		
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
			"A1F0AF28C866FAD8C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/speculationrules+json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_104(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C8676FA0C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_104 = new DataSub();
	reqAction.addDataSub(subContainer_104);

		ISubRule sub_291 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_14", null, 0, false);
	subContainer_104.addSubInstruction(sub_291);
		ISubRule sub_292 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[76], false, "cart_updateCartQuant_url_4", null, 0, false);
	subContainer_104.addSubInstruction(sub_292);
		ISubRule sub_293 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_104.addSubInstruction(sub_293);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C866FA72C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C864D794C10AB56564643036"), 3);		
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
			"A1F0AF28C8676FA3C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_105(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C868F64BC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_105 = new DataSub();
	reqAction.addDataSub(subContainer_105);

		ISubRule sub_294 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_12", null, 0, false);
	subContainer_105.addSubInstruction(sub_294);
		ISubRule sub_295 = new SubRule("req_uri", 0, 106, false, (IDCCoreVar)dcVars[76], false, "cart_updateCartQuant_url_3", null, 0, false);
	subContainer_105.addSubInstruction(sub_295);
		ISubRule sub_296 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_105.addSubInstruction(sub_296);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C866FA72C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C864D794C10AB56564643036"), 3);		
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
			"A1F0AF28C868F64EC10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_106(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C86BDC70C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_42 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_42);

	harvestContainer_42.addHarvestInstruction ("resp_hdr_Location_1", dcVars[77], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_75", null, 0, false);
	harvestContainer_42.addHarvestInstruction ("resp_hdr_Location_1", dcVars[78], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_73", null, 0, false);
	harvestContainer_42.addHarvestInstruction ("resp_hdr_Location_1", dcVars[79], "&client_task=(.*?)$", 1, 0, 0, 0, false, "Location_74", null, 0, false);
	IDataSub subContainer_106 = new DataSub();
	reqAction.addDataSub(subContainer_106);

		ISubRule sub_297 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[72], false, "action", null, 0, false);
	subContainer_106.addSubInstruction(sub_297);
		ISubRule sub_298 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_10", null, 0, false);
	subContainer_106.addSubInstruction(sub_298);
		ISubRule sub_299 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_106.addSubInstruction(sub_299);
	


		
				
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
			"A1F0AF28C86BDC73C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_107(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C86C03A3C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_107 = new DataSub();
	reqAction.addDataSub(subContainer_107);

		ISubRule sub_300 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_8", null, 0, false);
	subContainer_107.addSubInstruction(sub_300);
		ISubRule sub_301 = new SubRule("req_uri", 0, 699, false, (IDCCoreVar)dcVars[77], false, "cart_updateCartQuant_url_2", null, 0, false);
	subContainer_107.addSubInstruction(sub_301);
		ISubRule sub_302 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_107.addSubInstruction(sub_302);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C86BDC70C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C864D794C10AB56564643036"), 3);		
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
			"A1F0AF28C86C03A6C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_108(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C86C51A6C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_43 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_43);

	harvestContainer_43.addHarvestInstruction ("resp_hdr_Location_1", dcVars[80], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_77", null, 0, false);
	harvestContainer_43.addHarvestInstruction ("resp_hdr_Location_1", dcVars[81], "\\?action=(.*?)&", 1, 1, 0, 0, false, "Location_76", null, 0, false);
	IDataSub subContainer_108 = new DataSub();
	reqAction.addDataSub(subContainer_108);

		ISubRule sub_303 = new SubRule("req_uri", 114, 584, false, (IDCCoreVar)dcVars[79], false, "client_task", null, 0, false);
	subContainer_108.addSubInstruction(sub_303);
		ISubRule sub_304 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[78], false, "action", null, 0, false);
	subContainer_108.addSubInstruction(sub_304);
		ISubRule sub_305 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_6", null, 0, false);
	subContainer_108.addSubInstruction(sub_305);
		ISubRule sub_306 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_108.addSubInstruction(sub_306);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C86BDC70C10AB56564643036"), 3);		
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
			"A1F0AF28C86C51A9C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_109(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C86C78B2C10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36 Edg/141.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_109 = new DataSub();
	reqAction.addDataSub(subContainer_109);

		ISubRule sub_307 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_4", null, 0, false);
	subContainer_109.addSubInstruction(sub_307);
		ISubRule sub_308 = new SubRule("req_uri", 0, 699, false, (IDCCoreVar)dcVars[80], false, "cart_updateCartQuant_url", null, 0, false);
	subContainer_109.addSubInstruction(sub_308);
		ISubRule sub_309 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_109.addSubInstruction(sub_309);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C86C51A6C10AB56564643036"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C864D794C10AB56564643036"), 3);		
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
			"A1F0AF28C86C78B5C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_110(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1F0AF28C86C9FEBC10AB56564643036", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "127.0.0.1:7878", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Storage-Access", "active", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br, zstd", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_110 = new DataSub();
	reqAction.addDataSub(subContainer_110);

		ISubRule sub_310 = new SubRule("req_uri", 85, 16, true, (IDCCoreVar)dcVars[81], false, "action", null, 0, false);
	subContainer_110.addSubInstruction(sub_310);
		ISubRule sub_311 = new SubRule("req_hdr_Host_1", 10, 4, false, (IDCCoreVar)vars[1], false, "Host_2", null, 0, false);
	subContainer_110.addSubInstruction(sub_311);
		ISubRule sub_312 = new SubRule("req_hdr_Host_1", 0, 9, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_110.addSubInstruction(sub_312);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1F0AF28C86C51A6C10AB56564643036"), 3);		
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
			"A1F0AF28C86CC6D0C10AB56564643036",
			true,
			false
		);
		
		req.setExpectedResponseCode(500);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(500)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
