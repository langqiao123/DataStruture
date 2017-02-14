package org.langqiao.sort;

/**
 * 
 * 冒泡排序
 */
public class BuddleSort {
	
	
	public void sort(int[] targetArr){//小到大的排序

        int temp = 0;
        for(int i = 0;i<targetArr.length;i++){
            for(int j = i;j<targetArr.length;j++){

                if(targetArr[i]>targetArr[j]){

                   //方法一：
                    /*temp = targetArr[i];
                    targetArr[i] = targetArr[j];
                    targetArr[j] = temp;*/
                	//swap(targetArr[i],targetArr[j]);

                    //方法二:
                    targetArr[i] = targetArr[i] + targetArr[j];
                    targetArr[j] = targetArr[i] - targetArr[j];
                    targetArr[i] = targetArr[i] - targetArr[j];
                   }
                for(int k = 0;k < targetArr.length;k++){
                	System.out.print(targetArr[k] + "\t");
                }
                System.out.println();
             }
        }
    }
	public void swap(int a,int b){
		/*int temp = 0;
		temp = a;
		a = b;
		b = temp;*/
		a = a + b;
		b = a-b;
		a = a-b;
	}
	
	public static void main(String[] args){
		int[] arr = {19,12,20,45,1,0,100,19};
		long time1 = System.currentTimeMillis();
		BuddleSort sort = new BuddleSort();
		sort.sort(arr);
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
}
