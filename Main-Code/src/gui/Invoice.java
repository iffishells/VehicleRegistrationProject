package gui;

import java.util.Scanner;
public class Invoice {
    
    public String Cardetails;
    public String InvoiceNumber;
    public String ShowRoomName;
    public String ShowRoomNumber;
    public String ShowRoomCity;
    
    public void SetCarDetail(String word){
          
        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter The Cardetails :                       ");

        Cardetails = word ;// myobj.nextLine();


        System.out.println(Cardetails);


    }

    public void SetInvoiceNumber(String word){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The InvoiceNumber :                       ");

        InvoiceNumber = word ; // myobj.nextLine();


        System.out.println(InvoiceNumber);


    }

    public void SetShowroomName(String word){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The ShowRoomName :                       ");

        ShowRoomName = word ;// myobj.nextLine();


        System.out.println(ShowRoomName);


    }

    public void SetShowroomNumber(String word){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The ShowRoomNumber :                       ");

    
        ShowRoomNumber = word ;//myobj.nextLine();


        System.out.println(ShowRoomNumber);


    }

    public void SetShowroomCity(String word){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The ShowRoomCity :                       ");

    
        ShowRoomCity = word; //myobj.nextLine();


        System.out.println(ShowRoomCity);


    }
}
