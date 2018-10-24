/**
 * 
 */
package com.paypal.amortization;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paypal.amortization.dao.AmortizationScheduleDao;
import com.paypal.amortization.dao.LoanInformationDao;

@RestController
@RequestMapping(value="/paypal")
public class AmortizationController {
	

	AmortizationSchedule amortizationSchedule = new AmortizationScheduleImpl();	
	AmortizationScheduleDao amortizationScheduleDao = new AmortizationScheduleDao();
	@RequestMapping(method = RequestMethod.POST, value = "/v1/amortizationScheduler", produces = { "application/json" })
	public String registerStudentForCourse(
			@RequestBody LoanInformationDao loanInformationDao) {
		String response=null;
		try {
		amortizationScheduleDao=amortizationSchedule.getAmortizationSchedule(loanInformationDao);
		
		ObjectMapper mapper = new ObjectMapper();
		
		response = mapper.writeValueAsString(amortizationScheduleDao);
		System.out.println("Response****"+response ); 
		
		}catch(Exception e) {
			System.out.println("**** Exception******"+e.getMessage());
		}
		if(amortizationScheduleDao!=null)
			return response;
		else
			return "Amortization scheduler failed to get the payment information";
	}
}

