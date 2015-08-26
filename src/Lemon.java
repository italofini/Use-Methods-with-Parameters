import java.util.Scanner;
public class Lemon {
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		Coconut CoconutObject = new Coconut ();
		
		System.out.println("Enter your name here:");
		String name = input.nextLine();
		
		CoconutObject.simpleMessahe(name);
	}
}
	