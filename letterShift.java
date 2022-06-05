import java.util.Scanner;

/*
 * 6)  Given input as : “Softra Services Limited” < first char from 1st word, 2nd char from 
second word, 3rd char from 3rd word etc.>> Output should be in capitals at the end. 
  Output should be like: SEM 
  x: note that input need increase over time otherwise will cause error
 */
public class letterShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input with word and space");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] splited = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<splited.length;i++) {
			sb.append(splited[i].charAt(i));
			
			}
		System.out.println(sb);
	}

}
