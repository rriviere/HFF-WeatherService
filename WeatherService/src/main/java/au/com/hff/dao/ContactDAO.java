package au.com.hff.dao;

import java.util.List;

import au.com.hff.form.Contact;


public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
