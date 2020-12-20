package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.smartcardio.Card;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui_Interface {

	static void enter_new_Vehicle() {
		 
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

		    
		    
		    
		    
		    JTextField Vehicle_name_in = new JTextField();
		    Vehicle_name_in.setBounds(400,100,300,40);
		    test.add(Vehicle_name_in);

		    
		    


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
		    InvoiceDetail.setBounds(1000,10,500,100);
		    InvoiceDetail.setFont(font_title);
		    test.add(InvoiceDetail);

		    //car detail
		        JLabel car_Detail = new JLabel("Car Detail(color)");
		        car_Detail.setBounds(900,100,300,40);
		        car_Detail.setFont(font_label);
		        test.add(car_Detail);

		        JTextField car_Detail_in = new JTextField();
		        car_Detail_in.setBounds(1200,100,300,40);
		        test.add(car_Detail_in);
		        
		    
		    //Inoice Number
		        JLabel Invoice_Number = new JLabel("Invoice Number ");
		        Invoice_Number.setBounds(900,150,300,40);
		        Invoice_Number.setFont(font_label);
		        test.add(Invoice_Number);

		        JTextField Invoice_Number_in = new JTextField();
		        Invoice_Number_in.setBounds(1200,150,300,40);
		        test.add(Invoice_Number_in);
		   
		     //showroom Name  
		        JLabel showroomName = new JLabel("ShowRoom Name ");
		        showroomName.setBounds(900,200,320,40);
		        showroomName.setFont(font_label);
		        test.add(showroomName);

		        JTextField showroomName_in = new JTextField();
		        showroomName_in.setBounds(1200,200,300,40);
		        test.add(showroomName_in);  

		     //showroom Number
		        JLabel showroomNumber = new JLabel("ShowRoom Number ");
		        showroomNumber.setBounds(900,250,320,40);
		        showroomNumber.setFont(font_label);
		        test.add(showroomNumber);

		        JTextField showroomNumber_in = new JTextField();
		        showroomNumber_in.setBounds(1200,250,300,40);
		        test.add(showroomNumber_in);  
		        
		    //showRoom city

		        JLabel showroomcity = new JLabel("ShowRoom City");
		        showroomcity.setBounds(900,300,320,40);
		        showroomcity.setFont(font_label);
		        test.add(showroomcity);

		        JTextField showroomcity_in = new JTextField();
		        showroomcity_in.setBounds(1200,300,300,40);
		        test.add(showroomcity_in);  
		        


		    // Owner information

		        JLabel owner = new JLabel("OWNER INFORMATION");
		        owner.setBounds(400,350,500,100);
		        owner.setFont(font_title);
		        test.add(owner);

		        //owner name
		        JLabel owner_name  =  new JLabel("Owner Name ");
		        owner_name.setBounds(100,450,320,40);
		        owner_name.setFont(font_label);
		        test.add(owner_name);
		        
		        JTextField owner_name_in = new JTextField();
		        owner_name_in.setBounds(400,450,300,40);
		        test.add(owner_name_in);  
		        
		        //father Name
		        JLabel Father_name  =  new JLabel("Father Name ");
		        Father_name.setBounds(100,500,320,40);
		        Father_name.setFont(font_label);
		        test.add(Father_name);
		        
		        JTextField Father_name_in = new JTextField();
		        Father_name_in.setBounds(400,500,300,40);
		        test.add(Father_name_in);  
		        
		        //Onwer CNIC
		        JLabel CNIC  =  new JLabel("CNIC ");
		        CNIC.setBounds(100,550,320,40);
		        CNIC.setFont(font_label);
		        test.add(CNIC);
		        
		        JTextField CNIC_in = new JTextField();
		        CNIC_in.setBounds(400,550,300,40);
		        test.add(CNIC_in);  
		           
		        JLabel Owner_Car_Engine_number  =  new JLabel("Vehicle Engine Number ");
		        Owner_Car_Engine_number.setBounds(100,600,400,40);
		        Owner_Car_Engine_number.setFont(font_label);
		        test.add(Owner_Car_Engine_number);
		        
		        
		        JTextField Owner_Car_Engine_number_in = new JTextField();
		        Owner_Car_Engine_number_in.setBounds(450,600,300,40);
		        test.add(Owner_Car_Engine_number_in);  
		        
		        
		        
		        JLabel filerNonFiler  =  new JLabel("Filer Non filer ");
		        filerNonFiler.setBounds(400,700,400,40);
		        filerNonFiler.setFont(font_title);
		        test.add(filerNonFiler);
		        
		        
		        
		        
		        
		        JRadioButton filer = new JRadioButton("Filer");
		        filer.setBounds(100,750,400,40);
		        filer.setFont(font_label);
		        test.add(filer);
		        
		        JRadioButton Nonfiler = new JRadioButton("Non Filer");
		        Nonfiler.setBounds(100,800,400,40);
		        Nonfiler.setFont(font_label);
		        test.add(Nonfiler);
		        
		        JButton caculate_Fee = new JButton("Caculated Fee");
		        caculate_Fee.setBounds(1000,400,300,70);
		        test.add(caculate_Fee);
		        
		        
		        caculate_Fee.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		// when we click on the button of calculated Fee the this samll window will open
		    		    JFrame Cal_Fee  = new JFrame("Calculate Fee's");
		    		    Font font_label = new Font("Arial",Font.PLAIN,30);
		    		    Font font_text = new Font("Arial",Font.PLAIN,20);

		    		    CalculateFee obj_calculate_fee = new CalculateFee();
		    		    
		    		    Index obj_index =  new Index();
		    		    
		    		    JLabel  head_Fee =  new JLabel("Total Fee");
		    		    head_Fee.setBounds(200,10,200,50);
		    		    head_Fee.setFont(font_label);
		    		    Cal_Fee.add(head_Fee);
		    		    
		    		    
		    		    String word  = obj_index.Get_Calculate_Fee();
		    		    
		    		    JTextArea fee =  new JTextArea();
		    		    fee.setFont(font_text);
		    		    fee.setText(word);
		    		    
		    		    fee.setBounds(20,60,400,200);
		    		    Cal_Fee.add(fee);
		    		    
		    		    Cal_Fee.setSize(500,500);  
		    		    Cal_Fee.setLayout(null);  
		    		    Cal_Fee.setVisible(true);
//		    		    Cal_Fee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    		    

		        		
		        	}
		        });
		        
		        filer.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		if (filer.isSelected()) {
		        			System.out.println("Hello World");
		        			Nonfiler.setSelected(false);
		        		}
		        	}
		        });

		        Nonfiler.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		if (Nonfiler.isSelected()) {
		        			System.out.println("Hello World");
		        			filer.setSelected(false);
		        		}
		        	}
		        });

		        
			    
