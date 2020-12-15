import java.io.FileOutputStream;

import javax.swing.text.Document;

public  class PDF{


    public static void main(String[] args) {
        System.out.println("Hellow world");

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));


        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Hello World", font);

document.add(chunk);
document.close();
    }
}