package summer2019;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		System.out.println("Hello Git!");
		
		// 成人ならお酒が飲めるという処理
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		if (20 <= age) {
			System.out.println(age + "歳ならお酒が飲める！");
		} else {
			System.out.println(age + "歳ならお酒はまだ飲んではいけない！！");
		}
		
		scanner.close();
	}
}
