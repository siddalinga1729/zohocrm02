package com.zohocrm02.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm02.Services.ContactService;
import com.zohocrm02.Services.LeadService;
import com.zohocrm02.enities.Contact;
import com.zohocrm02.enities.Lead;

@Controller
public class ContactController {
@Autowired
private LeadService leadServices;
@Autowired
private ContactService contactServices;
	@RequestMapping("convert")
	public String convertLead(@RequestParam("id") int id,ModelMap model) {
		Lead lead = leadServices.getById(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadsource(lead.getLeadsource());
		contact.setMobileNumber(lead.getMobileNumber());
		contactServices.saveContact(contact);
		leadServices.deleteLead(id);
		List<Contact> contacts = contactServices.getALL();
		model.addAttribute("contacts", contacts);
		return "All_contacts";
	}
	@RequestMapping("leadsContacts")
	public String allContacts(ModelMap model) {
		List<Contact> contacts = contactServices.getALL();
		model.addAttribute("contacts", contacts);
		return "All_contacts";
	}
}
