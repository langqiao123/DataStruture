package org.langqiao.recursion;

public class RecursionApp {

	/**
	 * 求一个数的阶乘
	 * @param n
	 * @return int
	 */
	public static int factorial(int n){
		if(n == 0 ){
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	/**
	 * 求一个数x的n次方
	 * @param x
	 * @param n
	 * @return int
	 */
	public static int power(int x,int n){
		int result = 1;
		if(n == 0){
			result = 1;
		}else{
			result = result * power(x * x, n/2);
			if(n % 2 == 1){
				result = result * x;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int result = power(2,9);
		System.out.println(result);
	}
}
