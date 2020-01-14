package course.jse.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateRowID {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;

        try
        {	
        	// 1) create connection - conn - määrame andmebaasi asukoha ja parameetrid
            String userName = "root";
            String password = "tere";
            String url = "jdbc:mysql://localhost:3306/EShopMusic";
            Class.forName ("com.mysql.jdbc.Driver").newInstance (); // entrypoint to database - (Driver)
            conn = DriverManager.getConnection (url, userName, password);
            //
            
            System.out.println ("Connected to Database..."); // kui jõuad siiani siis järelikult line 23 töötas
            
            Statement cmd = conn.createStatement (); // this createStatement method should be always described 
		 	
	 		
            String query = "UPDATE cd SET Artist='Uno Loop', Title='Tere' where ID=1";
            cmd.executeUpdate(query);
	             
            query = "Select * from CD";
            ResultSet res = cmd.executeQuery(query);
	 		
	        while (res.next()) { // peale query saamist käib läbi kõik read 
	        	
	        	// from position
		        //System.out.print("\t"+res.getString(3)); // number annab 3 columni
		        //System.out.print("\t"+res.getString(4));
	        	
	        	//from column name
	        	System.out.print("\t"+res.getString("id"));
	        	System.out.print("\t"+res.getString("Artist"));
	        	System.out.print("\t"+res.getString("title"));
		        System.out.println();
	      	}
            
            
        }
        catch (Exception e)
        {
           
        	System.err.println ("Impossible to connect to Database");
        	 e.printStackTrace();
            
        }
        finally 
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("connection closed");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }

	}

}