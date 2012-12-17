package au.com.hff.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.com.hff.form.Contact;
import au.com.hff.form.WeatherArea;
import au.com.hff.service.WeatherAreaManager;
import au.com.hff.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private WeatherAreaManager areaManager;

	@RequestMapping("/index")
	public String listContacts(Map<String, Object> map) {

		map.put("contact", new Contact());
		map.put("contactList", contactService.listContact());
		
		List<WeatherArea> areas = areaManager.getWeatherAreas();
		map.put("area", new WeatherArea());
		map.put("areaList", areas);
		
	    /*for (WeatherArea area: areas ) {
	    	WeatherArea s = area;
	    	System.err.println("\n\n\n\n" + s.getAac());
	    }*/	
		return "contact";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
	Contact contact, BindingResult result) {

		contactService.addContact(contact);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId")
	Integer contactId) {

		contactService.removeContact(contactId);

		return "redirect:/index";
	}
}
