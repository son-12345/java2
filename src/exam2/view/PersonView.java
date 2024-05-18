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

        Person persons = new Person(id, name, company, email, phone_number);
        personController.createProductController(persons);
    }

    public void getAllPersons() throws SQLException {
        List<Person> allProducts = personController.getALLProductController(productName);
        allProducts.forEach(person -> {
            System.out.println("===Product Information===");
            System.out.println(person.getId());
            System.out.println(person.getName());
            System.out.println(person.getCompany());
            System.out.println(person.getEmail());
            System.out.println(person.getPhone());
        });
    }
    public void getPersonByIdName() throws SQLException {
        PersonController productbyname = new PersonController();
        System.out.println("=== Product Contact by Id ===");
        System.out.print("Enter id to search: ");
        String productName = sc.nextLine();

        try {
            productbyname.getALLProductController(productName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
