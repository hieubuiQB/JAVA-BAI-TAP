import com.mysql.cj.xdevapi.Result;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/ban_sach";
        var user = "root";
        var password ="";
        var sql = "SELECT * FROM dichvu";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println(conn.getCatalog());
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            showInfo(resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void showInfo(ResultSet rs) {
        try {
            while (rs.next()) {
            System.out.println(rs.getInt(1) +"-" + rs.getString(2)
                    + "-" + rs.getString(3) + "-"+ rs.getFloat(4));
        }
        } catch (SQLException throwables) {
        throwables.printStackTrace();
        }
    }
}
