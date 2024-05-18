package exam2.ui;



import exam2.view.PersonView;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    PersonView personView = new PersonView();

    public Menu() throws SQLException {
    }

    public int menu(){
        System.out.println("===Data Management===");
        System.out.println("1. Create");
        System.out.println("2. Find by Name");
        System.out.println("3. Get All Person");
        System.out.println("0. Exit");
        System.out.println("Your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public boolean start() throws SQLException {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    personView.createPersonUi();
                    break;
                case 2:
                    personView.getPersonByIdName();
                    break;
                case 3:

                    personView.getAllPersons();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}

