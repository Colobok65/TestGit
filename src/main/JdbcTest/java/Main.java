import ru.schur.jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.210:5432/testdb" ,"postgres", "01470147");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users;");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstname"));
                user.setLastName(rs.getString("lastname"));
                user.setAge(rs.getInt("age"));
                users.add(user);
                System.out.println(user.getId());
                System.out.println(user.getFirstName());
                System.out.println(user.getLastName());
                System.out.println(user.getAge());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
