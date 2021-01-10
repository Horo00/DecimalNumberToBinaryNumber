package main;

import java.util.Scanner;

public class InputNumber {
	static int getNumber() {
		Scanner scanner = getScanner();

		printForInput();

		int number = getInputNumber(scanner);

		return number;
	}



	private static int getInputNumber(Scanner scanner) {
		if(scanner.hasNextInt()) {
			return scanner.nextInt();
		}

		printForWrong();

		scanner.nextLine();
		
		return getInputNumber(scanner);
	}



	private static void printForWrong() {
		System.out.print("不正な入力です。もう一度数値を入力してください➡");

	}



	private static void printForInput() {
		System.out.print("10進数の数字を入力してください➡");
	}



	private static Scanner getScanner() {
		return new Scanner(System.in);
	}
}
