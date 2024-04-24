import java.sql.*;

class Create
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/milan";
        String user = "root";
        String pass = "";
        try
        {

            Connection conn = DriverManager.getConnection(url,user,pass);
            String q = "create table student(id int(4) primary key auto_increment,name varchar(255),city varchar(255),phone int(10)) ";
            Statement st = conn.createStatement();
            st.executeUpdate(q);
            conn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}