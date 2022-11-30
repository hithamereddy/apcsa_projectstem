/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One
{
  public static void main(String[] args)
  {
  
      Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String hit_str = scan.nextLine();
	    System.out.println("Enter a number:");
	    int hit_int = scan.nextInt();
	    
	    int hit_len = hit_str.length();
	    
	    System.out.print(hit_str.substring(0, hit_int)); 
	    System.out.print(hit_str.substring(hit_len - hit_int));
    
    
    
    
    
  
  }
}
