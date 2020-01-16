package course.jse.jdbc.project;

import java.sql.Connection;
import java.sql.Statement;
import course.jse.jdbc.utils.ProjectUtils;

public class CustomerDao {
	
	public void createCustomer (Customer customer) {
		
		 Connection conn =null;
			
			try{
				conn =ProjectUtils.createConnection();
	        
	            Statement cmd = conn.createStatement ();	 		
		        
	            String sql = "INSERT INTO `customer` "
		        		+ "( `customer_name`, " 
		        		+ "`registration_code`, "
		        		+ "`vat_no`, "
		        		+ "`address`, "
		        		+ "`city`, "
		        		+ "`state`, "
		        		+ "`country`, "
		        		+ "`zip`, "
		        		+ "`customer_email`, "
		        		+ "`contact`, "
		        		+ "`payment_term`) "
		        		+ "VALUES("
		        		+ "'"+customer.getCustomerName()+"', "
		        		+ "'"+customer.getRegistrationCode()+"', "
		        		+ "'"+customer.getVatNo()+"', "				
						+ "'"+customer.getAddress()+"', "
						+ "'"+customer.getCity()+"', "
						+ "'"+customer.getState()+"', "
						+ "'"+customer.getCountry()+"', "
						+ "'"+customer.getZip()+"', "
						+ "'"+customer.getCustomerEmail()+"', "
						+ "'"+customer.getContact()+"', "
						+ customer.getPaymentTerm()+") ";
							        
	            cmd.executeUpdate(sql);
		        	            
	        }
	        catch (Exception e){
	           
	        	System.err.println ("Impossible to connect to Database");
	        	 e.printStackTrace();            
	        }
	        finally {
	           ProjectUtils.closeConnection(conn);         
	        }
		
	}
	
	public void editCustomer (Customer customer, int id) {
		
		 Connection conn =null;
			
			try{
				conn =ProjectUtils.createConnection();
	        
	            Statement cmd = conn.createStatement ();	 		
		        
	            String sql = "UPDATE customer SET customer_name= " + "'"+customer.getCustomerName()+"'," 
	            + " vat_no= " + "'"+customer.getVatNo()+"',"
	            + " address= " + "'"+customer.getAddress()+"',"
	            + " city= " + "'"+customer.getCity()+"',"
	            + " state= " + "'"+customer.getState()+"',"
	            + " country= " + "'"+customer.getCountry()+"',"
	            + " zip= " + "'"+customer.getZip()+"',"
	            + " customer_email= " + "'"+customer.getCustomerEmail()+"',"          
	            + " contact= " + "'"+customer.getContact()+"',"
	            + " payment_term= " + "'"+customer.getPaymentTerm()+"'"
	            + " where id= " +id;
	            		
							        
	            cmd.executeUpdate(sql);
		        	            
	        }
	        catch (Exception e){
	           
	        	System.err.println ("Impossible to connect to Database");
	        	 e.printStackTrace();            
	        }
	        finally {
	           ProjectUtils.closeConnection(conn);         
	        }
		
	}
	
}
