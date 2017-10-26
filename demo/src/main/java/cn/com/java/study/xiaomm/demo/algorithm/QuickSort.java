package cn.com.java.study.xiaomm.demo.algorithm;

/**
 * 快速排序
 * 思想：先以开头元素立一个flag，设两个index：i j，j从尾部开始查找小于flag的元素，然后i从首部开始查找大于flag的元素，如果找到，交换两个元素的顺序
 * 查找的出口：i和j相遇，这时候把指向的元素和flag元素交换，然后在flag两边的数组递归调上面的排序，直到只剩一个元素停止
 * @author xiaomm
 *
 */
public class QuickSort implements SortMethod {

	@Override
	public int[] sort(int[] arr) {
		sortEachIndex(arr, 0, arr.length - 1);
		return arr;
	}

	private void sortEachIndex(int[] arr, int i, int j) {
		if (i >= j) {
			return;
		}
		int low = i, higt = j;
		int index = arr[i];
		while (i < j) {
			while (arr[j] >= index) {
				if(j<=i) {
					break;
				}
				j--;
			}
			while (arr[i] <= index) {
				if (i >= j) {
					break;
				}
				i++;
			}

			int temp = 0;
			if (i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		arr[low] = arr[j];
		arr[j] = index;
		StringBuilder sb=new StringBuilder();
		for (int a:arr) {
			sb.append(a).append(",");
		}
		System.out.println(sb.toString());
		sortEachIndex(arr, low, j - 1);
		sortEachIndex(arr, j + 1, higt);

	}

}
