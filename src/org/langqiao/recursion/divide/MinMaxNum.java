package org.langqiao.recursion.divide;

public class MinMaxNum {

	/**
	 * 求一个数组中的最大值和最小值
	 * @param a	数组
	 * @param low	数组开始下标
	 * @param high	数组结束下标
	 * @return	IntPair
	 */
	public static IntPair min_max(int[] a,int low,int high){
		IntPair pair = new IntPair();
		if(low > high -2){
			if(a[low] < a[high]){
				pair.x = a[low];
				pair.y = a[high];
			}else {
				pair.x = a[high];
				pair.y = a[low];
			}
		}else {
			int mid = (high + low)/2;
			IntPair pair1 = min_max(a, low, mid);
			IntPair pair2 = min_max(a, mid+1, high);
			pair.x = pair1.x < pair2.x ? pair1.x : pair2.x;
			pair.y = pair1.y < pair2.y ? pair2.y : pair1.y;
		}
		return pair;
	}
	
	public static void main(String[] args) {
	    int[] a = {10,11,7,9,1,111,22332,43};
		IntPair pair = min_max(a, 0, a.length-1);
		System.out.println(pair.x);
		System.out.println(pair.y);
	}
}
