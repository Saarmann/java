package course.jse.jdbc.demo;

public class DaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaoCD newCD1 = new DaoCD("Aerosmith", "Aero", 10.0, "My Song", "Poland", 1995, 10, 7);
		DaoCD newCD2 = new DaoCD("Pink Floyd", "Pink Panther", 50.0, "Super song", "Estonia", 2010, 15, 2);
		
		newCD1.insertCD();
		newCD2.insertCD();

	}

}
