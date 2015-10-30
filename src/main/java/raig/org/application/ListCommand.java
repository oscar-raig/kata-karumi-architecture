package raig.org.application;

import raig.org.domain.model.Agenda;
import raig.org.domain.model.Contact;

import java.util.List;

public class ListCommand implements CommandInterface {

  private final Agenda agenda;
  private final Application application;

  public ListCommand(Agenda agenda, Application application) {
    this.agenda = agenda;
    this.application = application;
  }

  @Override
  public void execute() {
    List<Contact> list = this.agenda.list();
    System.out.println(list);
    application.printAgenda(list);
  }

}
