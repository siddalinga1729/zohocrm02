package com.zohocrm02.Services;

import org.springframework.stereotype.Service;

import com.zohocrm02.enities.Billing;

@Service
public interface BillingServices {
public void saveBill(Billing billing);
}
