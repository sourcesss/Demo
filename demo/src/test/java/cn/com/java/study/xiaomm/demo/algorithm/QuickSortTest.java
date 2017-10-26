package cn.com.java.study.xiaomm.demo.algorithm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {
	private QuickSort qs;

	@Before
	public void setup() {
		qs=new QuickSort();
	}
	@Test
	public void testSort() {
		int[] arr = new int[] { 2, 3, 1, 3, 4, 7, 23, 1, 4, 5 };
		assertArrayEquals(new int[] { 1,1,2,3,3,4,4,5,7,23 }, qs.sort(arr));
	}

}
