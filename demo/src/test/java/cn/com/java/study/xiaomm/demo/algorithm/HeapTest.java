package cn.com.java.study.xiaomm.demo.algorithm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HeapTest {

	private HeapSort heap;

	@Before
	public void setup() {
		heap = new HeapSort();
	}

	@Test
	public void testSort() {
		assertArrayEquals(new int[] { 2, 4, 5, 6, 8, 10, 11, 13 }, heap.sort(new int[] { 13, 10, 11, 5, 6, 8, 4, 2 }));
	}

}
