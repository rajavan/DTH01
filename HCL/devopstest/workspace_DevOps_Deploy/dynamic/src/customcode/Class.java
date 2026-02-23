package customcode;

import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.util.DataVarUtil;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class Class implements
		com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Class() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		
		IDCArray dcArray = DataVarUtil.getVar(tes, "myarray",  ITestExecutionServices.STORAGE_LOCAL);
			dcArray.init();
		for (int i = 0; i < dcArray.size(); i++) {
			tes.getTestLogManager().reportMessage("i=" + i + " -> " + dcArray.getValue());
		}
		
		//dcArray.add("/random.nothere");
		
		return null;
	}

}
