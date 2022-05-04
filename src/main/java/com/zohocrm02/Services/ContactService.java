package com.zohocrm02.Services;

import java.util.List;

import com.zohocrm02.enities.Contact;

public interface ContactService {
	public void saveContact(Contact lead);

	public List<Contact> getALL();

	public Contact getById(int id);
}
