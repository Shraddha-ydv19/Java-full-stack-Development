import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepareddStatement {
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
                "INSERT INTO Student(name, age) VALUES(?, ?)"
            );

            pstmt.setString(1, "Shraddha");
            pstmt.setInt(2, 22);

            pstmt.executeUpdate();

            System.out.println("Data Inserted ✅");

            con.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}