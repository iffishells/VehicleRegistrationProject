package gui;


import java.io.File;
import java.util.Scanner;
import javax.annotation.processing.Filer;


public class FilerNonFiler {

    public boolean Filer ;
    // public int Reduce_Val;


    //AskerUSer () methood will ask the user you are filer or not
    // if the user is filer then you have to reduce the feee according to the 
    // condition

    public void AskUser(){

        Scanner myobj = new Scanner(System.in); 
        
        String temp ;       //temp save the yes or no Stirng
        System.out.println("                     Are You filer :(yes/no)                       ");

        System.out.println("");
        temp = myobj.nextLine();
        
        if(temp.equals("yes") || temp.equals("Yes")  ){
            Filer = true;

        }
        else{
            Filer = false;
        }

    

    // i will change the this method according to the condition    ##Remainder
    // public void Reduce_Tax(){

    //     System.out.println("                     You have set the setting to reduce the setting :                      ");
    //     CalculateFee Obj_Calculate_fee = new CalculateFee();
    //     Reduce_Val =  Obj_Calculate_fee.GiveTotalfee() - 200;
    //     return Reduce_Val


    }

}

