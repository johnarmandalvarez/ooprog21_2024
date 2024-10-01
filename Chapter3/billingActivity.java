public class Billing {    
    public static void computeBill(double price) {
        double tax = 0.08; 
        double total = price + (price * tax);
        System.out.printf("Total bill for price $%.2f: $%.2f%n", price, total);    
    }   
    public static void computeBill(double price, int quantity) {
        double tax = 0.08; 
        double subtotal = price * quantity;
        double total = subtotal + (subtotal * tax);
        System.out.printf("Total bill for price $%.2f and quantity %d: $%.2f%n", price, quantity, total);
    }
    public static void computeBill(double price, int quantity, int Discount) {
        double tax = 0.08; 
        double subtotal = price * quantity;
        double discountAmount = (Discount / 100.0) * subtotal;
        double total = (subtotal - discountAmount) + ((subtotal - discountAmount) * tax);
        System.out.printf("Total bill for price $%.2f, quantity %d, and coupon discount %d%%: $%.2f%n", 
                          price, quantity, Discount, total);
    }  
    public static void main(String[] args) {
        Billing bill = new Billing();
      
        bill.computeBill(23.2); 
        bill.computeBill(23.2, 3); 
        bill.computeBill(23.2, 3, 10); 
    }
}
