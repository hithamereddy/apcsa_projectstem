/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two
{
  public static void main(String[] args)
  {
  
      Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String hit_str = scan.nextLine();
	    System.out.println("How many characters would you like to delete at the end?");
	    int hit_int = scan.nextInt();
	    
	    int hit_len = hit_str.length();
	    System.out.println((hit_str.substring(0, (hit_len - hit_int))));
    
  
  }
}
