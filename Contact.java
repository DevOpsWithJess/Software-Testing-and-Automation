/**
 * SNHU CS 320 Software Test
 * Jessica Johnson
 * 07/20/2025
 * 
 * Module Three Milestone
 * 
 * The Contact.java class represents a "contact" and their basic information.
 */

/**
 * CS 320 Software Testing and Automation
 * Project One
 * 
 * Jessica Johnson
 * 08/10/2025
 * 
 * Contact.java
 * This class holds the basic contact details (ID, first/last name, phone, address).
 * Includes validation in the constructor and setters to make sure data is valid.
 * Used by ContactService to store and update contact information.
 */


package contactapp;

public class Contact {

	// Fields
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// Constructor that includes validation
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("The contactId must not be null and max of 10 characters.");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("The first name must not be null and max of 10 characters.");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("The last name must not be null and max of 10 characters.");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Phone number must be exactly 10 digits and not null.");
		}
		if (address == null || address .length() > 30) {
			throw new IllegalArgumentException("Address must not be null and max of 30 characters.");
		}
		
		// Assign values to each field
		this.contactId = contactId;
		
        this.firstName = firstName;
        
        this.lastName = lastName;
        
        this.phone = phone;
        
        this.address = address;
	}
	
	// Getters to retrieve field values
	public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    // Setters that includes validation
    // Notice contactId is not here because its final and not changeable
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must not be null and max 10 characters.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must not be null and max 10 characters.");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits and not null.");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and max 30 characters.");
        }
        this.address = address;
    }
}
