package course.jse.jdbc.labs;

import java.util.List;

public class CdDaoDemo {

	public static void main(String[] args) {

		CdDao cdDao = new CdDao();
	
		
//		Cd mockCd = new Cd();
//		mockCd.setArtist("random Artist");
//		mockCd.setCompany("random company" );
//		mockCd.setCountry("random country");
//		mockCd.setPrice(100.0);
//		mockCd.setQuantity(2);
//		mockCd.setTitle("Some title");
//		mockCd.setVersion(1L);
//		mockCd.setYear(2000);		
//		
//		cdDao.saveCd(mockCd);
		
		
		
//		Cd foundCd =cdDao.findById(69L);
//		System.out.println("Cd values: "+foundCd.toString());
		
//		cdDao.deleteById(66L);
		
		cdDao.updatateById(1500, 69L);
		
//		List<Cd> foundCd =cdDao.findByPrice(10.20);
//		for (Cd element : foundCd) {
//			System.out.println(element);
//		};
		
	}

}
