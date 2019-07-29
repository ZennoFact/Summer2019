package summer2019;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		System.out.println("Hello Git!");
		
		// 成人ならお酒が飲めるという処理
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("input your age[-1: quit] > ");
			int age = scanner.nextInt();
			if (20 <= age) {
				System.out.println(age + "歳ならお酒が飲める！");
			} else if(age < 0) {
				break;
			} else {
				System.out.println(age + "歳ならお酒はまだ飲んではいけない！！");
			}
		}
		
		scanner.close();
		System.out.println("プログラムを終了します。");
	}
}
