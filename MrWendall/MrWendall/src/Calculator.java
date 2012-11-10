import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to the calculator!");
		Scanner scanner = new Scanner(System.in);
		
		int fnum = scanner.nextInt();
		String operator = scanner.next();
		int snum = scanner.nextInt();;
		int total;
		
		
		if ("+".equals(operator)) {
			System.out.println(operator);
			total = fnum + snum;
		} 
		if ("-".equals(operator)) {
			System.out.println(operator);
			total = fnum - snum;
		}
		if ("*".equals(operator)) {
			System.out.println(operator);
			total = fnum * snum;
		}
		if ("/".equals(operator)) {
			System.out.println(operator);
			total = fnum / snum;
		}
		else {
			System.out.println("I don't understand... sorry!");
			total = 0;
		}
		
	   System.out.println(total);
		
//		System.out.println(fnum+" " +operator+" " +snum);
		
/*		switch (operator) {
		
		case "+":
			System.out.println("It's a plus!");
//			int total = fnum + snum;
			break;
		
		case "-":
			System.out.println("It's a minus!");
//			total = fnum - snum;
			break;
		
		case "*":
			System.out.println("It's a multiple!");
//			total = fnum * snum;
			break;
		
		case "/":
			System.out.println("It's a division!");
//			total = fnum / snum;
			break;
		

		}
********////////		
		
//		System.out.println(total);
//		System.out.print(fnum + " ");
//		System.out.print(operation);
//		System.out.print(snum);
//		System.out.println(fnum);
//		System.out.println(operation);
//		System.out.println(snum);
		

	}



//private static void doCalculation(final String token) {
 //   System.out.println("SARCASM: " + token);
//}

}