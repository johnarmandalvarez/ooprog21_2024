import java.util.Scanner;

public class SammysRentalPrice{
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       
    System.out.println("sssssssssssssssssssssssssssssssssss");
    System.out.println("s Sammy's makes it fun in the sun s");
    System.out.println("sssssssssssssssssssssssssssssssssss");       
    
    final int PRICE_PER_HOUR = 40;
        final int PRICE_PER_MIN = 1;
        
    System.out.print("Number of mins rented: ");
    int mins = scanner.nextInt();
    
    int hours = mins / 60;
    System.out.println("Hours rented: " + hours);
     
     int addminutes = mins %  60; 
     int zero = 0;
     if(mins <= 59){
     System.out.println("Additional mins: " + zero);
     }else{
      System.out.println("Additional mins: " + addminutes);
     }
    int zero1 = 40;
    int total = PRICE_PER_HOUR*hours + addminutes;
     if(mins<=59){
     System.out.print("Total price: $" + zero1);
     }else{
         System.out.print("Total price: $" + total);
         
     }
    }
}
