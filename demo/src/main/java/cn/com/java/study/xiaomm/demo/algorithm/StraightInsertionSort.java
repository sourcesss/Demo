package cn.com.java.study.xiaomm.demo.algorithm;

/**
 * 直接插入排序
 * 
 * 思想：从第2个数开始到最后一个数为止
 * 依次找其在前面已经有序的区间的位置
 * 
 * @author xiaomm
 *
 */
public class StraightInsertionSort {

	public int[] sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int temp=arr[i];
				for(int j=i-1;j>=0;j--) {
					if(temp<arr[j]) {
						arr[j+1]=arr[j];
						if(j==0) {
							arr[0]=temp;
						}
					}else {
						arr[j+1]=temp;
						break;
					}
				}
			}
			
		}
		return arr;
	}
}
