package gradecalc;
import java.util.Scanner;
public class gradecalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int n = sc.nextInt();
		int totalmarks = 0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the marks in subject " +i);
			int marks = sc.nextInt();
			totalmarks += marks;
		}
         double avgper = totalmarks/(n*100)*100;
         char grade;
         if(avgper >= 80)
         {
        	 grade = 'A';
         }
         else if(avgper >=60)
         {
        	 grade = 'B';
         }
         else if(avgper >= 40)
         {
        	 grade = 'C';
         }
         else 
         {
        	 grade = 'F';
         }
         System.out.println("------------------------------");
         System.out.println("The total marks is :" +totalmarks);
         System.out.println("The average percentage is :" +avgper );
         System.out.println("Grade:"+grade);
         sc.close();
	}

}
