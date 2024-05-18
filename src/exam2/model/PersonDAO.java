package exam2.model;

import exam2.dao.DBConnection;
import exam2.entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAO {
    private final Connection connection = DBConnection.getDBConnection();
    private final String SQL_CREATE_PRODUCT = "insert into persons values(?,?,?,?,?)";
    private  final String SQL_GET_PRODUCT_BY_NAME = "select * from persons where contact_name =?";
    private  final  String SQL_GET_ALL_PRODUCTS =" select * from persons ";
    public PersonDAO() throws SQLException {
    }
    public void createPerson(Person person) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1,person.getId());
        pstm.setString(2,person.getName());
        pstm.setString(3,person.getCompany());
        pstm.setString(3,person.getEmail());
        pstm.setString(4,person.getPhone());
        pstm.executeUpdate();
        System.out.println("Insert success");
    }


    public ArrayList<Person> getAllPersons() throws SQLException {
        ArrayList<Person> allPersons = new ArrayList<>();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_ALL_PRODUCTS);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String contactName = rs.getString("contact_name");
            String company = rs.getString("company");
            String email = rs.getString("email");
            String phoneNumber = rs.getString("phone_number");
            Person person = new Person(id, contactName, company, email, phoneNumber);
            allPersons.add(person);
        }
        return allPersons;
    }

    public Person getProductByName(int personContactName) {
        try {
            PreparedStatement pstm = connection.prepareStatement(SQL_GET_PRODUCT_BY_NAME);
            pstm.setInt(1, personContactName);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String contactName = rs.getString("contact_name");
                String company = rs.getString("company");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");
                return new Person(id, contactName, company, email, phoneNumber);
            }
        } catch (SQLException e) {
            e.printStackTrace(); //
        }
        return null;
    }
}

