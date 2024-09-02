import java.util.Scanner;

public class CarlysEventPrice{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("* Carly's makes the food that makes *");
        System.out.println("*           it a party.             *");
        System.out.println("*************************************");
       
        System.out.print("Total number of guest: ");
            int numOfGuests = scanner.nextInt();
                final int PRICE_PER_GUEST = 35; 
        
        System.out.println("Price per guest: $" + PRICE_PER_GUEST);
            int total = numOfGuests*PRICE_PER_GUEST;
                System.out.println("Total amount: $" + total);
                
        boolean largeEvent = numOfGuests >= 50;
        System.out.println("Is this a large event? " + largeEvent);
            
    }
}
