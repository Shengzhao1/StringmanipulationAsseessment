/*
 * 1)  Parse the String in the given format separated with ‘-’ 
  Sample input : computer 
  Sample output : r-e-t-u-p-m-o-c
 */
import java.util.Scanner;

public class ParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input for reoder");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String prt = "";
		for(int i = str.length()-1; i>=0;i--) {
			prt = prt.concat(str.charAt(i)+"-");
		}
		System.out.println(prt.substring(0,prt.lastIndexOf("-")));

	}

}
