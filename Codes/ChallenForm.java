

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ChallenForm {
   
    
    static void Create_challenfrom() {
        
        CalculateFee obj_cal =  new CalculateFee();

        

        String filename = "/home/iffishells/Desktop/New/challenForm.pdf";
		String para_1 = "this is paragraph one";
		String para_2 = "This is paragraph two";
		
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
                                            +"\n        Total is --------------------------------------------------------------------------------"+obj_cal.GiveTotalfee()
            
            
            );
            document.add(detail);
            
			
			
            
            
			System.out.println("Hellwoworld");
			document.close();
		}
		catch( Exception e) {
			System.err.println(e);
		}
        

    }
    public static void main(String[] args) {
        
        Create_challenfrom();
    }
}
