package com.zohocrm02.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm02.Repositories.BillingRepository;
import com.zohocrm02.enities.Billing;
@Service
public class BillingServicesImpl implements BillingServices {
@Autowired
private BillingRepository billingRepo;
	@Override
	public void saveBill(Billing billing) {
		billingRepo.save(billing);
	}

}
