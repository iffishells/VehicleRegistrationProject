package gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

public class Transfer_of_order {

    private String Older_owner_name;
    private String New_owner_name;
    private String Older_Owner_CNIC;
    private String New_Owner_CNIC;
    private String Vehicle_Number;

    public void Set_older_owner_name(String word) {

        Older_owner_name = word;
    }

    public void Set_new_owner_name(String word) {

        New_owner_name = word;
    }

    public void Set__new_CNIC_owner(String word) {

        New_Owner_CNIC = word;
    }

    public void Set_Older_CNIC_owner(String word) {
        Older_Owner_CNIC = word;
    }

    public void Set_vehcile_number(String word) {
        Vehicle_Number = word;
    }



    public String Get_older_owner_name() {

        return Older_owner_name;

    }

    public String Get_new_owner_name() {
        

        return New_owner_name;
    }

    public String Get__new_CNIC_owner() {

        return New_Owner_CNIC;
    }

    public String Get_Older_CNIC_owner() {
        return Older_Owner_CNIC;
    }

    public String Get_vehcile_number() {
        return Vehicle_Number;
    }


    public boolean check(Transfer_of_order ob) throws FileNotFoundException {
        ///check if its registered or not/

        Scanner read = new Scanner(new FileInputStream("/home/iffishells/Desktop/CarRegistrationProject/Codes/Database.txt"));
        String words =  ob.Get_vehcile_number();                          //ob.Get_vehcile_number();

            while(read.hasNextLine())
            {
                String line = read.nextLine();
                
                    if(line.indexOf(words)!=-1) {
                        return true;   //1 is True
                        
                    }
                
           }    
    
        return false;  // o is false
        
    }

    
    


}
