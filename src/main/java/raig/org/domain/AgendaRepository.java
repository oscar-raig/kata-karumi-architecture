package raig.org.domain;

import raig.org.domain.model.Contact;

import java.util.List;

public interface AgendaRepository {

  List<Contact> list();

  void add(Contact contact);

}