//			    JButton NewCar_submit=new JButton("Submit");
//			    NewCar_submit.setBounds(300,700,300,100);
//			    test.add(NewCar_submit);
//			    
//			    NewCar_submit.addActionListener(new ActionListener(){  
//			    	public void actionPerformed(ActionEvent e){
//			            Registration Obj_Registration = new Registration();
//			            Obj_Registration.SetVehicleName(Vehicle_name_in.getText());
//			            Obj_Registration.SetVehicleModel(model_number_in.getText());
//			            Obj_Registration.SetVehiclePurchasedCity(Purchased_city_in.getText());
//			            Obj_Registration.SetVehicleEngineNumber(Engine_Number_in.getText());
//
//			            Invoice Obj_Invoice =  new Invoice();
//			            Obj_Invoice.SetCarDetail(car_Detail_in.getText());
//			            Obj_Invoice.SetInvoiceNumber(Invoice_Number_in.getText());
//			            Obj_Invoice.SetShowroomName(showroomName_in.getText());
//			            Obj_Invoice.SetShowroomNumber(showroomNumber_in.getText());
//			            Obj_Invoice.SetShowroomCity(showroomcity_in.getText());
//			            
//			            Owner Obj_Owner = new Owner();
//
//			            Obj_Owner.SetOwnnerName(owner_name_in.getText());
//			            Obj_Owner.SetOwnerFatherName(Father_name_in.getText());
//			            Obj_Owner.SetOwnerCNIC(CNIC_in.getText());
//			            Obj_Owner.SetCarEngineNumber(Owner_Car_Engine_number_in.getText());
//			            
//			            
//			            String [] Data = {Obj_Registration.VehicleName ,  
//			                    Obj_Registration.VehicleModel,
//			                    Obj_Registration.VehicleEngineNumber,
//			                    Obj_Registration.VehiclePurCity,
//			                
//			                    Obj_Invoice.Cardetails ,
//			                    Obj_Invoice.InvoiceNumber ,
//			                    Obj_Invoice.ShowRoomName,
//			                    Obj_Invoice.ShowRoomNumber,
//			                    Obj_Invoice.ShowRoomCity  ,
//			                    
//			                    Obj_Owner.OwnerName,
//			                    Obj_Owner.OwnerFatherName,
//			                    Obj_Owner.OwnerCNIC,
//			                    Obj_Owner.CarEngineNumber
//			                    };
//			        
//			            BufferedWriter fw = null;
//						try {
//							fw = new BufferedWriter(new FileWriter("Database.txt" , true));
//						} catch (IOException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						} 
//			            
//                        // read character wise from string and write  
//                        // into FileWriter  
//                        for (int i = 0; i < Data.length; i++){
//                            try {
//								fw.write(Data[i] + ",");
//							} catch (IOException e1) {
//								// TODO Auto-generated catch block
//								e1.printStackTrace();
//							} 
//                            
//                        }
//                        // just for checking
//                        System.out.println("                     Writing successful                     ");
//                        try {
//							fw.append("\n");
//						} catch (IOException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
//                        //close the file  
//                        try {
//							fw.close();
//						} catch (IOException e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						} 
//
//			            
//			    	        }  
//			    	    });
//			    
                
//                JButton challen_Button = new JButton("Create Challen form");
//                challen_Button.setBounds(300,800,300,100);
//                test.add(challen_Button);
//                challen_Button.addActionListener(new ActionListener(){  
//			    	
//                	public void actionPerformed(ActionEvent e){
//                		ChallenForm myobj_ChallenForm = new ChallenForm();
// 
//                		myobj_ChallenForm.Create_challenfrom();//
//                		
//                	}
//			    	});
//                
//                
                

			    

		    
		    test.setSize(1600,1600);
		    test.setLayout(null);
		    test.setVisible(true);
		      
		}  
	
	static void start() {
	    JFrame f=new JFrame("Vehicle Registration");  
	    JButton NewCar=new JButton("New Vehicle Registration");
	    JButton UsedCar =  new JButton("Used Vehicle Registration");
	     
	    JLabel heading = new JLabel("Vehicle Registration");

	    
	    NewCar.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		enter_new_Vehicle();      
	    	        }  
	    	    });  
	    
	    UsedCar.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		System.out.println("Hello am pressed");     
	    	        }  
	    	    });
	    
	    heading.setLocation(500, 500);
	    heading.setSize(500,500);
	    NewCar.setBounds(200,300,300,100);  
	    UsedCar.setBounds(600,300,300,100);
	    heading.setBounds(500 , 10,300,300);
	    

	    


	    f.add(heading);
	    f.add(NewCar);
	    f.add(UsedCar);  
	    f.setSize(1000,1000);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}