package org.langqiao.sort;

/**
 * 
 * 快速排序
 */
public class QuickSort {

	void swap(int a,int b){
		int t;
		t =a;
		a =b;
		b =t;
	} 
	
    int Partition(int [] arr,int low,int high){ 
        int pivot = arr[low];//采用子序列的第一个元素作为枢纽元素 
        while (low < high){ 
            //从后往前栽后半部分中寻找第一个小于枢纽元素的元素 
            while (low < high && arr[high] >= pivot){ 
                --high; 
            } 
            //将这个比枢纽元素小的元素交换到前半部分 
            swap(arr[low], arr[high]); 
            //从前往后在前半部分中寻找第一个大于枢纽元素的元素 
            while (low <high &&arr [low ]<=pivot){ 
                ++low ; 
            } 
            swap (arr [low ],arr [high ]);//将这个枢纽元素大的元素交换到后半部分 
        } 
        return low ;//返回枢纽元素所在的位置 
    } 
    
    void QuickSort(int [] a,int low,int high){ 
        if (low <high ){ 
            int n = Partition (a ,low ,high ); 
            QuickSort (a ,low ,n ); 
            QuickSort (a ,n +1,high ); 
        } 
    } 
	
    public static void main(String[] args){
    	int[] arr = {19,12,20,45,1,0,100};
    	long time1 = System.currentTimeMillis();
    	QuickSort qs = new QuickSort();
    	qs.QuickSort(arr,1,6);
    	long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
    }
}
