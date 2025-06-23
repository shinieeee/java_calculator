import java.util.*;


public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.print("Enter first number: ");
		            double a = sc.nextDouble();

		            System.out.print("Enter an operator (+, -, *, /): ");
		            char op = sc.next().charAt(0);

		            System.out.print("Enter second number: ");
		            double b = sc.nextDouble();

		            double result = 0;

		            if (op == '+') result = a + b;
		            else if (op == '-') result = a - b;
		            else if (op == '*') result = a * b;
		            else if (op == '/') {
		                if (b == 0) {
		                    System.out.println("Cannot divide by zero.");
		                    continue;
		                } else result = a / b;
		            } else {
		                System.out.println("Invalid operator.");
		                continue;
		            }

		            System.out.println("Result:" + result);

		            System.out.print("Do you want to continue? (y/n):");
		            char again = sc.next().charAt(0);
		            if (again != 'y' && again != 'Y'){
                  break;}
		        }
            System.out.println("Calculator exited.");

	}

}
