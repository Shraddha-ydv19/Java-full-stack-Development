

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // 🔥 important
         // create connection......
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "Shraddha@19"
                Connection con=DriverManager.getConnection(url,user,password);
            );
    Statement stmt = con.createStatement();
    String sql="Create table if not exists student(id int primary key auto_increment,name varchar(20),age int)";
    stmt.execute(sql);
    String queries="insert into student(name,age) values('Shraddha',22)";
    stmt.executeUpdate(queries);
           // System.out.println("Connected Successfully ✅");
    con.close();
    System.out.println("Connected Successfully ✅");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}