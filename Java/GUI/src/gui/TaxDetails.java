package gui;

public class TaxDetails {

    public int  total;
    
    //objclsFee is object of calculus fee
    // CalculateFee objclsFee = new CalculateFee();
    
    // on the TOF is 10 percent tax
    static int GET_Registration_Tax(){
        return 45;
    }

    // public static void main(String[] args) {
    //     System.out.println(TaxTOFFee());        
    // }

    static int GET_TAX_onwnershipment_Fee(){
        return 50;
    }

    static int GET_Invoice_TAX(){
        return 70;
    }
    static int GET_Filer_Tax(){
        return 60;
    }
    static int GET_NonFiler_fee(){
        return 55;
    }
//    public String Get_Tax_Details(){
//
//        String str = "Filer Fee Tax is " + GET_Filer_Tax() + "\n" + "Non Filer Tax is " + GET_NonFiler_fee() +  "\n" + "Ownership Tax is "+ GET_TAX_onwnershipment_Feee() + "\n" +  "InVoice Tax is " + GET_Invoice_TAX() + "\n" +  "Transfer Order Tax is " + GET_Registration_Tax();
//        System.out.println(str);
//        return str;
//    }

}
