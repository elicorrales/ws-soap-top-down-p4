
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.eli.calc.shape.service.ws.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Generated;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.eli.calc.shape.service.ShapeCalculatorService;
import com.eli.calc.shape.service.ws.ShapeCalculatorWebService;
import com.eli.calc.shape.service.ws.resp.RunPendingRequestsResponse;
import com.eli.calc.shape.service.ws.resp.StatusCode;
import com.eli.calc.shape.service.ws.resp.StatusResponse;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-21T13:21:57.958-04:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "ShapeCalculatorWebService",
                      portName = "ShapeCalculatorWebService",
                      targetNamespace = "http://ws.service.shape.calc.eli.com/",
                      wsdlLocation = "classpath:wsdl/ShapeCalcWebService.wsdl",
                      endpointInterface = "com.eli.calc.shape.service.ws.ShapeCalculatorWebService")
                      
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T13:21:57.958-04:00", comments = "Apache CXF 3.1.7")
public class ShapeCalculatorWebServiceImpl implements ShapeCalculatorWebService {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T13:21:57.958-04:00")
    private static final Logger LOG = LoggerFactory.getLogger(ShapeCalculatorWebServiceImpl.class);

	@Autowired
	private ShapeCalculatorService calculator;
	
    /* (non-Javadoc)
     * @see com.eli.calc.shape.service.ws.ShapeCalculatorWebService#runAllPendingRequestsNoStopOnError()*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T13:21:57.958-04:00")
    public RunPendingRequestsResponse runAllPendingRequestsNoStopOnError() { 
        LOG.debug("\n\n\nExecuting operation runAllPendingRequestsNoStopOnError\n\n\n");
        RunPendingRequestsResponse _return = new RunPendingRequestsResponse();
		StatusResponse status = new StatusResponse();

        try {

			int numRun = calculator.runAllPendingRequestsNoStopOnError();

			LOG.debug("\n\n\noperation runAllPendingRequestsNoStopOnError returning "+numRun+"\n\n\n");
			status.setStatus(StatusCode.SUCCESS);
			status.setDescription("Ran Any Pending Requests: " + numRun);
			_return.setStatusResponse(status);
			_return.setNumRun(numRun);
			
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
			LOG.debug("\n\n\noperation runAllPendingRequestsNoStopOnError threw an exception..\n\n\n");
			status.setStatus(StatusCode.ERROR);
			status.setClazz(ex.getClass().getName());
			status.setDescription("Error attempting to Run Pending Requests");
			status.setErrMsg(ex.getMessage());
			if(ex.getCause()!=null) status.setCauseMsg(ex.getCause().getMessage());
			_return.setStatusResponse(status);
        }
		return _return;
    }

}
