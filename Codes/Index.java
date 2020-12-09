// package Codes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.crypto.Data;

import Invoice;
// 
/**
 * Index
 */
public class Index {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Starting....");



                    // this is Header/ColName on the CSV files
       
                String [] ColName = {"ID" ,"VehicleName" , "VechicleModel" , "VehicleEngineNumber","VehicleCity",
                            "CarDetails" , "InvoiceNumber" , "ShowRoomName" , "ShowRoomNumber" , "ShowRoomCity" };
        
        
        // this object take the data from the user 
        // save save into the specific pattern in list
        // and writing in the CSV file
        TOC Obj_TOC = new TOC();


        // this object will take the info from the Invoice 
        // datails  and save into the files
        
        Invoice Obj_Invoice = new Invoice();

        //this object get the Data from the Owner class
        Owner Obj_Owner = new Owner();

        FilerNonFiler Obj_Flr = new FilerNonFiler();
        

        //getting Data from the TOC classs
        Obj_TOC.SetVehicleName();
        Obj_TOC.SetVehicleModel();
        Obj_TOC.SetVehiclePurchasedCity();
        Obj_TOC.SetVehicleEngineNumber();
        
       
        // //getting input the from the Invoice classs
        Obj_Invoice.SetCarDetail();
        Obj_Invoice.SetInvoiceNumber();
        Obj_Invoice.SetShowroomName();
        Obj_Invoice.SetShowroomNumber();
        Obj_Invoice.SetShowroomCity();



        //calling the method of OWner Class this will take input from
        // the user and save into the user 
        Obj_Owner.SetOwnnerName();
        Obj_Owner.SetOwnerFatherName();
        Obj_Owner.SetOwnerCNIC();
        Obj_Owner.SetCarEngineNumber();





        //owner class
        Obj_Flr.AskUser();
        System.out.println(Obj_Flr.Filer);
        Obj_Flr.Reduce_Tax();

        // getiitng input from the OWner class


        String [] Data = {Obj_TOC.VehicleName ,  
            Obj_TOC.VehicleModel,
            Obj_TOC.VehicleEngineNumber,
            Obj_TOC.VehiclePurCity,
           
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
            

        System.out.println("Writing successful"); 

        }
        fw.append("\n");
        
        //close the file  
        fw.close(); 

    };
    
}
        



    