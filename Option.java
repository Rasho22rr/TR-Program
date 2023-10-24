package tr_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Option {
    
    Scanner keyboard = new Scanner(System.in);
    
    private int numberOfWorkers;
    private int numberOfHuors;
    public static int cuontWorkers = 20 ;
    private int day ;
    public int month ;
    private int year ;
    private String nationality;
    private int addHours = 1;
    
    
    public Option( String nationality, int day, int month, int year,int numberOfWorkers, int numberOfHuors)
    {
        this.nationality = nationality;
        this.day = day;
        this.month = month;
        this.year = year;
        this.numberOfWorkers = numberOfWorkers;
        this.numberOfHuors = numberOfHuors;
    }
    

    //Copy Con
    public Option(Option option)
    {
        this.nationality = option.nationality;
        this.day = option.day;
        this.month = option.month;
        this.year = option.year;   
        this.numberOfWorkers = option.numberOfWorkers;
        this.numberOfHuors = option.numberOfHuors;
    }
    
       
    public String getNationality()
    {
        return this.nationality;
    }
    
    public int getDay()
    {
        return this.day;
    }
    
    public int getMonth()
    {
        return this.month;
    }
   
    public int getYear()
    {
        return this.year;
    }
    
    public int getNumberOfWorkers()
    {
            return this.numberOfWorkers;
    }

    public int getNumberOfHuors()
    {
        if(month==4 || month ==10) {
            
            addHours = 1; 
            System.out.println(//"_____________________________________________\n"
                              "\n<< Congratulations, you get 4 extra hours :) >>\n");
                             //+ "___________________________________________\n");
            (this.numberOfHuors)+=4 ;
            
        } 
        else 
        {
            addHours = 0;
        }
       
        return this.numberOfHuors;
    }
    
    public int getCuontW()
    {
        cuontWorkers = numberOfWorkers*cuontWorkers;
        return cuontWorkers;
    }
    
    public String toString()
    {
        
        String str;
        str =   //
               "\n"
              +"  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
             + "       [ Surface Information ] \n"
             + "   ~ Nationality: "+nationality+".\n"+
               "   ~ Booking date: "+day+"/"+month+"/"+year+"\n"+
               "   ~ Working hours: "+numberOfHuors+"\n"+
               "   ~ Number of workers: "+numberOfWorkers+"\n"+
               "   ~ Price: "+getCuontW()+"\n"+
               "  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
                     
        return str;                
    }
    
    
    public void writeInFile() throws IOException{
        FileWriter fWrite = new FileWriter("booking.txt",true);
        PrintWriter write = new PrintWriter(fWrite);
        write.print("      "+"    "+this.nationality+"\t       "); 
        write.print(" "+this.day+"/"+this.month+"/"+this.year+"\t  ");
        write.print("\t "+this.numberOfWorkers+"\t   ");
        write.print("            "+getNumberOfHuors()+"\t      ");
        
        fWrite.close();
    }
    
    
}