import java.awt.*;

import javax.smartcardio.Card;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import jdk.vm.ci.meta.JavaKind;

class TextFieldExample{  
public static void main(String args[]){  
    JFrame test  = new JFrame("new window");

    Font font_title = new Font("Arial",Font.PLAIN,40);
    Font font_label = new Font("Arial",Font.PLAIN,30);
    
    //heading
    JLabel CarDetail = new JLabel("Car Details");
    CarDetail.setBounds(400,10,500,100);
    CarDetail.setFont(font_title);
    test.add(CarDetail);

    
    JLabel Vehicle = new JLabel("Vehicle Name");
    Vehicle.setBounds(100,100,300,50);
    Vehicle.setFont(font_label);
    test.add(Vehicle);

    JTextField Vehicle_in = new JTextField();
    Vehicle_in.setBounds(400,100,300,40);
    test.add(Vehicle_in);


    JLabel model_number = new JLabel("Model Number");
    model_number.setBounds(100,150,300,50);
    model_number.setFont(font_label);
    test.add(model_number);

    JTextField model_number_in = new JTextField();
    model_number_in.setBounds(400,150,300,40);
    test.add(model_number_in);




    JLabel Purchased_city = new JLabel("Purchased City");
    Purchased_city.setBounds(100,200,300,50);
    Purchased_city.setFont(font_label);
    test.add(Purchased_city);


    JTextField Purchased_city_in = new JTextField();
    Purchased_city_in.setBounds(400,200,300,40);
    test.add(Purchased_city_in);



    JLabel Engine_Number = new JLabel("Engine Number");
    Engine_Number.setBounds(100,250,300,50);
    Engine_Number.setFont(font_label);
    test.add(Engine_Number);

    JTextField Engine_Number_in = new JTextField();
    Engine_Number_in.setBounds(400,250,300,40);
    test.add(Engine_Number_in);



    // heading Inovice detail
    JLabel InvoiceDetail = new JLabel("INVOICE DETAIL");
    InvoiceDetail.setBounds(400,300,500,100);
    InvoiceDetail.setFont(font_title);
    test.add(InvoiceDetail);

    //car detail
        JLabel car_Detail = new JLabel("Car Detail(color)");
        car_Detail.setBounds(100,400,300,40);
        car_Detail.setFont(font_label);
        test.add(car_Detail);

        JTextField car_Detail_in = new JTextField();
        car_Detail_in.setBounds(400,400,300,40);
        test.add(car_Detail_in);
        
    
    //Inoice Number
        JLabel Invoice_Number = new JLabel("Invoice Number ");
        Invoice_Number.setBounds(100,450,300,40);
        Invoice_Number.setFont(font_label);
        test.add(Invoice_Number);

        JTextField Invoice_Number_in = new JTextField();
        Invoice_Number_in.setBounds(400,450,300,40);
        test.add(Invoice_Number_in);
   
     //showroom Name  
        JLabel showroomName = new JLabel("ShowRoom Name ");
        showroomName.setBounds(100,500,320,40);
        showroomName.setFont(font_label);
        test.add(showroomName);

        JTextField showroomName_in = new JTextField();
        showroomName_in.setBounds(400,500,300,40);
        test.add(showroomName_in);  

     //showroom Name
        JLabel showroomNumber = new JLabel("ShowRoom Number ");
        showroomNumber.setBounds(100,550,320,40);
        showroomNumber.setFont(font_label);
        test.add(showroomNumber);

        JTextField showroomNumber_in = new JTextField();
        showroomNumber_in.setBounds(400,550,300,40);
        test.add(showroomNumber_in);  
        
    //showRoom city

        JLabel showroomcity = new JLabel("ShowRoom City");
        showroomcity.setBounds(100,600,320,40);
        showroomcity.setFont(font_label);
        test.add(showroomcity);

        JTextField showroomcity_in = new JTextField();
        showroomcity_in.setBounds(400,600,300,40);
        test.add(showroomcity_in);  
        


    // Owner information

        JLabel owner = new JLabel("OWNER INFORMATION");
        owner.setBounds(350,700,500,100);
        owner.setFont(font_title);
        test.add(owner);




    
    test.setSize(1000,1000);
    test.setLayout(null);
    test.setVisible(true);
      
}  
}  