package com.zohocrm02.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm02.enities.Billing;
@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer> {

}
