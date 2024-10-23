import java.util.Scanner;

public class SortingNumbers{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
  System.out.println("enter three numbers: ");
  int a = in.nextInt();
  int b = in.nextInt();
  int c = in.nextInt();
  int max = Math.max(a, Math.max(b, c));
  int min = Math.min(a, Math.min(b, c));
  int mid = a + b + c - max - min;
    
   if(a <= b && b <= c){
   System.out.println("ascending order: " +a+ " " +b+ " " +c );
  }else{
      System.out.println("Descending order: " +max+ " " +mid+ " "  +min);
  }
   }
}
