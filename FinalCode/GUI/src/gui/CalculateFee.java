
package gui;


import java.util.Scanner;



public class CalculateFee extends TaxDetails {

    public int typeVehicle;
     

    public int GetregistrationFee(){
        Scanner myobj = new Scanner(System.in);
        // reuturn the fee according the Vehicle 
        System.out.println("                     Enter The Type of Vehicle \n Press 1 for Under Four Wheel  \n Press 2 for above four wheel                        ");

    

        typeVehicle = myobj.nextInt();
        

        if (typeVehicle ==1){
            return 200;
        }
        else{
            return 400;
        }

        // System.out.println(typeVehicle);

    }
    public int Get_Ownership_Fee(){
        return 300+GET_TAX_onwnershipment_Fee();
    }
    public int Get_TOF_fee(){
        return 300+ GET_Registration_Tax();
    }
    public int GetInvoiceFee(){

        return 300 + GET_Invoice_TAX();
    }
    public int GetFilerfee(){
        
        return 300+ GET_Filer_Tax();
    }
    public int GetNonFilerFee(){
        return 500 + GET_NonFiler_fee();
    }

    public int GiveTotalfee(){
        CalculateFee Obj_Calculate_fee = new CalculateFee();
        
        total = Obj_Calculate_fee.Get_TOF_fee() + Obj_Calculate_fee.Get_Ownership_Fee() + Obj_Calculate_fee.GetInvoiceFee() + Obj_Calculate_fee.GetFilerfee() + Obj_Calculate_fee.GetNonFilerFee();
        
        FilerNonFiler Obj_Filer = new FilerNonFiler();

        Obj_Filer.AskUser();
        
        if(Obj_Filer.Filer==true){
            System.out.println("Deduction in fee");
            total = total - 400;

        }
        else{
            System.out.println("You have to pay full fee");
        }
    
        
        return total;

    }
    

    
}

