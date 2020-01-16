package course.jse.jdbc.project;

public class Service {

	public static void main(String[] args) {
		
		Customer newCustomer = new Customer("My Business", "5265664", "USA154856", 
											"Wall st 10", "WA", "WA", "USA", "4554", 
											"business@business.com", "+55645454", 15);
		
		CustomerDao myCustomer = new CustomerDao();
//		myCustomer.createCustomer(newCustomer);
		
		myCustomer.editCustomer(newCustomer, 2);
		
	}
	
}
