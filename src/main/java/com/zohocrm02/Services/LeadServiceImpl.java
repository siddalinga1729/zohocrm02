package com.zohocrm02.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm02.Repositories.LeadRepository;
import com.zohocrm02.enities.Lead;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;//downcasting is happen

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> getALL() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getById(int id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLead(int id) {
		leadRepo.deleteById(id);
	}

}
