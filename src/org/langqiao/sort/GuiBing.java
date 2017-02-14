package org.langqiao.sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GuiBing {
 
	public static void main(String[] args) throws Exception {
		int datalength=100;
		GuiBing gui=new GuiBing();
		int[] array1 = gui.createArray(datalength);
		int[] array2 = gui.createArray(datalength);
		Thread.sleep(20000);

		long startTime = System.nanoTime();//纳秒精度
		long begin_freeMemory = Runtime.getRuntime().freeMemory();
  
		int[] final_array = gui.guibing(array1,array2);
  
		boolean result = gui.testResult(final_array);
		long end_freeMemory = Runtime.getRuntime().freeMemory();
		System.out.println("result===="+result);
		long estimatedTime = System.nanoTime() - startTime; 
		System.out.println("elapsed time(纳秒精度):"+estimatedTime/100000000.0);
		System.out.println("allocated memory:"+(begin_freeMemory - end_freeMemory)/1000.0+" KB");
		Thread.sleep(20000);
	}

	/**
	 * 显示数组的内容
	 * @param array
	 */
	private static void dispalyData(int[] array) {
		for(int i=0;i<array.length;i++){
			System.out.printf("%-6d",array[i]);
		}
		System.out.println("");
	}

	/**
	 * 测试结果
	 * @param final_array
	 * @return
	 */
	private boolean testResult(int[] final_array) {
		int length=final_array.length;
		for(int i=0;i<length-1;i++){
			if(final_array[i]>final_array[i+1]) return false;
		}
		return true;
	}

	/**
	 * 算法的思想是：
	 * 数组a是有序的，从小到大
	 * 数组b是有序的，从小到大
	 * 归并两个数组到一个中
	 * 1 从两个数组的第一个元素比较，小的放在新数组的第一个位置，小的元素所在的数组索引加1，依此比较
	 * 直到结束
	 * 2 将剩余元素直接拷贝到新的数组内
	 **/
	private int[] guibing(int[] a, int[] b) {
		int[] temp = new int[a.length*2];
		int i = 0,j = 0,a_length = a.length,b_length = a.length,k = 0;
		arraySort(a);
		arraySort(b);
		//dispalyData(a);
		//dispalyData(b);
		while(i < a_length && j < b_length){
			if(a[i]<b[j]){
				temp[k] = a[i];
				k++;
				i++;
			}else{
				temp[k] = b[j];
				k++;
				j++;
			}
		}
		
		while(i < a_length){
			temp[k++] = a[i++];
		}
		while(j < b_length){
			temp[k++] = b[j++]; 
		}
		return temp;
	}

	/**
	 * 用集合类Collections升序排列
	 * @param a
	 */
	@SuppressWarnings({"unchecked","unused"})
	private void sort(final int[] a){
		List list=new ArrayList();
		for(int i=0;i<a.length;i++)
			list.add(a[i]);
			Collections.sort(list);
			Object[] temp=list.toArray();
			for(int i=0;i<temp.length;i++){
				a[i]=(Integer)temp[i];
			}
	}
 
	/**
	 * 使用系统类对数组以升序排序。
	 * @param a
	 */
	@SuppressWarnings({"unchecked","unused"})
	private void arraySort(final int[] a){
		Arrays.sort(a);
	}

	/**
	 * 根据参数length创建一个随机的整数数组。数组中的值的小于length*2
	 * @param length 
	 * @return
	 */
	private int[] createArray(int length) {
		Random random=new Random();
		int[] temp=new int[length];
		int j=0;
		while(j < length){
			temp[j++]=random.nextInt(length<<2); 
		}
		return temp;
	}
}
