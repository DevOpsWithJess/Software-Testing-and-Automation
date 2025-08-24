/**
 * SNHU CS 320 Software Test
 * Jessica Johnson
 * 07/20/2025
 * 
 * Module Three Milestone
 * 
 * The ContactServiceTest.java class tests the functionality of ContactService class
 * It ensures that contact creation, deletion, and updates behave correctly to fields
 * such as first name, last name, phone, address.
 */

/**
 * CS 320 Software Testing and Automation
 * Project One
 * 
 * Jessica Johnson
 * 08/10/2025
 * 
 * ContactServiceTest.java
 * JUnit 5 tests for ContactService.java.
 * Checks that adding, deleting, and updating contacts works properly and invalid actions throw exceptions.
 */


package contactapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService contactService;

    /**
     * Sets up a new instance of ContactService before each test
     * to ensure a clean state.
     */
    
    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContactSuccessfully() {
        contactService.addContact("001", "Jane", "Doe", "1234567890", "123 Main St");
        Contact contact = contactService.getContact("001");
        assertNotNull(contact);
        assertEquals("Jane", contact.getFirstName());
    }

    @Test
    public void testAddContactWithDuplicateIdThrowsException() {
        contactService.addContact("002", "Tom", "Smith", "0987654321", "456 Oak St");
        assertThrows(IllegalArgumentException.class, () -> {
            contactService.addContact("002", "Another", "User", "1111111111", "789 Elm St");
        });
    }

    @Test
    public void testDeleteContactSuccessfully() {
        contactService.addContact("003", "Amy", "Wong", "1231231234", "101 Pine St");
        contactService.deleteContact("003");
        assertNull(contactService.getContact("003"));
    }

    @Test
    public void testDeleteNonexistentContactDoesNothing() {
        assertDoesNotThrow(() -> {
            contactService.deleteContact("nonexistent");
        });
    }

    @Test
    public void testUpdateFirstNameSuccessfully() {
        contactService.addContact("004", "John", "Doe", "1112223333", "200 Cedar Rd");
        contactService.updateFirstName("004", "Johnny");
        assertEquals("Johnny", contactService.getContact("004").getFirstName());
    }

    @Test
    public void testUpdateLastNameSuccessfully() {
        contactService.addContact("005", "Anna", "Lee", "9998887777", "300 Birch Blvd");
        contactService.updateLastName("005", "Smith");
        assertEquals("Smith", contactService.getContact("005").getLastName());
    }

    @Test
    public void testUpdatePhoneSuccessfully() {
        contactService.addContact("006", "Dave", "Brown", "4445556666", "400 Oak Dr");
        contactService.updatePhone("006", "1234567890");
        assertEquals("1234567890", contactService.getContact("006").getPhone());
    }

    @Test
    public void testUpdateAddressSuccessfully() {
        contactService.addContact("007", "Laura", "Green", "7776665555", "500 Willow Ln");
        contactService.updateAddress("007", "600 Maple St");
        assertEquals("600 Maple St", contactService.getContact("007").getAddress());
    }

    @Test
    public void testUpdateInvalidContactIdDoesNothing() {
        assertDoesNotThrow(() -> {
            contactService.updateFirstName("doesnotexist", "Name");
        });
    }
}
