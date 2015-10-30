package raig.org.application;

import raig.org.domain.model.Agenda;
import raig.org.domain.model.Contact;

import java.io.IOException;
import java.util.List;


public class Application {

  private int option;
  private CommandInterface addCommand;
  private CommandInterface listCommand;
  private SystemIo systemIo;

  public static final int option_end = 3;
  public static final int option_undefined = 0;
  public static final int option_add = 1;
  public static final int option_list = 2;

  public Application(SystemIo systemIo, Agenda agenda) {
    this.systemIo = systemIo;
    option = option_undefined;
    addCommand = new AddCommand(agenda,this);
    listCommand = new ListCommand(agenda,this);
  }

  public void run() {
    System.out.println("Running");
    while ( !isEnd()) {

      try {
        getUserOption();
      } catch (IOException e) {
        e.printStackTrace();
      }
      executeOption();

    }
    System.out.println("We are out of the app");
  }

  private boolean isEnd() {

    return getOption() == option_end;

  }

  public void getUserOption() throws IOException {

    printOptions();
    option = systemIo.getUserIoOption();
    System.out.println("Getting user Option:" + option);
  }

  private void printOptions() {
    System.out.println("1. Add User");
    System.out.println("2. List Users");
    System.out.println("3. Exit");
  }

  public int getOption() {
    return option;
  }


  public void executeOption() {

    switch (option) {
      case option_add:
        addCommand.execute();
        break;
      case option_list:
        listCommand.execute();
        break;
      default:
        System.out.println("Default option selected");
        break;
    }
  }



  Contact getContact() throws IOException {
    return systemIo.getUserIoContact();
  }

  public void setOption(int option) {
    this.option = option;
  }

  public void printAgenda(List<Contact> list) {
    for (Contact contact : list ) {
      System.out.println("Name : " + contact.getName());
      System.out.println("Email : " + contact.getEmail());
      System.out.println("Phone : " + contact.getPhone());
    }

  }

}
