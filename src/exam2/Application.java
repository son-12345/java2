package exam2;

import exam2.ui.Menu;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.start();
    }
}
