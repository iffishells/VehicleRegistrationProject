import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;      
public class ButtonExample implements ActionListener{  
    
    
    public static void main(String[] args) {  
        JFrame f=new JFrame("Button Example");  
        JButton NewCar=new JButton("New Car Registration");
        JButton UsedCar =  new JButton("Used Car Registration");
         
        JLabel heading = new JLabel("Vehicle Registration");

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



        
        NewCar.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                JFrame test  = new JFrame("new window");


                JLabel name = new JLabel("Enter the Name");
                name.setBounds(100 , 100,300,100);
                
                TextField t1=new TextField("");
                t1.setBounds(250 , 145,200,20);
                
                JLabel number = new JLabel("Enter the Number");
                number.setBounds(350 , 190, 300,100);
                
                
                test.add(number);
                test.add(t1);
                test.add(name);
                test.setSize(1000,1000);
                test.setLayout(null);
                test.setVisible(true);
            
            }  
        }); 
           
}



} 

