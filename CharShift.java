import java.util.Scanner;

public class CharShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me your input with word and space");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<str.length();i++) {
			int one = (int)str.charAt(i)+1;
			if(123>(one-1) && (one-1)>97) {
				sb.append(Character.toString(one));
			}else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
