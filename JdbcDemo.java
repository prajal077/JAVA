import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/test1";
            String query = "SELECT * FROM employee";
            Connection con = DriverManager.getConnection(url, "root", "");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");

                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Address: "+address);
            }
            st.close();
            con.close();
        } catch ( Exception e) {
            System.out.println("ERROR");
        }
    }
}
