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
public final class TwoDimRaggedArrayUtility extends Object {
	static final int MAX_ROW = 10;
	static final int MAX_COL = 10;
	public TwoDimRaggedArrayUtility() {} //constructor
	
	//this method reads the file and outputs it in a 2d array
	public static double[][] readFile(File file) throws FileNotFoundException {
		double[][] raggedArr=new double[MAX_ROW][];
		String line;
		int i=0;
		try {
			//open the file
			BufferedReader br=new BufferedReader(new FileReader(file));
			//read the file
			while((line=br.readLine())!=null){
				String[] temp=line.split(" ");
				int size=temp.length;
				raggedArr[i]=new double[size];
				//covert into doubles
				for(int j=0;j<size;j++)
				{
					raggedArr[i][j]= Double.parseDouble(temp[j]);
				}
				i++;
			}
			br.close();
		}
		catch(Exception ep)
		{
			ep.printStackTrace();
		}
		return raggedArr;
	}
	//this method writes to the file with the given data
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
		try{
			//open the file
			BufferedWriter br=new BufferedWriter(new FileWriter(outputFile));
			//read the array and print into file with spaces
			for(int i=0;i<data.length;i++)
			{
				for(int j=0;j<data[i].length;j++)
				{
					br.write(data[i][j]+" ");
				}
				br.newLine();
			}
			br.close();
		}
		catch(Exception ep)
		{
			ep.printStackTrace();
		}
	}
	//this method returns the absolute total
	public static double getTotal(double[][] data) {
		double total=0;
		//find the sum of the values of the 2D array
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				total += data[i][j];
			}
		}
		return total;
	}
	//this method returns the average of the whole array
	public static double getAverage(double[][] data) {
		double total=0;
		int numOfElements=0;
		double avg;
		//find the sum of the values of the 2D array
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				total += data[i][j];
				numOfElements += 1;
			}
		}
		avg = total/numOfElements;
		//find and return the average
		return avg;
	}
	//this method returns the row total
	public static double getRowTotal(double[][] data,int row) {
		double total=0;
		for(int j=0;j<data[row].length;j++)
		{
			total += data[row][j];
		}
		return total;
	}
	//this method returns the column total
	public static double getColumnTotal(double[][] data,int col) {
		double total=0;
		for(int i=0;i<data.length;i++) {
			if(col<=data[i].length-1)
				total += data[i][col];
		}
		return total;
	}
	//this method returns highest value
	public static double getHighestInRow(double[][] data,int row) {
		double highest=data[row][0];
		for(int j=0;j<data[row].length;j++) {
			if(data[row][j]>highest)
				highest= data[row][j];
		}
		return highest;
	}
	//this method returns the index of the highest value
	public static double getHighestInRowIndex(double[][] data,int row) {
		double highest=data[row][0];
		double highestIndex = 0;
		for(int j=0;j<data[row].length;j++) {
			if(data[row][j]>highest) {
				highest= data[row][j];
				highestIndex = j;
			}
		}
		return highestIndex;
	}
	
	//this method returns the smallest value in a row
	public static double getLowestInRow(double[][] data,int row) {
		double lowest=data[row][0];
		for(int j=0;j<data[row].length;j++)
		{
			if(data[row][j]<lowest)
				lowest= data[row][j];
		}
		return lowest;
	}
	//this method returns the index of the smallest value in a row
	public static double getLowestInRowIndex(double[][] data,int row) {
		double lowest=data[row][0];
		double lowestIndex = 0;
		for(int j=0;j<data[row].length;j++)
		{
			if(data[row][j]<lowest) {
				lowest= data[row][j];
				lowestIndex= j;
			}
		}
		return lowestIndex;
	}
	//this method returns the highest value in a column
	public static double getHighestInColumn(double[][] data,int col) {
		double highest=data[0][col];
		for(int i=0;i<data.length;i++)
		{
			if(col<=data[i].length-1)
			{
				if(data[i][col]>highest)
					highest= data[i][col];
			}
		}
		return highest;
	}
	//this method returns the index of the highest value in a column
	public static double getHighestInColumnIndex(double[][] data,int col) {
		double highest=data[0][col];
		double highestIndex = 0;
		for(int i=0;i<data.length;i++)
		{
			if(col<=data[i].length-1)
			{
				if(data[i][col]>highest) {
					highest= data[i][col];
					highestIndex= i;
				}
			}
		}
		return highestIndex;
	}
	//this method returns the lowest value in a column
	public static double getLowestInColumn(double[][] data,int col) {
		double lowest=data[0][col];
		for(int i=0;i<data.length;i++)
		{
			if(col<=data[i].length-1)
				if(data[i][col]<lowest)
					lowest= data[i][col];
		}
		return lowest;
	}
	//this method returns the index of the lowest value in a column
	public static double getLowestInColumnIndex(double[][] data,int col) {
		double lowest=data[0][col];
		double lowestIndex = 0;
		for(int i=0;i<data.length;i++)
		{
			if(col<=data[i].length-1) {
				if(data[i][col]<lowest) {
					lowest= data[i][col];
					lowestIndex = i;
				}
			}
		}
		return lowestIndex;
	}
	//this method returns the highest value in the array
	public static double getHighestInArray(double[][] data) {
		double highest=data[0][0];
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				if(data[i][j]>highest)
					highest= data[i][j];

			}
		}
		return highest;
	}
	//this method returns the lowest value in the array
	public static double getLowestInArray(double[][] data) {
		double lowest=data[0][0];
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				if(data[i][j]<lowest)
					lowest= data[i][j];
			}
		}
		return lowest;
	}
}
