package raig.org.domain.model;

import raig.org.domain.AgendaRepository;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

  AgendaRepository agendaRepository;

  public  Agenda(AgendaRepository agendaRepository) {
    this.agendaRepository = agendaRepository;
  }

  public void add(Contact contact ) {
    agendaRepository.add(contact);
  }

  public List<Contact> list() {
    return agendaRepository.list();
  }


}
