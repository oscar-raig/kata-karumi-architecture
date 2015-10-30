package raig.org.infraestructure;

import raig.org.domain.AgendaRepository;
import raig.org.domain.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class AgendaRepositoryImpl implements AgendaRepository{

  List<Contact> list;

  public  AgendaRepositoryImpl() {
    list = new ArrayList<>();
  }

  @Override
  public List<Contact> list() {
    return list;
  }

  @Override
  public void add(Contact contact) {
    list.add(contact);
  }
}
