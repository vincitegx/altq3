// NAME : OGBODU DAVID TEGA
// DEPT : COMPUTER SCIENCE
// MATRIC NO : CSC/15/3056
package altq3;

import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Altq3 {

   
    public static void main(String[] args) {
      Scanner vinci = new Scanner(System.in);
      double sum =0;
      double mean;
      
     double dev = 0;
      int score;
      System.out.println("Enter 10 numbers: ");
      for (int counter =0; counter<10; counter++){
          score = vinci.nextInt();
          sum = sum + score;
          dev = dev +(score*score);    
      }
      System.out.println("the sum of these numbers is: ");
     System.out.println(sum);
      mean = sum/10;
      System.out.println("the mean of these numbers is: ");
      System.out.println(mean);
    
      double sqr;
      sqr = (sum*sum)/10;
      
      double SD;
      SD = sqrt((dev-sqr)/9);
      System.out.println("the standard deviation of these numbers is: ");
      System.out.println(SD);
      
      
      
    }
    
}
