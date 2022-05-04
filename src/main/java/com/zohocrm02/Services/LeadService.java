package com.zohocrm02.Services;

import java.util.List;

import com.zohocrm02.enities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public List<Lead> getALL();

public Lead getById(int id);

public void deleteLead(int id);
}
