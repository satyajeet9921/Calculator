
import java.util.Scanner;

public class ArithmaticDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int n1,n2;
		 int ans=1,c=0;
		 char choice;
		 
		 do{
			 System.out.println("a.add\tb. sub\tc. mult\td. div\te. exit");
			 System.out.println("enter yout choice");
			 choice = s.next().charAt(0);
			 
			 switch(choice)
			 { 
			 case'a':
				 System.out.println("Enter two numbers: ");
				 n1 = s.nextInt();
				 n2 = s.nextInt();
				 c = n1+n2;
				 System.out.println(n1+"+"+n2+"="+c);
				 break;
			 case'b':
				 System.out.println("Enter two numbers: ");
				 n1 = s.nextInt();
				 n2 = s.nextInt();
				 if(n1>n2){
				 c = n1-n2;
				 }
				 else{
					c = n2-n1;
					 }
				 System.out.println(n1+"-"+n2+"="+c);
				 break;
			 case'c':
				 System.out.println("Enter two numbers: ");
				 n1 = s.nextInt();
				 n2 = s.nextInt();
				 c = n1*n2;
				 System.out.println(n1+"*"+n2+"="+c);
				 break;
			 case'd':
				 System.out.println("Enter two numbers: ");
				 n1 = s.nextInt();
				 n2 = s.nextInt();
				 if(n2==0)
				 {
					 System.out.println("Denominator should not be zero");
				 }
				 else
				 { 
				 c = n1/n2;
				 System.out.println(n1+"/"+n2+"="+c);
				 }
				 break;
			 case'e':
				 System.exit(0);
				 break;
			default:
				System.out.println("Entered choice is wrong!!");
				break;
			 }
		 System.out.println("do you want to continue enter(1/0)");
		 ans = s.nextInt();
		 } while(ans!=0);

	}

}
