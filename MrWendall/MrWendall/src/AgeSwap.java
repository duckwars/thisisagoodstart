import java.util.Scanner;   
   
public class AgeSwap {   
	   
	public static void main(String args[]) {   
		Scanner scanner = new Scanner(System.in);   
		System.out.println("First number you wish to multiply ");   
		int x = scanner.nextInt();   
		System.out.println("Next number to be multiplied ");   
		int y = scanner.nextInt();
		int total = x * y;
   
		if(total > 100){
			System.out.println(total);  
			System.out.println("Damn, that's a big number!");
		}else{
			System.out.println(total);
			System.out.println("Small number dude!");
		}
		
	}   
}   