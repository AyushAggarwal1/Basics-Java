import java.util.*;

public class dividedTwoNum{

public static void main(String args[])
{
	try{
		Scanner sc = new Scanner (System.in);
		int numb = sc.nextInt();
		int divid = numb%10;
		int num1 = numb / 10;
		// int num2 = numb % divid;
		// int c = 10 + num2;
		System.out.println("original number"+numb);
		System.out.println("divided 1 element"+divid);
		System.out.println("divided 2 element"+num1);
		sc.close();
	}
catch (Exception e)
{
	System.out.println(e);
}
	
}
}