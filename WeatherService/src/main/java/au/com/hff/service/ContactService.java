package au.com.hff.service;

import java.util.List;

import au.com.hff.form.Contact;


public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
