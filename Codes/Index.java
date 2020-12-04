package Codes;

import jdk.internal.jshell.tool.resources.version;
import jdk.internal.platform.cgroupv1.SubSystem;
import sun.awt.AWTAccessor.InvocationEventAccessor;
import sun.jvm.hotspot.oops.ObjArrayKlass;

import org.graalvm.compiler.nodes.calc.ObjectEqualsNode;

import Codes.Invoice;
/**
 * Index
 */
public class Index {

    public static void main(String[] args) {
        System.out.println("Start in the Name of Allah.......");

        String [] ColName = {"ID" ,"VehicleName" , "VechicleModel" , "VehicleEngineNumber","VehicleCity" };
        
       


        




        // this object take the data from the user 
        // save save into the specific pattern in list
        // and writing in the CSV file
        TOC Obj_TOC = new TOC();


        // this object will take the info from the Invoice 
        // datails  and save into the files
        
        Invoice Obj_Invoice = new Invoice();



        Obj_TOC.SetVehicleName();
        Obj_TOC.SetVehicleModel();
        Obj_TOC.SetVehiclePurchasedCity();
        Obj_TOC.SetVehicleEngineNumber();
        
        String [] Data = {Obj_TOC.VehicleName ,  
                        Obj_TOC.VehicleModel,
                        Obj_TOC.VehicleEngineNumber,
                        Obj_TOC.VehiclePurCity,
                       
                        Obj_Invoice.Cardetails ,
                        Obj_Invoice.InvoiceNumber ,
                        Obj_Invoice.ShowRoomName,
                        Obj_Invoice.ShowRoomNumber,
                        Obj_Invoice.ShowRoomCity
        }
};

        
        

        Obj_Invoice.SetCarDetail();
        Obj_Invoice.SetInvoiceNumber();
        Obj_Invoice.SetShowroomName();
        Obj_Invoice.SetShowroomNumber();
        Obj_Invoice.SetShowroomCity();

        String [] Data = [
                          ]

        

    }
    
}