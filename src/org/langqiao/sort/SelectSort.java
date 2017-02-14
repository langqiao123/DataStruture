package org.langqiao.sort;

/**
 * 
 * 选择排序
 */
public class SelectSort {
	public static void SelectSortArray(int[] arr){ 
		int n = arr.length;
	    int min_index; 
	    for(int i = 0;i < n-1;i++){ 
	         min_index = i; 
	         for(int j = i+1;j < n;j++){//每次扫描选择最小项 
	            if(arr[j] < arr[min_index])  
	            	min_index = j; 
	         }
	         if(min_index != i){//找到最小项交换，即将这一项移到列表中的正确位置 
	        	 //方法1
	             /*int temp; 
	             temp = arr[i]; 
	             arr[i] = arr[min_index]; 
	             arr[min_index] = temp; */
	        	 //方法二
	        	 arr[i] = arr[i] + arr[min_index];
	        	 arr[min_index] = arr[i] - arr[min_index];
	        	 arr[i] = arr[i] - arr[min_index];
	         }
	         for(int k = 0;k < arr.length;k++){
             	System.out.print(arr[k] + "\t");
             }
             System.out.println();
	    } 
	} 
	
	public static void main(String[] args){
		int[] arr = {19,12,20,45,1,0,100,19};
		long time1 = System.currentTimeMillis();
		SelectSortArray(arr);
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
}
