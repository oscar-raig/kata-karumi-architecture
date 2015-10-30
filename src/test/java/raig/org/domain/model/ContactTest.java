package raig.org.domain.model;

import org.junit.Assert;
import org.junit.Test;
import raig.org.domain.model.Contact;

public class ContactTest {



  @Test
  public void createNewContactShouldNotFail() {

    String name = "Oscar";
    String phone = "5353456";
    String email = "oscar.raig@gmail.com";
    Contact contact = new Contact(name, email, phone);
    Assert.assertNotNull(contact);

  }
}
