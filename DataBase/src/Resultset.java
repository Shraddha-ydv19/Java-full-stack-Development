import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Resultset {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "Shraddha@19"
            );

            // ✅ Create table
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Student(" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(20), age INT)";
            stmt.execute(sql);

            // ✅ Insert using PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(
                "Select *from Student"
            );

          

         ResultSet rs= pstmt.executeQuery();
         while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            System.out.println("id: " + id + ", name: " + name);
         }

            System.out.println("Data Retrieved ✅");

            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}