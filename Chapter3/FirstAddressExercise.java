public class FirstAddressExercise {
    
    public static void main(String[] args) {
        System.out.println("First Application Application");
        displayAddress();
    }
    
   
    public static void displayAddress() {
       
        String add = "Xinghua East Road";
        String district = "Chaoyang district";
        String capital = "Beijing";
        String zipCode = "100028";
        String country = "China";
        String companyName ="Xiaomi Co.";

        System.out.println(add);
       
        System.out.println(district + ", " + capital + " " + zipCode);
        System.out.println(country);
        
        System.out.println("Company: " + companyName);
    }
}
