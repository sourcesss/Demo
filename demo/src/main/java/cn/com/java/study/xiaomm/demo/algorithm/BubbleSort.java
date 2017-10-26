package cn.com.java.study.xiaomm.demo.algorithm;

/**
 * 
 * 冒泡排序
 * 
 * 思想：从第一躺两两比较，不符合顺序交换，最大（小）值会沉到最后
 * 然后再除去以后一个元素两两比较，直到只剩一个元素
 * @author xiaomm
 *
 */
public class BubbleSort implements SortMethod {

	public int[] sort(int[] arr) {
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
