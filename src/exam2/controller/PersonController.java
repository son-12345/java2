package exam2.controller;

import exam2.entity.Person;
import exam2.model.PersonDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class PersonController {
    PersonDAO personDAO = new PersonDAO();

    public PersonController() throws SQLException {
    }
    public ArrayList<Person> getALLProductController(String productName) throws SQLException{
        return personDAO.getAllPersons();
    }
    public void createProductController(Person product) throws SQLException{
        personDAO.createPerson(product);
    }
    public Person findPersonByName(String personName) throws SQLException {
        return personDAO.getProductByName(Integer.parseInt(personName));

    }
}
