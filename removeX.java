import java.util.Scanner;

/*
 * 2)  Remove all small ‘x’ and append at the end of the string 
  Sample input : abcxXXcxerxxXXwer 
  Sample output: abcXXcerXXwerxxxx
 */
public class removeX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your inpur to remove x");
		Scanner input = new Scanner(System.in);
		String cht = input.next();
		StringBuilder sb = new StringBuilder();
		for( int i =0; i< cht.length(); i ++) {
			if(cht.charAt(i)!='x') {
			sb.append(cht.charAt(i));
			}
		}	
		System.out.println(sb);
	}

}
