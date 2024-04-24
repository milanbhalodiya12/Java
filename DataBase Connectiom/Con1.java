import java.sql.*;

class Con1
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/milan";
        String user = "root";
        String pass = "";
        try
        {
            Connection conn = DriverManager.getConnection(url,user,pass);
            if(conn.isClosed())
            {
                System.out.println("Connection does not made");
            }
            else
            {
                System.out.println("Connection made successfully");
            }
            conn.close();
        }
        catch(SQLException e)
        {
                System.out.println(e);
        }
    }
}