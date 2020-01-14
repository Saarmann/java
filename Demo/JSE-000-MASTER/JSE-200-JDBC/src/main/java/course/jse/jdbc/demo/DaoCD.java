package course.jse.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import course.jse.jdbc.utils.DbUtils;
import lombok.Getter;
import lombok.Setter;

public class Cd {
	
	@Getter @Setter 
	private String artist;
	@Getter @Setter 
	private String company;
	@Getter @Setter 
	private double price;
	@Getter @Setter 
	private String title;
	@Getter @Setter 
	private String country;
	@Getter @Setter 
	private int year;
	@Getter @Setter 
	private int quantity;
	@Getter @Setter 
	private int version;

	public Cd(String artist, String company, double price, String title, String country, int year, int quantity,
			int version) {
				
		this.artist = artist;
		this.company = company;
		this.price = price;
		this.title = title;
		this.country = country;
		this.year = year;
		this.quantity = quantity;
		this.version = version;
	}
	
    
	public void insertCD() {
		
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
            
            Statement cd = conn.createStatement (); // this createStatement method should be always described 
	 		 		
            String query = "INSERT INTO CD (Artist,Title,Company,Year,Price,Quantity,Country,Version) VALUES (?,?,?,?,?,?,?,?)";
                  
            cd.setString(1, "Radiohead2");
            insertCD.setString(2, "The Bends");
            insertCD.setString(3, "RCA");
            insertCD.setInt(4,1998 );
            insertCD.setDouble(5, 21.2);
            insertCD.setInt(6, 12);
            insertCD.setString(7, "UK");
            insertCD.setInt(8, 0);
            
            cd.executeUpdate(query);
            
            
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
