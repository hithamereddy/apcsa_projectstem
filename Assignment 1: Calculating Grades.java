/* Assignment 1 - Calculating Grades */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
  		System.out.println("Please enter the course name.");
  		String hit_cn = scan.nextLine();
  		System.out.println("Please enter the average time spent in a week for this course in minutes.");
  		int hit_ts = scan.nextInt();
  		System.out.println("Please enter the homework grades for this course.");
  		double hit_hw1 = scan.nextDouble();
  		double hit_hw2 = scan.nextDouble();
  		double hit_hw3 = scan.nextDouble();
  		double hit_hw4 = scan.nextDouble();
  		System.out.println("Please enter the quiz grades for this course.");
  		double hit_qg1 = scan.nextDouble();
  		double hit_qg2 = scan.nextDouble();
  		System.out.println("Please enter the final exam grade for this course.");
  		double hit_f = scan.nextDouble();
  		    
  		int hit_hours = hit_ts / 60;
  		int hit_mins = hit_ts % 60;
  		
  		double hit_average_hw = (double) (hit_hw1 + hit_hw2 + hit_hw3 + hit_hw4) / 4;
  		    
  		double hit_average_q = (double) (hit_qg1 + hit_qg2) / 2;
  		    
  		int hit_overall = (int) ((((hit_average_hw * (35)) + (hit_average_q * (15)) + (hit_f * (50))) / 100) + 0.5);
  		
  		System.out.println("Course name: " + hit_cn);
  		System.out.println("Weekly time spent: " + hit_hours + "h" + hit_mins);
  		System.out.println("Average homework grade: " + hit_average_hw);
		  System.out.println("Average quiz grade: " + hit_average_q);
  		System.out.println("Final exam grade: " + hit_f);
	  	System.out.println("Overall grade: " + hit_overall);
    
  }
}

  
