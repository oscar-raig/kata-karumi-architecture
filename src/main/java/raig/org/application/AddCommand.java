package raig.org.application;

import raig.org.domain.model.Agenda;
import raig.org.domain.model.Contact;

import java.io.IOException;

public class AddCommand implements CommandInterface {

  private final Agenda agenda;
  private final Application application;

  public AddCommand(Agenda agenda, Application application) {
    this.agenda = agenda;
    this.application = application;
  }

  @Override
  public void execute() {
    Contact contact = null;
    try {
      contact = application.getContact();
    } catch (IOException e) {
      e.printStackTrace();
    }
    this.agenda.add(contact);
  }
}
