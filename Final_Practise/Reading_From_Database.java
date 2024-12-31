package Final_Practise;

import java.sql.*;

public class Reading_From_Database {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            String sql = "SELECT customer_id, customer_name, customer_address FROM customer";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String address = resultSet.getString("customer_address");

                System.out.println("id: "+id);
                System.out.println("name: "+name);
                System.out.println("address: "+address);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }

                if (resultSet != null) {
                    resultSet.close();
                }
            }catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
