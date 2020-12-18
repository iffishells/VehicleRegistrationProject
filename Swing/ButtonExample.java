import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;      
public class ButtonExample implements ActionListener{  
    
    
    public static void main(String[] args) {  
        JFrame f=new JFrame("Button Example");  
        JButton NewCar=new JButton("New Car Registration");
        JButton UsedCar =  new JButton("Used Car Registration");
         
        JLabel heading = new JLabel("Vehicle Registration");


        NewCar.setBounds(200,300,300,100);  
        UsedCar.setBounds(600,300,300,100);
        heading.setBounds(500 , 10,300,300);
        
        f.add(heading);
        f.add(NewCar);
        f.add(UsedCar);  
        f.setSize(1000,1000);  
        f.setLayout(null);  
        f.setVisible(true);


        
        NewCar.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                JFrame test  = new JFrame("new window");


                JLabel heading = new JLabel("Vehicle Registration");

                heading.setBounds(500 , 10,300,300);
                test.add(heading);
                

                test.setSize(1000,1000);
                test.setLayout(null);
                test.setVisible(true);
                        }  
            }); 
           
}



} 

