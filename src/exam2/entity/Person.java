package exam2.entity;

public class Person {
    private int id;
    private String name;
    private String company;
    private String email;
    private String phone;

    public Person( int id, String name, String company, String email, String phone) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//
//    @Override
//    public String toString() {
//        return "Id: " + id + "Name: " + name + ", Company: " + company + ", Email: " + email + ", Phone: " + phone;
//    }
}
