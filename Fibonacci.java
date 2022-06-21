package assignment01;
import java.util.Scanner;

public class Fibonacci {
		  public static void main(String[] args) {

		    int n, n1 = 0, n2 = 1,n3;
		   
		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter number: ");
		    n = s.nextInt();
		    System.out.println("Fibonacci Series till " +n+ " terms:");
		    for (int i = 1; i <= n; ++i) {
		      System.out.print(n1 + ", ");

		      n3 = n1 + n2;
		      n1 = n2;
		      n2 = n3;
		    }
		  }
		}
//output:
//Enter number: 
//10
//Fibonacci Series till 10 terms:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 