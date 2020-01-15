package course.jse.jdbc.labs;

import lombok.Data;

@Data
public class Cd {
	
	private long id;
	private String artist;
	private String company;
	private String title;
	private String country;
	private int year;
	private int quantity;
	private double price;
	private Long version;
	
	
}
