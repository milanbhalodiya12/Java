import java.sql.*;
import java.util.*;

class Con
{
    String url = "jdbc:mysql://localhost:3306/Examdb";
    String user = "root";
    String pass = "";
    Scanner sc = new Scanner(System.in);
}

class Connection_c extends Con
{
    Connection_c()
    {   
        try
        {
            Connection conn = DriverManager.getConnection(url,user,pass);
            if(conn.isClosed())
            {
                System.out.println("Does not able to set connection");
            }
            else
            {
                System.out.println("Connection Successfully made");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

class Create extends Con
{
    Create()
    {
        try
        {
            Connection con = DriverManager.getConnection(url,user,pass);
            String q = "CREATE TABLE stud(id int primary key auto_increment, name varchar(25), city varchar(25))";
            Statement s = con.createStatement();
            s.executeUpdate(q);
            System.out.println("Table Successfully created");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

class Insert extends Con
{
    Insert()
    {
        try
        {
            Connection c = DriverManager.getConnection(url,user,pass);
            System.out.println("Enter the name of student : ");
            String name = sc.nextLine();
            System.out.println("Enter the city of student : ");
            String city = sc.nextLine();
            String q = "Insert into stud(name,city) values('"+name+"','"+city+"')";
            PreparedStatement ps = c.prepareStatement(q);
            ps.executeUpdate();
            System.out.println("Record insetred successfully");

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

class Select extends Con
{
    Select()
    {
        try
        {
            Connection c = DriverManager.getConnection(url,user,pass);
            String q = "Select * from stud";
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(q);
            while(rs.next())
            {
                System.out.println("\t" + rs.getInt(1)+ "\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

class Search extends Con
{
    Search()
    {
        try
        {
            Connection c = DriverManager.getConnection(url,user,pass);
            System.out.println("Enter the id number you want to search : ");
            int id = sc.nextInt();           
            String q = "Select * from stud where id = '"+id+"'";
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(q);
            while(rs.next())
            {
                System.out.println("\t" + rs.getInt(1)+ "\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
class Update extends Con
{
    Update()
    {
        try
        {
            Connection c = DriverManager.getConnection(url,user,pass);
            System.out.println("Enter the student Name you want to change : ");
            String name = sc.nextLine();
            System.out.println("Enter the student id you want to update : ");
            int id = sc.nextInt();
            String q = "update stud set name = '"+name+"' where id = '"+id+"'";
            Statement s = c.createStatement();
            s.executeUpdate(q);
            System.out.println("Record Updated successfully successfully");

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

class Delete extends Con
{
    Delete()
    {
        try
        {
            Connection c = DriverManager.getConnection(url,user,pass);
            System.out.println("Enter the id number you want to delete");
            int del = sc.nextInt();
            String q = "Delete from stud where id = '"+del+"'";
            Statement s = c.createStatement();
            s.executeUpdate(q);
            System.out.println("Record Deleted successfully");

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}

class Option extends Con
{
    Option()
    {

        System.out.println("Menu for CRUD Operation");
        System.out.println("1-> Check Connection");
        System.out.println("2-> Insert the record");
        System.out.println("3-> Show the record");
        System.out.println("4-> Search the record");
        System.out.println("5-> Update the record");
        System.out.println("6-> Delete the record");
        System.out.println("7-> Exit");
        System.out.println("Enter from the following menu : ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 :
                new Connection_c();
                break;
            case 2 :
                new Insert();
                break;
            case 3 :
                new Select();
                break;
            case 4 :
                new Search();
                break;
            case 5 :
                new Update();
                break;
            case 6 :
                new Delete();
                break;
            case 7 :
                System.exit(0);
            default :
                System.out.println("Please Enter a valid choice.");
        }


    }
}
class Menu
{
    public static void main(String[] args)
    {
        // Connection_c c = new Connection_c();
        // Create c = new Create();
        // Insert i = new Insert();
        // Select s = new Select();
        // Update u = new Update();
        // Delete d = new Delete();
        while(true)
        {
            new Option();
        }


    }
}