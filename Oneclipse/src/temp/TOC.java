/**
 * 
 */
package temp;

import java.util.Scanner;

/**
 * @author iffishells
 *
 */
public class TOC {
	
	 public String VehicleModel ;
	    public String VehicleEngineNumber;
	    public String VehiclePurCity ;   //Purchsed City
	    public String VehicleName;


	    public void SetVehicleModel(){

	        Scanner myobj = new Scanner(System.in); 

	        System.out.println("Enter The Vehicle Model Number : ");
	        VehicleModel = myobj.nextLine();


	        // System.out.println(VehicleModel);

	    }
	    
	    public void SetVehicleEngineNumber(){

	        Scanner myobj = new Scanner(System.in); 

	        System.out.println("Enter the Engine Number :");
	        VehicleEngineNumber = myobj.nextLine();

	        // System.out.println(VehicleEngineNumber);

	    }
	    
	    public void SetVehiclePurchasedCity(){

	        Scanner myobj = new Scanner(System.in); 

	        System.out.println("Enter The Purchased City Name : ");
	        VehiclePurCity = myobj.nextLine();

	        // System.out.println(VehiclePurCity);
	    }
	    
	    public void SetVehicleName(){

	        Scanner myobj = new Scanner(System.in); 

	        System.out.println("Enter The Vehicle Name : ");
	        VehicleName = myobj.nextLine();

	        // System.out.println(VehicleName);

	    }


}
