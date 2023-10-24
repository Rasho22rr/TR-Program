package tr_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Customer 
{
    private String firstName;
    private String lastName;
    private String customerCity;
    private String customerNumber;
    public int discount = 1;
    //public Option cuontWorkers;
    
   public Customer()
    {
        this.firstName = "";
        this.lastName = "";
        this.customerCity = "";
        this.customerNumber = "";
    }

    Customer(String firstName, String lastName, String customerCity, String customerNumber) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerCity = customerCity;
        this.customerNumber = customerNumber;
    }
    
    //Copy constructor 
    public Customer(Customer customer)
    {
        this.firstName = customer.firstName;
        this.lastName = customer.lastName;
        this.customerCity = customer.customerCity;
        this.customerNumber = customer.customerNumber;
                
    }
   
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNam()
    {
        return lastName;
    }
    
    public String getCustomerCity()
    {
        return customerCity;
    }
    
    public String getCustomerNumber()
    {
        return customerNumber;
    }
    
    public int getDiscount()
    {
        if(firstName.equalsIgnoreCase("Rasha") || firstName.equalsIgnoreCase("Tala"))
        {
            discount = 1; 
            System.out.println("\n<< Congratulations, you are eligible to receive a 50% discount :) >>\n");
            (Option.cuontWorkers)*=0.5 ;
        }
        else
        {
            discount = 0;
        }
        
        return (Option.cuontWorkers);
    }
    
    public String toString()
    {
        String str;
        str =  "  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n"
             + "       [ Customer Information ] \n"
             + "   ~ Customer name "+firstName+lastName+".\n"+
               "   ~ Customer city: "+customerCity+"\n"+
               "   ~ WCustomer phone number "+customerNumber+"\n"+
               "  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
                
        return str;
    }
    
    public void writeInFile1() throws IOException{
        FileWriter fWrite = new FileWriter("booking.txt",true);
        PrintWriter write = new PrintWriter(fWrite);
        //write.print("Name\t |   Adress   |    Number    | \t");
        write.print("  "+this.firstName+" ");
        write.print(this.lastName+"\t      ");
        write.print(this.customerCity+"\t      ");
        write.print(this.customerNumber+"   	   ");
        //write.print(Option.cuontWorkers+" or ");
        write.print(getDiscount());
        write.close();
    }
    
}
