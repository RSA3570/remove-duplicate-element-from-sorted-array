import java.util.*;

public class PrintAllPrimeFactors {
    public static void main(String[] args) {
      
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      
      while(num%2 == 0){
        System.out.print(2+" ");
        num = num/2;
      }
      
      int sr = (int)(Math.sqrt(num));
      
      for(int i= 3; i<=sr; i+= 2){
        while(num%i == 0){
          num = num/i;
          System.out.print(i+" ");
        }
      }
      
      if(num != 1){
        System.out.print(num);
      }
          

    }
}