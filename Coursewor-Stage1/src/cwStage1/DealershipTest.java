package cwStage1;

import java.util.ArrayList;

import cwStage1.Input;

public class DealershipTest {

	 public static void main(String[] args) {
	        /* Dealership Array List Start */
	    	ArrayList<String> dealership =new ArrayList<String>();
	    	   dealership.add(new String("ferrari"));
	    	   dealership.add(new String("volkswagen"));
	    	   dealership.add(new String("audi"));
	    	   
	    	   for (int i = 0; i < dealership.size(); i++) {
	    	       System.out.println(dealership.get(i));
	    	   } 
	    	   
	    	   
	    	   
	    	   
	        String make;

	        Integer option;
	        do {
	            System.out.println("0: QUIT");
	            System.out.println("1: ADD MAKE OF CAR");
	            System.out.println("2: DISPLAY");
	            System.out.println("3: SEARCH");
	            System.out.println("4: REMOVE");
	            option = Input.getInteger("Option:");
	            switch (option) {
	                case 0:
	                	Integer confirmExit;
	                	
	                    System.out.println("Are you sure you wish to exit the program?");
	                    System.out.println("0: Yes");
	                    System.out.println("1: No");
	                    confirmExit = Input.getInteger("Enter here: ");
	                    if (confirmExit == 0) {
	                    	System.out.println("You are no exiting the program..");
	                    	System.exit(0);
	                    }
	                    else if(confirmExit == 1) {
	                    	break;
	                    }
	                    
	                case 1:

	                    make = Input.getString("Manufacturer: ");
	                    /*if (cars.checkExists(make))
	                		System.out.println(make  + " is already in stock." );
	                	else*/
	                	
	                	
	                	if ( dealership.contains(make)) {
	                		System.out.println(make + " already exists");
	                	}else{
	                		dealership.add(new String(make));
	                		System.out.println(make + " was added..");
	                	}
	                	
	                    
	                	break;
	                  
	                case 2:
	                	if (dealership.isEmpty()) {
	                		System.out.println("No Data in Array");
	                	}
	                	else
	                	{
	                		System.out.println(dealership);
	                	}

	                     break;

	                 case 3:
	                	 /* When searching for make, the make within the dealership.contains will be the only valid output.
	                	  * if you want to change the output so that it is NOT Found, then remove ferrari below and add 
	                	  * something else in its place.*/
	                	 String SearchMake = Input.getString("Enter Car Make: ");
	                     boolean search = dealership.contains(SearchMake); 
	                     
	                     if (search) 
	                         System.out.println("The list contains " + SearchMake); 
	                     else
	                    	 
	                         System.out.println("The list does not contain "  + SearchMake); 
	                	   	
	                	 break;
	                 case 4:
	                	 String deleteCar = Input.getString("Enter car to delete: ");
	                	 String carToDelete = new String(deleteCar);
	                	   for (int i = 0; i < dealership.size(); i++) {
	                	       if (dealership.get(i).equals(carToDelete)) {
	                	           dealership.remove(i);
	                	           System.out.println(carToDelete + " was Removed");
	                	          
	                	       }
	                	   }
	                	 
	                	break;
	                 default:
	                    System.out.println("Invalid Option");
	            }

	         } while (option != 0);
	    }
	
}
