/**
 * SNHU CS 320 Software Test
 * Jessica Johnson
 * 07/20/2025
 * 
 * Module Three Milestone
 * 
 * The ContactTest.java class tests the behavior of the Contact class.
 * This includes verifying successful object creation, proper validation
 * of inputs, correct functioning of setters, and that exceptions are thrown
 * for invalid inputs.
 */

/**
 * CS 320 Software Testing and Automation
 * Project One
 * 
 * Jessica Johnson
 * 08/10/2025
 * 
 * ContactTest.java
 * JUnit 5 tests for Contact.java.
 * Makes sure contacts are created correctly, validation parameters work, and setters update data as expected.
 */

package contactapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("001", "Jane", "Doe", "1234567890", "123 Main St");
        assertEquals("001", contact.getContactId());
        assertEquals("Jane", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testSettersWorkCorrectly() {
        Contact contact = new Contact("002", "Tom", "Smith", "0987654321", "456 Oak St");

        contact.setFirstName("Amy");
        assertEquals("Amy", contact.getFirstName());

        contact.setLastName("Johnson");
        assertEquals("Johnson", contact.getLastName());

        contact.setPhone("1122334455");
        assertEquals("1122334455", contact.getPhone());

        contact.setAddress("789 Maple Ave");
        assertEquals("789 Maple Ave", contact.getAddress());
    }

    @Test
    public void testInvalidContactIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Street");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Street");
        });
    }

    @Test
    public void testInvalidFirstNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("003", null, "Doe", "1234567890", "123 Street");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("003", "FirstnameTooLong", "Doe", "1234567890", "123 Street");
        });
    }
    
    @Test
    public void testInvalidLastNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("001", "Jane", "LastnameTooLong", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testInvalidPhoneThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("004", "Alice", "Smith", null, "456 Road");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("004", "Alice", "Smith", "12345", "456 Road");
        });
    }

    @Test
    public void testInvalidAddressThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("005", "Bob", "Lee", "1234567890", null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("005", "Bob", "Lee", "1234567890", "AddressThatIsWayTooLongToBeAcceptedByValidationLogic");
        });
    }

    @Test
    public void testSettersWithInvalidValuesThrowException() {
        Contact contact = new Contact("006", "Ann", "Lee", "1234567890", "222 River Rd");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("short");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress(null);
        });
    }
}
