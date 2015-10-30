package raig.org.application;

import raig.org.domain.model.Contact;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class SystemIo {

  int getUserIoOption() throws IOException {
    System.out.println("Should get option");

    String line = readLine();

    if (line == null) {
      throw new IOException("Error getting line");
    }
    int option = Character.getNumericValue(line.charAt(0));
    return option;
  }

  Contact getUserIoContact() throws IOException {
    System.out.println("Name: ");
    String name = readLine();
    System.out.println("Email: ");
    String email = readLine();
    System.out.println("Phone: ");
    String phone = readLine();

    return new Contact(name, email, phone);
  }

  private String readLine() throws IOException {
    String line;
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        System.in));

    line = reader.readLine();
    return line;
  }



}
