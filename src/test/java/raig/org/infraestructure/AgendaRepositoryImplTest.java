package raig.org.infraestructure;


import junit.framework.Assert;
import org.junit.Test;
import raig.org.domain.AgendaRepository;
import raig.org.domain.model.Contact;
import raig.org.infraestructure.AgendaRepositoryImpl;

import java.util.List;

public class AgendaRepositoryImplTest {


  @Test
  public void createARepositoryShouldNotFail() {

    AgendaRepository agendaRepository = new AgendaRepositoryImpl();

    Assert.assertNotNull(agendaRepository);

  }

  @Test
  public void createANewContactShouldCreateAListWithTheNewContact() {
    String name = "Oscar";
    String phone = "5353456";
    String email = "oscar.raig@gmail.com";
    Contact contact = new Contact(name, email, phone);

    AgendaRepository agendaRepository = new AgendaRepositoryImpl();
    agendaRepository.add(contact);
    List<Contact> list = agendaRepository.list();

    Assert.assertTrue(list.contains(contact));
  }
}
