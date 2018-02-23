

/****************************************************************************
*
* Created by: Heejo Suh
* Created on: Feb 2018
* Created for: learning
* 
* Program that generates 10 random numbers between 1 and 99 and returns them.
* it also shows the min and max numbers
*     
*
****************************************************************************/


//have to import the following:
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//****************************************************************************
public class MaxMinNum {
	
	//------------------------
	//return type is integer
	public static int getMax(List<Integer> inputArray){
		//Gets the maximum number from an array
		int maxValue = Collections.max(inputArray);
	    return maxValue;
	}//close for getMax

	//------------------------
	//return type is integer
	public static int getMin(List<Integer> inputArray){
		//Gets the maximum number from an array
	    int minValue = Collections.min(inputArray);
	    return minValue;
	}//close for getMin

	//-----------------------------------------    
	public static void main(String[] args) {
		//Max and min values of array of random numbers
    	
    	//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
    	
    	//set variables to a default	
    	//You can't add elements to arrays! need to have list!
    	//******************************************
    	List<Integer> numbers = new ArrayList<>();

		Random rand = new Random();
		
    	//create 10 random numbers
    	for ( int count=0; count<11; count++ ) {  
    		//random number from 1 to 99
	    	int randNumber= rand.nextInt(99) + 1;
	    	numbers.add(randNumber);
    	}
    	//show array
       	System.out.println("Array generated:\n" + numbers);
       	
       	//print max
       	System.out.println("The maximum number generated was " + getMax(numbers));

       	//print max
       	System.out.println("The minimum number generated was " + getMin(numbers));
		
    
    }//closing for main
	}//closing for public class MaxMinNum
