package Codes;

public class Invoice {
    
    public String Cardetails;
    public String InvoiceNumber;
    public String ShowRoomName;
    public String ShowRoomNumber;
    public String ShowRoomCity;
    
    public void SetCarDetail(){
          
        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The Cardetails : ");
        Cardetails = myobj.nextLine();


        System.out.println(Cardetails);


    }

    public void SetInvoiceNumber(){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The InvoiceNumber : ");
        InvoiceNumber = myobj.nextLine();


        System.out.println(InvoiceNumber);


    }

    public void SetShowroomName(){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The ShowRoomName : ");
        ShowRoomName = myobj.nextLine();


        System.out.println(ShowRoomName);


    }

    public void SetShowroomNumber(){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The ShowRoomNumber : ");
        ShowRoomNumber = myobj.nextLine();


        System.out.println(ShowRoomNumber);


    }

    public void SetShowroomCity(){

        Scanner myobj = new Scanner(System.in); 

        System.out.println("Enter The ShowRoomCity : ");
        ShowRoomCity = myobj.nextLine();


        System.out.println(ShowRoomCity);


    }
}
