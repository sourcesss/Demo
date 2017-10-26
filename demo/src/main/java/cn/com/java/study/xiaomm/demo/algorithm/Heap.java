package cn.com.java.study.xiaomm.demo.algorithm;

/**
 * 堆排序
 * 思想：对一个数组构建堆，交换顶元素（R0）和堆中最后一个元素
 * 然后继续把除去最后一个元素的数组再作成堆，再交换，直到堆只剩下一个元素
 * 
 * @author xiaomm
 *
 */
public class Heap {

	/**
	 * 大顶堆的创建
	 * 
	 * @param arr
	 * @param length
	 */
	public void buildHeap(int[] arr, int length) {
		for (int i = length / 2; i >= 1; i--) {
			int temp = 0;
			if (arr[i - 1] < arr[2 * i - 1]) {
				temp = arr[i - 1];
				arr[i - 1] = arr[2 * i - 1];
				arr[2 * i - 1] = temp;
			}
			if (2 * i + 1 <= length) {
				if (arr[i - 1] < arr[2 * i]) {
					temp = arr[i - 1];
					arr[i - 1] = arr[2 * i];
					arr[2 * i] = temp;
				}
			}
		}
	}

	/**
	 * 对于堆元素排序
	 * 
	 * @param arr
	 * @return
	 */
	public int[] sort(int[] arr) {
		int length = arr.length;
		do {
			buildHeap(arr, length);
			int temp = 0;
			temp = arr[0];
			arr[0] = arr[length - 1];
			arr[length - 1] = temp;
			length--;
		} while (length > 1);
		return arr;
	}
}
