package com.zohocrm02.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm02.Services.BillingServices;
import com.zohocrm02.Services.ContactService;
import com.zohocrm02.enities.Billing;
import com.zohocrm02.enities.Contact;


@Controller
public class BillingController {
@Autowired
private ContactService contactServices;
@Autowired
	private BillingServices billngServices;
	@RequestMapping("getcontactId")
	public String getcontactId(@RequestParam("id") int id,ModelMap model) {
		Contact contact = contactServices.getById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	@RequestMapping("generateBill")
	public String generateBill(@ModelAttribute() Billing billing,ModelMap model) {
		billngServices.saveBill(billing);
		model.addAttribute("billing", billing);
		return "view_bill";
	}
}
