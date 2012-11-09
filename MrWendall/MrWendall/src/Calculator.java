import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[]) {
		boolean calculate = true;
			
		while (calculate == true) {
		Scanner in1 = new Scanner(System.in);
		int fnum, snum;
		fnum = in1.nextInt();
		Scanner operation = new Scanner(System.in);
		String math = operation.nextLine();
		Scanner in2 = new Scanner(System.in);
		snum = in2.nextInt();
		
		if(math.equals("*") ) {
			int total = fnum * snum;
			System.out.println(total);
	
		}
		if(math.equals("/") ) {
			int total = fnum / snum;
			System.out.println(total);
		}
			if(math.equals("+") ) {
				int total = fnum + snum;
				System.out.println(total);
			}
			
			if(math.equals("-") ) {
				int total = fnum - snum;
				System.out.println(total);
			}
			
			System.out.println("Would you like to go again?");
			Scanner again = new Scanner(System.in);
			// It looks as though it gets up to here, and then after taking input it goes ape shit
				if(again.equals("no")) {
					calculate = false;
				}else {
					calculate = true;
				}
			
		}
			System.out.println("Thanks Buddy!");
		
	}

}