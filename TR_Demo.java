package tr_demo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TR_Demo {

    public static Object write;
    
    public static void main(String[] args) throws IOException {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=====================================================");
        System.out.println("|                Welcome to our program             |");
        System.out.println("=====================================================");
        System.out.println("|    If you are lucky, TR gives a great discount    |\n"+
                           "|    to people who called {Tala} or {Rasha}.        |\n"+
                           "|    Also we provide an extra working hours for     |\n"+
                           "|    people who book in April or October            |\n"+
                           "=====================================================");
        
        System.out.println("\nTo show the menu, enter yes");
        
       int sel ;
       char cho;
       String men = keyboard.nextLine();
       //System.out.println();
       cho = men.charAt(0);
       String[] array = {"     Driver", "     Home made", "    ass"};
       
       while(cho == 'Y' || cho == 'y'){
            System.out.println("___________________________________________\n"
                             + "| -  To select workers, enter ( 1 )       |\n"
                             + "| -  To options,enter ( 2 )               |\n"       
                             + "| -  To info, enter ( 3 )                 |\n"
                             + "| -  To view the receipt, enter ( 4 )     |\n"
                             + "| -  To exit, enter ( 5 )                 |\n"
                             + "|_________________________________________|\n");      
                    sel = keyboard.nextInt();
           if(sel==1)
           {
               System.out.println("__________________________________________\n");
                System.out.println("Enter type");
                System.out.println("Enter ( 0 ) for Driver");
                System.out.println("Enter ( 1 ) for Home made");
                System.out.println("Enter ( 2 ) for Ass");
                
                String number = keyboard.nextLine();
                String number1 = keyboard.nextLine();
                
                String value;
                
                if(number1.equalsIgnoreCase("0"))
                {
                    value = array[0];
                    System.out.println(value);
                    fw(value);
                }
                else if(number1.equalsIgnoreCase("1"))
                {
                    value = array[1];
                    System.out.println(value);
                    fw(value);
                }
                else if(number1.equalsIgnoreCase("2"))
                {
                    value = array[2];
                    System.out.println(value);
                    fw(value);
                }
                System.out.println("\n__________________________________________\n");
                
            } 
            else if(sel==2)
            {                   
                   System.out.println("__________________________________________\n");
                    
                    System.out.println("Enter the nationality:");
                    String nationality = keyboard.nextLine();
                    String nationality1 = keyboard.nextLine();

                    System.out.println("Enter the day:");
                    int day=keyboard.nextInt();

                    System.out.println("Enter the month:");
                    int month=keyboard.nextInt();

                    System.out.println("Enter the year:");
                    int year=keyboard.nextInt();

                    System.out.println("Enter the number of workers:");
                    int numberOfWorkers=keyboard.nextInt();

                        while(numberOfWorkers >= 8)
                        {
                            System.out.println("Plese don't enter a number greater than 8, Try again; ");
                            numberOfWorkers = keyboard.nextInt();
                        }

                    System.out.println("Enter the number of huors:");
                    int numberOfHuors=keyboard.nextInt();


                    Option tr = new Option(nationality1, day, month, year, numberOfWorkers,numberOfHuors);
                    tr.writeInFile();

                    System.out.println(tr.toString());
                    
                    System.out.println("\nInformation saved,Thank you");
                    
                    System.out.println("\n__________________________________________\n");
            } 
            else if(sel==3)
            {
                    System.out.println("__________________________________________\n");
                    System.out.println("Enter the firstName");
                    String firstName = keyboard.nextLine();
                    String firstName1 = keyboard.nextLine();

                    System.out.println("Enter the lastName:");
                    String lastName = keyboard.nextLine();

                    System.out.println("Enter the customerAdress:");
                    String customerAdress = keyboard.nextLine();

                    System.out.println("Enter the customerNumber:");
                    String customerNumber = keyboard.nextLine();

                    Customer c = new Customer(firstName1, lastName,  customerAdress, customerNumber);
                    c.writeInFile1();
                   
                    System.out.println(c.toString());
                    System.out.println("\nInformation saved,Thank you");
                    System.out.println("\n__________________________________________\n");
 
            }
            else if(sel==4)
            {
                System.out.println(" ");
                
                Booking b = new Booking();
                b.disPlayBooking();
                System.out.println("\nTHANK YOU");
            }
            else if(sel==5)
            {
                cho='n';
                System.out.println( "\n **************************************************\n"
                                    + " |       Thanks for putting your trust in TR.     |\n"
                                    + " |     I hope you find our services helpful <3    |\n"
                                    + " **************************************************");
            }
           
       }
        
    }
    
      public static void fw(String f) throws IOException
   {
       FileWriter fWrite = new FileWriter("booking.txt",true);
        PrintWriter write = new PrintWriter(fWrite);
        write.print("\n_______________________________________________________________________________________________________________________________________________________________________________\n" +
                    "   Worker Type      Nationality	         Date 	        Number of workers       Number of huors	           Name   	      Adress	       Number            Total price\n" +
                    "_________________________________________________________________________________________________________________________________________________________________________________ \n");
        write.print(f);
        write.close();
   }
      
}
