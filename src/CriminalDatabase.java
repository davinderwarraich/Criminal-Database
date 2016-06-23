package criminaldatabase;

import java.sql.*;

public class CriminalDatabase 
{
    static final String URL="JDBC:mysql://localhost:3306/PunjabCriminalDatabase";
    static final String ID="root";
    static final String PASS="";
    static Connection connectingDatabase;
    static Statement databaseStat;
    static ResultSet result;
    static boolean connectDatabse()
    {
        try
        {
            connectingDatabase=DriverManager.getConnection(URL,ID,PASS);
            databaseStat=connectingDatabase.createStatement();
            return true;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    static void createCriminalTable()
    {
        String tableCreate="CREATE TABLE CRIMINAL_RECORD(Name varchar(20),Father_Name varchar(20),Age varchar(3),City varchar(20),Crime_Type varchar(20),Crime_Year varchar(20))";
        try
        {
            databaseStat.executeUpdate(tableCreate);
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    static boolean checkMasterLogin(String loginId,String pass)
    {
        try
        {
            result=databaseStat.executeQuery("SELECT * FROM AuthenticationMaster");
            while(result.next())
            {
                String id=result.getString("LoginId");
                String passd=result.getString("Password");
                if(passd.equals(pass)&&id.equals(loginId))
                {
                    return true;
                }
            }
            return false;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    static boolean checkSimpleLogin(String loginId,String pass)
    {
        try
        {
            result=databaseStat.executeQuery("SELECT * FROM AuthenticationSimple");
            while(result.next())
            {
                String id=result.getString("LoginId");
                String passd=result.getString("Password");
                if(passd.equals(pass)&&id.equals(loginId))
                {
                    return true;
                }
            }
            return false;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    static boolean addRecord(String name,String fatherName,String age,String city,String crimeType,String crimeYear)
    {
        String enter="INSERT INTO CRIMINAL_RECORD VALUES('"+name+"','"+fatherName+"','"+age+"','"+city+"','"+crimeType+"','"+crimeYear+"')";
        try
        {
            databaseStat.executeUpdate(enter);
            return true;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    static ResultSet showAllRecords()
    {
        String show="SELECT * FROM CRIMINAL_RECORD";
        try
        {
            result=databaseStat.executeQuery(show);
            return result;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    static ResultSet searchByQuery()
    {
        String show="SELECT * FROM CRIMINAL_RECORD";
        try
        {
            result=databaseStat.executeQuery(show);
            return result;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
