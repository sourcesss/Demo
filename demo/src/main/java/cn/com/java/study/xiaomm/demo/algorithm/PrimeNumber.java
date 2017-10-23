package cn.com.java.study.xiaomm.demo.algorithm;

import java.util.Arrays;

public class PrimeNumber {

	private int[] arr;

	public PrimeNumber(int[] arr) {
		super();
		this.arr = arr;
	}

	public int getSmallestPrimeNumber() {
		Arrays.sort(arr);
		int i = 2;
		while (true) {
			if (isPrimeNumber(i) && !isExit(i, arr)) {
				return i;
			}
			i++;
		}

	}

	private boolean isExit(int value, int[] arr) {
		if (null == arr || arr.length == 0) {
			return false;
		}
		for (int i : arr) {
			if(i>value){
				break;
			}
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	private boolean isPrimeNumber(int value) {
		if (value == 2 || value == 3) {
			return true;
		}
		int count = 0;
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0) {
				count++;
			}
		}
		return count == 0;

	}

}
