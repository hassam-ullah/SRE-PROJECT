
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public Connection myConnection;
    public Database() {    }
    public void init(){
       try{  
        myConnection=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/scd_project","root",""); 
        }catch(Exception e)
        {
            System.out.println("Exception : "+e.getMessage());
            System.out.println(e);
            System.out.println("===================================");
        }  
    }
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    public String insertRecord(String query){
         
        try{
            System.out.println("Database");
        Statement stmt=myConnection.createStatement();  
        int rows=stmt.executeUpdate(query);  
        return "Query executed successfully "+rows;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    public ResultSet getAllRecords(String query)
    {
        try{
            Statement stmt=myConnection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        }catch(SQLException e){ 
            return null;
        }
    }
    public ResultSet getById(String query)
    {
        try{
            System.out.println("database");
            Statement stmt=myConnection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        }catch(SQLException e){ 
            return null;
        }
    }
    public String updateRecord(String query)
    {
        try{
        Statement stmt=myConnection.createStatement();  
        int rows=stmt.executeUpdate(query);  
        return "record updated with effectoed rows "+rows;
        }
        catch(Exception ex){
            return ex.getMessage();
        }
    }
    public String deleteRecord(String query)
    {
        try{
        Statement stmt=myConnection.createStatement();  
        int row=stmt.executeUpdate(query);  
        return "Query Succesful";
        }
        catch(Exception ex){
            return "Unsuccesful";
        }
    }
}
