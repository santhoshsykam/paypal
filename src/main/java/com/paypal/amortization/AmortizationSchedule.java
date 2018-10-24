/**
 * 
 */
package com.paypal.amortization;

import com.paypal.amortization.dao.AmortizationScheduleDao;
import com.paypal.amortization.dao.LoanInformationDao;

/**
 * Interface for Amortization schedule API
 * @author santhosh
 *
 */

/**
 * This is the Amortization API contract which will be exposed to any client using this API to calculate Amortization
 * schedule.
 * 
 * @param loan
 * @return AmortizationScheduleDao
 * @throws IllegalArgumentException 
 *
 */

public interface AmortizationSchedule {
	
	public AmortizationScheduleDao getAmortizationSchedule(LoanInformationDao loanInformation) throws IllegalArgumentException;	

}