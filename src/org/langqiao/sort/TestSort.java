package org.langqiao.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class TestSort {

	@Test
	public void test(){
		test_selectSort();
		test_buddleSort();
	}
	
	@Test
	public void test_selectSort() {
		List<int[]> list = test1();
		long time1 = System.currentTimeMillis();
		for(int i = 0;i < list.size();i++){
			int[] array = list.get(i);
			SelectSort.SelectSortArray(array);
			/*for(int j = 0;j < array.length;j++){
				System.out.print(array[j] + "\t");
			}
			System.out.println("................................");*/
		}
		long time2 = System.currentTimeMillis();
		System.out.println("选择排序花费时间:"+(time2-time1));
	}
	
	@Test
	public void test_buddleSort() {
		List<int[]> list = test1();
		long time1 = System.currentTimeMillis();
		for(int i = 0;i < list.size();i++){
			int[] array = list.get(i);
			SelectSort.SelectSortArray(array);
			/*for(int j = 0;j < array.length;j++){
				System.out.print(array[j] + "\t");
			}
			System.out.println("................................");*/
		}
		long time2 = System.currentTimeMillis();
		System.out.println("冒泡排序花费时间:"+(time2-time1));
	}
	
	public List<int[]> test1(){
		List<int[]> list = new ArrayList<int[]>();
		int length = 1000;
		int[] testArray1 = new int[length];
		int[] testArray2 = new int[length];
		int[] testArray3 = new int[length];
		int[] testArray4 = new int[length];
		int[] testArray5 = new int[length];
		int[] testArray6 = new int[length];
		int[] testArray7 = new int[length];
		int[] testArray8 = new int[length];
		int[] testArray9 = new int[length];
		int[] testArray10 = new int[length];
		int[] testArray11 = new int[length];
		
		Random random = new Random();
		for(int i = 0;i < length;i++){
			int temp = random.nextInt(1000);
			testArray1[i] = temp;
			testArray2[i] = temp;
			testArray3[i] = temp;
			testArray4[i] = temp;
			testArray5[i] = temp;
			testArray6[i] = temp;
			testArray7[i] = temp;
			testArray8[i] = temp;
			testArray9[i] = temp;
			testArray10[i] = temp;
			testArray11[i] = temp;
		}
		list.add(testArray1);
		list.add(testArray2);
		list.add(testArray3);
		list.add(testArray4);
		list.add(testArray5);
		list.add(testArray6);
		list.add(testArray7);
		list.add(testArray8);
		list.add(testArray9);
		list.add(testArray10);
		list.add(testArray11);
		return list;
	}

}
