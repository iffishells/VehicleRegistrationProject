package gui;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;



public class ChallenForm {
   
    
    public void Create_challenfrom() {
        
        CalculateFee obj_cal =  new CalculateFee();

        
        //set your own path for getting challen from
        String filename = "/home/iffishells/Desktop/Challenform/ForNewCar.pdf";
//        String filename = "~/Desktop/ForNewCar.pdf";
		
		try {
			
			Document document = new Document();
			
			PdfWriter.getInstance(document, new FileOutputStream(filename));
			
			document.open();
			
			Image img = Image.getInstance("/home/iffishells/Desktop/New/logo.png");
			
			img.scaleAbsolute(300f, 100f);
			img.setAbsolutePosition(150f, 700f);
			document.add(img);
            
            

            Paragraph lineskip = new Paragraph("\n\n\n\n\n\n\n\n");
            document.add(lineskip);
            
            Paragraph line = new Paragraph("                                                     Challen form                                                     ");
            document.add(line);
            Paragraph heading  = new Paragraph("Tax details");
            document.add(heading);
            
            Paragraph detail  = new Paragraph("        Ownership Fee --------------------------------------------------------------------------------"+obj_cal.Get_Ownership_Fee() 
                                            + "\n        Invovice Fee --------------------------------------------------------------------------------" + obj_cal.GetInvoiceFee()
                                            + "\n        Filer Fee --------------------------------------------------------------------------------"+obj_cal.GetFilerfee()
                                            + "\n        No filer fee --------------------------------------------------------------------------------"+obj_cal.GetNonFilerFee()
                                            +"\n        Transfer order fee --------------------------------------------------------------------------------"+obj_cal.Get_TOF_fee()
                                            
            
            
            );
            document.add(detail);
            
			
			
            
            
			System.out.println("Challen from generated");
			document.close();
		}
		catch( Exception e) {
			System.err.println(e);
		}
        

    }
    public void Create_challenfrom_used_vehicle(){

        CalculateFee obj_cal =  new CalculateFee();

        

        String filename = "/home/iffishells/Desktop/Challenform/ForUedCar.pdf";
//        String filename = "~/Desktop/ForUedCar.pdf";
		
		try {
			
			Document document = new Document();
			
			PdfWriter.getInstance(document, new FileOutputStream(filename));
			
			document.open();
			
			Image img = Image.getInstance("/home/iffishells/Desktop/New/logo.png");
			
			img.scaleAbsolute(300f, 100f);
			img.setAbsolutePosition(150f, 700f);
			document.add(img);
            
            

            Paragraph lineskip = new Paragraph("\n\n\n\n\n\n\n\n");
            document.add(lineskip);
            
            Paragraph line = new Paragraph("                                                     Challen form                                                     ");
            document.add(line);
            Paragraph heading  = new Paragraph("Tax details");
            document.add(heading);
            
            Paragraph detail  = new Paragraph("        Ownership Fee --------------------------------------------------------------------------------"+obj_cal.Get_Ownership_Fee() 
                                            + "\n        Invovice Fee --------------------------------------------------------------------------------" + obj_cal.GetInvoiceFee()
                                            + "\n        Filer Fee --------------------------------------------------------------------------------"+obj_cal.GetFilerfee()
                                            + "\n        No filer fee --------------------------------------------------------------------------------"+obj_cal.GetNonFilerFee()
                                            +"\n        Transfer order fee --------------------------------------------------------------------------------"+obj_cal.Get_TOF_fee()
                                            
            
            
            );
            document.add(detail);
            
			
			
            
            
			System.out.println("Challen from generated");
			document.close();
		}
		catch( Exception e) {
			System.err.println(e);
		}
        
//		+"\n        Total is --------------------------------------------------------------------------------"+obj_cal.GiveTotalfee()
    }
//    +"\n        Total is --------------------------------------------------------------------------------"+obj_cal.GiveTotalfee()
}
