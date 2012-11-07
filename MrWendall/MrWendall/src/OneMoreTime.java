import java.util.Scanner;

public class OneMoreTime {
	public static void main(String args[]){
		Scanner buck = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number");
		fnum = buck.nextDouble();
		System.out.println("Enter second number");
		snum = buck.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		
	}

}
