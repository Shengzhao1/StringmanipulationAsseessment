/*3)  Replace the first and last characters in the given string 
  Sample input : Hello World 
  Sample output: dello WorlH
  */
import java.util.Scanner;

public class removeFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input to move first and last char");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String next =str.substring(1,str.length()-1);
		System.out.println(str.charAt(str.length()-1)+next+str.charAt(0));
	}

}
