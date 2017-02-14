package org.langqiao.sort;

/**
 * 
 *  插入排序
 */
public class InsertSort {
	
	public static void InsertSortArray(int[] arr){ 
		int n = arr.length;
		for(int i=1;i<n;i++){//循环从第二个数组元素开始，因为arr[0]作为最初已排序部分 
		    int temp=arr[i];//temp标记为未排序第一个元素 
		    int j=i-1; 
			while (j>=0 && arr[j]>temp){/*将temp与已排序元素从小到大比较，寻找temp应插入的位置*/ 
			    arr[j+1]=arr[j]; 
			    j--; 
			} 
			arr[j+1]=temp; 
		} 
	} 
	
	public static void main(String[] args){
		int[] arr = {19,12,20,45,1,0,100};
		long time1 = System.currentTimeMillis();
		InsertSortArray(arr);
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
}
