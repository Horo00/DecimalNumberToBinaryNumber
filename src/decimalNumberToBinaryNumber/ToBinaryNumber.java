package decimalNumberToBinaryNumber;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToBinaryNumber {
	public BigDecimal getBinaryNumber(int decimalNumber) {
		BigDecimal binaryNumber = toBynary(decimalNumber);

		return binaryNumber;
	}

	private BigDecimal toBynary(int decimalNumber) {
		//与えられた数字が1か0ならそのまま数字を返す
		if(decimalNumber == 1 || decimalNumber == 0) {
			return new BigDecimal(decimalNumber);
		}

		List<Integer> binaryList = new ArrayList<Integer>();

		binaryList = mapToBinary(binaryList,Math.abs(decimalNumber));

		StringBuffer sb = parseStringBuffer(binaryList);

		String binaryString = codeCheck(sb,decimalNumber).toString();


		BigDecimal binaryNumber = new BigDecimal(binaryString);

		return binaryNumber;
	}

	private StringBuffer codeCheck(StringBuffer sb, int decimalNumber) {
		if(decimalNumber > 0) {
			return sb;
		}
		return sb.insert(0, "-");
	}

	private void secondAdjust(List<Integer> binaryList) {
		binaryList.add(1);

		Collections.reverse(binaryList);
	}

	private StringBuffer parseStringBuffer(List<Integer> binaryList) {
		StringBuffer sb = new StringBuffer();
		for (Integer integer : binaryList) {
			sb.append(integer);
		}
		return sb;
	}

	private List<Integer> mapToBinary(List<Integer> list,int number) {
		int i = (number % 2 == 1) ? 1 : 0;
		list.add(i);

		int nextNumber = (int)number / 2 ;
		if(nextNumber > 1) {
			mapToBinary(list, nextNumber);
		} else {
			secondAdjust(list);
		}
		return list;
	}
}
