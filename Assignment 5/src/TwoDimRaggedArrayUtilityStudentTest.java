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
import java.io.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityStudentTest {
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8}};
	File data1 = new File("C:\\Users\\Justi\\eclipse-workspace\\Assignment 5\\src\\dataSet1.txt");
	File testData = new File("C:\\Users\\Justi\\eclipse-workspace\\Assignment 5\\src\\testData.txt");
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReadFile() {
		try {
			assertArrayEquals(dataSet1, TwoDimRaggedArrayUtility.readFile(data1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testWriteFile() {
		try {
			TwoDimRaggedArrayUtility.writeToFile(dataSet1, testData);
			assertArrayEquals(dataSet1, TwoDimRaggedArrayUtility.readFile(testData));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGetTotal() {
		assertEquals(36.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), .001);
	}
	@Test
	public void testGetAvg() {
		assertEquals(4.5, TwoDimRaggedArrayUtility.getAverage(dataSet1), .001);
	}
	
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	@Test
	public void testGetColumnTotal() {
		assertEquals(14.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,1),.001);
	}
	@Test
	public void testGetHighestInRow() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,1),.001);
	}
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,1),.001);
	}
	@Test
	public void testGetLowestInRow() {
		assertEquals(4.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1,1),.001);
	}
	@Test
	public void testGetLowestInRowIndex() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1,1),.001);
	}
	@Test
	public void testGetHighestInColumn() {
		assertEquals(7.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1,1),.001);
	}
	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(2.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1,1),.001);
	}
	@Test
	public void testGetLowestInColumn() {
		assertEquals(2.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1,1),.001);
	}
	@Test
	public void testGetLowestInColumnIndex() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1,1),.001);
	}
	@Test
	public void testGetHighestInArray() {
		assertEquals(8.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
	}
	@Test
	public void testGetLowestInArray() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
	}
}

