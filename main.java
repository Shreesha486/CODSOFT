package number_guessing;
import java.util.Scanner;
public class main {
	public static void 
	numberguessinggame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1+(int)(100*Math.random());
		int k = 5;
		int i,guess;
		System.out.println("A number is chosen"
				+ " between 1 and 100"
				+ " Guess this number "
				+ " within 5 trials");
		for(i=0;i<k;i++)
		{
			System.out.println("Guess the number");
			guess=sc.nextInt();
			if(number==guess)
			{
				System.out.println("Congratulations");
				break;
			}
			else if(number > guess && i!= k-1)
			{
				System.out.println("Number is greater tham" +guess);
			}
			else if (number < guess && i!=k-1)
			{
				System.out.println("Number is less than" +guess);
			}
		}
		if(i==k)
		{
			System.out.println("You have exhausted your chance");
			System.out.println("The number is" +number);
		}
	}
 public static void main(String args[])
 {
	 numberguessinggame();
 }
}
