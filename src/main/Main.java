package main;

import java.math.BigDecimal;

import decimalNumberToBinaryNumber.ToBinaryNumber;

public class Main {
	public static void main(String[] args) {
		int inputNumber = InputNumber.getNumber();

		ToBinaryNumber tBN = new ToBinaryNumber();

		BigDecimal binaryNumber = tBN.getBinaryNumber(inputNumber);

		System.out.println(binaryNumber);
	}
}
