package raig.org;

import raig.org.application.Application;
import raig.org.application.SystemIo;
import raig.org.domain.AgendaRepository;
import raig.org.domain.model.Agenda;
import raig.org.infraestructure.AgendaRepositoryImpl;


public class KataArchitecuture {


  public static void main(String[] args) {

    System.out.print("Let's go running");
    SystemIo systemIo = new SystemIo();
    AgendaRepository agendaRepository = new AgendaRepositoryImpl();
    Agenda agenda = new Agenda(agendaRepository);
    Application application = new Application(systemIo,agenda);

    application.run();
  }
}
