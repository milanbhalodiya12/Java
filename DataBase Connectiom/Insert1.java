import java.sql.*;

class Insert1
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/milan";
        String user = "root";
        String pass = "";
        try
        {

            Connection conn = DriverManager.getConnection(url,user,pass);
            String q = "insert into student(name, city, phone) values('Milan', 'Morbi', 987654)";
            PreparedStatement ps = conn.prepareStatement(q);
            ps.executeUpdate();
            conn.close();
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}