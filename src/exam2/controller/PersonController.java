package exam2.controller;

import exam2.entity.Person;
import exam2.model.PersonDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class PersonController {
    PersonDAO personDAO = new PersonDAO();

    public PersonController() throws SQLException {
    }

    public ArrayList<Person> getAllPersonsController() throws SQLException {
        return personDAO.getAllPersons();
    }

    public void createPersonController(Person person) throws SQLException { // Đổi tên tham số thành person
        personDAO.createPerson(person);
    }

    public Person findPersonByName(String personContactName) throws SQLException {
        return personDAO.getPersontByName(personContactName);
    }
}
