package raig.org.domain.model;

public class Contact {
  String name;

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  String email;

  public String getPhone() {
    return phone;
  }

  String phone;

  public Contact( String name, String email, String phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;

  }
}
