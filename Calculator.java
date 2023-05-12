package arithmetic_Calculator;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int operand1;
		int operand2;
		
		System.out.println("WELCOME TO THE ARITHMETIC CALCULATOR \n");
		
		System.out.println("Enter the value for the first operand" );
		
		operand1=sc.nextInt();
		
		System.out.println("Enter the value for the second operand" );
		
		operand2=sc.nextInt();
		
		System.out.println("The Following Operations Can Be Performed : ");
		
		System.out.println("\n1: + ADDITION\n \n2: - SUBTRACTION");
		
		System.out.println("\n3: * MULTIPLICATION\n \n4: / DIVISON");
		
		System.out.println("\n5: % MODULUS\n");
		
		System.out.println("Enter the operation you want to perform");
		
		String operation= sc.next();
		
		int result =AriCalcu(operand1,operand2,operation);
		
		System.out.println("The result obtained is"+ " " + result);
	}
		
		public static int AriCalcu(int a, int b, String operation)
		{
			int result=0;
			if(operation.equals("+"))
			{
				result= a + b;            //ADDITON
			}
			
			else if(operation.equals("-"))
			{
				result= a-b;             //SUBTRACTION
			}
			
			else if(operation.equals("*"))
			{
				result= a*b;              //MULTIPLICATION
			}
			
			else if(operation.equals("/"))
			{
				result= a/b;              //DIVISON
			}
			
			else if(operation.equals("%"))
			{
				result= a%b;             //MODULUS
			}
			
			else
				System.out.println("operation not defined");
			
			
			return result;
		}
					
			
}
