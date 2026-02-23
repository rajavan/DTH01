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
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.core.impl.TestDataFileReader;
import com.ibm.rational.test.lt.execution.ws.container.ExecResourceResolver;
import com.ibm.rational.test.lt.execution.ws.container.ExecVTinfoAcces;
import com.ibm.rational.test.lt.execution.ws.container.WSFinish;
import com.ibm.rational.test.lt.execution.ws.container.WSLogWsdlStore;
import com.ibm.rational.test.lt.execution.ws.container.WebServiceCertificates;
import com.ibm.rational.test.lt.execution.ws.container.WebServicesCallbackInit;
import com.ibm.rational.test.lt.execution.ws.container.WebServicesMessage;
import com.ibm.rational.test.lt.execution.ws.container.WebServicesThinkTime;
import com.ibm.rational.test.lt.execution.ws.log.ExecutionLog;
import com.ibm.rational.test.lt.execution.ws.log.ModelLogDelegate;
import com.ibm.rational.test.lt.execution.ws.log.WsExecutionMessages;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import com.ibm.rational.test.lt.models.ws.LoggingUtil;
import com.ibm.rational.test.lt.models.wscore.datamodel.adaptation.util.ResourceProxyResolverAccess;
import com.ibm.rational.test.lt.models.wscore.datamodel.configuration.RPTWebServiceConfiguration;
import com.ibm.rational.test.lt.models.wscore.datamodel.configuration.WSDLStore;
import com.ibm.rational.test.lt.models.wscore.datamodel.message.MessagePackage;
import com.ibm.rational.test.lt.models.wscore.datamodel.message.Request;
import com.ibm.rational.test.lt.models.wscore.transport.common.impl.VWebServiceMessageInformationExtractorAccess;
import com.ibm.rational.test.lt.models.wscore.utils.util.EmfUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;

@SuppressWarnings("all")
public class ServiceTest3_Test_A1EF087456CABB10E348B23938333530 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesTextVPAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesTextVP");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesPropertiesVPAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesPropertiesVP");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesDocumentEqualsVPAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesDocumentEqualsVP");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesXpathVPAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesXpathVP");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesAttachmentVPAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesAttachmentVP");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesDocumentContainsVPAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesDocumentContainsVP");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServiceCertificatesProtoMessageAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServiceCertificates");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesCallbackAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesCallback");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesMessageAnswerAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesMessageAnswer");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServiceCertificatesProtoMessageAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServiceCertificates");
pa.addPA("com.ibm.rational.test.lt.execution.ws.container.WebServicesMessageAdapter", "com.ibm.rational.test.lt.execution.ws.container.WebServicesMessage");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
        static RPTWebServiceConfiguration configuration;
    static WSDLStore wsdlStore;
    static 
    {
    	try 
	   	{
	   		//Emf model initalization for standalone application
        	ExecResourceResolver.initPackages();
        	/*Please comment out the code up to the next comment in case of empty Test suites.
        	 * 
        	 */
        	ExecResourceResolver.extractWSResources("A1EF087456CABB10E348B23938333530");
        		//byte[] dataBuf_1 = null;
	String configurationData_1 = TestDataFileReader.readTestDataFileEntry(
	                                   "A1EF087456CABB10E348B23938333530.testdata",
	                                   "configuration");
	                                   
    		configuration=(RPTWebServiceConfiguration)EmfUtils.deserializeEObject(configurationData_1);
    		configuration.getProtocolConfigurations().hashMapAllTheValuesForRun(true);
    			//byte[] dataBuf_2 = null;
	String wsdStoreData_1 = TestDataFileReader.readTestDataFileEntry(
	                                   "A1EF087456CABB10E348B23938333530.testdata",
	                                   "wsdlStore");
	                                   
    		wsdlStore=(WSDLStore)EmfUtils.deserializeEObject(wsdStoreData_1);
    		wsdlStore.hashMapAllTheValuesForRun(true);    
    		/*End of portion of code to be commented out.
    		 * 
    		 */		
    		ResourceProxyResolverAccess.setIresourceResolverForContext(ExecResourceResolver.getInstance());
    		VWebServiceMessageInformationExtractorAccess.setVTInformationExtractorAccess(ExecVTinfoAcces.INSTANCE);
    	}
    	catch (Throwable e)
    	{
    		ExecutionLog.log(WsExecutionMessages.INSTANCE,"RPWD0001E_EXECUTION_EXCEPTION",e); //$NON-NLS-1$
    	}
    }

	
	public ServiceTest3_Test_A1EF087456CABB10E348B23938333530(IContainer container, String invocationId) {
		super(container, "ServiceTest3", invocationId, "A1EF087456CABB10E348B23938333530", "/ServiceTestProject/ServiceTest3.testsuite", "C:/Users/rajesh-a/HCL/devopstest/workspace_DevOps_Deploy/ServiceTestProject/ServiceTest3.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
			    LoggingUtil.INSTANCE.setDelegate(ModelLogDelegate.INSTANCE);

	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
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
		add(new WebServicesThinkTime(this, 0));
		add(wsTransaction_1(this));
			add(new WSFinish(this));
add(new WSLogWsdlStore(this,wsdlStore));

	    } catch (Throwable e) {
		     log("Test Execution: ServiceTest3_Test_A1EF087456CABB10E348B23938333530 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		stopRequested = true;

		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EF087456CB0943E348B23938333530");	
			vars[0] = new DataVar("Host:Port_webservices.oorsprong.org", "webservices.oorsprong.org", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
  
    private IContainer wsTransaction_1(IContainer parent) {		
    	WebServicesCallbackInit cbInit2 = null;		
        
    	
    	String[] queueIDs = new String[] {};
    	int[] queueIDsIndices = new int[] {};
    	boolean[] xmlQueues = new boolean[] {};
    			
    	WebServicesMessage wsMessage = new WebServicesMessage(parent,"A1EF087456CABB10E348B23938333530","A1EF087456CF9D10E348B23938333530",
    			"\u004c\u0069\u0073\u0074\u004f\u0066\u0043\u006f\u006e\u0074\u0069\u006e\u0065\u006e\u0074\u0073\u0042\u0079\u004e\u0061\u006d\u0065\u0028\u0020\u0020\u0029", 
    			(Request)ExecResourceResolver.messageMap().get("A1EF087456CABB10E348B23938333530message1"), 
    			configuration, 
    			wsdlStore, 
    			false, 
    			false,
    			false,
    			"", 
    			queueIDs, 
    			xmlQueues);
    			
    	int idx = 0;
    
    

	    return cbInit2 == null ? wsMessage : cbInit2 ;
    }
}
