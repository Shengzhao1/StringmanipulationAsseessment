/*
 * 4)  Find the substring which is having max length, if two strings lengths are equal  
return the first one. 
  Sample input 1 : “Hi How are you” 
  Sample output 1 : How 
  
  Sample input 2 : “This is java String program ” 
  Sample output 2 : program 
 */
import java.util.Scanner;

public class findMaxLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input with word and space");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] splited = str.split(" ");
		String holder = "";
		for(String item: splited) {

			if (holder.length()<item.length()) {
				holder = item;
			}
			
		}
		System.out.println(holder);
	}

}
