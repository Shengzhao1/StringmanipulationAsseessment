import java.util.Scanner;

/*
 * 5)  Given input as : “Softra Services Limited” 
  Output should be like: SSL 
 */
public class GetFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input with word and space");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] splited = str.split(" ");
		StringBuilder sb = new StringBuilder();

		for(String item: splited) {
			sb.append(item.charAt(0));
			
			}
		System.out.println(sb);
		
		
	}

}
