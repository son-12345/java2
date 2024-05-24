package exam2.view;

import exam2.controller.PersonController;
import exam2.entity.Person;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PersonView {
    Scanner sc = new Scanner(System.in);
    PersonController personController = new PersonController();

    public PersonView() throws SQLException {
    }

    public void createPersonUi() throws SQLException {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Company: ");
        String company = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Phone Number: ");
        String phone_number = sc.nextLine();

        Person person = new Person(id, name, company, email, phone_number);
        personController.createPersonController(person);  // Đổi tên phương thức gọi
    }

    public void getAllPersons() throws SQLException {
        List<Person> allPersons = personController.getAllPersonsController();  // Đổi tên biến cho rõ ràng
        allPersons.forEach(person -> {
            System.out.println("=== Person Information ===");
            System.out.println("ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Company: " + person.getCompany());
            System.out.println("Email: " + person.getEmail());
            System.out.println("Phone: " + person.getPhone());
        });
    }

    public void getPersonByIdName() throws SQLException {
        System.out.println("=== Person Information by Name ===");
        System.out.print("Enter name to search: ");
        String personName = sc.nextLine();

        try {
            Person person = personController.findPersonByName(personName);  // Đổi tên biến cho rõ ràng
            if (person != null) {
                System.out.println("ID: " + person.getId());
                System.out.println("Name: " + person.getName());
                System.out.println("Company: " + person.getCompany());
                System.out.println("Email: " + person.getEmail());
                System.out.println("Phone: " + person.getPhone());
            } else {
                System.out.println("Person not found with name: " + personName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
