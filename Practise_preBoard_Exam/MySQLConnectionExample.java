package Practise_preBoard_Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // URL of the database
        String user = "root"; // MySQL username
        String password = "root"; // MySQL password

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establishing the connection
            connection = DriverManager.getConnection(url, user, password);

            // SQL query to insert data into the customer table
            String sql = "INSERT INTO customer (customer_id, customer_name, customer_address) VALUES (?, ?, ?)";

            preparedStatement = connection.prepareStatement(sql);
            // Inserting first record
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "John Doe");
            preparedStatement.setString(3, "123 Main St");

            // Execute the insert operation
            preparedStatement.executeUpdate();

            System.out.println("Record inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
