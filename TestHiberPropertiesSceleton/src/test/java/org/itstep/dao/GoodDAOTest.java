//package org.itstep.dao;
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.itstep.model.Good;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class GoodDAOTest {
//	
//	Good good = new Good();
//	
//	@Before
//	public void setDataToDB() {
//		good = new Good("v567y", "toy", 67);
//		GoodDAO goodDAO = new GoodDAO();
//		goodDAO.save(good);
//		
//		
//	}
//	
//
//	@Test
//	public void testSaveAndGet() {
//		GoodDAO goodDAO = new GoodDAO();
//		assertNotNull(goodDAO.get(good.getAsin()));
//		assertEquals("v567y", goodDAO.get("v567y").getAsin());
//	}
//	
//
//	@Test
//	public void testGetByNameAndPrice() {
//		GoodDAO goodDAO = new GoodDAO();
//		
//		 List<Good> testGood = goodDAO.getByNameAndPrice(good.getName(), good.getPrice());
//		  assertTrue(!testGood.isEmpty());
//	}
//
//	 @After
//	 public void removeTempDataFromDB() {
//		 GoodDAO goodDAO = new GoodDAO();
//		 goodDAO.delete(good);
//	 }
//
//}
