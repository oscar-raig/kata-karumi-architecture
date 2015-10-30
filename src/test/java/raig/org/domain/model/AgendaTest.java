package raig.org.domain.model;

import junit.framework.Assert;
import org.junit.Test;
import raig.org.domain.AgendaRepository;
import raig.org.domain.model.Agenda;
import raig.org.domain.model.Contact;
import raig.org.infraestructure.AgendaRepositoryImpl;

public class AgendaTest {


  @Test
  public void createAgendaShouldNotfail() {

    Agenda agenda = new Agenda(null);
    Assert.assertNotNull(agenda);
  }

  @Test
  public void addContactOfNotExistentUserShouldNotFail() {

    AgendaRepository agendaRepository = new AgendaRepositoryImpl();
    Agenda agenda = new Agenda(agendaRepository);
    String name = "Oscar";
    String phone = "5353456";
    String email = "oscar.raig@gmail.com";
    Contact contact = new Contact(name, email, phone);

    agenda.add(contact);

  }
}
