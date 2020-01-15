package course.jse.jdbc.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import course.jse.jdbc.utils.DbUtils;
import lombok.Getter;
import lombok.Setter;

public class DaoCD {
	
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

	public DaoCD(String artist, String company, double price, String title, String country, int year, int quantity,
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
        	
            String userName = "root";
            String password = "tere";
            String url = "jdbc:mysql://localhost:3306/EShopMusic";
            Class.forName ("com.mysql.jdbc.Driver").newInstance (); 
            conn = DriverManager.getConnection (url, userName, password);
                      
            System.out.println ("Connected to Database..."); 
	 		 		
            PreparedStatement insertCD = conn.prepareStatement("INSERT INTO CD (Artist,Title,Company,Year,Price,Quantity,Country,Version) " +
					"VALUES (?,?,?,?,?,?,?,?)");            
            
                         
            insertCD.setString(1, artist);
            insertCD.setString(2, title);
            insertCD.setString(3, company);
            insertCD.setInt(4, year );
            insertCD.setDouble(5, price);
            insertCD.setInt(6, quantity);
            insertCD.setString(7, country);
            insertCD.setInt(8, version);
            
            insertCD.executeUpdate();
            
            
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
