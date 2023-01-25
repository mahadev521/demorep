package homeTasks;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			int[] seen = new int[128];
			int ascii;
			for (int i = 0; i < input.length(); i++) {
				ascii = (int) input.charAt(i);
				if (seen[ascii] == 1 && input.charAt(i) != ' ') {
					System.out.print(input.charAt(i));
				} else if (seen[ascii] == 0)
					seen[ascii] = 1;
			}
		}
	}
}
