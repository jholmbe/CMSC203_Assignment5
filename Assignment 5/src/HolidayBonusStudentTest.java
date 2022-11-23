/* CMSC203 Assignment 5
Class: CMSC203 CRN 23999 
Program: Assignment 5 
Instructor: Farnaz Eivazi 
Summary of Description: Creating two utility classes to determine holiday bonuses for a district.
Due Date: 11/23/2022 
Integrity Pledge: I pledge that I have completed the programming assignment independently. 
I have not copied the code from a student or any source.
Student name: Justin Holmberg
*/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusStudentTest {

	private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonus() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(3000.0, result[0], .001);
			assertEquals(2000.0, result[1], .001);
			assertEquals(15000.0, result[2], .001);
		} catch (Exception e) {
			
		}

	}

	@Test
	public void testCalculateTotalHolidayBonus() {
		assertEquals(20000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}

}
