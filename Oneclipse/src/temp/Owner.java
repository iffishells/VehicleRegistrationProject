/**
 * 
 */
package temp;

import java.util.Scanner;

/**
 * @author iffishells
 *
 */
public class Owner {

    public String OwnerCNIC; 
    public String OwnerName;
    public String OwnerFatherName;
    public String CarEngineNumber;
    public void SetOwnerCNIC(){
          
        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter Owner CNIC : ");
        OwnerCNIC = myobj.nextLine();


        System.out.println(OwnerCNIC);


    }

    public void SetOwnnerName(){
          
        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The Onwer Name : ");
        OwnerName = myobj.nextLine();


        System.out.println(OwnerName);


    }

    public void SetOwnerFatherName(){
          
        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The Onwer Father Name : ");
        OwnerFatherName = myobj.nextLine();


        System.out.println(OwnerFatherName);


    }
    

    public void SetCarEngineNumber(){
          
        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The Vehicel Engine Number : ");
        CarEngineNumber = myobj.nextLine();


        System.out.println(CarEngineNumber);


    }
    


}
