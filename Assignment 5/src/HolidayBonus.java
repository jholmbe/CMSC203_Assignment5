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
public class HolidayBonus {
	// definition of the method calculateHolidayBonus
	// pass in a two dimensional ragged array of doubles,
	// bonus for high, bonus for low, and bonus for others.
	// and returns the an array of doubles which represents
	// the holiday bonuses for each of the stores in the district.
	private static final double HIGH = 5000.0;
	private static final double LOW = 1000.0;
	private static final double NORM = 2000.0;
	
	public static double[] calculateHolidayBonus(double[][] data) {
		double[][] holidayBonusArr = new double[data.length][];
		for (int i = 0; i < data.length; i++) {
			holidayBonusArr[i] = new double[data[i].length];
		}
		for (int i = 0, j = 0; i < holidayBonusArr.length; i++, j++) {
			double highIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
			double lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,i);
		
			if (i < holidayBonusArr[j].length) {
				holidayBonusArr[(int) highIndex][i] = HIGH;
				holidayBonusArr[(int) lowIndex][i] = LOW;
				if (j == highIndex || j == lowIndex)
					continue;
			else {
				holidayBonusArr[j][i] = NORM;
			}
		}
		}
		double[] holidayBonusPerStore = new double[data.length];
		for (int i = 0; i < holidayBonusArr.length; i++) {
			for (int j = 0; j < holidayBonusArr[i].length; j++) {
				holidayBonusPerStore[i] += holidayBonusArr[i][j];
			}
		}
		return holidayBonusPerStore;
	}
	
	// definition of the method calculateTotalHolidayBonus
	// pass in a two dimensional ragged array of doubles,
	// bonus for high, bonus for low, and bonus for others.
	// returns a double which represents the total of all Holiday Bonuses for
	// the District.
	public static double calculateTotalHolidayBonus(double[][] data) {
		double[][] holidayBonusArr = new double[data.length][];
			for (int i = 0; i < data.length; i++) {
				holidayBonusArr[i] = new double[data[i].length];
			}
			for (int i = 0, j = 0; i < holidayBonusArr.length; i++, j++)
			{
				double highIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
				double lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,i);
				if (i < holidayBonusArr[j].length)
				{
					holidayBonusArr[(int)highIndex][i] = HIGH;
					holidayBonusArr[(int)lowIndex][i] = LOW;
					if (j == highIndex || j == lowIndex)
						continue;
					else
					{
						holidayBonusArr[j][i] = NORM;
					}
				}
			}
			double holidayTotal = 0.0;
			for (int i = 0; i < holidayBonusArr.length; i++)
			{
				for (int j = 0; j < holidayBonusArr[i].length; j++)
				{
					holidayTotal += holidayBonusArr[i][j];
				}
			}
			return holidayTotal;
		}
	}

