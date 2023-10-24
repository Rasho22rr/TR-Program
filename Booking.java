package tr_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Booking {
 
    private Customer customer;
    private Option option;
    
    public Booking()
    {
        this.customer = null;
        this.option = null;
    }
    
    //Copy
    public Booking(Customer customer, Option option, double totalPrice)
    {
        this.customer = new Customer(customer);
        this.option = new Option(option);
    }
    
    public Customer getCustomer()
    {
        return new Customer(this.customer);
    }
    
    public Option getOptin()
    {
        return new Option(this.option);
    }
    
   public String toString()
   {
       String str = "Booking Info:\n"+this.customer+"\n"+this.option+"\n";
       return str;
   }
   
   public void writeInFile() throws IOException{
        FileWriter fWrite = new FileWriter("booking.txt",true);
        PrintWriter write = new PrintWriter(fWrite);
        write.print(this.customer.toString()+"\t");
        write.print(this.option.toString()+"\t");

        write.close();
    } 
   
   public void disPlayBooking() throws FileNotFoundException
    {
        File file = new File("booking.txt");
        Scanner read = new Scanner(file);
        
        while(read.hasNext())
        {
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();
    }
   
 
}
