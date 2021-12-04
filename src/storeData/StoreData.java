package storeData;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[EASY]6. Store all the data into respective arrays.
		
		int[] movieNumber = {1, 2, 3, 4, 5, 6, 7, 8};
		String[] movieNames = {"Harry Potter and the Philosopher's Stone",
				"Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban",
				"Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix",
				"Harry Potter and the Half-Blood Prince","Harry Potter and the Deathly Hallows – Part 1",
				"Harry Potter and the Deathly Hallows – Part 2"};
		int[] releaseYear = {2001, 2002, 2004, 2005, 2007, 2009, 2010, 2011};
		
		//System.out.println(movieNumber[3]);
		//System.out.println(movieNames[3]);
		//System.out.println(releaseYear[3]);
		
		/* [AVERAGE] 7. Create a single for loop to print all the data in the format [Movie
		Number, Movie name, Year Of Release] */
		
		//System.out.println("For Loop");
		//System.out.println("-------------");
		System.out.println("Movie Number");
		System.out.println("-------------");
		for (int i = 0; i < movieNumber.length; i++) 
		{
		System.out.println(movieNumber[i]);
		}
		
		System.out.println("\nMovie Names");
		System.out.println("-------------");

		for (int x = 0; x < movieNames.length; x++)
		{
		System.out.println(movieNames[x]);
		}
		
        System.out.println("\nRelease Year");
        System.out.println("-------------");
        
		for (int y = 0; y < releaseYear.length; y++)
		{
		System.out.println(releaseYear[y]);
		}
		
		


	}//End of main

}//End of class
