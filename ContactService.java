/**
 * SNHU CS 320 Software Test
 * Jessica Johnson
 * 07/20/2025
 * 
 * Module Three Milestone
 * 
 * The ContactService.java class manages a collection of Contacts
 * Methods to add, delete, and update are defined
 */

/**
 * CS 320 Software Testing and Automation
 * Project One
 * 
 * Jessica Johnson
 * 08/10/2025
 * 
 * ContactService.java
 * Manages a collection of Contact objects.
 * Defines methods to add, delete, and update contacts while checking for duplicates.
 * Works together with Contact.java and is tested by ContactServiceTest.java.
 */

package contactapp;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	// Create HashMap to store contacts using contactId as the key
    private Map<String, Contact> contacts = new HashMap<>();
    
    /**
     * Adds a new contact to the contact list
     * Throws an exception if a contact with the same ID already exists
     * 
     * @param contactId The unique ID for the contact
     * @param firstName First name of the contact
     * @param lastName  Last name of the contact
     * @param phone     Phone number (10 digits)
     * @param address   Address (max 30 characters)
     */

    public void addContact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID already exists.");
        }
        Contact contact = new Contact(contactId, firstName, lastName, phone, address);
        contacts.put(contactId, contact);
    }

    /**
     * Deletes the contact with the specified ID from the collection.
     *
     * @param contactId ID of the contact to be deleted
     */
    
    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    /**
     * Updates the first name of the contact with the given ID.
     *
     * @param contactId ID of the contact to update
     * @param firstName New first name
     */
    
    public void updateFirstName(String contactId, String firstName) {
        if (contacts.containsKey(contactId)) {
            contacts.get(contactId).setFirstName(firstName);
        }
    }

    /**
     * Updates the last name of the contact with the given ID.
     *
     * @param contactId ID of the contact to update
     * @param lastName  New last name
     */
    
    public void updateLastName(String contactId, String lastName) {
        if (contacts.containsKey(contactId)) {
            contacts.get(contactId).setLastName(lastName);
        }
    }

    /**
     * Updates the phone number of the contact with the given ID.
     *
     * @param contactId ID of the contact to update
     * @param phone     New phone number (must be 10 digits)
     */
    
    public void updatePhone(String contactId, String phone) {
        if (contacts.containsKey(contactId)) {
            contacts.get(contactId).setPhone(phone);
        }
    }
    
    /**
     * Updates the address of the contact with the given ID.
     *
     * @param contactId ID of the contact to update
     * @param address   New address (max 30 characters)
     */

    public void updateAddress(String contactId, String address) {
        if (contacts.containsKey(contactId)) {
            contacts.get(contactId).setAddress(address);
        }
    }

    /**
     * Optional method to retrieve a contact by ID
     * For Testing
     * 
     * @param contactId of the contact to retrieve
     * @return Contact object or null if not found
     */
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
