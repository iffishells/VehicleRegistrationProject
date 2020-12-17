// package Codes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.crypto.Data;
import java.util.Scanner;


import Invoice;
// 
/**
 * Index
 */
public class Index {



    public String Get_Calculate_Fee(){
     
        //creating the object of Calculate 
        //where this object will calculate the fee

        CalculateFee Obj_Calculate_fee = new CalculateFee();
        String ret_str = "Registration Fee "+ Obj_Calculate_fee.Get_TOF_fee() + "\n" + "                     OwnerShipment  Fee "+ Obj_Calculate_fee.Get_Ownership_Fee() + "\n"  + "                     Invoice Fee "+ Obj_Calculate_fee.GetInvoiceFee() + "\n" + "                     Filer Fee "+ Obj_Calculate_fee.GetFilerfee() + "\n" + "                     Non Filer Fee "+ Obj_Calculate_fee.GetNonFilerFee() ;
        return ret_str;  
    }
    /*
    public int GiveTotalfee(){
        int total;
        CalculateFee Obj_Calculate_fee = new CalculateFee();
        
        total = Obj_Calculate_fee.Get_TOF_fee() + Obj_Calculate_fee.Get_Ownership_Fee() + Obj_Calculate_fee.GetInvoiceFee() + Obj_Calculate_fee.GetFilerfee() + Obj_Calculate_fee.GetNonFilerFee();
        return total;

    }
    */

    public static void main(String[] args) throws IOException {

            Index Obj_index = new Index();
            
            System.out.println("                     Starting the program                     ");


            // this object take the data from the user 
            // save save into the specific pattern in list
            // and writing in the CSV file
            Registration Obj_Registration = new Registration();


            // this object will take the info from the Invoice 
            // datails  and save into the files
            

            //this object get the Data from the Owner class
            Owner Obj_Owner = new Owner();

            // FilerNonFiler Obj_Filer = new FilerNonFiler();
            


            Invoice Obj_Invoice =  new Invoice();


            Scanner myobj = new Scanner(System.in);
            
            String again_str = "yes";    // condition for the while loop
            int choice  ;                 //choice for new car mode and used car mode
            
        
        while(again_str.equals("yes") || again_str.equals("Yes") || again_str.equals("YES")){
            
                System.out.println("                     Selecting 1 :                     ");
                
                System.out.println("                     1 : press 1 for New Car                      ");
                System.out.println("                     2 : Press for Used Car                     ");
                choice = myobj.nextInt();
                    if(choice == 1)
                    {
                        
                        System.out.println("pressed 1");



            
                        // 1 for the New Car 

                        //  getting Data from the Registration classs
                        System.out.println("                     Please Enter the Registration Details \n \n \n                    ");

                        Obj_Registration.SetVehicleName();
                        Obj_Registration.SetVehicleModel();
                        Obj_Registration.SetVehiclePurchasedCity();
                        Obj_Registration.SetVehicleEngineNumber();


                        //getting input the from the Invoice classs
                        System.out.println("                     Enter the InVoice Details \n \n \n                     ");
                        Obj_Invoice.SetCarDetail();
                        Obj_Invoice.SetInvoiceNumber();
                        Obj_Invoice.SetShowroomName();
                        Obj_Invoice.SetShowroomNumber();
                        Obj_Invoice.SetShowroomCity();



                        // calling the method of OWner Class this will take input from
                        // the user and save into the user 
                        System.out.println("                     Enter the Owner Information \n \n \n                     ");

                        Obj_Owner.SetOwnnerName();
                        Obj_Owner.SetOwnerFatherName();
                        Obj_Owner.SetOwnerCNIC();
                        Obj_Owner.SetCarEngineNumber();


                        System.out.println("                     Calculating Fee ...... \n \n \n                     ");
                        System.out.println("                     "+Obj_index.Get_Calculate_Fee());


                        
                       

                        
                    
                    
                        CalculateFee Obj_Calculate_fee = new CalculateFee();
                        Obj_index.Get_Calculate_Fee();
                        Obj_Calculate_fee.GiveTotalfee();
                        System.out.println( "Total fee is  : "+ Obj_Calculate_fee.total);

                        System.out.println("                     Creating challen from ...... \n \n \n                     ");
                        ChallenForm myobj_ChallenForm = new ChallenForm();
                        myobj_ChallenForm.Create_challenfrom();

                       

                        String [] Data = {Obj_Registration.VehicleName ,  
                            Obj_Registration.VehicleModel,
                            Obj_Registration.VehicleEngineNumber,
                            Obj_Registration.VehiclePurCity,
                        
                            Obj_Invoice.Cardetails ,
                            Obj_Invoice.InvoiceNumber ,
                            Obj_Invoice.ShowRoomName,
                            Obj_Invoice.ShowRoomNumber,
                            Obj_Invoice.ShowRoomCity  ,
                            
                            Obj_Owner.OwnerName,
                            Obj_Owner.OwnerFatherName,
                            Obj_Owner.OwnerCNIC,
                            Obj_Owner.CarEngineNumber
                            };
                
                
                        // attach a file to FileWriter  
                        BufferedWriter fw=new BufferedWriter(new FileWriter("Database.txt" , true)); 
                
                        // read character wise from string and write  
                        // into FileWriter  
                        for (int i = 0; i < Data.length; i++){
                            fw.write(Data[i] + ","); 
                            
                        }
                        // just for checking
                        System.out.println("                     Writing successful                     ");
                        fw.append("\n");
                        //close the file  
                        fw.close(); 
                
                         
                    }

                
                                          
                    


                    

                    else{
                        System.out.println("press 2");
                    }


                    
                    

                    // handle another time
                    
                    // System.out.println("                     Do you register Another classs(Yes/No)                   \n  ");
                    // again_str = myobj.nextLine();
                    // if (again_str.equals("no") ||again_str.equals("NO") || again_str.equals("No")){
                    //     System.out.println("Terminate");
                    //     break;
                    // }
                    // System.out.println("acha jee");


                    
                }
                
    
        



                    // this is Header/ColName on the CSV files
       
                // String [] ColName = {"ID" ,"VehicleName" , "VechicleModel" , "VehicleEngineNumber","VehicleCity",
                //             "CarDetails" , "InvoiceNumber" , "ShowRoomName" , "ShowRoomNumber" , "ShowRoomCity" };
        
        
       
        
       
        
        
        




        // getiitng input from the OWner class


       
        
    };


    
    
}
        



    