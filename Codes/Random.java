package com.excelcsv;
import com.opencsv.CSVWriter;
import java.io.*;
public class CSVReadWrite {
    String filePath;
    CSVWriter file;
    
    CSVReadWrite(String filePath){
    this.filePath = filePath;
    }
// writing csv file function
    public void writingCSVFile(){
    try {
        file = new CSVWriter(new FileWriter(new File(filePath)));
        String[] colName = { "Student ID", "Student Name", "Student Email" };
        file.writeNext(colName);
        String[] data = {"001", "Frank", "frank@znx.com"};
        String[] data1 = {"002", "Mark", "mark@znx.com"};
        String[] data2 = {"003", "Martin", "martin@znx.com"};
        file.writeNext(data);
        file.writeNext(data1);
        file.writeNext(data2);
        file.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
}
}
// reading csv file
public void readingCSVFile(){
        try {
                BufferedReader readFile = new BufferedReader(new FileReader(filePath));
                String readFilerow;
                    while ((readFilerow = readFile.readLine()) != null) {
                    String[] data = readFilerow.split(",");
                    System.out.println(data[0]+"|"+data[1]+"|"+data[2]);
                    }
                readFile.close();
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        } catch (IOException e) {
                        e.printStackTrace();
                        }
                        }
}