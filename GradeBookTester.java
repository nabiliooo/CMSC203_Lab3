import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook gb1, gb2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(24);
		gb1.addScore(28);
		gb2.addScore(76);
		gb2.addScore(55);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}
	
	
	


	@Test
	void testAddScore() {
		assertTrue(gb1.toString().equals("24.0 28.0 "));
		assertTrue(gb2.toString().equals("76.0 55.0 "));
		
		assertEquals(gb1.getScoreSize(), 2);
		assertEquals(gb2.getScoreSize(), 2);
	}

	@Test
	void testSum() {
		assertEquals(gb1.sum(), 52);
		assertEquals(gb2.sum(), 131);
	}

	@Test
	void testMinimum() {
		assertEquals(gb1.minimum(), 24);
		assertEquals(gb2.minimum(), 55);
	}

	@Test
	void testFinalScore() {
		assertEquals(gb1.finalScore(), 28);
		assertEquals(gb2.finalScore(), 76);
	}
	

	

}
