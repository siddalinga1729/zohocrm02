package com.zohocrm02.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm02.Services.LeadService;
import com.zohocrm02.enities.Lead;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;

	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute() Lead lead,Model model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "view_page";
	}
	@RequestMapping("listAllLeads")
	public String getAll(ModelMap model) {
		List<Lead> leads = leadService.getALL();
		model.addAttribute("leads", leads);
		return "ListAll_Leads";
	}
	@RequestMapping("getById")
		public String getById(@RequestParam("id")int id,ModelMap model)	{
		Lead lead =leadService.getById(id);
		model.addAttribute("lead", lead);
		return "view_page";
	}
	
}
